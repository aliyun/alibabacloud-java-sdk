// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsResponseBody extends TeaModel {
    /**
     * <p>请求状态码。</p>
     * <ul>
     * <li>返回OK代表请求成功。</li>
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
    public SendCardSmsResponseBodyData data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D28D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>调用接口是否成功。取值：</p>
     * <ul>
     * <li><p><strong>true</strong>：调用成功。</p>
     * </li>
     * <li><p><strong>false</strong>：调用失败。</p>
     * </li>
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
         * <p>卡片短信发送ID。</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BizCardId")
        public String bizCardId;

        /**
         * <p>数字短信发送ID。</p>
         * 
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("BizDigitalId")
        public String bizDigitalId;

        /**
         * <p>文本短信发送ID。</p>
         * 
         * <strong>example:</strong>
         * <p>524</p>
         */
        @NameInMap("BizSmsId")
        public String bizSmsId;

        /**
         * <p>卡片短信模板审核状态。取值：</p>
         * <ul>
         * <li><strong>0</strong>：审核中。</li>
         * <li><strong>1</strong>：审核通过。</li>
         * <li><strong>2</strong>：审核不通过。<blockquote>
         * <p> 审核不通过的短信可通过<strong>FallbackType</strong>字段设置回落流程。</p>
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
         * <p>接收卡片短信的手机号。</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("MediaMobiles")
        public String mediaMobiles;

        /**
         * <p>回落的手机号。</p>
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
