// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPortalPublicationsResponseBody extends TeaModel {
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
    public ListPortalPublicationsResponseBodyData data;

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

    public static ListPortalPublicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPortalPublicationsResponseBody self = new ListPortalPublicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPortalPublicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPortalPublicationsResponseBody setData(ListPortalPublicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPortalPublicationsResponseBodyData getData() {
        return this.data;
    }

    public ListPortalPublicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPortalPublicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPortalPublicationsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The creation time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The description of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>API product for model services available to internal developers</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The API product ID. This is the primary ID of the Product resource, which identifies the API product associated with this publication record.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        /**
         * <p>The API product name. This is the Name property of the Product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>model-service</p>
         */
        @NameInMap("productName")
        public String productName;

        /**
         * <p>The API product type. The valid values are not defined in the API specification. Refer to the types displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_API</p>
         */
        @NameInMap("productType")
        public String productType;

        /**
         * <p>The publication record ID of the API product. This ID is returned when the PublishProduct operation publishes the API product to the portal. You can use it in the /himarket/v1/products/{productId}/publications/{publicationId} path to locate the publication record for the UnpublishProduct operation.</p>
         * 
         * <strong>example:</strong>
         * <p>publication-xxxxxxxx</p>
         */
        @NameInMap("publicationId")
        public String publicationId;

        public static ListPortalPublicationsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListPortalPublicationsResponseBodyDataContent self = new ListPortalPublicationsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListPortalPublicationsResponseBodyDataContent setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListPortalPublicationsResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPortalPublicationsResponseBodyDataContent setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListPortalPublicationsResponseBodyDataContent setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListPortalPublicationsResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListPortalPublicationsResponseBodyDataContent setPublicationId(String publicationId) {
            this.publicationId = publicationId;
            return this;
        }
        public String getPublicationId() {
            return this.publicationId;
        }

    }

    public static class ListPortalPublicationsResponseBodyData extends TeaModel {
        /**
         * <p>The list of published API products on the portal. The list elements are named portalConfig, and each element represents an API product publication record.</p>
         */
        @NameInMap("content")
        public java.util.List<ListPortalPublicationsResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListPortalPublicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPortalPublicationsResponseBodyData self = new ListPortalPublicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPortalPublicationsResponseBodyData setContent(java.util.List<ListPortalPublicationsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListPortalPublicationsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListPortalPublicationsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPortalPublicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPortalPublicationsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
