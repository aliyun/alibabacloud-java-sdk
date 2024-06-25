// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
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
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the message.</p>
     */
    @NameInMap("SmsSendDetailDTOs")
    public QuerySendDetailsResponseBodySmsSendDetailDTOs smsSendDetailDTOs;

    /**
     * <p>The number of sent messages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static QuerySendDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsResponseBody self = new QuerySendDetailsResponseBody();
        return TeaModel.build(map, self);
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

    public QuerySendDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySendDetailsResponseBody setSmsSendDetailDTOs(QuerySendDetailsResponseBodySmsSendDetailDTOs smsSendDetailDTOs) {
        this.smsSendDetailDTOs = smsSendDetailDTOs;
        return this;
    }
    public QuerySendDetailsResponseBodySmsSendDetailDTOs getSmsSendDetailDTOs() {
        return this.smsSendDetailDTOs;
    }

    public QuerySendDetailsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO extends TeaModel {
        /**
         * <p>The content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>【Aliyun】This is a test message.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status code returned by the carrier.</p>
         * <ul>
         * <li>If the message is delivered, &quot;DELIVERED&quot; is returned.</li>
         * <li>For information about the error codes that may be returned if the message is not delivered, see <a href="https://help.aliyun.com/document_detail/101347.html">error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELIVERED</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The mobile numbers of the recipients.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("PhoneNum")
        public String phoneNum;

        /**
         * <p>The date and time when the message was received.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 16:44:13</p>
         */
        @NameInMap("ReceiveDate")
        public String receiveDate;

        /**
         * <p>The date and time when the message was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 16:44:10</p>
         */
        @NameInMap("SendDate")
        public String sendDate;

        /**
         * <p>The delivery status of the message. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The message has not received a delivery receipt yet.</li>
         * <li><strong>2</strong>: The message failed to be delivered.</li>
         * <li><strong>3</strong>: The message was delivered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SendStatus")
        public Long sendStatus;

        /**
         * <p>The ID of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_12231****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO self = new QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }
        public String getReceiveDate() {
            return this.receiveDate;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setSendStatus(Long sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Long getSendStatus() {
            return this.sendStatus;
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class QuerySendDetailsResponseBodySmsSendDetailDTOs extends TeaModel {
        @NameInMap("SmsSendDetailDTO")
        public java.util.List<QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO> smsSendDetailDTO;

        public static QuerySendDetailsResponseBodySmsSendDetailDTOs build(java.util.Map<String, ?> map) throws Exception {
            QuerySendDetailsResponseBodySmsSendDetailDTOs self = new QuerySendDetailsResponseBodySmsSendDetailDTOs();
            return TeaModel.build(map, self);
        }

        public QuerySendDetailsResponseBodySmsSendDetailDTOs setSmsSendDetailDTO(java.util.List<QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO> smsSendDetailDTO) {
            this.smsSendDetailDTO = smsSendDetailDTO;
            return this;
        }
        public java.util.List<QuerySendDetailsResponseBodySmsSendDetailDTOsSmsSendDetailDTO> getSmsSendDetailDTO() {
            return this.smsSendDetailDTO;
        }

    }

}
