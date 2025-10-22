// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckPushReceiverRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>破天荒的土豆</p>
     */
    @NameInMap("ReceiverAccount")
    public String receiverAccount;

    public static CheckPushReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPushReceiverRequest self = new CheckPushReceiverRequest();
        return TeaModel.build(map, self);
    }

    public CheckPushReceiverRequest setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
        return this;
    }
    public String getReceiverAccount() {
        return this.receiverAccount;
    }

}
