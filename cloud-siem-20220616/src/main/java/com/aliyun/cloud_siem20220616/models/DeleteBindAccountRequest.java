// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteBindAccountRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("BindId")
    public Long bindId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindAccountRequest self = new DeleteBindAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBindAccountRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DeleteBindAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteBindAccountRequest setBindId(Long bindId) {
        this.bindId = bindId;
        return this;
    }
    public Long getBindId() {
        return this.bindId;
    }

    public DeleteBindAccountRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public DeleteBindAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
