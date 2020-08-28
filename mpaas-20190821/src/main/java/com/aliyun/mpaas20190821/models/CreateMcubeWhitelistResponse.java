// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("CreateWhitelistResult")
    @Validation(required = true)
    public CreateMcubeWhitelistResponseCreateWhitelistResult createWhitelistResult;

    public static CreateMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistResponse self = new CreateMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateMcubeWhitelistResponseCreateWhitelistResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("WhitelistId")
        @Validation(required = true)
        public String whitelistId;

        public static CreateMcubeWhitelistResponseCreateWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeWhitelistResponseCreateWhitelistResult self = new CreateMcubeWhitelistResponseCreateWhitelistResult();
            return TeaModel.build(map, self);
        }

    }

}
