// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineAsyncResultRequest extends TeaModel {
    /**
     * <p>The asynchronous execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AsyncId")
    public Long asyncId;

    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public GetPipelineAsyncResultRequestContext context;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetPipelineAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineAsyncResultRequest self = new GetPipelineAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineAsyncResultRequest setAsyncId(Long asyncId) {
        this.asyncId = asyncId;
        return this;
    }
    public Long getAsyncId() {
        return this.asyncId;
    }

    public GetPipelineAsyncResultRequest setContext(GetPipelineAsyncResultRequestContext context) {
        this.context = context;
        return this;
    }
    public GetPipelineAsyncResultRequestContext getContext() {
        return this.context;
    }

    public GetPipelineAsyncResultRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetPipelineAsyncResultRequestContext extends TeaModel {
        /**
         * <p>The current operation environment. Valid values:</p>
         * <ul>
         * <li>DEV: development environment.</li>
         * <li>PROD: production environment.</li>
         * </ul>
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

        public static GetPipelineAsyncResultRequestContext build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineAsyncResultRequestContext self = new GetPipelineAsyncResultRequestContext();
            return TeaModel.build(map, self);
        }

        public GetPipelineAsyncResultRequestContext setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetPipelineAsyncResultRequestContext setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
