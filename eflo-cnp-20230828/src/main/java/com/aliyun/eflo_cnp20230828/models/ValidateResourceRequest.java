// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ValidateResourceRequest extends TeaModel {
    /**
     * <p>Resource ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-sh-ouypm5aucy</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>User Authorization Parameters</p>
     */
    @NameInMap("UserAccessParam")
    public ValidateResourceRequestUserAccessParam userAccessParam;

    public static ValidateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateResourceRequest self = new ValidateResourceRequest();
        return TeaModel.build(map, self);
    }

    public ValidateResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ValidateResourceRequest setUserAccessParam(ValidateResourceRequestUserAccessParam userAccessParam) {
        this.userAccessParam = userAccessParam;
        return this;
    }
    public ValidateResourceRequestUserAccessParam getUserAccessParam() {
        return this.userAccessParam;
    }

    public static class ValidateResourceRequestUserAccessParam extends TeaModel {
        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <p>User Key</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>Endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ValidateResourceRequestUserAccessParam build(java.util.Map<String, ?> map) throws Exception {
            ValidateResourceRequestUserAccessParam self = new ValidateResourceRequestUserAccessParam();
            return TeaModel.build(map, self);
        }

        public ValidateResourceRequestUserAccessParam setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public ValidateResourceRequestUserAccessParam setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ValidateResourceRequestUserAccessParam setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ValidateResourceRequestUserAccessParam setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
