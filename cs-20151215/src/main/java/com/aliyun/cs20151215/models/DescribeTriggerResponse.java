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
         * <p>The ID of the trigger.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the trigger.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the associated cluster.</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The name of the project.</p>
         * <br>
         * <p>The name consists of the namespace where the application is deployed and the name of the application. The format is `${namespace}/${name}`. Example: default/test-app.</p>
         */
        @NameInMap("project_id")
        public String projectId;

        /**
         * <p>The type of trigger.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   `deployment`: performs actions on Deployments.</p>
         * <p>*   `application`: performs actions on applications that are deployed in Application Center.</p>
         * <br>
         * <p>Default value: `deployment`.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The action that the trigger performs. The value is set to redeploy.</p>
         * <br>
         * <p>`redeploy`: redeploys the resource specified by project_id.</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The token information.</p>
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
