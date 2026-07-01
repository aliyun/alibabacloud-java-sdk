// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchCardSmsResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li>If <strong>OK</strong> is returned, the request is successful.</li>
     * <li>For information about other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SendBatchCardSmsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendBatchCardSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendBatchCardSmsResponseBody self = new SendBatchCardSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendBatchCardSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendBatchCardSmsResponseBody setData(SendBatchCardSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendBatchCardSmsResponseBodyData getData() {
        return this.data;
    }

    public SendBatchCardSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendBatchCardSmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendBatchCardSmsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the card SMS sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BizCardId")
        public String bizCardId;

        /**
         * <p>The ID of the digital SMS sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>3214</p>
         */
        @NameInMap("BizDigitalId")
        public String bizDigitalId;

        /**
         * <p>The ID of the text SMS sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>3256</p>
         */
        @NameInMap("BizSmsId")
        public String bizSmsId;

        /**
         * <p>The review status of the card SMS template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Under review.</li>
         * <li><strong>1</strong>: Approved.</li>
         * <li><strong>2</strong>: Rejected.<blockquote>
         * <p>For SMS messages that are rejected, you can configure the fallback process by using the <strong>FallbackType</strong> parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CardTmpState")
        public Integer cardTmpState;

        /**
         * <p>The mobile phone numbers that receive the card SMS messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("MediaMobiles")
        public String mediaMobiles;

        /**
         * <p>The fallback phone numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("NotMediaMobiles")
        public String notMediaMobiles;

        public static SendBatchCardSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendBatchCardSmsResponseBodyData self = new SendBatchCardSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendBatchCardSmsResponseBodyData setBizCardId(String bizCardId) {
            this.bizCardId = bizCardId;
            return this;
        }
        public String getBizCardId() {
            return this.bizCardId;
        }

        public SendBatchCardSmsResponseBodyData setBizDigitalId(String bizDigitalId) {
            this.bizDigitalId = bizDigitalId;
            return this;
        }
        public String getBizDigitalId() {
            return this.bizDigitalId;
        }

        public SendBatchCardSmsResponseBodyData setBizSmsId(String bizSmsId) {
            this.bizSmsId = bizSmsId;
            return this;
        }
        public String getBizSmsId() {
            return this.bizSmsId;
        }

        public SendBatchCardSmsResponseBodyData setCardTmpState(Integer cardTmpState) {
            this.cardTmpState = cardTmpState;
            return this;
        }
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        public SendBatchCardSmsResponseBodyData setMediaMobiles(String mediaMobiles) {
            this.mediaMobiles = mediaMobiles;
            return this;
        }
        public String getMediaMobiles() {
            return this.mediaMobiles;
        }

        public SendBatchCardSmsResponseBodyData setNotMediaMobiles(String notMediaMobiles) {
            this.notMediaMobiles = notMediaMobiles;
            return this;
        }
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

    }

}
