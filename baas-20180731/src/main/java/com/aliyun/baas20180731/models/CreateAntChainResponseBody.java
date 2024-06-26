// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainResponseBodyResult result;

    public static CreateAntChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainResponseBody self = new CreateAntChainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainResponseBody setResult(CreateAntChainResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAntChainResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        public static CreateAntChainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainResponseBodyResult self = new CreateAntChainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

    }

}
