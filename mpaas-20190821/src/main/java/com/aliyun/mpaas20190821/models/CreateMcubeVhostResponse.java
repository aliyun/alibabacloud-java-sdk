// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeVhostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("CreateVhostResult")
    @Validation(required = true)
    public CreateMcubeVhostResponseCreateVhostResult createVhostResult;

    public static CreateMcubeVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeVhostResponse self = new CreateMcubeVhostResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateMcubeVhostResponseCreateVhostResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static CreateMcubeVhostResponseCreateVhostResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeVhostResponseCreateVhostResult self = new CreateMcubeVhostResponseCreateVhostResult();
            return TeaModel.build(map, self);
        }

    }

}
