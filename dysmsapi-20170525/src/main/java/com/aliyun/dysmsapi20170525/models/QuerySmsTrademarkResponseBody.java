// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTrademarkResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p><code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A list of trademark details.</p>
     */
    @NameInMap("Data")
    public java.util.List<QuerySmsTrademarkResponseBodyData> data;

    /**
     * <p>The description of the status code.</p>
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
     * <p>569E9DBD-23FF-1785-99AD-E4B23608C104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySmsTrademarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTrademarkResponseBody self = new QuerySmsTrademarkResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTrademarkResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySmsTrademarkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsTrademarkResponseBody setData(java.util.List<QuerySmsTrademarkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySmsTrademarkResponseBodyData> getData() {
        return this.data;
    }

    public QuerySmsTrademarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsTrademarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsTrademarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySmsTrademarkResponseBodyData extends TeaModel {
        /**
         * <p>The applicant name.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        @NameInMap("TrademarkApplicantName")
        public String trademarkApplicantName;

        /**
         * <p>The validity period of the trademark.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-01~2025-12-19</p>
         */
        @NameInMap("TrademarkEffExpDate")
        public String trademarkEffExpDate;

        /**
         * <p>The trademark ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000*******</p>
         */
        @NameInMap("TrademarkId")
        public Long trademarkId;

        /**
         * <p>The name of the trademark.</p>
         * 
         * <strong>example:</strong>
         * <p>示例商标</p>
         */
        @NameInMap("TrademarkName")
        public String trademarkName;

        /**
         * <p>The Object Storage Service (OSS) file key for the trademark image.</p>
         * 
         * <strong>example:</strong>
         * <p>100000*<strong><strong>802/afdebd46-</strong></strong>-46e4-899d-b4375826c898_mhk9oz0p_1762****31542.png</p>
         */
        @NameInMap("TrademarkPic")
        public String trademarkPic;

        /**
         * <p>The URL of the trademark screenshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&OSSAccessKeyId=bypFN****73PsLI&Signature=BygI9X****h7%2FXmFIo****FB2c%3D">https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&amp;OSSAccessKeyId=bypFN****73PsLI&amp;Signature=BygI9X****h7%2FXmFIo****FB2c%3D</a></p>
         */
        @NameInMap("TrademarkPicUrl")
        public String trademarkPicUrl;

        /**
         * <p>The trademark registration number.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TrademarkRegistrationNumber")
        public String trademarkRegistrationNumber;

        public static QuerySmsTrademarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTrademarkResponseBodyData self = new QuerySmsTrademarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkApplicantName(String trademarkApplicantName) {
            this.trademarkApplicantName = trademarkApplicantName;
            return this;
        }
        public String getTrademarkApplicantName() {
            return this.trademarkApplicantName;
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkEffExpDate(String trademarkEffExpDate) {
            this.trademarkEffExpDate = trademarkEffExpDate;
            return this;
        }
        public String getTrademarkEffExpDate() {
            return this.trademarkEffExpDate;
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkId(Long trademarkId) {
            this.trademarkId = trademarkId;
            return this;
        }
        public Long getTrademarkId() {
            return this.trademarkId;
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkPic(String trademarkPic) {
            this.trademarkPic = trademarkPic;
            return this;
        }
        public String getTrademarkPic() {
            return this.trademarkPic;
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkPicUrl(String trademarkPicUrl) {
            this.trademarkPicUrl = trademarkPicUrl;
            return this;
        }
        public String getTrademarkPicUrl() {
            return this.trademarkPicUrl;
        }

        public QuerySmsTrademarkResponseBodyData setTrademarkRegistrationNumber(String trademarkRegistrationNumber) {
            this.trademarkRegistrationNumber = trademarkRegistrationNumber;
            return this;
        }
        public String getTrademarkRegistrationNumber() {
            return this.trademarkRegistrationNumber;
        }

    }

}
