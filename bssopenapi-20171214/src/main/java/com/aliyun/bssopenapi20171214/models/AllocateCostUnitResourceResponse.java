// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceResponse extends TeaModel {
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
    public AllocateCostUnitResourceResponseData data;

    public static AllocateCostUnitResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceResponse self = new AllocateCostUnitResourceResponse();
        return TeaModel.build(map, self);
    }

    public static class AllocateCostUnitResourceResponseData extends TeaModel {
        @NameInMap("ToUnitUserId")
        @Validation(required = true)
        public Long toUnitUserId;

        @NameInMap("ToUnitId")
        @Validation(required = true)
        public Long toUnitId;

        @NameInMap("IsSuccess")
        @Validation(required = true)
        public Boolean isSuccess;

        public static AllocateCostUnitResourceResponseData build(java.util.Map<String, ?> map) throws Exception {
            AllocateCostUnitResourceResponseData self = new AllocateCostUnitResourceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
