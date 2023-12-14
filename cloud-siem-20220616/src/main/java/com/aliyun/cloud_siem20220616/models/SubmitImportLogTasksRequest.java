// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitImportLogTasksRequest extends TeaModel {
    @NameInMap("Accounts")
    public String accounts;

    @NameInMap("AutoImported")
    public Integer autoImported;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("LogCodes")
    public String logCodes;

    @NameInMap("ProdCode")
    public String prodCode;

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
