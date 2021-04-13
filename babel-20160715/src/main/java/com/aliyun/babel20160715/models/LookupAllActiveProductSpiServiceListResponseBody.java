// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupAllActiveProductSpiServiceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProductSpiServiceList")
    public java.util.List<LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList> productSpiServiceList;

    @NameInMap("Success")
    public Boolean success;

    public static LookupAllActiveProductSpiServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupAllActiveProductSpiServiceListResponseBody self = new LookupAllActiveProductSpiServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupAllActiveProductSpiServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LookupAllActiveProductSpiServiceListResponseBody setProductSpiServiceList(java.util.List<LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList> productSpiServiceList) {
        this.productSpiServiceList = productSpiServiceList;
        return this;
    }
    public java.util.List<LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList> getProductSpiServiceList() {
        return this.productSpiServiceList;
    }

    public LookupAllActiveProductSpiServiceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("isDefault")
        public Boolean isDefault;

        @NameInMap("Action")
        public String action;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("SpiChannel")
        public String spiChannel;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("IsActivate")
        public Boolean isActivate;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TargetRegion")
        public String targetRegion;

        @NameInMap("Version")
        public String version;

        @NameInMap("SpiGroup")
        public String spiGroup;

        @NameInMap("Environment")
        public String environment;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProductCode")
        public String productCode;

        public static LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList build(java.util.Map<String, ?> map) throws Exception {
            LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList self = new LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList();
            return TeaModel.build(map, self);
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setSpiChannel(String spiChannel) {
            this.spiChannel = spiChannel;
            return this;
        }
        public String getSpiChannel() {
            return this.spiChannel;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setIsActivate(Boolean isActivate) {
            this.isActivate = isActivate;
            return this;
        }
        public Boolean getIsActivate() {
            return this.isActivate;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setSpiGroup(String spiGroup) {
            this.spiGroup = spiGroup;
            return this;
        }
        public String getSpiGroup() {
            return this.spiGroup;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public LookupAllActiveProductSpiServiceListResponseBodyProductSpiServiceList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
