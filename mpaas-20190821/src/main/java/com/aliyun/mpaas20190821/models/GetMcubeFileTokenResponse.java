// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class GetMcubeFileTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("GetFileTokenResult")
    @Validation(required = true)
    public GetMcubeFileTokenResponseGetFileTokenResult getFileTokenResult;

    public static GetMcubeFileTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeFileTokenResponse self = new GetMcubeFileTokenResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMcubeFileTokenResponseGetFileTokenResultFileToken extends TeaModel {
        @NameInMap("Accessid")
        @Validation(required = true)
        public String accessid;

        @NameInMap("Dir")
        @Validation(required = true)
        public String dir;

        @NameInMap("Expire")
        @Validation(required = true)
        public String expire;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("Signature")
        @Validation(required = true)
        public String signature;

        public static GetMcubeFileTokenResponseGetFileTokenResultFileToken build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeFileTokenResponseGetFileTokenResultFileToken self = new GetMcubeFileTokenResponseGetFileTokenResultFileToken();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMcubeFileTokenResponseGetFileTokenResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("FileToken")
        @Validation(required = true)
        public GetMcubeFileTokenResponseGetFileTokenResultFileToken fileToken;

        public static GetMcubeFileTokenResponseGetFileTokenResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeFileTokenResponseGetFileTokenResult self = new GetMcubeFileTokenResponseGetFileTokenResult();
            return TeaModel.build(map, self);
        }

    }

}
