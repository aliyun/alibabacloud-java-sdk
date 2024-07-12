// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class FindInstanceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public FindInstanceInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindInstanceInfoResponseBody self = new FindInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public FindInstanceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindInstanceInfoResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public FindInstanceInfoResponseBody setData(FindInstanceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindInstanceInfoResponseBodyData getData() {
        return this.data;
    }

    public FindInstanceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindInstanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo extends TeaModel {
        @NameInMap("GcLevel")
        public String gcLevel;

        @NameInMap("HitWhiteReason")
        public String hitWhiteReason;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserSite")
        public String userSite;

        @NameInMap("WhiteUser")
        public Boolean whiteUser;

        public static FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo build(java.util.Map<String, ?> map) throws Exception {
            FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo self = new FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo();
            return TeaModel.build(map, self);
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo setHitWhiteReason(String hitWhiteReason) {
            this.hitWhiteReason = hitWhiteReason;
            return this;
        }
        public String getHitWhiteReason() {
            return this.hitWhiteReason;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo setUserSite(String userSite) {
            this.userSite = userSite;
            return this;
        }
        public String getUserSite() {
            return this.userSite;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo setWhiteUser(Boolean whiteUser) {
            this.whiteUser = whiteUser;
            return this;
        }
        public Boolean getWhiteUser() {
            return this.whiteUser;
        }

    }

    public static class FindInstanceInfoResponseBodyDataPegInstanceInfoList extends TeaModel {
        @NameInMap("BussinessCode")
        public String bussinessCode;

        @NameInMap("Coordinate")
        public java.util.Map<String, ?> coordinate;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ServiceCreatedTime")
        public String serviceCreatedTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserInfo")
        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo userInfo;

        public static FindInstanceInfoResponseBodyDataPegInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            FindInstanceInfoResponseBodyDataPegInstanceInfoList self = new FindInstanceInfoResponseBodyDataPegInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setBussinessCode(String bussinessCode) {
            this.bussinessCode = bussinessCode;
            return this;
        }
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setCoordinate(java.util.Map<String, ?> coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public java.util.Map<String, ?> getCoordinate() {
            return this.coordinate;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setServiceCreatedTime(String serviceCreatedTime) {
            this.serviceCreatedTime = serviceCreatedTime;
            return this;
        }
        public String getServiceCreatedTime() {
            return this.serviceCreatedTime;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FindInstanceInfoResponseBodyDataPegInstanceInfoList setUserInfo(FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public FindInstanceInfoResponseBodyDataPegInstanceInfoListUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

    public static class FindInstanceInfoResponseBodyData extends TeaModel {
        @NameInMap("PegInstanceInfoList")
        public java.util.List<FindInstanceInfoResponseBodyDataPegInstanceInfoList> pegInstanceInfoList;

        public static FindInstanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindInstanceInfoResponseBodyData self = new FindInstanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindInstanceInfoResponseBodyData setPegInstanceInfoList(java.util.List<FindInstanceInfoResponseBodyDataPegInstanceInfoList> pegInstanceInfoList) {
            this.pegInstanceInfoList = pegInstanceInfoList;
            return this;
        }
        public java.util.List<FindInstanceInfoResponseBodyDataPegInstanceInfoList> getPegInstanceInfoList() {
            return this.pegInstanceInfoList;
        }

    }

}
