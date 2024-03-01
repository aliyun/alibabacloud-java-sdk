// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DirectDeductResourceCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("cost")
    public Long cost;

    @NameInMap("deductScene")
    public String deductScene;

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

    public static DirectDeductResourceCmd build(java.util.Map<String, ?> map) throws Exception {
        DirectDeductResourceCmd self = new DirectDeductResourceCmd();
        return TeaModel.build(map, self);
    }

    public DirectDeductResourceCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DirectDeductResourceCmd setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public DirectDeductResourceCmd setDeductScene(String deductScene) {
        this.deductScene = deductScene;
        return this;
    }
    public String getDeductScene() {
        return this.deductScene;
    }

    public DirectDeductResourceCmd setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public DirectDeductResourceCmd setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public DirectDeductResourceCmd setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public DirectDeductResourceCmd setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public DirectDeductResourceCmd setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
