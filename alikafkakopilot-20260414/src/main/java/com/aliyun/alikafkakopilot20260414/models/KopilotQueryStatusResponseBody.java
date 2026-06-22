// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotQueryStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public KopilotQueryStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ActivateTime")
        public Long activateTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LifeStatus")
        public String lifeStatus;

        @NameInMap("RegionId")
        public String regionId;

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
