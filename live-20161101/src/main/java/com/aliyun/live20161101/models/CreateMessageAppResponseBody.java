// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateMessageAppResponseBodyResult result;

    public static CreateMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageAppResponseBody self = new CreateMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMessageAppResponseBody setResult(CreateMessageAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMessageAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateMessageAppResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        public static CreateMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageAppResponseBodyResult self = new CreateMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMessageAppResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
