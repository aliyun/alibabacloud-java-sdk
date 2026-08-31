// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityArchiveTableProgressRequest extends TeaModel {
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
     * <p>The asynchronous task progress ID returned by the UpsertQualityArchiveTable operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f0b5c9a1e4f2ab3c6d5e4f7a8b9c0</p>
     */
    @NameInMap("ProgressId")
    public String progressId;

    public static GetQualityArchiveTableProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityArchiveTableProgressRequest self = new GetQualityArchiveTableProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityArchiveTableProgressRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetQualityArchiveTableProgressRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetQualityArchiveTableProgressRequest setProgressId(String progressId) {
        this.progressId = progressId;
        return this;
    }
    public String getProgressId() {
        return this.progressId;
    }

}
