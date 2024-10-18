// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <p>If OK is returned, the request is successful. Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html?spm=a2c4g.419277.0.i11">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
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
         * 
         * <strong>example:</strong>
         * <p>203160</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status code returned by the carrier.</p>
         * <ul>
         * <li>If the text message was delivered, &quot;DELIVERED&quot; is returned.</li>
         * <li>If the text message failed to be sent, see <a href="https://help.aliyun.com/document_detail/101347.html?spm=a2c4g.419277.0.i8">Error codes</a> for more information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELIVERED</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>12131231</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("PhoneNum")
        public String phoneNum;

        /**
         * <p>The date and time when the text message was received.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 16:44:13</p>
         */
        @NameInMap("ReceiveDate")
        public String receiveDate;

        /**
         * <p>The date when the text message was sent. You can query text messages that were sent within the last 30 days.</p>
         * <p>The date is in the yyyyMMdd format. Example: 20181225.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 16:44:13</p>
         */
        @NameInMap("SendDate")
        public String sendDate;

        /**
         * <p>The delivery status of the text message.</p>
         * <ul>
         * <li>1: A delivery receipt is to be sent.</li>
         * <li>2: The text message failed to be sent.</li>
         * <li>3: The text message was sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SendStatus")
        public Long sendStatus;

        /**
         * <p>The code of the text message template.</p>
         * <p>Log on to the SMS console. In the left-side navigation pane, click <strong>Go China</strong> or <strong>Go Globe</strong>. You can view the text message template code in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
         * <blockquote>
         * <p> The text message templates must be created on the Go Globe page and approved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SMS_12231****</p>
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
