// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public ExportCardSmsHistoryResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExportCardSmsHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsHistoryResponseBody self = new ExportCardSmsHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportCardSmsHistoryResponseBody setModel(ExportCardSmsHistoryResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ExportCardSmsHistoryResponseBodyModel getModel() {
        return this.model;
    }

    public ExportCardSmsHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportCardSmsHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportCardSmsHistoryResponseBodyModelRecords extends TeaModel {
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

        public static ExportCardSmsHistoryResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            ExportCardSmsHistoryResponseBodyModelRecords self = new ExportCardSmsHistoryResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setAcceptDate(Long acceptDate) {
            this.acceptDate = acceptDate;
            return this;
        }
        public Long getAcceptDate() {
            return this.acceptDate;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setApiSend(Long apiSend) {
            this.apiSend = apiSend;
            return this;
        }
        public Long getApiSend() {
            return this.apiSend;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setCardTemplateType(String cardTemplateType) {
            this.cardTemplateType = cardTemplateType;
            return this;
        }
        public String getCardTemplateType() {
            return this.cardTemplateType;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setCustomTmpCode(String customTmpCode) {
            this.customTmpCode = customTmpCode;
            return this;
        }
        public String getCustomTmpCode() {
            return this.customTmpCode;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setFuuId(String fuuId) {
            this.fuuId = fuuId;
            return this;
        }
        public String getFuuId() {
            return this.fuuId;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setIsSupport(Long isSupport) {
            this.isSupport = isSupport;
            return this;
        }
        public Long getIsSupport() {
            return this.isSupport;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setReceiveState(Long receiveState) {
            this.receiveState = receiveState;
            return this;
        }
        public Long getReceiveState() {
            return this.receiveState;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setRenderDate(Long renderDate) {
            this.renderDate = renderDate;
            return this;
        }
        public Long getRenderDate() {
            return this.renderDate;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setRenderState(Long renderState) {
            this.renderState = renderState;
            return this;
        }
        public Long getRenderState() {
            return this.renderState;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setTmpCode(String tmpCode) {
            this.tmpCode = tmpCode;
            return this;
        }
        public String getTmpCode() {
            return this.tmpCode;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setTmpId(String tmpId) {
            this.tmpId = tmpId;
            return this;
        }
        public String getTmpId() {
            return this.tmpId;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setTmpType(Long tmpType) {
            this.tmpType = tmpType;
            return this;
        }
        public Long getTmpType() {
            return this.tmpType;
        }

        public ExportCardSmsHistoryResponseBodyModelRecords setTmpTypeName(String tmpTypeName) {
            this.tmpTypeName = tmpTypeName;
            return this;
        }
        public String getTmpTypeName() {
            return this.tmpTypeName;
        }

    }

    public static class ExportCardSmsHistoryResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<ExportCardSmsHistoryResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ExportCardSmsHistoryResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ExportCardSmsHistoryResponseBodyModel self = new ExportCardSmsHistoryResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ExportCardSmsHistoryResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public ExportCardSmsHistoryResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ExportCardSmsHistoryResponseBodyModel setRecords(java.util.List<ExportCardSmsHistoryResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ExportCardSmsHistoryResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public ExportCardSmsHistoryResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
