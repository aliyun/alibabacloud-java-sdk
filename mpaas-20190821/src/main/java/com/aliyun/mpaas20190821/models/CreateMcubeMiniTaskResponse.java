// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("CreateMiniTaskResult")
    @Validation(required = true)
    public CreateMcubeMiniTaskResponseCreateMiniTaskResult createMiniTaskResult;

    public static CreateMcubeMiniTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniTaskResponse self = new CreateMcubeMiniTaskResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateMcubeMiniTaskResponseCreateMiniTaskResult extends TeaModel {
        @NameInMap("MiniTaskId")
        @Validation(required = true)
        public String miniTaskId;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static CreateMcubeMiniTaskResponseCreateMiniTaskResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeMiniTaskResponseCreateMiniTaskResult self = new CreateMcubeMiniTaskResponseCreateMiniTaskResult();
            return TeaModel.build(map, self);
        }

    }

}
