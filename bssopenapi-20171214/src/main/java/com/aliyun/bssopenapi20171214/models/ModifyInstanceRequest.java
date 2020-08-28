// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    @NameInMap("ProductCode")
    @Validation(required = true)
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    @Validation(required = true)
    public String subscriptionType;

    @NameInMap("ModifyType")
    @Validation(required = true)
    public String modifyType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Parameter")
    public java.util.List<ModifyInstanceRequestParameter> parameter;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRequest self = new ModifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyInstanceRequestParameter extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ModifyInstanceRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceRequestParameter self = new ModifyInstanceRequestParameter();
            return TeaModel.build(map, self);
        }

    }

}
