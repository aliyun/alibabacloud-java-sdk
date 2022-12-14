// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetAuthCodeResponseBody extends TeaModel {
    @NameInMap("AuthModel")
    public GetAuthCodeResponseBodyAuthModel authModel;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeResponseBody self = new GetAuthCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeResponseBody setAuthModel(GetAuthCodeResponseBodyAuthModel authModel) {
        this.authModel = authModel;
        return this;
    }
    public GetAuthCodeResponseBodyAuthModel getAuthModel() {
        return this.authModel;
    }

    public GetAuthCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthCodeResponseBodyAuthModel extends TeaModel {
        @NameInMap("AuthCode")
        public String authCode;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ExpireTime")
        public String expireTime;

        public static GetAuthCodeResponseBodyAuthModel build(java.util.Map<String, ?> map) throws Exception {
            GetAuthCodeResponseBodyAuthModel self = new GetAuthCodeResponseBodyAuthModel();
            return TeaModel.build(map, self);
        }

        public GetAuthCodeResponseBodyAuthModel setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

        public GetAuthCodeResponseBodyAuthModel setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public GetAuthCodeResponseBodyAuthModel setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
