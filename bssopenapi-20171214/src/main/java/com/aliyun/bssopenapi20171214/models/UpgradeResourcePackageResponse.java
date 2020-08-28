// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UpgradeResourcePackageResponse extends TeaModel {
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
    public UpgradeResourcePackageResponseData data;

    public static UpgradeResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeResourcePackageResponse self = new UpgradeResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public static class UpgradeResourcePackageResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        public static UpgradeResourcePackageResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeResourcePackageResponseData self = new UpgradeResourcePackageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
