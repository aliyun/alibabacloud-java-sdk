// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class UploadMcubeRsaKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("UploadRsaResult")
    @Validation(required = true)
    public UploadMcubeRsaKeyResponseUploadRsaResult uploadRsaResult;

    public static UploadMcubeRsaKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeRsaKeyResponse self = new UploadMcubeRsaKeyResponse();
        return TeaModel.build(map, self);
    }

    public static class UploadMcubeRsaKeyResponseUploadRsaResult extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static UploadMcubeRsaKeyResponseUploadRsaResult build(java.util.Map<String, ?> map) throws Exception {
            UploadMcubeRsaKeyResponseUploadRsaResult self = new UploadMcubeRsaKeyResponseUploadRsaResult();
            return TeaModel.build(map, self);
        }

    }

}
