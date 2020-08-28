// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("Parameter")
    public java.util.List<CreateInstanceRequestParameter> parameter;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    @Validation(required = true)
    public String subscriptionType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("RenewPeriod")
    public Integer renewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateInstanceRequestParameter extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateInstanceRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestParameter self = new CreateInstanceRequestParameter();
            return TeaModel.build(map, self);
        }

    }

}
