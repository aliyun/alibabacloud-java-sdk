// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class FindGuestTicketRecordResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<FindGuestTicketRecordResponseBodyData> data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindGuestTicketRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindGuestTicketRecordResponseBody self = new FindGuestTicketRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public FindGuestTicketRecordResponseBody setData(java.util.List<FindGuestTicketRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FindGuestTicketRecordResponseBodyData> getData() {
        return this.data;
    }

    public FindGuestTicketRecordResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public FindGuestTicketRecordResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public FindGuestTicketRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindGuestTicketRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner extends TeaModel {
        @NameInMap("OwnerEmpIdOrTelephone")
        public String ownerEmpIdOrTelephone;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerNickName")
        public String ownerNickName;

        public static FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner build(java.util.Map<String, ?> map) throws Exception {
            FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner self = new FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner();
            return TeaModel.build(map, self);
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner setOwnerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
            this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
            return this;
        }
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

    }

    public static class FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner extends TeaModel {
        @NameInMap("OwnerEmpIdOrTelephone")
        public String ownerEmpIdOrTelephone;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerNickName")
        public String ownerNickName;

        public static FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner build(java.util.Map<String, ?> map) throws Exception {
            FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner self = new FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner();
            return TeaModel.build(map, self);
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner setOwnerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
            this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
            return this;
        }
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

    }

    public static class FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner extends TeaModel {
        @NameInMap("OwnerEmpIdOrTelephone")
        public String ownerEmpIdOrTelephone;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerNickName")
        public String ownerNickName;

        public static FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner build(java.util.Map<String, ?> map) throws Exception {
            FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner self = new FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner();
            return TeaModel.build(map, self);
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner setOwnerEmpIdOrTelephone(String ownerEmpIdOrTelephone) {
            this.ownerEmpIdOrTelephone = ownerEmpIdOrTelephone;
            return this;
        }
        public String getOwnerEmpIdOrTelephone() {
            return this.ownerEmpIdOrTelephone;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner setOwnerNickName(String ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public String getOwnerNickName() {
            return this.ownerNickName;
        }

    }

    public static class FindGuestTicketRecordResponseBodyDataChannelLevelInfo extends TeaModel {
        @NameInMap("ChannelId")
        public Long channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("LevelOneChannelName")
        public String levelOneChannelName;

        @NameInMap("LevelOneOwner")
        public java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner> levelOneOwner;

        @NameInMap("LevelThreeChannelName")
        public String levelThreeChannelName;

        @NameInMap("LevelThreeOwner")
        public java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner> levelThreeOwner;

        @NameInMap("LevelTwoChannelName")
        public String levelTwoChannelName;

        @NameInMap("LevelTwoOwner")
        public java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner> levelTwoOwner;

        public static FindGuestTicketRecordResponseBodyDataChannelLevelInfo build(java.util.Map<String, ?> map) throws Exception {
            FindGuestTicketRecordResponseBodyDataChannelLevelInfo self = new FindGuestTicketRecordResponseBodyDataChannelLevelInfo();
            return TeaModel.build(map, self);
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setChannelId(Long channelId) {
            this.channelId = channelId;
            return this;
        }
        public Long getChannelId() {
            return this.channelId;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setLevelOneChannelName(String levelOneChannelName) {
            this.levelOneChannelName = levelOneChannelName;
            return this;
        }
        public String getLevelOneChannelName() {
            return this.levelOneChannelName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setLevelOneOwner(java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner> levelOneOwner) {
            this.levelOneOwner = levelOneOwner;
            return this;
        }
        public java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelOneOwner> getLevelOneOwner() {
            return this.levelOneOwner;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setLevelThreeChannelName(String levelThreeChannelName) {
            this.levelThreeChannelName = levelThreeChannelName;
            return this;
        }
        public String getLevelThreeChannelName() {
            return this.levelThreeChannelName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setLevelThreeOwner(java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner> levelThreeOwner) {
            this.levelThreeOwner = levelThreeOwner;
            return this;
        }
        public java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelThreeOwner> getLevelThreeOwner() {
            return this.levelThreeOwner;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setLevelTwoChannelName(String levelTwoChannelName) {
            this.levelTwoChannelName = levelTwoChannelName;
            return this;
        }
        public String getLevelTwoChannelName() {
            return this.levelTwoChannelName;
        }

        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo setLevelTwoOwner(java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner> levelTwoOwner) {
            this.levelTwoOwner = levelTwoOwner;
            return this;
        }
        public java.util.List<FindGuestTicketRecordResponseBodyDataChannelLevelInfoLevelTwoOwner> getLevelTwoOwner() {
            return this.levelTwoOwner;
        }

    }

    public static class FindGuestTicketRecordResponseBodyData extends TeaModel {
        @NameInMap("ChannelLevelInfo")
        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo channelLevelInfo;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("EquityDates")
        public String equityDates;

        @NameInMap("FaceFeature")
        public String faceFeature;

        @NameInMap("FaceFeatureWriteTime")
        public String faceFeatureWriteTime;

        @NameInMap("HealthCommitmentStatus")
        public Integer healthCommitmentStatus;

        @NameInMap("IdNumber")
        public String idNumber;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TicketCode")
        public String ticketCode;

        @NameInMap("TicketName")
        public String ticketName;

        @NameInMap("TicketReceiveDates")
        public String ticketReceiveDates;

        @NameInMap("TicketType")
        public String ticketType;

        public static FindGuestTicketRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindGuestTicketRecordResponseBodyData self = new FindGuestTicketRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindGuestTicketRecordResponseBodyData setChannelLevelInfo(FindGuestTicketRecordResponseBodyDataChannelLevelInfo channelLevelInfo) {
            this.channelLevelInfo = channelLevelInfo;
            return this;
        }
        public FindGuestTicketRecordResponseBodyDataChannelLevelInfo getChannelLevelInfo() {
            return this.channelLevelInfo;
        }

        public FindGuestTicketRecordResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public FindGuestTicketRecordResponseBodyData setEquityDates(String equityDates) {
            this.equityDates = equityDates;
            return this;
        }
        public String getEquityDates() {
            return this.equityDates;
        }

        public FindGuestTicketRecordResponseBodyData setFaceFeature(String faceFeature) {
            this.faceFeature = faceFeature;
            return this;
        }
        public String getFaceFeature() {
            return this.faceFeature;
        }

        public FindGuestTicketRecordResponseBodyData setFaceFeatureWriteTime(String faceFeatureWriteTime) {
            this.faceFeatureWriteTime = faceFeatureWriteTime;
            return this;
        }
        public String getFaceFeatureWriteTime() {
            return this.faceFeatureWriteTime;
        }

        public FindGuestTicketRecordResponseBodyData setHealthCommitmentStatus(Integer healthCommitmentStatus) {
            this.healthCommitmentStatus = healthCommitmentStatus;
            return this;
        }
        public Integer getHealthCommitmentStatus() {
            return this.healthCommitmentStatus;
        }

        public FindGuestTicketRecordResponseBodyData setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }
        public String getIdNumber() {
            return this.idNumber;
        }

        public FindGuestTicketRecordResponseBodyData setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindGuestTicketRecordResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindGuestTicketRecordResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FindGuestTicketRecordResponseBodyData setTicketCode(String ticketCode) {
            this.ticketCode = ticketCode;
            return this;
        }
        public String getTicketCode() {
            return this.ticketCode;
        }

        public FindGuestTicketRecordResponseBodyData setTicketName(String ticketName) {
            this.ticketName = ticketName;
            return this;
        }
        public String getTicketName() {
            return this.ticketName;
        }

        public FindGuestTicketRecordResponseBodyData setTicketReceiveDates(String ticketReceiveDates) {
            this.ticketReceiveDates = ticketReceiveDates;
            return this;
        }
        public String getTicketReceiveDates() {
            return this.ticketReceiveDates;
        }

        public FindGuestTicketRecordResponseBodyData setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

    }

}
