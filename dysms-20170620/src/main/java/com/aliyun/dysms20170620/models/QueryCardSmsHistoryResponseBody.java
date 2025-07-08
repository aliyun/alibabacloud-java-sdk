// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public QueryCardSmsHistoryResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsHistoryResponseBody self = new QueryCardSmsHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsHistoryResponseBody setModel(QueryCardSmsHistoryResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryCardSmsHistoryResponseBodyModel getModel() {
        return this.model;
    }

    public QueryCardSmsHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsHistoryResponseBodyModelRecords extends TeaModel {
        @NameInMap("AcceptDate")
        public Long acceptDate;

        @NameInMap("ApiSend")
        public Long apiSend;

        @NameInMap("CardTemplateType")
        public String cardTemplateType;

        @NameInMap("CustomTmpCode")
        public String customTmpCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("FuuId")
        public String fuuId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsSupport")
        public Long isSupport;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("Pid")
        public Long pid;

        @NameInMap("ReceiveState")
        public Long receiveState;

        @NameInMap("Receiver")
        public String receiver;

        @NameInMap("RenderDate")
        public Long renderDate;

        @NameInMap("RenderState")
        public Long renderState;

        @NameInMap("ShortUrl")
        public String shortUrl;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SmsContent")
        public String smsContent;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TmpCode")
        public String tmpCode;

        @NameInMap("TmpId")
        public String tmpId;

        @NameInMap("TmpType")
        public Long tmpType;

        @NameInMap("TmpTypeName")
        public String tmpTypeName;

        public static QueryCardSmsHistoryResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsHistoryResponseBodyModelRecords self = new QueryCardSmsHistoryResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setAcceptDate(Long acceptDate) {
            this.acceptDate = acceptDate;
            return this;
        }
        public Long getAcceptDate() {
            return this.acceptDate;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setApiSend(Long apiSend) {
            this.apiSend = apiSend;
            return this;
        }
        public Long getApiSend() {
            return this.apiSend;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setCardTemplateType(String cardTemplateType) {
            this.cardTemplateType = cardTemplateType;
            return this;
        }
        public String getCardTemplateType() {
            return this.cardTemplateType;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setCustomTmpCode(String customTmpCode) {
            this.customTmpCode = customTmpCode;
            return this;
        }
        public String getCustomTmpCode() {
            return this.customTmpCode;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setFuuId(String fuuId) {
            this.fuuId = fuuId;
            return this;
        }
        public String getFuuId() {
            return this.fuuId;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setIsSupport(Long isSupport) {
            this.isSupport = isSupport;
            return this;
        }
        public Long getIsSupport() {
            return this.isSupport;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setReceiveState(Long receiveState) {
            this.receiveState = receiveState;
            return this;
        }
        public Long getReceiveState() {
            return this.receiveState;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setRenderDate(Long renderDate) {
            this.renderDate = renderDate;
            return this;
        }
        public Long getRenderDate() {
            return this.renderDate;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setRenderState(Long renderState) {
            this.renderState = renderState;
            return this;
        }
        public Long getRenderState() {
            return this.renderState;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setTmpCode(String tmpCode) {
            this.tmpCode = tmpCode;
            return this;
        }
        public String getTmpCode() {
            return this.tmpCode;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setTmpId(String tmpId) {
            this.tmpId = tmpId;
            return this;
        }
        public String getTmpId() {
            return this.tmpId;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setTmpType(Long tmpType) {
            this.tmpType = tmpType;
            return this;
        }
        public Long getTmpType() {
            return this.tmpType;
        }

        public QueryCardSmsHistoryResponseBodyModelRecords setTmpTypeName(String tmpTypeName) {
            this.tmpTypeName = tmpTypeName;
            return this;
        }
        public String getTmpTypeName() {
            return this.tmpTypeName;
        }

    }

    public static class QueryCardSmsHistoryResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryCardSmsHistoryResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryCardSmsHistoryResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsHistoryResponseBodyModel self = new QueryCardSmsHistoryResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsHistoryResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryCardSmsHistoryResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryCardSmsHistoryResponseBodyModel setRecords(java.util.List<QueryCardSmsHistoryResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryCardSmsHistoryResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public QueryCardSmsHistoryResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
