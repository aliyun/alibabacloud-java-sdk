// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SetAccountInfoRequest extends TeaModel {
    /**
     * <p>Result Code:</p>
     * <ul>
     * <li>200 OK</li>
     * <li>1109 System error</li>
     * <li>3030 Sub Account Nickname exceeds maximum length,  maximum length 150 bytes.</li>
     * <li>3031 Remark exceeds maximum length,  maximum length 3000 bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Message information</p>
     */
    @NameInMap("AccountNickname")
    public String accountNickname;

    /**
     * <p>Customer manager（limited 50 character）</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("CustomerBd")
    public String customerBd;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
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
