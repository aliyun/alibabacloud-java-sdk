// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ExistMcubeRsaKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("CheckRsaKeyResult")
    @Validation(required = true)
    public ExistMcubeRsaKeyResponseCheckRsaKeyResult checkRsaKeyResult;

    public static ExistMcubeRsaKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistMcubeRsaKeyResponse self = new ExistMcubeRsaKeyResponse();
        return TeaModel.build(map, self);
    }

    public static class ExistMcubeRsaKeyResponseCheckRsaKeyResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static ExistMcubeRsaKeyResponseCheckRsaKeyResult build(java.util.Map<String, ?> map) throws Exception {
            ExistMcubeRsaKeyResponseCheckRsaKeyResult self = new ExistMcubeRsaKeyResponseCheckRsaKeyResult();
            return TeaModel.build(map, self);
        }

    }

}
