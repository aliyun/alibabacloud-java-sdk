// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesShrinkRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    public static GetDataCorrectBackupFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectBackupFilesShrinkRequest self = new GetDataCorrectBackupFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectBackupFilesShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetDataCorrectBackupFilesShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectBackupFilesShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

}
