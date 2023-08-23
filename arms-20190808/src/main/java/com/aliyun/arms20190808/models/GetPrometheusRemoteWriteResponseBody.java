// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteWriteResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the remote write configuration item.</p>
     */
    @NameInMap("Data")
    public GetPrometheusRemoteWriteResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPrometheusRemoteWriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusRemoteWriteResponseBody self = new GetPrometheusRemoteWriteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusRemoteWriteResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPrometheusRemoteWriteResponseBody setData(GetPrometheusRemoteWriteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPrometheusRemoteWriteResponseBodyData getData() {
        return this.data;
    }

    public GetPrometheusRemoteWriteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrometheusRemoteWriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrometheusRemoteWriteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPrometheusRemoteWriteResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Prometheus instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the remote write configuration item.</p>
         */
        @NameInMap("RemoteWriteName")
        public String remoteWriteName;

        /**
         * <p>The details of the remote write configuration item. The value is in the YAML format.</p>
         */
        @NameInMap("RemoteWriteYaml")
        public String remoteWriteYaml;

        public static GetPrometheusRemoteWriteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusRemoteWriteResponseBodyData self = new GetPrometheusRemoteWriteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrometheusRemoteWriteResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetPrometheusRemoteWriteResponseBodyData setRemoteWriteName(String remoteWriteName) {
            this.remoteWriteName = remoteWriteName;
            return this;
        }
        public String getRemoteWriteName() {
            return this.remoteWriteName;
        }

        public GetPrometheusRemoteWriteResponseBodyData setRemoteWriteYaml(String remoteWriteYaml) {
            this.remoteWriteYaml = remoteWriteYaml;
            return this;
        }
        public String getRemoteWriteYaml() {
            return this.remoteWriteYaml;
        }

    }

}
