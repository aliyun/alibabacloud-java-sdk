// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageSummaryNewResponseBody extends TeaModel {
    @NameInMap("CertifyType")
    public Integer certifyType;

    @NameInMap("InterPackageCount")
    public Long interPackageCount;

    @NameInMap("InterPackageSum")
    public Long interPackageSum;

    @NameInMap("MktPackageCount")
    public Long mktPackageCount;

    @NameInMap("MktPackageSum")
    public Long mktPackageSum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsPackageCount")
    public Long smsPackageCount;

    @NameInMap("SmsPackageSum")
    public Long smsPackageSum;

    @NameInMap("SysPackageCount")
    public Long sysPackageCount;

    @NameInMap("SysPackageSum")
    public Long sysPackageSum;

    public static QuerySmsPackageSummaryNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageSummaryNewResponseBody self = new QuerySmsPackageSummaryNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageSummaryNewResponseBody setCertifyType(Integer certifyType) {
        this.certifyType = certifyType;
        return this;
    }
    public Integer getCertifyType() {
        return this.certifyType;
    }

    public QuerySmsPackageSummaryNewResponseBody setInterPackageCount(Long interPackageCount) {
        this.interPackageCount = interPackageCount;
        return this;
    }
    public Long getInterPackageCount() {
        return this.interPackageCount;
    }

    public QuerySmsPackageSummaryNewResponseBody setInterPackageSum(Long interPackageSum) {
        this.interPackageSum = interPackageSum;
        return this;
    }
    public Long getInterPackageSum() {
        return this.interPackageSum;
    }

    public QuerySmsPackageSummaryNewResponseBody setMktPackageCount(Long mktPackageCount) {
        this.mktPackageCount = mktPackageCount;
        return this;
    }
    public Long getMktPackageCount() {
        return this.mktPackageCount;
    }

    public QuerySmsPackageSummaryNewResponseBody setMktPackageSum(Long mktPackageSum) {
        this.mktPackageSum = mktPackageSum;
        return this;
    }
    public Long getMktPackageSum() {
        return this.mktPackageSum;
    }

    public QuerySmsPackageSummaryNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsPackageSummaryNewResponseBody setSmsPackageCount(Long smsPackageCount) {
        this.smsPackageCount = smsPackageCount;
        return this;
    }
    public Long getSmsPackageCount() {
        return this.smsPackageCount;
    }

    public QuerySmsPackageSummaryNewResponseBody setSmsPackageSum(Long smsPackageSum) {
        this.smsPackageSum = smsPackageSum;
        return this;
    }
    public Long getSmsPackageSum() {
        return this.smsPackageSum;
    }

    public QuerySmsPackageSummaryNewResponseBody setSysPackageCount(Long sysPackageCount) {
        this.sysPackageCount = sysPackageCount;
        return this;
    }
    public Long getSysPackageCount() {
        return this.sysPackageCount;
    }

    public QuerySmsPackageSummaryNewResponseBody setSysPackageSum(Long sysPackageSum) {
        this.sysPackageSum = sysPackageSum;
        return this;
    }
    public Long getSysPackageSum() {
        return this.sysPackageSum;
    }

}
