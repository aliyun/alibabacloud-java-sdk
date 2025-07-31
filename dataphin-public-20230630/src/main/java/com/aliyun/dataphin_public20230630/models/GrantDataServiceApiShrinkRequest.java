// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantDataServiceApiShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantCommand")
    public String grantCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static GrantDataServiceApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantDataServiceApiShrinkRequest self = new GrantDataServiceApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantDataServiceApiShrinkRequest setGrantCommandShrink(String grantCommandShrink) {
        this.grantCommandShrink = grantCommandShrink;
        return this;
    }
    public String getGrantCommandShrink() {
        return this.grantCommandShrink;
    }

    public GrantDataServiceApiShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GrantDataServiceApiShrinkRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
