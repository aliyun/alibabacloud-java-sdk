// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendFailDetailsNewResponseBody extends TeaModel {
    @NameInMap("ApplyDateStr")
    public String applyDateStr;

    @NameInMap("BillCount")
    public Long billCount;

    @NameInMap("BizType")
    public Long bizType;

    @NameInMap("InnerErrCode")
    public String innerErrCode;

    @NameInMap("List")
    public QuerySendFailDetailsNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsLength")
    public Long smsLength;

    @NameInMap("Total")
    public Long total;

    public static QuerySendFailDetailsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendFailDetailsNewResponseBody self = new QuerySendFailDetailsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendFailDetailsNewResponseBody setApplyDateStr(String applyDateStr) {
        this.applyDateStr = applyDateStr;
        return this;
    }
    public String getApplyDateStr() {
        return this.applyDateStr;
    }

    public QuerySendFailDetailsNewResponseBody setBillCount(Long billCount) {
        this.billCount = billCount;
        return this;
    }
    public Long getBillCount() {
        return this.billCount;
    }

    public QuerySendFailDetailsNewResponseBody setBizType(Long bizType) {
        this.bizType = bizType;
        return this;
    }
    public Long getBizType() {
        return this.bizType;
    }

    public QuerySendFailDetailsNewResponseBody setInnerErrCode(String innerErrCode) {
        this.innerErrCode = innerErrCode;
        return this;
    }
    public String getInnerErrCode() {
        return this.innerErrCode;
    }

    public QuerySendFailDetailsNewResponseBody setList(QuerySendFailDetailsNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySendFailDetailsNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySendFailDetailsNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySendFailDetailsNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySendFailDetailsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySendFailDetailsNewResponseBody setSmsLength(Long smsLength) {
        this.smsLength = smsLength;
        return this;
    }
    public Long getSmsLength() {
        return this.smsLength;
    }

    public QuerySendFailDetailsNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse extends TeaModel {
        @NameInMap("BlackListStatus")
        public Integer blackListStatus;

        @NameInMap("Content")
        public String content;

        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrCodeDesc")
        public String errCodeDesc;

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

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse build(java.util.Map<String, ?> map) throws Exception {
            QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse self = new QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse();
            return TeaModel.build(map, self);
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setBlackListStatus(Integer blackListStatus) {
            this.blackListStatus = blackListStatus;
            return this;
        }
        public Integer getBlackListStatus() {
            return this.blackListStatus;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setErrCodeDesc(String errCodeDesc) {
            this.errCodeDesc = errCodeDesc;
            return this;
        }
        public String getErrCodeDesc() {
            return this.errCodeDesc;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setReceiveDateStr(String receiveDateStr) {
            this.receiveDateStr = receiveDateStr;
            return this;
        }
        public String getReceiveDateStr() {
            return this.receiveDateStr;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setSendDateStr(String sendDateStr) {
            this.sendDateStr = sendDateStr;
            return this;
        }
        public String getSendDateStr() {
            return this.sendDateStr;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setSendStatus(Long sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Long getSendStatus() {
            return this.sendStatus;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class QuerySendFailDetailsNewResponseBodyList extends TeaModel {
        @NameInMap("SmsSendDetailResponse")
        public java.util.List<QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse> smsSendDetailResponse;

        public static QuerySendFailDetailsNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySendFailDetailsNewResponseBodyList self = new QuerySendFailDetailsNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySendFailDetailsNewResponseBodyList setSmsSendDetailResponse(java.util.List<QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse> smsSendDetailResponse) {
            this.smsSendDetailResponse = smsSendDetailResponse;
            return this;
        }
        public java.util.List<QuerySendFailDetailsNewResponseBodyListSmsSendDetailResponse> getSmsSendDetailResponse() {
            return this.smsSendDetailResponse;
        }

    }

}
