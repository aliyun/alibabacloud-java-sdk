// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkResponseBody extends TeaModel {
    /**
     * <p>请求状态码。取值：</p>
     * <ul>
     * <li>OK：代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">错误码列表</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public GetCardSmsLinkResponseBodyData data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>CC89A90C-978F-46AC-B80D-54738371E7CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>接口调用是否成功。取值：</p>
     * <ul>
     * <li><strong>true</strong>：调用成功。</li>
     * <li><strong>false</strong>：调用失败。</li>
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
         * <p>支持卡片短信的手机号码。</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;1390000****\&quot;,\&quot;1370000****\&quot;]</p>
         */
        @NameInMap("CardPhoneNumbers")
        public String cardPhoneNumbers;

        /**
         * <p>用于申请卡片短信短链的短信签名，在发送时签名、接收号码、卡片短信短链要一一对应。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;阿里云&quot;,&quot;阿里云2&quot;]</p>
         */
        @NameInMap("CardSignNames")
        public String cardSignNames;

        /**
         * <p>卡片短信短链。</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;mw2m.cn/LAaGGa\&quot;,\&quot;mw2m.cn/LAAaes\&quot;]</p>
         */
        @NameInMap("CardSmsLinks")
        public String cardSmsLinks;

        /**
         * <p>卡片短信模板审核状态。取值：</p>
         * <ul>
         * <li><strong>0</strong>：审核中。</li>
         * <li><strong>1</strong>：审核通过。</li>
         * <li><strong>2</strong>：审核不通过。</li>
         * </ul>
         * <blockquote>
         * <p>未审核通过的短信走回落流程。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CardTmpState")
        public Integer cardTmpState;

        /**
         * <p>不支持卡片短信的手机号。</p>
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
