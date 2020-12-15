// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDataStatisticsByDayResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListDataStatisticsByDayResponseData> data;

    public static ListDataStatisticsByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataStatisticsByDayResponse self = new ListDataStatisticsByDayResponse();
        return TeaModel.build(map, self);
    }

    public ListDataStatisticsByDayResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataStatisticsByDayResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataStatisticsByDayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataStatisticsByDayResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataStatisticsByDayResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataStatisticsByDayResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDataStatisticsByDayResponse setData(java.util.List<ListDataStatisticsByDayResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataStatisticsByDayResponseData> getData() {
        return this.data;
    }

    public static class ListDataStatisticsByDayResponseData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("FaceNumber")
        @Validation(required = true)
        public Integer faceNumber;

        @NameInMap("BodyNumber")
        @Validation(required = true)
        public Integer bodyNumber;

        @NameInMap("MotorNumber")
        @Validation(required = true)
        public Integer motorNumber;

        @NameInMap("NonMotorNumber")
        @Validation(required = true)
        public Integer nonMotorNumber;

        @NameInMap("TotalNumber")
        @Validation(required = true)
        public Integer totalNumber;

        public static ListDataStatisticsByDayResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataStatisticsByDayResponseData self = new ListDataStatisticsByDayResponseData();
            return TeaModel.build(map, self);
        }

        public ListDataStatisticsByDayResponseData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListDataStatisticsByDayResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListDataStatisticsByDayResponseData setFaceNumber(Integer faceNumber) {
            this.faceNumber = faceNumber;
            return this;
        }
        public Integer getFaceNumber() {
            return this.faceNumber;
        }

        public ListDataStatisticsByDayResponseData setBodyNumber(Integer bodyNumber) {
            this.bodyNumber = bodyNumber;
            return this;
        }
        public Integer getBodyNumber() {
            return this.bodyNumber;
        }

        public ListDataStatisticsByDayResponseData setMotorNumber(Integer motorNumber) {
            this.motorNumber = motorNumber;
            return this;
        }
        public Integer getMotorNumber() {
            return this.motorNumber;
        }

        public ListDataStatisticsByDayResponseData setNonMotorNumber(Integer nonMotorNumber) {
            this.nonMotorNumber = nonMotorNumber;
            return this;
        }
        public Integer getNonMotorNumber() {
            return this.nonMotorNumber;
        }

        public ListDataStatisticsByDayResponseData setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}
