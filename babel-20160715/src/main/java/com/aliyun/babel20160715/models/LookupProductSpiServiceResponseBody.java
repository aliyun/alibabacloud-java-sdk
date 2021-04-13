// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class LookupProductSpiServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProductSpiService")
    public LookupProductSpiServiceResponseBodyProductSpiService productSpiService;

    @NameInMap("Success")
    public Boolean success;

    public static LookupProductSpiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupProductSpiServiceResponseBody self = new LookupProductSpiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupProductSpiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LookupProductSpiServiceResponseBody setProductSpiService(LookupProductSpiServiceResponseBodyProductSpiService productSpiService) {
        this.productSpiService = productSpiService;
        return this;
    }
    public LookupProductSpiServiceResponseBodyProductSpiService getProductSpiService() {
        return this.productSpiService;
    }

    public LookupProductSpiServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LookupProductSpiServiceResponseBodyProductSpiService extends TeaModel {
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

        public static LookupProductSpiServiceResponseBodyProductSpiService build(java.util.Map<String, ?> map) throws Exception {
            LookupProductSpiServiceResponseBodyProductSpiService self = new LookupProductSpiServiceResponseBodyProductSpiService();
            return TeaModel.build(map, self);
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setIsActivate(Boolean isActivate) {
            this.isActivate = isActivate;
            return this;
        }
        public Boolean getIsActivate() {
            return this.isActivate;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public LookupProductSpiServiceResponseBodyProductSpiService setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
