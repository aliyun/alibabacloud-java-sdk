// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitImportLogTasksRequest extends TeaModel {
    /**
     * <p>The accounts that you want to add. The value is a JSON array. Valid values:</p>
     * <br>
     * <p>*   AccountId: the IDs of the accounts.</p>
     * <br>
     * <p>*   Imported: specifies whether to add the accounts. Valid values:</p>
     * <br>
     * <p>    *   0: no</p>
     * <p>    *   1: yes</p>
     */
    @NameInMap("Accounts")
    public String accounts;

    /**
     * <p>Specifies whether to automatically add the account for which the logging feature is configured. Valid values:</p>
     * <br>
     * <p>*   1: yes</p>
     * <p>*   0: no</p>
     */
    @NameInMap("AutoImported")
    public Integer autoImported;

    /**
     * <p>The code that is used for multi-cloud environments.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   qcloud.</p>
     * <p>*   hcloud.</p>
     * <p>*   aliyun.</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The logs that you want to collect. The value is a JSON array.</p>
     */
    @NameInMap("LogCodes")
    public String logCodes;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SubmitImportLogTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportLogTasksRequest self = new SubmitImportLogTasksRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImportLogTasksRequest setAccounts(String accounts) {
        this.accounts = accounts;
        return this;
    }
    public String getAccounts() {
        return this.accounts;
    }

    public SubmitImportLogTasksRequest setAutoImported(Integer autoImported) {
        this.autoImported = autoImported;
        return this;
    }
    public Integer getAutoImported() {
        return this.autoImported;
    }

    public SubmitImportLogTasksRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public SubmitImportLogTasksRequest setLogCodes(String logCodes) {
        this.logCodes = logCodes;
        return this;
    }
    public String getLogCodes() {
        return this.logCodes;
    }

    public SubmitImportLogTasksRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SubmitImportLogTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
