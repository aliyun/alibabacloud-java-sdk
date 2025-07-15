// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
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
