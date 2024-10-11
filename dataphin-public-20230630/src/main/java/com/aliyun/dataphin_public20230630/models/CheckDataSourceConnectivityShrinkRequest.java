// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckDataSourceConnectivityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public String checkCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CheckDataSourceConnectivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceConnectivityShrinkRequest self = new CheckDataSourceConnectivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceConnectivityShrinkRequest setCheckCommandShrink(String checkCommandShrink) {
        this.checkCommandShrink = checkCommandShrink;
        return this;
    }
    public String getCheckCommandShrink() {
        return this.checkCommandShrink;
    }

    public CheckDataSourceConnectivityShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
