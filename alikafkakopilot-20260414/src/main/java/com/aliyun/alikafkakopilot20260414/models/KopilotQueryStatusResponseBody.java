// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotQueryStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The status information returned when the call is successful.</p>
     */
    @NameInMap("Data")
    public KopilotQueryStatusResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2DF166F2-F581-5254-AAB6-B482083FA7B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static KopilotQueryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotQueryStatusResponseBody self = new KopilotQueryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotQueryStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public KopilotQueryStatusResponseBody setData(KopilotQueryStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KopilotQueryStatusResponseBodyData getData() {
        return this.data;
    }

    public KopilotQueryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotQueryStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class KopilotQueryStatusResponseBodyData extends TeaModel {
        /**
         * <p>The UNIX timestamp when the instance was activated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17346565678778</p>
         */
        @NameInMap("ActivateTime")
        public Long activateTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>NotActivated</p>
         */
        @NameInMap("LifeStatus")
        public String lifeStatus;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>206022063004684756</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static KopilotQueryStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KopilotQueryStatusResponseBodyData self = new KopilotQueryStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KopilotQueryStatusResponseBodyData setActivateTime(Long activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public Long getActivateTime() {
            return this.activateTime;
        }

        public KopilotQueryStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public KopilotQueryStatusResponseBodyData setLifeStatus(String lifeStatus) {
            this.lifeStatus = lifeStatus;
            return this;
        }
        public String getLifeStatus() {
            return this.lifeStatus;
        }

        public KopilotQueryStatusResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public KopilotQueryStatusResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
