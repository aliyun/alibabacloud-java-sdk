// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeQualityPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcNegativeQualityPunishmentResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcNegativeQualityPunishmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeQualityPunishmentResponseBody self = new GetOcNegativeQualityPunishmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeQualityPunishmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcNegativeQualityPunishmentResponseBody setData(java.util.List<GetOcNegativeQualityPunishmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcNegativeQualityPunishmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcNegativeQualityPunishmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcNegativeQualityPunishmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcNegativeQualityPunishmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcNegativeQualityPunishmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcNegativeQualityPunishmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcNegativeQualityPunishmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcNegativeQualityPunishmentResponseBodyData extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("EventDate")
        public String eventDate;

        @NameInMap("EventResult")
        public String eventResult;

        @NameInMap("PubDate")
        public String pubDate;

        @NameInMap("Title")
        public String title;

        public static GetOcNegativeQualityPunishmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcNegativeQualityPunishmentResponseBodyData self = new GetOcNegativeQualityPunishmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcNegativeQualityPunishmentResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcNegativeQualityPunishmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcNegativeQualityPunishmentResponseBodyData setEventDate(String eventDate) {
            this.eventDate = eventDate;
            return this;
        }
        public String getEventDate() {
            return this.eventDate;
        }

        public GetOcNegativeQualityPunishmentResponseBodyData setEventResult(String eventResult) {
            this.eventResult = eventResult;
            return this;
        }
        public String getEventResult() {
            return this.eventResult;
        }

        public GetOcNegativeQualityPunishmentResponseBodyData setPubDate(String pubDate) {
            this.pubDate = pubDate;
            return this;
        }
        public String getPubDate() {
            return this.pubDate;
        }

        public GetOcNegativeQualityPunishmentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
