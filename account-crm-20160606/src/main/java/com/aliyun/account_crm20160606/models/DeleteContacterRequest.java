// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DeleteContacterRequest extends TeaModel {
    @NameInMap("ContacterId")
    public Long contacterId;

    @NameInMap("UserId")
    public Long userId;

    public static DeleteContacterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContacterRequest self = new DeleteContacterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContacterRequest setContacterId(Long contacterId) {
        this.contacterId = contacterId;
        return this;
    }
    public Long getContacterId() {
        return this.contacterId;
    }

    public DeleteContacterRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
