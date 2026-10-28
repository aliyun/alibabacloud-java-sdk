// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoRequest extends TeaModel {
    /**
     * <p>The nickname of the sub-account. For enterprise customers, this is the company name. For T2 partners, this is the partner name.</p>
     * 
     * <strong>example:</strong>
     * <p>我的账号</p>
     */
    @NameInMap("AccountNickname")
    public String accountNickname;

    /**
     * <p>The customer business manager. Maximum length: 50 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CustomerBd")
    public String customerBd;

    /**
     * <p>The description of the sub-account.</p>
     * 
     * <strong>example:</strong>
     * <p>测试的账号</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The UID of the sub-account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1133166938931507</p>
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
