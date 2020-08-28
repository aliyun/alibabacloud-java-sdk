// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    public ModifyInstanceResponseData data;

    public static ModifyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceResponse self = new ModifyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifyInstanceResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        public static ModifyInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceResponseData self = new ModifyInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
