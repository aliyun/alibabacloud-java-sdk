// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public RenewResourcePackageResponseData data;

    public static RenewResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageResponse self = new RenewResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public static class RenewResourcePackageResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static RenewResourcePackageResponseData build(java.util.Map<String, ?> map) throws Exception {
            RenewResourcePackageResponseData self = new RenewResourcePackageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
