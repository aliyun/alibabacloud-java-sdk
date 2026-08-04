// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterExportMemberBalanceOrdersRequest extends TeaModel {
    /**
     * <p>The balance type filter. Valid values: permanent and monthly.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The change direction filter. Valid values: in and out.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("direction")
    public String direction;

    public static ModelRouterExportMemberBalanceOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterExportMemberBalanceOrdersRequest self = new ModelRouterExportMemberBalanceOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterExportMemberBalanceOrdersRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterExportMemberBalanceOrdersRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

}
