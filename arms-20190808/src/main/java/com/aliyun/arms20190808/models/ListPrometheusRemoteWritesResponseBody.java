// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusRemoteWritesResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The remote write configuration items returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPrometheusRemoteWritesResponseBodyData> data;

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
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPrometheusRemoteWritesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusRemoteWritesResponseBody self = new ListPrometheusRemoteWritesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusRemoteWritesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPrometheusRemoteWritesResponseBody setData(java.util.List<ListPrometheusRemoteWritesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPrometheusRemoteWritesResponseBodyData> getData() {
        return this.data;
    }

    public ListPrometheusRemoteWritesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrometheusRemoteWritesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrometheusRemoteWritesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrometheusRemoteWritesResponseBodyData extends TeaModel {
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
         * <p>The information about the queried remote write configuration item of the Prometheus instance. The information is displayed in the YAML format.</p>
         */
        @NameInMap("RemoteWriteYaml")
        public String remoteWriteYaml;

        public static ListPrometheusRemoteWritesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusRemoteWritesResponseBodyData self = new ListPrometheusRemoteWritesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrometheusRemoteWritesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListPrometheusRemoteWritesResponseBodyData setRemoteWriteName(String remoteWriteName) {
            this.remoteWriteName = remoteWriteName;
            return this;
        }
        public String getRemoteWriteName() {
            return this.remoteWriteName;
        }

        public ListPrometheusRemoteWritesResponseBodyData setRemoteWriteYaml(String remoteWriteYaml) {
            this.remoteWriteYaml = remoteWriteYaml;
            return this;
        }
        public String getRemoteWriteYaml() {
            return this.remoteWriteYaml;
        }

    }

}
