// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BindAccountRequest extends TeaModel {
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
     * <p>The username of the cloud account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The code of the cloud service provider.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   qcloud</p>
     * <p>*   hcloud</p>
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

    public static BindAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAccountRequest self = new BindAccountRequest();
        return TeaModel.build(map, self);
    }

    public BindAccountRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public BindAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BindAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BindAccountRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public BindAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
