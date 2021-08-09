// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCrossBorderPackageForComplianceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("BandwidthPackages")
    public java.util.List<ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages> bandwidthPackages;

    public static ListCrossBorderPackageForComplianceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrossBorderPackageForComplianceResponseBody self = new ListCrossBorderPackageForComplianceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrossBorderPackageForComplianceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrossBorderPackageForComplianceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCrossBorderPackageForComplianceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCrossBorderPackageForComplianceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCrossBorderPackageForComplianceResponseBody setBandwidthPackages(java.util.List<ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public java.util.List<ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public static class ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages extends TeaModel {
        @NameInMap("IsBinded")
        public Boolean isBinded;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CbnGeographicRegionIdA")
        public String cbnGeographicRegionIdA;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("CbnGeographicRegionIdB")
        public String cbnGeographicRegionIdB;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("BindTime")
        public Long bindTime;

        public static ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages self = new ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setIsBinded(Boolean isBinded) {
            this.isBinded = isBinded;
            return this;
        }
        public Boolean getIsBinded() {
            return this.isBinded;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }
        public String getCbnGeographicRegionIdA() {
            return this.cbnGeographicRegionIdA;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }
        public String getCbnGeographicRegionIdB() {
            return this.cbnGeographicRegionIdB;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListCrossBorderPackageForComplianceResponseBodyBandwidthPackages setBindTime(Long bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public Long getBindTime() {
            return this.bindTime;
        }

    }

}
