// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoRequest extends TeaModel {
    /**
     * <p>Sub Account Nickname. </p>
     * <p>* Use the official name of Company, if Sub Account is an enterprise.</p>
     * <p>* Use the official name of Partner, if Sub Account is a T2 reseller.</p>
     */
    @NameInMap("AccountNickname")
    public String accountNickname;

    @NameInMap("CustomerBd")
    public String customerBd;

    /**
     * <p>Description of Sub Account.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The UID of Sub Account.</p>
     */
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

    public SetAccountInfoRequest setCustomerBd(String customerBd) {
        this.customerBd = customerBd;
        return this;
    }
    public String getCustomerBd() {
        return this.customerBd;
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
