// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendDetailsByPhoneNumNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySendDetailsByPhoneNumNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySendDetailsByPhoneNumNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsByPhoneNumNewResponseBody self = new QuerySendDetailsByPhoneNumNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsByPhoneNumNewResponseBody setList(QuerySendDetailsByPhoneNumNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySendDetailsByPhoneNumNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySendDetailsByPhoneNumNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySendDetailsByPhoneNumNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySendDetailsByPhoneNumNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySendDetailsByPhoneNumNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse extends TeaModel {
        @NameInMap("ApplyDateStr")
        public String applyDateStr;

        @NameInMap("BillCount")
        public Long billCount;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public Long bizType;

        @NameInMap("BlackListStatus")
        public Integer blackListStatus;

        @NameInMap("Content")
        public String content;

        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrCodeDesc")
        public String errCodeDesc;

        @NameInMap("InnerErrCode")
        public String innerErrCode;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("PhoneNum")
        public String phoneNum;

        @NameInMap("ReceiveDateStr")
        public String receiveDateStr;

        @NameInMap("SendDateStr")
        public String sendDateStr;

        @NameInMap("SendStatus")
        public Long sendStatus;

        @NameInMap("SmsLength")
        public Long smsLength;

        @NameInMap("StatisticsStatus")
        public Integer statisticsStatus;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse self = new QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setApplyDateStr(String applyDateStr) {
            this.applyDateStr = applyDateStr;
            return this;
        }
        public String getApplyDateStr() {
            return this.applyDateStr;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setBillCount(Long billCount) {
            this.billCount = billCount;
            return this;
        }
        public Long getBillCount() {
            return this.billCount;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setBizType(Long bizType) {
            this.bizType = bizType;
            return this;
        }
        public Long getBizType() {
            return this.bizType;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setBlackListStatus(Integer blackListStatus) {
            this.blackListStatus = blackListStatus;
            return this;
        }
        public Integer getBlackListStatus() {
            return this.blackListStatus;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setErrCodeDesc(String errCodeDesc) {
            this.errCodeDesc = errCodeDesc;
            return this;
        }
        public String getErrCodeDesc() {
            return this.errCodeDesc;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setInnerErrCode(String innerErrCode) {
            this.innerErrCode = innerErrCode;
            return this;
        }
        public String getInnerErrCode() {
            return this.innerErrCode;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setReceiveDateStr(String receiveDateStr) {
            this.receiveDateStr = receiveDateStr;
            return this;
        }
        public String getReceiveDateStr() {
            return this.receiveDateStr;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setSendDateStr(String sendDateStr) {
            this.sendDateStr = sendDateStr;
            return this;
        }
        public String getSendDateStr() {
            return this.sendDateStr;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setSendStatus(Long sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Long getSendStatus() {
            return this.sendStatus;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setSmsLength(Long smsLength) {
            this.smsLength = smsLength;
            return this;
        }
        public Long getSmsLength() {
            return this.smsLength;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setStatisticsStatus(Integer statisticsStatus) {
            this.statisticsStatus = statisticsStatus;
            return this;
        }
        public Integer getStatisticsStatus() {
            return this.statisticsStatus;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class QuerySendDetailsByPhoneNumNewResponseBodyList extends TeaModel {
        @NameInMap("SmsSendDetailResponse")
        public java.util.List<QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse> smsSendDetailResponse;

        public static QuerySendDetailsByPhoneNumNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsByPhoneNumNewResponseBodyList self = new QuerySendDetailsByPhoneNumNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsByPhoneNumNewResponseBodyList setSmsSendDetailResponse(java.util.List<QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse> smsSendDetailResponse) {
            this.smsSendDetailResponse = smsSendDetailResponse;
            return this;
        }
        public java.util.List<QuerySendDetailsByPhoneNumNewResponseBodyListSmsSendDetailResponse> getSmsSendDetailResponse() {
            return this.smsSendDetailResponse;
        }

    }

}
