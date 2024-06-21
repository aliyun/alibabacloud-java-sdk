// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>状态码。说明 200表示成功。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the array object.</p>
     */
    @NameInMap("Data")
    public AddPrometheusGlobalViewResponseBodyData data;

    /**
     * <p>返回结果的提示信息。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewResponseBody self = new AddPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddPrometheusGlobalViewResponseBody setData(AddPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public AddPrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrometheusGlobalViewResponseBodyDataInfo extends TeaModel {
        /**
         * <p>The list of instances that failed to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;sourceName&quot;: &quot;Data source name- ArmsPrometheus&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;userId&quot;:&quot;UserID&quot;,&quot;clusterId&quot;:&quot;ClusterId&quot;,}]</p>
         */
        @NameInMap("FailedInstances")
        public String failedInstances;

        /**
         * <p>The ID of the global aggregation instance.</p>
         * 
         * <strong>example:</strong>
         * <p>global-v2-cn-1483223059272121-jmjjfznz</p>
         */
        @NameInMap("GlobalViewClusterId")
        public String globalViewClusterId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static AddPrometheusGlobalViewResponseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewResponseBodyDataInfo self = new AddPrometheusGlobalViewResponseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewResponseBodyDataInfo setFailedInstances(String failedInstances) {
            this.failedInstances = failedInstances;
            return this;
        }
        public String getFailedInstances() {
            return this.failedInstances;
        }

        public AddPrometheusGlobalViewResponseBodyDataInfo setGlobalViewClusterId(String globalViewClusterId) {
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }
        public String getGlobalViewClusterId() {
            return this.globalViewClusterId;
        }

        public AddPrometheusGlobalViewResponseBodyDataInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class AddPrometheusGlobalViewResponseBodyData extends TeaModel {
        /**
         * <p>The Info-level information.</p>
         */
        @NameInMap("Info")
        public AddPrometheusGlobalViewResponseBodyDataInfo info;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AddPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewResponseBodyData self = new AddPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewResponseBodyData setInfo(AddPrometheusGlobalViewResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public AddPrometheusGlobalViewResponseBodyDataInfo getInfo() {
            return this.info;
        }

        public AddPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
