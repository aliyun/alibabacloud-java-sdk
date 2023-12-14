// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyBindAccountRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("BindId")
    public Long bindId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyBindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBindAccountRequest self = new ModifyBindAccountRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBindAccountRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ModifyBindAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyBindAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyBindAccountRequest setBindId(Long bindId) {
        this.bindId = bindId;
        return this;
    }
    public Long getBindId() {
        return this.bindId;
    }

    public ModifyBindAccountRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ModifyBindAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
