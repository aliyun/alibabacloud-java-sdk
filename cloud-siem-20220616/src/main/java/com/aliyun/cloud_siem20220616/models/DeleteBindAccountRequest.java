// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteBindAccountRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the cloud account.</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>The ID of the cloud account.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The ID generated when the account is added to the threat analysis feature. You can call the [ListBindAccount](https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854\&activeTabKey=api%7CListBindAccount) operation to query the ID.</p>
     */
    @NameInMap("BindId")
    public Long bindId;

    /**
     * <p>The code of the cloud service provider. Valid values:</p>
     * <br>
     * <p>*   qcloud: Tencent Cloud</p>
     * <p>*   aliyun: Alibaba Cloud</p>
     * <p>*   hcloud: Huawei Cloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
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
