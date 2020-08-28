// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceRequest extends TeaModel {
    @NameInMap("ServicePeriodUnit")
    public String servicePeriodUnit;

    @NameInMap("SubscriptionType")
    @Validation(required = true)
    public String subscriptionType;

    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("OrderType")
    @Validation(required = true)
    public String orderType;

    @NameInMap("ServicePeriodQuantity")
    public Integer servicePeriodQuantity;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("Region")
    public String region;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModuleList")
    @Validation(required = true)
    public java.util.List<GetSubscriptionPriceRequestModuleList> moduleList;

    @NameInMap("Quantity")
    public Integer quantity;

    public static GetSubscriptionPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceRequest self = new GetSubscriptionPriceRequest();
        return TeaModel.build(map, self);
    }

    public static class GetSubscriptionPriceRequestModuleList extends TeaModel {
        @NameInMap("ModuleCode")
        @Validation(required = true)
        public String moduleCode;

        @NameInMap("Config")
        @Validation(required = true)
        public String config;

        @NameInMap("ModuleStatus")
        public Integer moduleStatus;

        @NameInMap("Tag")
        public String tag;

        public static GetSubscriptionPriceRequestModuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionPriceRequestModuleList self = new GetSubscriptionPriceRequestModuleList();
            return TeaModel.build(map, self);
        }

    }

}
