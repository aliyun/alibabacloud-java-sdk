// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaDocumentDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call succeeds. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The pre-signed download URL information for the original document.</p>
     */
    @NameInMap("Data")
    public GetLumaDocumentDownloadUrlResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. Use this ID for troubleshooting or when submitting a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLumaDocumentDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLumaDocumentDownloadUrlResponseBody self = new GetLumaDocumentDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLumaDocumentDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLumaDocumentDownloadUrlResponseBody setData(GetLumaDocumentDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLumaDocumentDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetLumaDocumentDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLumaDocumentDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLumaDocumentDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLumaDocumentDownloadUrlResponseBodyData extends TeaModel {
        /**
         * <p>The pre-signed download URL for the original document. The URL is valid for a limited period of time.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/kb/doc-bp1xxxxxxxxxxxx?Expires=1788000000&Signature=xxxx">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/kb/doc-bp1xxxxxxxxxxxx?Expires=1788000000&amp;Signature=xxxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time of the download URL in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T12:00:00Z</p>
         */
        @NameInMap("ExpireAt")
        public String expireAt;

        public static GetLumaDocumentDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLumaDocumentDownloadUrlResponseBodyData self = new GetLumaDocumentDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLumaDocumentDownloadUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetLumaDocumentDownloadUrlResponseBodyData setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

    }

}
