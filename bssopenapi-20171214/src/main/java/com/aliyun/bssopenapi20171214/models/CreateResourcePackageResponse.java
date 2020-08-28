// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageResponse extends TeaModel {
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
    public CreateResourcePackageResponseData data;

    public static CreateResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageResponse self = new CreateResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateResourcePackageResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static CreateResourcePackageResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateResourcePackageResponseData self = new CreateResourcePackageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
