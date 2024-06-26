// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class OperateUserRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Operation")
    public Integer operation;

    @NameInMap("UserName")
    public String userName;

    public static OperateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateUserRequest self = new OperateUserRequest();
        return TeaModel.build(map, self);
    }

    public OperateUserRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public OperateUserRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public OperateUserRequest setOperation(Integer operation) {
        this.operation = operation;
        return this;
    }
    public Integer getOperation() {
        return this.operation;
    }

    public OperateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
