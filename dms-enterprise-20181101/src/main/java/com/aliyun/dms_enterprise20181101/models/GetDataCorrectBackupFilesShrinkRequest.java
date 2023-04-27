// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesShrinkRequest extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    /**
     * <p>The download URL of the backup file for the ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The parameters that are required to perform the operation. You do not need to specify this parameter.</p>
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
