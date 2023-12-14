// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountsByLogRequest extends TeaModel {
    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("LogCodes")
    public java.util.List<String> logCodes;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ListAccountsByLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsByLogRequest self = new ListAccountsByLogRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountsByLogRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListAccountsByLogRequest setLogCodes(java.util.List<String> logCodes) {
        this.logCodes = logCodes;
        return this;
    }
    public java.util.List<String> getLogCodes() {
        return this.logCodes;
    }

    public ListAccountsByLogRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListAccountsByLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
