// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsDetailsResponseBody extends TeaModel {
    /**
     * <p>Access denied detail; this field is returned only if the RAM check fails.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Card SMS sending result</p>
     */
    @NameInMap("CardSendDetailDTO")
    public GetCardSmsDetailsResponseBodyCardSendDetailDTO cardSendDetailDTO;

    /**
     * <p>Request status code.</p>
     * <ul>
     * <li>OK indicates a successful request.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API Error Codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the API call was successful. Values:</p>
     * <ul>
     * <li><strong>true</strong> - <strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCardSmsDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsDetailsResponseBody self = new GetCardSmsDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardSmsDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetCardSmsDetailsResponseBody setCardSendDetailDTO(GetCardSmsDetailsResponseBodyCardSendDetailDTO cardSendDetailDTO) {
        this.cardSendDetailDTO = cardSendDetailDTO;
        return this;
    }
    public GetCardSmsDetailsResponseBodyCardSendDetailDTO getCardSendDetailDTO() {
        return this.cardSendDetailDTO;
    }

    public GetCardSmsDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardSmsDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCardSmsDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardSmsDetailsResponseBodyCardSendDetailDTORecords extends TeaModel {
        /**
         * <p>Error code for sending</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>Customer-transmitted outId</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>Phone number that received the SMS</p>
         * 
         * <strong>example:</strong>
         * <p>156****9080</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Receive date</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:26:35</p>
         */
        @NameInMap("ReceiveDate")
        public String receiveDate;

        /**
         * <p>Receive SMS type</p>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS</p>
         */
        @NameInMap("ReceiveType")
        public String receiveType;

        /**
         * <p>Render date</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 12:13:39</p>
         */
        @NameInMap("RenderDate")
        public String renderDate;

        /**
         * <p>Render status. 0: Not rendered; 1: Rendered successfully; 3: Not rendered</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenderStatus")
        public Long renderStatus;

        /**
         * <p>Time when the SMS was sent</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-27 11:26:32</p>
         */
        @NameInMap("SendDate")
        public String sendDate;

        /**
         * <p>Sending status. 1: Sending; 2: Send failed; 3: Sent successfully; 4: Addressing failed</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SendStatus")
        public Long sendStatus;

        /**
         * <p>SMS content. Only applicable for text messages.</p>
         * 
         * <strong>example:</strong>
         * <p>您收到一条短信消息</p>
         */
        @NameInMap("SmsContent")
        public String smsContent;

        /**
         * <p>Template code</p>
         * 
         * <strong>example:</strong>
         * <p>CARD_SMS_6***</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static GetCardSmsDetailsResponseBodyCardSendDetailDTORecords build(java.util.Map<String, ?> map) throws Exception {
            GetCardSmsDetailsResponseBodyCardSendDetailDTORecords self = new GetCardSmsDetailsResponseBodyCardSendDetailDTORecords();
            return TeaModel.build(map, self);
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setReceiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }
        public String getReceiveDate() {
            return this.receiveDate;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setReceiveType(String receiveType) {
            this.receiveType = receiveType;
            return this;
        }
        public String getReceiveType() {
            return this.receiveType;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setRenderDate(String renderDate) {
            this.renderDate = renderDate;
            return this;
        }
        public String getRenderDate() {
            return this.renderDate;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setRenderStatus(Long renderStatus) {
            this.renderStatus = renderStatus;
            return this;
        }
        public Long getRenderStatus() {
            return this.renderStatus;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setSendStatus(Long sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Long getSendStatus() {
            return this.sendStatus;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTORecords setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetCardSmsDetailsResponseBodyCardSendDetailDTO extends TeaModel {
        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>List of card SMS sending records</p>
         */
        @NameInMap("Records")
        public java.util.List<GetCardSmsDetailsResponseBodyCardSendDetailDTORecords> records;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardSmsDetailsResponseBodyCardSendDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardSmsDetailsResponseBodyCardSendDetailDTO self = new GetCardSmsDetailsResponseBodyCardSendDetailDTO();
            return TeaModel.build(map, self);
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTO setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTO setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTO setRecords(java.util.List<GetCardSmsDetailsResponseBodyCardSendDetailDTORecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetCardSmsDetailsResponseBodyCardSendDetailDTORecords> getRecords() {
            return this.records;
        }

        public GetCardSmsDetailsResponseBodyCardSendDetailDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
