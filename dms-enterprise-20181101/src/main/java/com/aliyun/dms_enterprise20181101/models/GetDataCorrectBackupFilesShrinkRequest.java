// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that are required to perform the operation. You do not need to specify this parameter.</p>
     */
    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    /**
     * <p>The ID of the ticket. You can call the [ListOrders](https://help.aliyun.com/document_detail/144643.html) operation to obtain the ticket ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataCorrectBackupFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectBackupFilesShrinkRequest self = new GetDataCorrectBackupFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectBackupFilesShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

    public GetDataCorrectBackupFilesShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectBackupFilesShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
