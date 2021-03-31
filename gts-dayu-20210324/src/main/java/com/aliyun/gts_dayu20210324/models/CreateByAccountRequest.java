// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class CreateByAccountRequest extends TeaModel {
    // phone
    @NameInMap("Phone")
    public String phone;

    // dingOrgId
    @NameInMap("DingOrgId")
    public String dingOrgId;

    // accountUserId
    @NameInMap("AccountUserId")
    public String accountUserId;

    public static CreateByAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateByAccountRequest self = new CreateByAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateByAccountRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateByAccountRequest setDingOrgId(String dingOrgId) {
        this.dingOrgId = dingOrgId;
        return this;
    }
    public String getDingOrgId() {
        return this.dingOrgId;
    }

    public CreateByAccountRequest setAccountUserId(String accountUserId) {
        this.accountUserId = accountUserId;
        return this;
    }
    public String getAccountUserId() {
        return this.accountUserId;
    }

}
