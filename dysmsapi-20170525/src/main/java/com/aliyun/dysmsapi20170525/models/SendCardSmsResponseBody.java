// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public SendCardSmsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D28D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendCardSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCardSmsResponseBody self = new SendCardSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCardSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCardSmsResponseBody setData(SendCardSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendCardSmsResponseBodyData getData() {
        return this.data;
    }

    public SendCardSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCardSmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendCardSmsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the card message.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BizCardId")
        public String bizCardId;

        /**
         * <p>The ID of the digital message.</p>
         * 
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("BizDigitalId")
        public String bizDigitalId;

        /**
         * <p>The ID of the text message.</p>
         * 
         * <strong>example:</strong>
         * <p>524</p>
         */
        @NameInMap("BizSmsId")
        public String bizSmsId;

        /**
         * <p>The review status of the card message template.</p>
         * <ul>
         * <li><strong>0</strong>: pending approval</li>
         * <li><strong>1</strong>: approved</li>
         * <li><strong>2</strong>: rejected</li>
         * </ul>
         * <blockquote>
         * <p>Unapproved card messages are rolled back.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CardTmpState")
        public Integer cardTmpState;

        /**
         * <p>The mobile phone number from which the card message is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("MediaMobiles")
        public String mediaMobiles;

        /**
         * <p>The mobile phone number whose card message is rolled back.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("NotMediaMobiles")
        public String notMediaMobiles;

        public static SendCardSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendCardSmsResponseBodyData self = new SendCardSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendCardSmsResponseBodyData setBizCardId(String bizCardId) {
            this.bizCardId = bizCardId;
            return this;
        }
        public String getBizCardId() {
            return this.bizCardId;
        }

        public SendCardSmsResponseBodyData setBizDigitalId(String bizDigitalId) {
            this.bizDigitalId = bizDigitalId;
            return this;
        }
        public String getBizDigitalId() {
            return this.bizDigitalId;
        }

        public SendCardSmsResponseBodyData setBizSmsId(String bizSmsId) {
            this.bizSmsId = bizSmsId;
            return this;
        }
        public String getBizSmsId() {
            return this.bizSmsId;
        }

        public SendCardSmsResponseBodyData setCardTmpState(Integer cardTmpState) {
            this.cardTmpState = cardTmpState;
            return this;
        }
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        public SendCardSmsResponseBodyData setMediaMobiles(String mediaMobiles) {
            this.mediaMobiles = mediaMobiles;
            return this;
        }
        public String getMediaMobiles() {
            return this.mediaMobiles;
        }

        public SendCardSmsResponseBodyData setNotMediaMobiles(String notMediaMobiles) {
            this.notMediaMobiles = notMediaMobiles;
            return this;
        }
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

    }

}
