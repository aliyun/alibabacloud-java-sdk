// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateMemberRoleRequest extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Role")
    public Integer role;

    @NameInMap("UserId")
    public Long userId;

    public static UpdateMemberRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberRoleRequest self = new UpdateMemberRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemberRoleRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public UpdateMemberRoleRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public UpdateMemberRoleRequest setRole(Integer role) {
        this.role = role;
        return this;
    }
    public Integer getRole() {
        return this.role;
    }

    public UpdateMemberRoleRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
