// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ExpectDeductResourceCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("cost")
    public Long cost;

    @NameInMap("extraInfo")
    public String extraInfo;

    @NameInMap("idempotentId")
    public String idempotentId;

    @NameInMap("resourceType")
    public Long resourceType;

    @NameInMap("subAccountId")
    public String subAccountId;

    @NameInMap("token")
    public String token;

    public static ExpectDeductResourceCmd build(java.util.Map<String, ?> map) throws Exception {
        ExpectDeductResourceCmd self = new ExpectDeductResourceCmd();
        return TeaModel.build(map, self);
    }

    public ExpectDeductResourceCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ExpectDeductResourceCmd setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public ExpectDeductResourceCmd setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ExpectDeductResourceCmd setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public ExpectDeductResourceCmd setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public ExpectDeductResourceCmd setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public ExpectDeductResourceCmd setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
