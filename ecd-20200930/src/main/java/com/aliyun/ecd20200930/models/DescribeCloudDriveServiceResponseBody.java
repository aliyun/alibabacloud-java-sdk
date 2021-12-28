// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveServiceResponseBody extends TeaModel {
    @NameInMap("CloudDriveServices")
    public java.util.List<DescribeCloudDriveServiceResponseBodyCloudDriveServices> cloudDriveServices;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudDriveServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveServiceResponseBody self = new DescribeCloudDriveServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveServiceResponseBody setCloudDriveServices(java.util.List<DescribeCloudDriveServiceResponseBodyCloudDriveServices> cloudDriveServices) {
        this.cloudDriveServices = cloudDriveServices;
        return this;
    }
    public java.util.List<DescribeCloudDriveServiceResponseBodyCloudDriveServices> getCloudDriveServices() {
        return this.cloudDriveServices;
    }

    public DescribeCloudDriveServiceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDriveServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudDriveServiceResponseBodyCloudDriveServices extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("CdsChargeStatus")
        public String cdsChargeStatus;

        @NameInMap("CdsChargeType")
        public String cdsChargeType;

        @NameInMap("CdsId")
        public String cdsId;

        @NameInMap("CdsName")
        public String cdsName;

        @NameInMap("CdsReleaseDeadline")
        public String cdsReleaseDeadline;

        @NameInMap("CdsStatus")
        public String cdsStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MaxSize")
        public Long maxSize;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("PdsAdministrator")
        public String pdsAdministrator;

        @NameInMap("PdsDomainId")
        public String pdsDomainId;

        @NameInMap("PdsEndpoint")
        public String pdsEndpoint;

        @NameInMap("PdsInitToken")
        public String pdsInitToken;

        @NameInMap("PdsProductName")
        public String pdsProductName;

        @NameInMap("PdsSubdomainId")
        public String pdsSubdomainId;

        @NameInMap("PdsUrl")
        public String pdsUrl;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeCloudDriveServiceResponseBodyCloudDriveServices build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDriveServiceResponseBodyCloudDriveServices self = new DescribeCloudDriveServiceResponseBodyCloudDriveServices();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCdsChargeStatus(String cdsChargeStatus) {
            this.cdsChargeStatus = cdsChargeStatus;
            return this;
        }
        public String getCdsChargeStatus() {
            return this.cdsChargeStatus;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCdsChargeType(String cdsChargeType) {
            this.cdsChargeType = cdsChargeType;
            return this;
        }
        public String getCdsChargeType() {
            return this.cdsChargeType;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCdsId(String cdsId) {
            this.cdsId = cdsId;
            return this;
        }
        public String getCdsId() {
            return this.cdsId;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCdsName(String cdsName) {
            this.cdsName = cdsName;
            return this;
        }
        public String getCdsName() {
            return this.cdsName;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCdsReleaseDeadline(String cdsReleaseDeadline) {
            this.cdsReleaseDeadline = cdsReleaseDeadline;
            return this;
        }
        public String getCdsReleaseDeadline() {
            return this.cdsReleaseDeadline;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCdsStatus(String cdsStatus) {
            this.cdsStatus = cdsStatus;
            return this;
        }
        public String getCdsStatus() {
            return this.cdsStatus;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setMaxSize(Long maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Long getMaxSize() {
            return this.maxSize;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsAdministrator(String pdsAdministrator) {
            this.pdsAdministrator = pdsAdministrator;
            return this;
        }
        public String getPdsAdministrator() {
            return this.pdsAdministrator;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsDomainId(String pdsDomainId) {
            this.pdsDomainId = pdsDomainId;
            return this;
        }
        public String getPdsDomainId() {
            return this.pdsDomainId;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsEndpoint(String pdsEndpoint) {
            this.pdsEndpoint = pdsEndpoint;
            return this;
        }
        public String getPdsEndpoint() {
            return this.pdsEndpoint;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsInitToken(String pdsInitToken) {
            this.pdsInitToken = pdsInitToken;
            return this;
        }
        public String getPdsInitToken() {
            return this.pdsInitToken;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsProductName(String pdsProductName) {
            this.pdsProductName = pdsProductName;
            return this;
        }
        public String getPdsProductName() {
            return this.pdsProductName;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsSubdomainId(String pdsSubdomainId) {
            this.pdsSubdomainId = pdsSubdomainId;
            return this;
        }
        public String getPdsSubdomainId() {
            return this.pdsSubdomainId;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setPdsUrl(String pdsUrl) {
            this.pdsUrl = pdsUrl;
            return this;
        }
        public String getPdsUrl() {
            return this.pdsUrl;
        }

        public DescribeCloudDriveServiceResponseBodyCloudDriveServices setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
