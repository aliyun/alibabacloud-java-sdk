// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairResponseBody extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CloudSiteName")
    public String cloudSiteName;

    @NameInMap("Code")
    public String code;

    @NameInMap("CreatedTime")
    public Long createdTime;

    @NameInMap("LocalSiteName")
    public String localSiteName;

    @NameInMap("Message")
    public String message;

    @NameInMap("PrimarySiteId")
    public String primarySiteId;

    @NameInMap("PrimarySiteName")
    public String primarySiteName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecondarySiteId")
    public String secondarySiteId;

    @NameInMap("SecondarySiteName")
    public String secondarySiteName;

    @NameInMap("SitePairId")
    public String sitePairId;

    @NameInMap("SitePairType")
    public String sitePairType;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Version")
    public String version;

    public static DescribeSitePairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairResponseBody self = new DescribeSitePairResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DescribeSitePairResponseBody setCloudSiteName(String cloudSiteName) {
        this.cloudSiteName = cloudSiteName;
        return this;
    }
    public String getCloudSiteName() {
        return this.cloudSiteName;
    }

    public DescribeSitePairResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSitePairResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public DescribeSitePairResponseBody setLocalSiteName(String localSiteName) {
        this.localSiteName = localSiteName;
        return this;
    }
    public String getLocalSiteName() {
        return this.localSiteName;
    }

    public DescribeSitePairResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSitePairResponseBody setPrimarySiteId(String primarySiteId) {
        this.primarySiteId = primarySiteId;
        return this;
    }
    public String getPrimarySiteId() {
        return this.primarySiteId;
    }

    public DescribeSitePairResponseBody setPrimarySiteName(String primarySiteName) {
        this.primarySiteName = primarySiteName;
        return this;
    }
    public String getPrimarySiteName() {
        return this.primarySiteName;
    }

    public DescribeSitePairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSitePairResponseBody setSecondarySiteId(String secondarySiteId) {
        this.secondarySiteId = secondarySiteId;
        return this;
    }
    public String getSecondarySiteId() {
        return this.secondarySiteId;
    }

    public DescribeSitePairResponseBody setSecondarySiteName(String secondarySiteName) {
        this.secondarySiteName = secondarySiteName;
        return this;
    }
    public String getSecondarySiteName() {
        return this.secondarySiteName;
    }

    public DescribeSitePairResponseBody setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

    public DescribeSitePairResponseBody setSitePairType(String sitePairType) {
        this.sitePairType = sitePairType;
        return this;
    }
    public String getSitePairType() {
        return this.sitePairType;
    }

    public DescribeSitePairResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSitePairResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
