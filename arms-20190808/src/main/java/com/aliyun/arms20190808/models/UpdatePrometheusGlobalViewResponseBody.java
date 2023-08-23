// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusGlobalViewResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public UpdatePrometheusGlobalViewResponseBodyData data;

    /**
     * <p>The error message that is returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusGlobalViewResponseBody self = new UpdatePrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePrometheusGlobalViewResponseBody setData(UpdatePrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public UpdatePrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePrometheusGlobalViewResponseBodyDataFailedInstances extends TeaModel {
        /**
         * <p>The ID of the Prometheus instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <p>The type of the data source. AlibabaPrometheus MetricStore CustomPrometheus</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdatePrometheusGlobalViewResponseBodyDataFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusGlobalViewResponseBodyDataFailedInstances self = new UpdatePrometheusGlobalViewResponseBodyDataFailedInstances();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusGlobalViewResponseBodyDataFailedInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdatePrometheusGlobalViewResponseBodyDataFailedInstances setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public UpdatePrometheusGlobalViewResponseBodyDataFailedInstances setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdatePrometheusGlobalViewResponseBodyDataFailedInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdatePrometheusGlobalViewResponseBodyData extends TeaModel {
        /**
         * <p>The data sources that failed to be updated.</p>
         */
        @NameInMap("FailedInstances")
        public java.util.List<UpdatePrometheusGlobalViewResponseBodyDataFailedInstances> failedInstances;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpdatePrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusGlobalViewResponseBodyData self = new UpdatePrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusGlobalViewResponseBodyData setFailedInstances(java.util.List<UpdatePrometheusGlobalViewResponseBodyDataFailedInstances> failedInstances) {
            this.failedInstances = failedInstances;
            return this;
        }
        public java.util.List<UpdatePrometheusGlobalViewResponseBodyDataFailedInstances> getFailedInstances() {
            return this.failedInstances;
        }

        public UpdatePrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
