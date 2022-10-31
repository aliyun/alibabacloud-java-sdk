// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetMessageUserInfoResponseBodyResult result;

    public static GetMessageUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageUserInfoResponseBody self = new GetMessageUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageUserInfoResponseBody setResult(GetMessageUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMessageUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMessageUserInfoResponseBodyResult extends TeaModel {
        @NameInMap("HasOrderedIM")
        public Boolean hasOrderedIM;

        @NameInMap("IsNewIMUser")
        public Boolean isNewIMUser;

        public static GetMessageUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMessageUserInfoResponseBodyResult self = new GetMessageUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMessageUserInfoResponseBodyResult setHasOrderedIM(Boolean hasOrderedIM) {
            this.hasOrderedIM = hasOrderedIM;
            return this;
        }
        public Boolean getHasOrderedIM() {
            return this.hasOrderedIM;
        }

        public GetMessageUserInfoResponseBodyResult setIsNewIMUser(Boolean isNewIMUser) {
            this.isNewIMUser = isNewIMUser;
            return this;
        }
        public Boolean getIsNewIMUser() {
            return this.isNewIMUser;
        }

    }

}
