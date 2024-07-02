// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ShopStatusChangeResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("operate")
    public Boolean operate;

    public static ShopStatusChangeResult build(java.util.Map<String, ?> map) throws Exception {
        ShopStatusChangeResult self = new ShopStatusChangeResult();
        return TeaModel.build(map, self);
    }

    public ShopStatusChangeResult setOperate(Boolean operate) {
        this.operate = operate;
        return this;
    }
    public Boolean getOperate() {
        return this.operate;
    }

}
