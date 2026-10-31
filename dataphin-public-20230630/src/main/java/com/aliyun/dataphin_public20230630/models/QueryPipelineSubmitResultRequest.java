// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class QueryPipelineSubmitResultRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public QueryPipelineSubmitResultRequestContext context;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The submit detail ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SubmitId")
    public Long submitId;

    public static QueryPipelineSubmitResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineSubmitResultRequest self = new QueryPipelineSubmitResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryPipelineSubmitResultRequest setContext(QueryPipelineSubmitResultRequestContext context) {
        this.context = context;
        return this;
    }
    public QueryPipelineSubmitResultRequestContext getContext() {
        return this.context;
    }

    public QueryPipelineSubmitResultRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public QueryPipelineSubmitResultRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public QueryPipelineSubmitResultRequest setSubmitId(Long submitId) {
        this.submitId = submitId;
        return this;
    }
    public Long getSubmitId() {
        return this.submitId;
    }

    public static class QueryPipelineSubmitResultRequestContext extends TeaModel {
        /**
         * <p>The current operation environment. Valid values: DEV: development environment. PROD: production environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The ID of the project to which the integration pipeline task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static QueryPipelineSubmitResultRequestContext build(java.util.Map<String, ?> map) throws Exception {
            QueryPipelineSubmitResultRequestContext self = new QueryPipelineSubmitResultRequestContext();
            return TeaModel.build(map, self);
        }

        public QueryPipelineSubmitResultRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryPipelineSubmitResultRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
