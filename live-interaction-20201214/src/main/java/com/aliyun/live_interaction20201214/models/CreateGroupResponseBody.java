// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateGroupResponseBodyResult result;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupResponseBody setResult(CreateGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateGroupResponseBodyResult extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        public static CreateGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseBodyResult self = new CreateGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseBodyResult setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

    }

}
