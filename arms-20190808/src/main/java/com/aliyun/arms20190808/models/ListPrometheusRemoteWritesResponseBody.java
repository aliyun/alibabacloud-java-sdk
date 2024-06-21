// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusRemoteWritesResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The remote write configuration items returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;name&quot;: &quot;TiDBxxx&quot;,
     *     &quot;yaml&quot;: &quot;remote_write:\\n- basic_auth: {password: \&quot;<strong><strong><strong>\&quot;, username: xxx}\\n  name: TiDBxxx\\n  write_relabel_configs:\\n  - regex: si-6e2ca86444db4e55a7c1\\n    source_labels: [instance_id]\\n    action: keep\\n    separator: ;\\n    replacement: $1\\n  url: <a href="http://xxx:8080/prometheus/xxx/ddd/cn-hangzhou/api/v3/write%5C%5C%5C%5Cn">http://xxx:8080/prometheus/xxx/ddd/cn-hangzhou/api/v3/write\\\\n</a>&quot;
     *   },
     *   {
     *     &quot;name&quot;: &quot;TiDBxxx1&quot;,
     *     &quot;yaml&quot;: &quot;remote_write:\\n- basic_auth: {password: \&quot;</strong></strong></strong>\&quot;, username: xxx}\\n  name: TiDBxxx1\\n  write_relabel_configs:\\n  - regex: si-6e2ca86444db4e55a7c1\\n    source_labels: [instance_id]\\n    action: keep\\n    separator: ;\\n    replacement: $1\\n  url: <a href="http://xxx:8080/prometheus/xxx/ddd/cn-hangzhou/api/v3/write%5C%5C%5C%5Cn">http://xxx:8080/prometheus/xxx/ddd/cn-hangzhou/api/v3/write\\\\n</a>&quot;
     *   }
     * ]</p>
     */
    @NameInMap("Data")
    public java.util.List<ListPrometheusRemoteWritesResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9319A57D-2D9E-472A-B69B-CF3CD16D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>c589a1b8db05c4561aefbb898ca8fb1cf</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the remote write configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123</p>
         */
        @NameInMap("RemoteWriteName")
        public String remoteWriteName;

        /**
         * <p>The information about the queried remote write configuration item of the Prometheus instance. The information is displayed in the YAML format.</p>
         * 
         * <strong>example:</strong>
         * <p>remote_write:</p>
         * <ul>
         * <li>name: rw1
         * url: &quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/uid/xx/cn-hangzhou/api/v3/write">http://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/uid/xx/cn-hangzhou/api/v3/write</a>&quot;
         * basic_auth:
         *   username: xxx
         *   password: xxx
         * write_relabel_configs:<ul>
         * <li>source_labels: [ instance_id ]
         * separator: ;
         * regex: si
         * replacement: $1
         * action: keep</li>
         * </ul>
         * </li>
         * </ul>
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
