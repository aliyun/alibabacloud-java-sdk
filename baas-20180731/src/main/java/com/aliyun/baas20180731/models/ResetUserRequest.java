// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetUserRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Operation")
    public Integer operation;

    @NameInMap("UserName")
    public String userName;

    public static ResetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserRequest self = new ResetUserRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ResetUserRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ResetUserRequest setOperation(Integer operation) {
        this.operation = operation;
        return this;
    }
    public Integer getOperation() {
        return this.operation;
    }

    public ResetUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
