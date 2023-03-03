// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusRemoteWritesResponseBody extends TeaModel {
    /**
     * <p>The status code returned. 200 indicates that the Prometheus agent was installed. Otherwise, the Prometheus agent fails to be installed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The list of Remote Write configuration items.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPrometheusRemoteWritesResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful: true: The call was successful. false: The call failed.</p>
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
         * <p>The Remote Write configuration item.</p>
         */
        @NameInMap("RemoteWriteName")
        public String remoteWriteName;

        /**
         * <p>The details about the Remote Write configuration item. The value is in the YAML format.</p>
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
