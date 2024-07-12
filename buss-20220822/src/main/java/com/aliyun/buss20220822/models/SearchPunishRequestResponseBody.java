// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class SearchPunishRequestResponseBody extends TeaModel {
    @NameInMap("Class")
    public String _class;

    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    @NameInMap("DataList")
    public java.util.List<SearchPunishRequestResponseBodyDataList> dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("ViewCount")
    public Long viewCount;

    public static SearchPunishRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPunishRequestResponseBody self = new SearchPunishRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPunishRequestResponseBody set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public SearchPunishRequestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchPunishRequestResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public SearchPunishRequestResponseBody setDataList(java.util.List<SearchPunishRequestResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<SearchPunishRequestResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public SearchPunishRequestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchPunishRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchPunishRequestResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public SearchPunishRequestResponseBody setViewCount(Long viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    public Long getViewCount() {
        return this.viewCount;
    }

    public static class SearchPunishRequestResponseBodyDataList extends TeaModel {
        @NameInMap("AntiPunishRespTime")
        public String antiPunishRespTime;

        @NameInMap("AntiPunishTime")
        public String antiPunishTime;

        @NameInMap("AntiResult")
        public String antiResult;

        @NameInMap("AntiStatus")
        public String antiStatus;

        @NameInMap("BussinessCode")
        public String bussinessCode;

        @NameInMap("CaseCode")
        public String caseCode;

        @NameInMap("CaseExtendCode")
        public String caseExtendCode;

        @NameInMap("CaseSubCode")
        public String caseSubCode;

        @NameInMap("Class")
        public String _class;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("ExpectedRemoveTime")
        public String expectedRemoveTime;

        @NameInMap("ExtRequestId")
        public String extRequestId;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpString")
        public String ipString;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("PunishDomain")
        public String punishDomain;

        @NameInMap("PunishIp")
        public String punishIp;

        @NameInMap("PunishRequest")
        public String punishRequest;

        @NameInMap("PunishRespTime")
        public String punishRespTime;

        @NameInMap("PunishResult")
        public String punishResult;

        @NameInMap("PunishStatus")
        public String punishStatus;

        @NameInMap("PunishTime")
        public String punishTime;

        @NameInMap("PunishUrl")
        public String punishUrl;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SourceCode")
        public String sourceCode;

        @NameInMap("UserId")
        public String userId;

        public static SearchPunishRequestResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            SearchPunishRequestResponseBodyDataList self = new SearchPunishRequestResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public SearchPunishRequestResponseBodyDataList setAntiPunishRespTime(String antiPunishRespTime) {
            this.antiPunishRespTime = antiPunishRespTime;
            return this;
        }
        public String getAntiPunishRespTime() {
            return this.antiPunishRespTime;
        }

        public SearchPunishRequestResponseBodyDataList setAntiPunishTime(String antiPunishTime) {
            this.antiPunishTime = antiPunishTime;
            return this;
        }
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        public SearchPunishRequestResponseBodyDataList setAntiResult(String antiResult) {
            this.antiResult = antiResult;
            return this;
        }
        public String getAntiResult() {
            return this.antiResult;
        }

        public SearchPunishRequestResponseBodyDataList setAntiStatus(String antiStatus) {
            this.antiStatus = antiStatus;
            return this;
        }
        public String getAntiStatus() {
            return this.antiStatus;
        }

        public SearchPunishRequestResponseBodyDataList setBussinessCode(String bussinessCode) {
            this.bussinessCode = bussinessCode;
            return this;
        }
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        public SearchPunishRequestResponseBodyDataList setCaseCode(String caseCode) {
            this.caseCode = caseCode;
            return this;
        }
        public String getCaseCode() {
            return this.caseCode;
        }

        public SearchPunishRequestResponseBodyDataList setCaseExtendCode(String caseExtendCode) {
            this.caseExtendCode = caseExtendCode;
            return this;
        }
        public String getCaseExtendCode() {
            return this.caseExtendCode;
        }

        public SearchPunishRequestResponseBodyDataList setCaseSubCode(String caseSubCode) {
            this.caseSubCode = caseSubCode;
            return this;
        }
        public String getCaseSubCode() {
            return this.caseSubCode;
        }

        public SearchPunishRequestResponseBodyDataList set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public SearchPunishRequestResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public SearchPunishRequestResponseBodyDataList setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SearchPunishRequestResponseBodyDataList setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public SearchPunishRequestResponseBodyDataList setExpectedRemoveTime(String expectedRemoveTime) {
            this.expectedRemoveTime = expectedRemoveTime;
            return this;
        }
        public String getExpectedRemoveTime() {
            return this.expectedRemoveTime;
        }

        public SearchPunishRequestResponseBodyDataList setExtRequestId(String extRequestId) {
            this.extRequestId = extRequestId;
            return this;
        }
        public String getExtRequestId() {
            return this.extRequestId;
        }

        public SearchPunishRequestResponseBodyDataList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public SearchPunishRequestResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SearchPunishRequestResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchPunishRequestResponseBodyDataList setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SearchPunishRequestResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SearchPunishRequestResponseBodyDataList setIpString(String ipString) {
            this.ipString = ipString;
            return this;
        }
        public String getIpString() {
            return this.ipString;
        }

        public SearchPunishRequestResponseBodyDataList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public SearchPunishRequestResponseBodyDataList setPunishDomain(String punishDomain) {
            this.punishDomain = punishDomain;
            return this;
        }
        public String getPunishDomain() {
            return this.punishDomain;
        }

        public SearchPunishRequestResponseBodyDataList setPunishIp(String punishIp) {
            this.punishIp = punishIp;
            return this;
        }
        public String getPunishIp() {
            return this.punishIp;
        }

        public SearchPunishRequestResponseBodyDataList setPunishRequest(String punishRequest) {
            this.punishRequest = punishRequest;
            return this;
        }
        public String getPunishRequest() {
            return this.punishRequest;
        }

        public SearchPunishRequestResponseBodyDataList setPunishRespTime(String punishRespTime) {
            this.punishRespTime = punishRespTime;
            return this;
        }
        public String getPunishRespTime() {
            return this.punishRespTime;
        }

        public SearchPunishRequestResponseBodyDataList setPunishResult(String punishResult) {
            this.punishResult = punishResult;
            return this;
        }
        public String getPunishResult() {
            return this.punishResult;
        }

        public SearchPunishRequestResponseBodyDataList setPunishStatus(String punishStatus) {
            this.punishStatus = punishStatus;
            return this;
        }
        public String getPunishStatus() {
            return this.punishStatus;
        }

        public SearchPunishRequestResponseBodyDataList setPunishTime(String punishTime) {
            this.punishTime = punishTime;
            return this;
        }
        public String getPunishTime() {
            return this.punishTime;
        }

        public SearchPunishRequestResponseBodyDataList setPunishUrl(String punishUrl) {
            this.punishUrl = punishUrl;
            return this;
        }
        public String getPunishUrl() {
            return this.punishUrl;
        }

        public SearchPunishRequestResponseBodyDataList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public SearchPunishRequestResponseBodyDataList setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public SearchPunishRequestResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
