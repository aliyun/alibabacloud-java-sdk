// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("Region")
    public String region;

    @NameInMap("ModuleList")
    public java.util.List<GetPayAsYouGoPriceRequestModuleList> moduleList;

    public static GetPayAsYouGoPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceRequest self = new GetPayAsYouGoPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetPayAsYouGoPriceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetPayAsYouGoPriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetPayAsYouGoPriceRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public GetPayAsYouGoPriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetPayAsYouGoPriceRequest setModuleList(java.util.List<GetPayAsYouGoPriceRequestModuleList> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<GetPayAsYouGoPriceRequestModuleList> getModuleList() {
        return this.moduleList;
    }

    public static class GetPayAsYouGoPriceRequestModuleList extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("Config")
        public String config;

        public static GetPayAsYouGoPriceRequestModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceRequestModuleList self = new GetPayAsYouGoPriceRequestModuleList();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceRequestModuleList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetPayAsYouGoPriceRequestModuleList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public GetPayAsYouGoPriceRequestModuleList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
