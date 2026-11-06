// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishProductResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public PublishProductResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PublishProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishProductResponseBody self = new PublishProductResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublishProductResponseBody setData(PublishProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PublishProductResponseBodyData getData() {
        return this.data;
    }

    public PublishProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PublishProductResponseBodyData extends TeaModel {
        /**
         * <p>The publication record ID, which identifies the publication relationship between the published API product and the target portal. You can query this ID in the response of ListProductPublications at /himarket/v1/products/{productId}/publications. You can also use this ID as the publicationId path parameter in UnpublishProduct to unpublish the record.</p>
         * 
         * <strong>example:</strong>
         * <p>publication-xxxxxxxx</p>
         */
        @NameInMap("publicationId")
        public String publicationId;

        public static PublishProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PublishProductResponseBodyData self = new PublishProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PublishProductResponseBodyData setPublicationId(String publicationId) {
            this.publicationId = publicationId;
            return this;
        }
        public String getPublicationId() {
            return this.publicationId;
        }

    }

}
