// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class FindUserAvailbleResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("Data")
    public FindUserAvailbleResourcesResponseBodyData data;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static FindUserAvailbleResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindUserAvailbleResourcesResponseBody self = new FindUserAvailbleResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindUserAvailbleResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindUserAvailbleResourcesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public FindUserAvailbleResourcesResponseBody setData(FindUserAvailbleResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindUserAvailbleResourcesResponseBodyData getData() {
        return this.data;
    }

    public FindUserAvailbleResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public FindUserAvailbleResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindUserAvailbleResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FindUserAvailbleResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindUserAvailbleResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FindUserAvailbleResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class FindUserAvailbleResourcesResponseBodyDataPegCoordinates extends TeaModel {
        @NameInMap("BussinessCode")
        public String bussinessCode;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Coordinate")
        public java.util.Map<String, ?> coordinate;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ReleaseTime")
        public String releaseTime;

        @NameInMap("ResCreateTime")
        public String resCreateTime;

        @NameInMap("ResourceStatus")
        public String resourceStatus;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ServiceCreatedTime")
        public String serviceCreatedTime;

        @NameInMap("UserId")
        public String userId;

        public static FindUserAvailbleResourcesResponseBodyDataPegCoordinates build(java.util.Map<String, ?> map) throws Exception {
            FindUserAvailbleResourcesResponseBodyDataPegCoordinates self = new FindUserAvailbleResourcesResponseBodyDataPegCoordinates();
            return TeaModel.build(map, self);
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setBussinessCode(String bussinessCode) {
            this.bussinessCode = bussinessCode;
            return this;
        }
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setCoordinate(java.util.Map<String, ?> coordinate) {
            this.coordinate = coordinate;
            return this;
        }
        public java.util.Map<String, ?> getCoordinate() {
            return this.coordinate;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setResCreateTime(String resCreateTime) {
            this.resCreateTime = resCreateTime;
            return this;
        }
        public String getResCreateTime() {
            return this.resCreateTime;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setServiceCreatedTime(String serviceCreatedTime) {
            this.serviceCreatedTime = serviceCreatedTime;
            return this;
        }
        public String getServiceCreatedTime() {
            return this.serviceCreatedTime;
        }

        public FindUserAvailbleResourcesResponseBodyDataPegCoordinates setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FindUserAvailbleResourcesResponseBodyDataUserInfo extends TeaModel {
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

        public static FindUserAvailbleResourcesResponseBodyDataUserInfo build(java.util.Map<String, ?> map) throws Exception {
            FindUserAvailbleResourcesResponseBodyDataUserInfo self = new FindUserAvailbleResourcesResponseBodyDataUserInfo();
            return TeaModel.build(map, self);
        }

        public FindUserAvailbleResourcesResponseBodyDataUserInfo setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public FindUserAvailbleResourcesResponseBodyDataUserInfo setHitWhiteReason(String hitWhiteReason) {
            this.hitWhiteReason = hitWhiteReason;
            return this;
        }
        public String getHitWhiteReason() {
            return this.hitWhiteReason;
        }

        public FindUserAvailbleResourcesResponseBodyDataUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FindUserAvailbleResourcesResponseBodyDataUserInfo setUserSite(String userSite) {
            this.userSite = userSite;
            return this;
        }
        public String getUserSite() {
            return this.userSite;
        }

        public FindUserAvailbleResourcesResponseBodyDataUserInfo setWhiteUser(Boolean whiteUser) {
            this.whiteUser = whiteUser;
            return this;
        }
        public Boolean getWhiteUser() {
            return this.whiteUser;
        }

    }

    public static class FindUserAvailbleResourcesResponseBodyData extends TeaModel {
        @NameInMap("PegCoordinates")
        public java.util.List<FindUserAvailbleResourcesResponseBodyDataPegCoordinates> pegCoordinates;

        @NameInMap("UserInfo")
        public FindUserAvailbleResourcesResponseBodyDataUserInfo userInfo;

        public static FindUserAvailbleResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindUserAvailbleResourcesResponseBodyData self = new FindUserAvailbleResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindUserAvailbleResourcesResponseBodyData setPegCoordinates(java.util.List<FindUserAvailbleResourcesResponseBodyDataPegCoordinates> pegCoordinates) {
            this.pegCoordinates = pegCoordinates;
            return this;
        }
        public java.util.List<FindUserAvailbleResourcesResponseBodyDataPegCoordinates> getPegCoordinates() {
            return this.pegCoordinates;
        }

        public FindUserAvailbleResourcesResponseBodyData setUserInfo(FindUserAvailbleResourcesResponseBodyDataUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public FindUserAvailbleResourcesResponseBodyDataUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

}
