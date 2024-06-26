// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class RejectUserRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("UserName")
    public String userName;

    public static RejectUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectUserRequest self = new RejectUserRequest();
        return TeaModel.build(map, self);
    }

    public RejectUserRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public RejectUserRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public RejectUserRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RejectUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
