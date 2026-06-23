// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryUserInfoToMsenceResponseBody extends TeaModel {
    @NameInMap("MpaasUserInfoShareResponse")
    public QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse mpaasUserInfoShareResponse;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserInfoToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoToMsenceResponseBody self = new QueryUserInfoToMsenceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoToMsenceResponseBody setMpaasUserInfoShareResponse(QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse mpaasUserInfoShareResponse) {
        this.mpaasUserInfoShareResponse = mpaasUserInfoShareResponse;
        return this;
    }
    public QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse getMpaasUserInfoShareResponse() {
        return this.mpaasUserInfoShareResponse;
    }

    public QueryUserInfoToMsenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserInfoToMsenceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserInfoToMsenceResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserInfoToMsenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("NickName")
        public String nickName;

        public static QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse self = new QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse();
            return TeaModel.build(map, self);
        }

        public QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

}
