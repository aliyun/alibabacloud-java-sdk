// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InviteUserRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("UserEmail")
    public String userEmail;

    @NameInMap("UserId")
    public Long userId;

    public static InviteUserRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteUserRequest self = new InviteUserRequest();
        return TeaModel.build(map, self);
    }

    public InviteUserRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public InviteUserRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public InviteUserRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public InviteUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
