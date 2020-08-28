// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class DeleteMcubeWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("DeleteWhitelistResult")
    @Validation(required = true)
    public DeleteMcubeWhitelistResponseDeleteWhitelistResult deleteWhitelistResult;

    public static DeleteMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeWhitelistResponse self = new DeleteMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMcubeWhitelistResponseDeleteWhitelistResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static DeleteMcubeWhitelistResponseDeleteWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeWhitelistResponseDeleteWhitelistResult self = new DeleteMcubeWhitelistResponseDeleteWhitelistResult();
            return TeaModel.build(map, self);
        }

    }

}
