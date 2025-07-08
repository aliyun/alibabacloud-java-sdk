// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsByTemplateNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsStatisticsByTemplateNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySmsStatisticsByTemplateNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsByTemplateNewResponseBody self = new QuerySmsStatisticsByTemplateNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsByTemplateNewResponseBody setList(QuerySmsStatisticsByTemplateNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsStatisticsByTemplateNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsStatisticsByTemplateNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsStatisticsByTemplateNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsStatisticsByTemplateNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsStatisticsByTemplateNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse extends TeaModel {
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

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateName")
        public String templateName;

        public static QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse self = new QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse();
            return TeaModel.build(map, self);
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setDetailStsDate(String detailStsDate) {
            this.detailStsDate = detailStsDate;
            return this;
        }
        public String getDetailStsDate() {
            return this.detailStsDate;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setSendSuccessRate(String sendSuccessRate) {
            this.sendSuccessRate = sendSuccessRate;
            return this;
        }
        public String getSendSuccessRate() {
            return this.sendSuccessRate;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setSendTotal(Long sendTotal) {
            this.sendTotal = sendTotal;
            return this;
        }
        public Long getSendTotal() {
            return this.sendTotal;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setSendTotalFail(Long sendTotalFail) {
            this.sendTotalFail = sendTotalFail;
            return this;
        }
        public Long getSendTotalFail() {
            return this.sendTotalFail;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setSendTotalSuccess(Long sendTotalSuccess) {
            this.sendTotalSuccess = sendTotalSuccess;
            return this;
        }
        public Long getSendTotalSuccess() {
            return this.sendTotalSuccess;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setSendTotalUnknown(Long sendTotalUnknown) {
            this.sendTotalUnknown = sendTotalUnknown;
            return this;
        }
        public Long getSendTotalUnknown() {
            return this.sendTotalUnknown;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class QuerySmsStatisticsByTemplateNewResponseBodyList extends TeaModel {
        @NameInMap("SmsStatisticsResponse")
        public java.util.List<QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse> smsStatisticsResponse;

        public static QuerySmsStatisticsByTemplateNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsStatisticsByTemplateNewResponseBodyList self = new QuerySmsStatisticsByTemplateNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsStatisticsByTemplateNewResponseBodyList setSmsStatisticsResponse(java.util.List<QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse> smsStatisticsResponse) {
            this.smsStatisticsResponse = smsStatisticsResponse;
            return this;
        }
        public java.util.List<QuerySmsStatisticsByTemplateNewResponseBodyListSmsStatisticsResponse> getSmsStatisticsResponse() {
            return this.smsStatisticsResponse;
        }

    }

}
