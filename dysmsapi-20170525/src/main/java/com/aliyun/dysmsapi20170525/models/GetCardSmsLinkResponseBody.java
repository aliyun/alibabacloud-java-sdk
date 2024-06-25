// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCardSmsLinkResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CC89A90C-978F-46AC-B80D-54738371E7CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
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

    public static GetCardSmsLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsLinkResponseBody self = new GetCardSmsLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardSmsLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardSmsLinkResponseBody setData(GetCardSmsLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCardSmsLinkResponseBodyData getData() {
        return this.data;
    }

    public GetCardSmsLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardSmsLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardSmsLinkResponseBodyData extends TeaModel {
        /**
         * <p>The mobile phone numbers that support card messages.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;1390000****\&quot;,\&quot;1370000****\&quot;]</p>
         */
        @NameInMap("CardPhoneNumbers")
        public String cardPhoneNumbers;

        /**
         * <p>The signatures must correspond to the mobile numbers and short URLs in sequence.</p>
         */
        @NameInMap("CardSignNames")
        public String cardSignNames;

        /**
         * <p>The short URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;mw2m.cn/LAaGGa\&quot;,\&quot;mw2m.cn/LAAaes\&quot;]</p>
         */
        @NameInMap("CardSmsLinks")
        public String cardSmsLinks;

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
         * <p>The mobile phone numbers that do not support card messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("NotMediaMobiles")
        public String notMediaMobiles;

        public static GetCardSmsLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCardSmsLinkResponseBodyData self = new GetCardSmsLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCardSmsLinkResponseBodyData setCardPhoneNumbers(String cardPhoneNumbers) {
            this.cardPhoneNumbers = cardPhoneNumbers;
            return this;
        }
        public String getCardPhoneNumbers() {
            return this.cardPhoneNumbers;
        }

        public GetCardSmsLinkResponseBodyData setCardSignNames(String cardSignNames) {
            this.cardSignNames = cardSignNames;
            return this;
        }
        public String getCardSignNames() {
            return this.cardSignNames;
        }

        public GetCardSmsLinkResponseBodyData setCardSmsLinks(String cardSmsLinks) {
            this.cardSmsLinks = cardSmsLinks;
            return this;
        }
        public String getCardSmsLinks() {
            return this.cardSmsLinks;
        }

        public GetCardSmsLinkResponseBodyData setCardTmpState(Integer cardTmpState) {
            this.cardTmpState = cardTmpState;
            return this;
        }
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        public GetCardSmsLinkResponseBodyData setNotMediaMobiles(String notMediaMobiles) {
            this.notMediaMobiles = notMediaMobiles;
            return this;
        }
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

    }

}
