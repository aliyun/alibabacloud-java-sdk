// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("CreateMiniResult")
    @Validation(required = true)
    public CreateMcubeMiniAppResponseCreateMiniResult createMiniResult;

    public static CreateMcubeMiniAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniAppResponse self = new CreateMcubeMiniAppResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateMcubeMiniAppResponseCreateMiniResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static CreateMcubeMiniAppResponseCreateMiniResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeMiniAppResponseCreateMiniResult self = new CreateMcubeMiniAppResponseCreateMiniResult();
            return TeaModel.build(map, self);
        }

    }

}
