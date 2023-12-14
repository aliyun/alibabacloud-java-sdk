// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListImportedLogsByProdRequest extends TeaModel {
    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ListImportedLogsByProdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImportedLogsByProdRequest self = new ListImportedLogsByProdRequest();
        return TeaModel.build(map, self);
    }

    public ListImportedLogsByProdRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListImportedLogsByProdRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListImportedLogsByProdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
