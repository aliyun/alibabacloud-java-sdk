// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineAsyncResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AsyncId")
    public Long asyncId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public GetPipelineAsyncResultRequestContext context;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
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
