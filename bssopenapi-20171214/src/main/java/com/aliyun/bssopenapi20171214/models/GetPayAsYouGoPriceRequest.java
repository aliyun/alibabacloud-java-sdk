// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceRequest extends TeaModel {
    /**
     * <p>The details of pricing modules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModuleList")
    public java.util.List<GetPayAsYouGoPriceRequestModuleList> moduleList;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The billing method. Set the value to PayAsYouGo.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static GetPayAsYouGoPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceRequest self = new GetPayAsYouGoPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceRequest setModuleList(java.util.List<GetPayAsYouGoPriceRequestModuleList> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<GetPayAsYouGoPriceRequestModuleList> getModuleList() {
        return this.moduleList;
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

    public GetPayAsYouGoPriceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetPayAsYouGoPriceRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static class GetPayAsYouGoPriceRequestModuleList extends TeaModel {
        /**
         * <p>The configuration of the Nth pricing module. Valid values of N: 1 to 50. Format: AA:aa,BB:bb. The values of AA and BB are the property IDs of the pricing module. The values of aa and bb are the property values of the pricing module.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a> operation to obtain the configuration parameters of the pricing module.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType:ecs.g5.xlarge,IoOptimized:IoOptimized,ImageOs:linux</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The code of the Nth pricing module.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a> operation to obtain the module code.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The price type of the Nth pricing module. Valid values:</p>
         * <ul>
         * <li>Hour: hourly price</li>
         * <li>Usage: usage price</li>
         * <li>Month: monthly price</li>
         * <li>Year: annual price</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a> operation to obtain the configuration parameters of the pricing module.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        @NameInMap("PriceType")
        public String priceType;

        public static GetPayAsYouGoPriceRequestModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceRequestModuleList self = new GetPayAsYouGoPriceRequestModuleList();
            return TeaModel.build(map, self);
        }

        public GetPayAsYouGoPriceRequestModuleList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
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

    }

}
