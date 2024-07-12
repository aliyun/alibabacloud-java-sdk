// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public java.util.List<SearchPunishEventsResponseBodyDataList> dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchPunishEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishEventsResponseBody self = new SearchPunishEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPunishEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchPunishEventsResponseBody setDataList(java.util.List<SearchPunishEventsResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<SearchPunishEventsResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public SearchPunishEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchPunishEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPunishEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchPunishEventsResponseBodyDataList extends TeaModel {
        @NameInMap("BussinessCode")
        public String bussinessCode;

        @NameInMap("CaseCode")
        public String caseCode;

        @NameInMap("RecordsCount")
        public Integer recordsCount;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("TipsCode")
        public String tipsCode;

        @NameInMap("UserId")
        public String userId;

        public static SearchPunishEventsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SearchPunishEventsResponseBodyDataList self = new SearchPunishEventsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SearchPunishEventsResponseBodyDataList setBussinessCode(String bussinessCode) {
            this.bussinessCode = bussinessCode;
            return this;
        }
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        public SearchPunishEventsResponseBodyDataList setCaseCode(String caseCode) {
            this.caseCode = caseCode;
            return this;
        }
        public String getCaseCode() {
            return this.caseCode;
        }

        public SearchPunishEventsResponseBodyDataList setRecordsCount(Integer recordsCount) {
            this.recordsCount = recordsCount;
            return this;
        }
        public Integer getRecordsCount() {
            return this.recordsCount;
        }

        public SearchPunishEventsResponseBodyDataList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public SearchPunishEventsResponseBodyDataList setTipsCode(String tipsCode) {
            this.tipsCode = tipsCode;
            return this;
        }
        public String getTipsCode() {
            return this.tipsCode;
        }

        public SearchPunishEventsResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
