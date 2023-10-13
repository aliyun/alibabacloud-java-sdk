// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoRequest extends TeaModel {
    @NameInMap("AccountNickname")
    public String accountNickname;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Uid")
    public Long uid;

    public static SetAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccountInfoRequest self = new SetAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetAccountInfoRequest setAccountNickname(String accountNickname) {
        this.accountNickname = accountNickname;
        return this;
    }
    public String getAccountNickname() {
        return this.accountNickname;
    }

    public SetAccountInfoRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SetAccountInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
