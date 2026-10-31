// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetGranularityBySummaryIdRequest extends TeaModel {
    /**
     * <p>Env</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>ModelId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1978</p>
     */
    @NameInMap("ModelId")
    public Long modelId;

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
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>ProjectId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7081229106458752</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>QueryDraft</p>
     */
    @NameInMap("QueryDraft")
    public Boolean queryDraft;

    public static GetGranularityBySummaryIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGranularityBySummaryIdRequest self = new GetGranularityBySummaryIdRequest();
        return TeaModel.build(map, self);
    }

    public GetGranularityBySummaryIdRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetGranularityBySummaryIdRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public GetGranularityBySummaryIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetGranularityBySummaryIdRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetGranularityBySummaryIdRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetGranularityBySummaryIdRequest setQueryDraft(Boolean queryDraft) {
        this.queryDraft = queryDraft;
        return this;
    }
    public Boolean getQueryDraft() {
        return this.queryDraft;
    }

}
