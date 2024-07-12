// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public java.util.List<SearchPunishRecordsResponseBodyDataList> dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchPunishRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRecordsResponseBody self = new SearchPunishRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPunishRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchPunishRecordsResponseBody setDataList(java.util.List<SearchPunishRecordsResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<SearchPunishRecordsResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public SearchPunishRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchPunishRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPunishRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchPunishRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchPunishRecordsResponseBodyDataList extends TeaModel {
        @NameInMap("ActionCode")
        public String actionCode;

        @NameInMap("AntiStatus")
        public String antiStatus;

        @NameInMap("BussinessCode")
        public String bussinessCode;

        @NameInMap("CaseCode")
        public String caseCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PunishStatus")
        public String punishStatus;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("TipsCode")
        public String tipsCode;

        @NameInMap("Url")
        public String url;

        public static SearchPunishRecordsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SearchPunishRecordsResponseBodyDataList self = new SearchPunishRecordsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SearchPunishRecordsResponseBodyDataList setActionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }
        public String getActionCode() {
            return this.actionCode;
        }

        public SearchPunishRecordsResponseBodyDataList setAntiStatus(String antiStatus) {
            this.antiStatus = antiStatus;
            return this;
        }
        public String getAntiStatus() {
            return this.antiStatus;
        }

        public SearchPunishRecordsResponseBodyDataList setBussinessCode(String bussinessCode) {
            this.bussinessCode = bussinessCode;
            return this;
        }
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        public SearchPunishRecordsResponseBodyDataList setCaseCode(String caseCode) {
            this.caseCode = caseCode;
            return this;
        }
        public String getCaseCode() {
            return this.caseCode;
        }

        public SearchPunishRecordsResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchPunishRecordsResponseBodyDataList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public SearchPunishRecordsResponseBodyDataList setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public SearchPunishRecordsResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SearchPunishRecordsResponseBodyDataList setPunishStatus(String punishStatus) {
            this.punishStatus = punishStatus;
            return this;
        }
        public String getPunishStatus() {
            return this.punishStatus;
        }

        public SearchPunishRecordsResponseBodyDataList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public SearchPunishRecordsResponseBodyDataList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public SearchPunishRecordsResponseBodyDataList setTipsCode(String tipsCode) {
            this.tipsCode = tipsCode;
            return this;
        }
        public String getTipsCode() {
            return this.tipsCode;
        }

        public SearchPunishRecordsResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
