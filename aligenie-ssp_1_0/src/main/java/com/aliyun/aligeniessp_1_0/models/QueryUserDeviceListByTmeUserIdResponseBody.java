// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryUserDeviceListByTmeUserIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryUserDeviceListByTmeUserIdResponseBodyResult result;

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
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("OpenDeviceId")
        public String openDeviceId;

        @NameInMap("TmeDeviceId")
        public String tmeDeviceId;

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
        @NameInMap("AuthorizedDeviceList")
        public java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoListAuthorizedDeviceList> authorizedDeviceList;

        @NameInMap("OpenUserId")
        public String openUserId;

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
        @NameInMap("AligenieUserInfoList")
        public java.util.List<QueryUserDeviceListByTmeUserIdResponseBodyResultAligenieUserInfoList> aligenieUserInfoList;

        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

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
