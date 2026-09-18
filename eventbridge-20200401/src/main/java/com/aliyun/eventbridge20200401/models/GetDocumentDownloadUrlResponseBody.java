// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetDocumentDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The document download URL information.</p>
     */
    @NameInMap("Data")
    public GetDocumentDownloadUrlResponseBodyData data;

    /**
     * <p>The message returned by the operation. A value of Operation success indicates a successful call. If the call fails, a specific error description is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocumentDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentDownloadUrlResponseBody self = new GetDocumentDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentDownloadUrlResponseBody setData(GetDocumentDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDocumentDownloadUrlResponseBodyData extends TeaModel {
        /**
         * <p>A short-lived GET pre-signed URL that the client uses to download the original file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/kb/doc-bp1xxxxxxxxxxxx?Expires=1788000000&Signature=xxxx">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/kb/doc-bp1xxxxxxxxxxxx?Expires=1788000000&amp;Signature=xxxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time of the pre-signed download URL, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>1756022400000</p>
         */
        @NameInMap("ExpireAt")
        public String expireAt;

        public static GetDocumentDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentDownloadUrlResponseBodyData self = new GetDocumentDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentDownloadUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetDocumentDownloadUrlResponseBodyData setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

    }

}
