// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QuerySendDetailsResponseBodyModel> model;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QuerySendDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsResponseBody self = new QuerySendDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySendDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySendDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySendDetailsResponseBody setModel(java.util.List<QuerySendDetailsResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QuerySendDetailsResponseBodyModel> getModel() {
        return this.model;
    }

    public QuerySendDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySendDetailsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QuerySendDetailsResponseBodyModel extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("PhoneNum")
        public String phoneNum;

        @NameInMap("ReceiveDate")
        public String receiveDate;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("SendStatus")
        public Long sendStatus;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static QuerySendDetailsResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseBodyModel self = new QuerySendDetailsResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsResponseBodyModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySendDetailsResponseBodyModel setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QuerySendDetailsResponseBodyModel setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QuerySendDetailsResponseBodyModel setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public QuerySendDetailsResponseBodyModel setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }
        public String getReceiveDate() {
            return this.receiveDate;
        }

        public QuerySendDetailsResponseBodyModel setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QuerySendDetailsResponseBodyModel setSendStatus(Long sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Long getSendStatus() {
            return this.sendStatus;
        }

        public QuerySendDetailsResponseBodyModel setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
