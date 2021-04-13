// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupProductSpiServiceListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProductSpiServiceList")
    public java.util.List<LookupProductSpiServiceListResponseBodyProductSpiServiceList> productSpiServiceList;

    @NameInMap("Success")
    public Boolean success;

    public static LookupProductSpiServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupProductSpiServiceListResponseBody self = new LookupProductSpiServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupProductSpiServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LookupProductSpiServiceListResponseBody setProductSpiServiceList(java.util.List<LookupProductSpiServiceListResponseBodyProductSpiServiceList> productSpiServiceList) {
        this.productSpiServiceList = productSpiServiceList;
        return this;
    }
    public java.util.List<LookupProductSpiServiceListResponseBodyProductSpiServiceList> getProductSpiServiceList() {
        return this.productSpiServiceList;
    }

    public LookupProductSpiServiceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LookupProductSpiServiceListResponseBodyProductSpiServiceList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Action")
        public String action;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Version")
        public String version;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("IsActivate")
        public Boolean isActivate;

        @NameInMap("Environment")
        public String environment;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ProductCode")
        public String productCode;

        public static LookupProductSpiServiceListResponseBodyProductSpiServiceList build(java.util.Map<String, ?> map) throws Exception {
            LookupProductSpiServiceListResponseBodyProductSpiServiceList self = new LookupProductSpiServiceListResponseBodyProductSpiServiceList();
            return TeaModel.build(map, self);
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setIsActivate(Boolean isActivate) {
            this.isActivate = isActivate;
            return this;
        }
        public Boolean getIsActivate() {
            return this.isActivate;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public LookupProductSpiServiceListResponseBodyProductSpiServiceList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
