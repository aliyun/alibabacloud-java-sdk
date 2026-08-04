// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryUserDeviceListByTmeUserIdResponseBody extends TeaModel {
    /**
     * <p>Response code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>860194F7-9593-50EA-8E53-BCEC0D325A00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Response Result</p>
     */
    @NameInMap("Result")
    public QueryUserDeviceListByTmeUserIdResponseBodyResult result;

    /**
     * <p>Flag indicating whether the invocation succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserDeviceListByTmeUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserDeviceListByTmeUserIdResponseBody self = new QueryUserDeviceListByTmeUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserDeviceListByTmeUserIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryUserDeviceListByTmeUserIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserDeviceListByTmeUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserDeviceListByTmeUserIdResponseBody setResult(QueryUserDeviceListByTmeUserIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryUserDeviceListByTmeUserIdResponseBodyResult getResult() {
        return this.result;
    }

    public QueryUserDeviceListByTmeUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList extends TeaModel {
        /**
         * <p>device name</p>
         * 
         * <strong>example:</strong>
         * <p>CC</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>Indicates whether the device is online</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>Device ID</p>
         * 
         * <strong>example:</strong>
         * <p>fjwZiYQdtkaI95fHaLNjYcaOA/mxUPzxxw2J5iBiTBnjUCWKwER4TSHCqkBnNOYvGJ4bRZA9KzBB2naS4r/Am0lSe8ECDAAOcJ9QKLFF6DM=</p>
         */
        @NameInMap("OpenDeviceId")
        public String openDeviceId;

        /**
         * <p>Device ID exposed to TME</p>
         */
        @NameInMap("TmeDeviceId")
        public String tmeDeviceId;

        /**
         * <p>TME product ID</p>
         */
        @NameInMap("TmeProductId")
        public String tmeProductId;

        public static QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList self = new QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList setOpenDeviceId(String openDeviceId) {
            this.openDeviceId = openDeviceId;
            return this;
        }
        public String getOpenDeviceId() {
            return this.openDeviceId;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList setTmeDeviceId(String tmeDeviceId) {
            this.tmeDeviceId = tmeDeviceId;
            return this;
        }
        public String getTmeDeviceId() {
            return this.tmeDeviceId;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList setTmeProductId(String tmeProductId) {
            this.tmeProductId = tmeProductId;
            return this;
        }
        public String getTmeProductId() {
            return this.tmeProductId;
        }

    }

    public static class QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList extends TeaModel {
        /**
         * <p>User Authorization device List</p>
         */
        @NameInMap("AuthorizedDeviceList")
        public java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList> authorizedDeviceList;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>R457Av3qg/OXTwVnFt12z6MwNe0HAS699V6n63OaLdu+VmwvhcNfMzBd+la553wWJhj3kBMjgHq2Y2dyCFoDBg==</p>
         */
        @NameInMap("OpenUserId")
        public String openUserId;

        /**
         * <p>User nickname</p>
         * 
         * <strong>example:</strong>
         * <p>a***e</p>
         */
        @NameInMap("UserNickname")
        public String userNickname;

        public static QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList self = new QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList();
            return TeaModel.build(map, self);
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList setAuthorizedDeviceList(java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList> authorizedDeviceList) {
            this.authorizedDeviceList = authorizedDeviceList;
            return this;
        }
        public java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList> getAuthorizedDeviceList() {
            return this.authorizedDeviceList;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList setOpenUserId(String openUserId) {
            this.openUserId = openUserId;
            return this;
        }
        public String getOpenUserId() {
            return this.openUserId;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList setUserNickname(String userNickname) {
            this.userNickname = userNickname;
            return this;
        }
        public String getUserNickname() {
            return this.userNickname;
        }

    }

    public static class QueryUserDeviceListByTmeUserIdResponseBodyResult extends TeaModel {
        /**
         * <p>Tmall Genie User List</p>
         */
        @NameInMap("AligenieUserInfoList")
        public java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList> aligenieUserInfoList;

        /**
         * <p>entity key (pass-through by third party)</p>
         * 
         * <strong>example:</strong>
         * <p>12****7</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>entity Type (pass-through by third party)</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>&quot;KG&quot;: KuGou<br>&quot;KW&quot;: Kuwo<br>&quot;QM&quot;: QQ Music</p>
         * 
         * <strong>example:</strong>
         * <p>KG</p>
         */
        @NameInMap("Sp")
        public String sp;

        public static QueryUserDeviceListByTmeUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserDeviceListByTmeUserIdResponseBodyResult self = new QueryUserDeviceListByTmeUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResult setAligenieUserInfoList(java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList> aligenieUserInfoList) {
            this.aligenieUserInfoList = aligenieUserInfoList;
            return this;
        }
        public java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList> getAligenieUserInfoList() {
            return this.aligenieUserInfoList;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResult setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResult setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryUserDeviceListByTmeUserIdResponseBodyResult setSp(String sp) {
            this.sp = sp;
            return this;
        }
        public String getSp() {
            return this.sp;
        }

    }

}
