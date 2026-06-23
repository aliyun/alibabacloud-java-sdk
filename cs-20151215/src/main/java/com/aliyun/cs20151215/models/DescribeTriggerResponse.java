// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<DescribeTriggerResponseBody> body;

    public static DescribeTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTriggerResponse self = new DescribeTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTriggerResponse setBody(java.util.List<DescribeTriggerResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeTriggerResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeTriggerResponseBody extends TeaModel {
        /**
         * <p>触发器ID。</p>
         * 
         * <strong>example:</strong>
         * <p>75973497486******</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>触发器名称。</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>c259f563386444ebb8d7****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>触发器项目名称。</p>
         * <p>由应用所在命名空间及应用名称组成，格式为<code>${namespace}/${name}</code>，取值示例：default/test-app。</p>
         * 
         * <strong>example:</strong>
         * <p>default/test-app</p>
         */
        @NameInMap("project_id")
        public String projectId;

        /**
         * <p>触发器类型。</p>
         * <p>取值：</p>
         * <ul>
         * <li><p><code>deployment</code>：针对无状态应用的触发器。 </p>
         * </li>
         * <li><p><code>application</code>：针对应用中心应用的触发器。</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>触发器行为，取值：</p>
         * <p><code>redeploy</code>: 重新部署应用。</p>
         * 
         * <strong>example:</strong>
         * <p>redeploy</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>Token信息。</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGci***</p>
         */
        @NameInMap("token")
        public String token;

        public static DescribeTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeTriggerResponseBody self = new DescribeTriggerResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeTriggerResponseBody setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTriggerResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTriggerResponseBody setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeTriggerResponseBody setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeTriggerResponseBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeTriggerResponseBody setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeTriggerResponseBody setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
