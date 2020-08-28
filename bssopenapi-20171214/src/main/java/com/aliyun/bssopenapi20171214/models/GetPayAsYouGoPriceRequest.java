// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceRequest extends TeaModel {
    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    @Validation(required = true)
    public String subscriptionType;

    @NameInMap("Region")
    public String region;

    @NameInMap("ModuleList")
    @Validation(required = true)
    public java.util.List<GetPayAsYouGoPriceRequestModuleList> moduleList;

    public static GetPayAsYouGoPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceRequest self = new GetPayAsYouGoPriceRequest();
        return TeaModel.build(map, self);
    }

    public static class GetPayAsYouGoPriceRequestModuleList extends TeaModel {
        @NameInMap("ModuleCode")
        @Validation(required = true)
        public String moduleCode;

        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        @NameInMap("PriceType")
        @Validation(required = true)
        public String priceType;

        public static GetPayAsYouGoPriceRequestModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetPayAsYouGoPriceRequestModuleList self = new GetPayAsYouGoPriceRequestModuleList();
            return TeaModel.build(map, self);
        }

    }

}
