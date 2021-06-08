// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOfflineLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Fields")
    public java.util.List<String> fields;

    @NameInMap("Domains")
    public java.util.List<DescribeDcdnOfflineLogDeliveryResponseBodyDomains> domains;

    @NameInMap("Regions")
    public java.util.List<DescribeDcdnOfflineLogDeliveryResponseBodyRegions> regions;

    public static DescribeDcdnOfflineLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOfflineLogDeliveryResponseBody self = new DescribeDcdnOfflineLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOfflineLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnOfflineLogDeliveryResponseBody setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public DescribeDcdnOfflineLogDeliveryResponseBody setDomains(java.util.List<DescribeDcdnOfflineLogDeliveryResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDcdnOfflineLogDeliveryResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDcdnOfflineLogDeliveryResponseBody setRegions(java.util.List<DescribeDcdnOfflineLogDeliveryResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeDcdnOfflineLogDeliveryResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public static class DescribeDcdnOfflineLogDeliveryResponseBodyDomains extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        public static DescribeDcdnOfflineLogDeliveryResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnOfflineLogDeliveryResponseBodyDomains self = new DescribeDcdnOfflineLogDeliveryResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeDcdnOfflineLogDeliveryResponseBodyRegions extends TeaModel {
        @NameInMap("OssId")
        public Integer ossId;

        @NameInMap("OssPathPrefix")
        public String ossPathPrefix;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AreaName")
        public String areaName;

        @NameInMap("DlaTableName")
        public String dlaTableName;

        @NameInMap("DlaVcName")
        public String dlaVcName;

        @NameInMap("DlaDbName")
        public String dlaDbName;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("IsOverseas")
        public String isOverseas;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        public static DescribeDcdnOfflineLogDeliveryResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnOfflineLogDeliveryResponseBodyRegions self = new DescribeDcdnOfflineLogDeliveryResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setOssId(Integer ossId) {
            this.ossId = ossId;
            return this;
        }
        public Integer getOssId() {
            return this.ossId;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setOssPathPrefix(String ossPathPrefix) {
            this.ossPathPrefix = ossPathPrefix;
            return this;
        }
        public String getOssPathPrefix() {
            return this.ossPathPrefix;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setDlaTableName(String dlaTableName) {
            this.dlaTableName = dlaTableName;
            return this;
        }
        public String getDlaTableName() {
            return this.dlaTableName;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setDlaVcName(String dlaVcName) {
            this.dlaVcName = dlaVcName;
            return this;
        }
        public String getDlaVcName() {
            return this.dlaVcName;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setDlaDbName(String dlaDbName) {
            this.dlaDbName = dlaDbName;
            return this;
        }
        public String getDlaDbName() {
            return this.dlaDbName;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setIsOverseas(String isOverseas) {
            this.isOverseas = isOverseas;
            return this;
        }
        public String getIsOverseas() {
            return this.isOverseas;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public DescribeDcdnOfflineLogDeliveryResponseBodyRegions setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

    }

}
