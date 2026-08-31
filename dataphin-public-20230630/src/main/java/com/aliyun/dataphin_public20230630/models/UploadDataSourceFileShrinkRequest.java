// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UploadDataSourceFileShrinkRequest extends TeaModel {
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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The request object for uploading a datasource authentication file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadCommand")
    public String uploadCommandShrink;

    public static UploadDataSourceFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSourceFileShrinkRequest self = new UploadDataSourceFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadDataSourceFileShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UploadDataSourceFileShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UploadDataSourceFileShrinkRequest setUploadCommandShrink(String uploadCommandShrink) {
        this.uploadCommandShrink = uploadCommandShrink;
        return this;
    }
    public String getUploadCommandShrink() {
        return this.uploadCommandShrink;
    }

}
