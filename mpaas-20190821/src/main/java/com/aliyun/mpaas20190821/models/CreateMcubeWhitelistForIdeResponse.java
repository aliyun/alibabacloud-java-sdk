// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistForIdeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("CreateWhitelistForIdeResult")
    @Validation(required = true)
    public CreateMcubeWhitelistForIdeResponseCreateWhitelistForIdeResult createWhitelistForIdeResult;

    public static CreateMcubeWhitelistForIdeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistForIdeResponse self = new CreateMcubeWhitelistForIdeResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateMcubeWhitelistForIdeResponseCreateWhitelistForIdeResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("WhitelistId")
        @Validation(required = true)
        public String whitelistId;

        public static CreateMcubeWhitelistForIdeResponseCreateWhitelistForIdeResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeWhitelistForIdeResponseCreateWhitelistForIdeResult self = new CreateMcubeWhitelistForIdeResponseCreateWhitelistForIdeResult();
            return TeaModel.build(map, self);
        }

    }

}
