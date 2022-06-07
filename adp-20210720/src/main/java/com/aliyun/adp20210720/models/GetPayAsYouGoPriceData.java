// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceData extends TeaModel {
    // ModuleList
    @NameInMap("ModuleList")
    public java.util.List<GetPayAsYouGoPriceDataModuleList> moduleList;

    // OwnerId
    @NameInMap("OwnerId")
    public String ownerId;

    // ProductCode
    @NameInMap("ProductCode")
    public String productCode;

    // ProductType
    @NameInMap("ProductType")
    public String productType;

    // Region
    @NameInMap("Region")
    public String region;

    // SubscriptionType
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static GetPayAsYouGoPriceData build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceData self = new GetPayAsYouGoPriceData();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceData setModuleList(java.util.List<GetPayAsYouGoPriceDataModuleList> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<GetPayAsYouGoPriceDataModuleList> getModuleList() {
        return this.moduleList;
    }

    public GetPayAsYouGoPriceData setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetPayAsYouGoPriceData setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetPayAsYouGoPriceData setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetPayAsYouGoPriceData setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetPayAsYouGoPriceData setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class GetPayAsYouGoPriceDataModuleList extends TeaModel {
        // Config
        @NameInMap("Config")
        public String config;

        // ModuleCode
        @NameInMap("ModuleCode")
        public String moduleCode;

        // PriceType
        @NameInMap("PriceType")
        public String priceType;

        public static GetPayAsYouGoPriceDataModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceDataModuleList self = new GetPayAsYouGoPriceDataModuleList();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceDataModuleList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetPayAsYouGoPriceDataModuleList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetPayAsYouGoPriceDataModuleList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

    }

}
