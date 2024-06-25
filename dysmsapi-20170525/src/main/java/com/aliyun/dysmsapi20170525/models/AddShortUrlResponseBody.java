// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddShortUrlResponseBody extends TeaModel {
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
     * <p>The details of the short URL.</p>
     */
    @NameInMap("Data")
    public AddShortUrlResponseBodyData data;

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

    public static AddShortUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShortUrlResponseBody self = new AddShortUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShortUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddShortUrlResponseBody setData(AddShortUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddShortUrlResponseBodyData getData() {
        return this.data;
    }

    public AddShortUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddShortUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddShortUrlResponseBodyData extends TeaModel {
        /**
         * <p>The time when the short URL expires.</p>
         * <blockquote>
         * <p>The value of <strong>ExpireDate</strong> is on the hour.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-09-19 00:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The short URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://****.cn/6y8uy7</p>
         */
        @NameInMap("ShortUrl")
        public String shortUrl;

        /**
         * <p>The source URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.****.com/product/sms">https://www.****.com/product/sms</a></p>
         */
        @NameInMap("SourceUrl")
        public String sourceUrl;

        public static AddShortUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddShortUrlResponseBodyData self = new AddShortUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddShortUrlResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public AddShortUrlResponseBodyData setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public AddShortUrlResponseBodyData setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

    }

}
