// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QuerySmsStatisticsNewResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsStatisticsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsNewResponseBody self = new QuerySmsStatisticsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsNewResponseBody setList(java.util.List<QuerySmsStatisticsNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QuerySmsStatisticsNewResponseBodyList> getList() {
        return this.list;
    }

    public QuerySmsStatisticsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySmsStatisticsNewResponseBodyList extends TeaModel {
        @NameInMap("BizType")
        public Integer bizType;

        @NameInMap("DetailStsDate")
        public String detailStsDate;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SendSuccessRate")
        public String sendSuccessRate;

        @NameInMap("SendTotal")
        public Long sendTotal;

        @NameInMap("SendTotalFail")
        public Long sendTotalFail;

        @NameInMap("SendTotalSuccess")
        public Long sendTotalSuccess;

        @NameInMap("SendTotalUnknown")
        public Long sendTotalUnknown;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateName")
        public String templateName;

        public static QuerySmsStatisticsNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsStatisticsNewResponseBodyList self = new QuerySmsStatisticsNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsStatisticsNewResponseBodyList setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public QuerySmsStatisticsNewResponseBodyList setDetailStsDate(String detailStsDate) {
            this.detailStsDate = detailStsDate;
            return this;
        }
        public String getDetailStsDate() {
            return this.detailStsDate;
        }

        public QuerySmsStatisticsNewResponseBodyList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QuerySmsStatisticsNewResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySmsStatisticsNewResponseBodyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QuerySmsStatisticsNewResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySmsStatisticsNewResponseBodyList setSendSuccessRate(String sendSuccessRate) {
            this.sendSuccessRate = sendSuccessRate;
            return this;
        }
        public String getSendSuccessRate() {
            return this.sendSuccessRate;
        }

        public QuerySmsStatisticsNewResponseBodyList setSendTotal(Long sendTotal) {
            this.sendTotal = sendTotal;
            return this;
        }
        public Long getSendTotal() {
            return this.sendTotal;
        }

        public QuerySmsStatisticsNewResponseBodyList setSendTotalFail(Long sendTotalFail) {
            this.sendTotalFail = sendTotalFail;
            return this;
        }
        public Long getSendTotalFail() {
            return this.sendTotalFail;
        }

        public QuerySmsStatisticsNewResponseBodyList setSendTotalSuccess(Long sendTotalSuccess) {
            this.sendTotalSuccess = sendTotalSuccess;
            return this;
        }
        public Long getSendTotalSuccess() {
            return this.sendTotalSuccess;
        }

        public QuerySmsStatisticsNewResponseBodyList setSendTotalUnknown(Long sendTotalUnknown) {
            this.sendTotalUnknown = sendTotalUnknown;
            return this;
        }
        public Long getSendTotalUnknown() {
            return this.sendTotalUnknown;
        }

        public QuerySmsStatisticsNewResponseBodyList setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QuerySmsStatisticsNewResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySmsStatisticsNewResponseBodyList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySmsStatisticsNewResponseBodyList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
