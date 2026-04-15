// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryUserInfoToMsenceResponseBody extends TeaModel {
    @NameInMap("MpaasUserInfoShareResponse")
    public QueryUserInfoToMsenceResponseBodyMpaasUserInfoShareResponse mpaasUserInfoShareResponse;

    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
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
