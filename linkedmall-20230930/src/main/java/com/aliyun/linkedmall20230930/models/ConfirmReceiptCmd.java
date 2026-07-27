// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ConfirmReceiptCmd extends TeaModel {
    @NameInMap("disputeId")
    public String disputeId;

    public static ConfirmReceiptCmd build(java.util.Map<String, ?> map) throws Exception {
        ConfirmReceiptCmd self = new ConfirmReceiptCmd();
        return TeaModel.build(map, self);
    }

    public ConfirmReceiptCmd setDisputeId(String disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public String getDisputeId() {
        return this.disputeId;
    }

}
