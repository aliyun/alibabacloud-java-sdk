// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetRiskListRequest extends TeaModel {
    @NameInMap("IpAddrList")
    public java.util.List<String> ipAddrList;

    @NameInMap("IpVersion")
    public Integer ipVersion;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAssetRiskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetRiskListRequest self = new DescribeAssetRiskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetRiskListRequest setIpAddrList(java.util.List<String> ipAddrList) {
        this.ipAddrList = ipAddrList;
        return this;
    }
    public java.util.List<String> getIpAddrList() {
        return this.ipAddrList;
    }

    public DescribeAssetRiskListRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public DescribeAssetRiskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAssetRiskListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
