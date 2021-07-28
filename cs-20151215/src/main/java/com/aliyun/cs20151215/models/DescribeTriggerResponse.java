// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeTriggerResponse setBody(java.util.List<DescribeTriggerResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeTriggerResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeTriggerResponseBody extends TeaModel {
        // 触发器ID。
        @NameInMap("id")
        public String id;

        // 触发器名称。
        @NameInMap("name")
        public String name;

        // 集群ID
        @NameInMap("cluster_id")
        public String clusterId;

        // 触发器项目名称
        @NameInMap("project_id")
        public String projectId;

        // 触发器类型。
        @NameInMap("type")
        public String type;

        // 触发器行为
        @NameInMap("action")
        public String action;

        // Token
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
