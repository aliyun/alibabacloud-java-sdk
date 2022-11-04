// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelListByAkResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryHotelListByAkResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static QueryHotelListByAkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelListByAkResponseBody self = new QueryHotelListByAkResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotelListByAkResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public QueryHotelListByAkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotelListByAkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotelListByAkResponseBody setResult(QueryHotelListByAkResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryHotelListByAkResponseBodyResult getResult() {
        return this.result;
    }

    public QueryHotelListByAkResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class QueryHotelListByAkResponseBodyResultHotelInfoForList extends TeaModel {
        @NameInMap("AccessMode")
        public String accessMode;

        @NameInMap("AuditOpinion")
        public String auditOpinion;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EstOpenTime")
        public String estOpenTime;

        @NameInMap("HotelAddress")
        public String hotelAddress;

        @NameInMap("HotelEmail")
        public String hotelEmail;

        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("HotelName")
        public String hotelName;

        @NameInMap("IndustryType")
        public String industryType;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RelatedName")
        public String relatedName;

        @NameInMap("RelatedPk")
        public String relatedPk;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RoomNum")
        public Integer roomNum;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryHotelListByAkResponseBodyResultHotelInfoForList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelListByAkResponseBodyResultHotelInfoForList self = new QueryHotelListByAkResponseBodyResultHotelInfoForList();
            return TeaModel.build(map, self);
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setAuditOpinion(String auditOpinion) {
            this.auditOpinion = auditOpinion;
            return this;
        }
        public String getAuditOpinion() {
            return this.auditOpinion;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setEstOpenTime(String estOpenTime) {
            this.estOpenTime = estOpenTime;
            return this;
        }
        public String getEstOpenTime() {
            return this.estOpenTime;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setHotelEmail(String hotelEmail) {
            this.hotelEmail = hotelEmail;
            return this;
        }
        public String getHotelEmail() {
            return this.hotelEmail;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setIndustryType(String industryType) {
            this.industryType = industryType;
            return this;
        }
        public String getIndustryType() {
            return this.industryType;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setRelatedName(String relatedName) {
            this.relatedName = relatedName;
            return this;
        }
        public String getRelatedName() {
            return this.relatedName;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setRelatedPk(String relatedPk) {
            this.relatedPk = relatedPk;
            return this;
        }
        public String getRelatedPk() {
            return this.relatedPk;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setRoomNum(Integer roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Integer getRoomNum() {
            return this.roomNum;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryHotelListByAkResponseBodyResultHotelInfoForList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryHotelListByAkResponseBodyResult extends TeaModel {
        @NameInMap("HotelInfoForList")
        public java.util.List<QueryHotelListByAkResponseBodyResultHotelInfoForList> hotelInfoForList;

        public static QueryHotelListByAkResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelListByAkResponseBodyResult self = new QueryHotelListByAkResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryHotelListByAkResponseBodyResult setHotelInfoForList(java.util.List<QueryHotelListByAkResponseBodyResultHotelInfoForList> hotelInfoForList) {
            this.hotelInfoForList = hotelInfoForList;
            return this;
        }
        public java.util.List<QueryHotelListByAkResponseBodyResultHotelInfoForList> getHotelInfoForList() {
            return this.hotelInfoForList;
        }

    }

}
