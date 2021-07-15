// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public CreateAppResponseBodyResult result;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setResult(CreateAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppResponseBodyResult extends TeaModel {
        // 应用唯一标示
        @NameInMap("AppId")
        public String appId;

        public static CreateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyResult self = new CreateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
