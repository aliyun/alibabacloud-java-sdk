// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <br>
     * <p>If OK is returned, the request is successful. Other values indicate that the request failed. For more information, see [Error codes](https://help.aliyun.com/document_detail/101346.html?spm=a2c4g.419277.0.i11).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Model")
    public java.util.List<QuerySendDetailsResponseBodyModel> model;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries in the list.</p>
     */
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
        /**
         * <p>The content of the text message.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status code returned by the carrier.</p>
         * <br>
         * <p>*   If the text message was delivered, "DELIVERED" is returned.</p>
         * <p>*   If the text message failed to be sent, see [Error codes](https://help.aliyun.com/document_detail/101347.html?spm=a2c4g.419277.0.i8) for more information.</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The extension field.</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The phone number.</p>
         */
        @NameInMap("PhoneNum")
        public String phoneNum;

        /**
         * <p>The date and time when the text message was received.</p>
         */
        @NameInMap("ReceiveDate")
        public String receiveDate;

        /**
         * <p>The date when the text message was sent. You can query text messages that were sent within the last 30 days.</p>
         * <br>
         * <p>The date is in the yyyyMMdd format. Example: 20181225.</p>
         */
        @NameInMap("SendDate")
        public String sendDate;

        /**
         * <p>The delivery status of the text message.</p>
         * <br>
         * <p>*   1: A delivery receipt is to be sent.</p>
         * <p>*   2: The text message failed to be sent.</p>
         * <p>*   3: The text message was sent.</p>
         */
        @NameInMap("SendStatus")
        public Long sendStatus;

        /**
         * <p>The code of the text message template.</p>
         * <br>
         * <p>Log on to the SMS console. In the left-side navigation pane, click **Go China** or **Go Globe**. You can view the text message template code in the **Template Code** column on the **Message Templates** tab.</p>
         * <br>
         * <p>>  The text message templates must be created on the Go Globe page and approved.</p>
         */
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
