// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class DeleteMcubeMiniAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("DeleteMiniResult")
    @Validation(required = true)
    public DeleteMcubeMiniAppResponseDeleteMiniResult deleteMiniResult;

    public static DeleteMcubeMiniAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeMiniAppResponse self = new DeleteMcubeMiniAppResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMcubeMiniAppResponseDeleteMiniResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static DeleteMcubeMiniAppResponseDeleteMiniResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeMiniAppResponseDeleteMiniResult self = new DeleteMcubeMiniAppResponseDeleteMiniResult();
            return TeaModel.build(map, self);
        }

    }

}
