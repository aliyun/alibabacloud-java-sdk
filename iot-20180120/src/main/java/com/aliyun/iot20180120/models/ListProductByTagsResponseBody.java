// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductByTagsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of the products returned if the call is successful. The details are included in the <strong>ProductInfo</strong> parameter.</p>
     * <blockquote>
     * <p> The returned product information is sorted in reverse-chronological order based on the time when the products were created.</p>
     * </blockquote>
     */
    @NameInMap("ProductInfos")
    public ListProductByTagsResponseBodyProductInfos productInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProductByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductByTagsResponseBody self = new ListProductByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductByTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductByTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProductByTagsResponseBody setProductInfos(ListProductByTagsResponseBodyProductInfos productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public ListProductByTagsResponseBodyProductInfos getProductInfos() {
        return this.productInfos;
    }

    public ListProductByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductByTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProductByTagsResponseBodyProductInfosProductInfo extends TeaModel {
        /**
         * <p>The time when the product was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1545355537000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test product.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The node type of the product. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can connect to IoT Platform directly or as a sub-device of a gateway.</li>
         * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain the topological relationships with sub-devices, and synchronize the topological relationships to IoT Platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The ProductKey of the product. A ProductKey is a globally unique identifier (GUID) issued by IoT Platform to a new product.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static ListProductByTagsResponseBodyProductInfosProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsResponseBodyProductInfosProductInfo self = new ListProductByTagsResponseBodyProductInfosProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListProductByTagsResponseBodyProductInfosProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListProductByTagsResponseBodyProductInfos extends TeaModel {
        @NameInMap("ProductInfo")
        public java.util.List<ListProductByTagsResponseBodyProductInfosProductInfo> productInfo;

        public static ListProductByTagsResponseBodyProductInfos build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsResponseBodyProductInfos self = new ListProductByTagsResponseBodyProductInfos();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsResponseBodyProductInfos setProductInfo(java.util.List<ListProductByTagsResponseBodyProductInfosProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<ListProductByTagsResponseBodyProductInfosProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

}
