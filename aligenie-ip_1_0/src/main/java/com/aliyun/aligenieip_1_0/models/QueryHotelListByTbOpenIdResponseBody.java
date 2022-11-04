// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelListByTbOpenIdResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryHotelListByTbOpenIdResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static QueryHotelListByTbOpenIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelListByTbOpenIdResponseBody self = new QueryHotelListByTbOpenIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotelListByTbOpenIdResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public QueryHotelListByTbOpenIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotelListByTbOpenIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotelListByTbOpenIdResponseBody setResult(QueryHotelListByTbOpenIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryHotelListByTbOpenIdResponseBodyResult getResult() {
        return this.result;
    }

    public QueryHotelListByTbOpenIdResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList extends TeaModel {
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

        public static QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList self = new QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList();
            return TeaModel.build(map, self);
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setAuditOpinion(String auditOpinion) {
            this.auditOpinion = auditOpinion;
            return this;
        }
        public String getAuditOpinion() {
            return this.auditOpinion;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setEstOpenTime(String estOpenTime) {
            this.estOpenTime = estOpenTime;
            return this;
        }
        public String getEstOpenTime() {
            return this.estOpenTime;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setHotelEmail(String hotelEmail) {
            this.hotelEmail = hotelEmail;
            return this;
        }
        public String getHotelEmail() {
            return this.hotelEmail;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setIndustryType(String industryType) {
            this.industryType = industryType;
            return this;
        }
        public String getIndustryType() {
            return this.industryType;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setRelatedName(String relatedName) {
            this.relatedName = relatedName;
            return this;
        }
        public String getRelatedName() {
            return this.relatedName;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setRelatedPk(String relatedPk) {
            this.relatedPk = relatedPk;
            return this;
        }
        public String getRelatedPk() {
            return this.relatedPk;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setRoomNum(Integer roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Integer getRoomNum() {
            return this.roomNum;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryHotelListByTbOpenIdResponseBodyResult extends TeaModel {
        @NameInMap("HotelInfoForList")
        public java.util.List<QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList> hotelInfoForList;

        public static QueryHotelListByTbOpenIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelListByTbOpenIdResponseBodyResult self = new QueryHotelListByTbOpenIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryHotelListByTbOpenIdResponseBodyResult setHotelInfoForList(java.util.List<QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList> hotelInfoForList) {
            this.hotelInfoForList = hotelInfoForList;
            return this;
        }
        public java.util.List<QueryHotelListByTbOpenIdResponseBodyResultHotelInfoForList> getHotelInfoForList() {
            return this.hotelInfoForList;
        }

    }

}
