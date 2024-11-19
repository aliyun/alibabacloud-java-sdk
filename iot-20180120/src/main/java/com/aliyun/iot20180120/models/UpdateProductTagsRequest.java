// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTagsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product. You can use the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products within the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductTag")
    public java.util.List<UpdateProductTagsRequestProductTag> productTag;

    public static UpdateProductTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTagsRequest self = new UpdateProductTagsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductTagsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateProductTagsRequest setProductTag(java.util.List<UpdateProductTagsRequestProductTag> productTag) {
        this.productTag = productTag;
        return this;
    }
    public java.util.List<UpdateProductTagsRequestProductTag> getProductTag() {
        return this.productTag;
    }

    public static class UpdateProductTagsRequestProductTag extends TeaModel {
        /**
         * <p>The keys of the product tags. Each key must be 1 to 30 characters in length, and can contain letters, digits, and periods (.).</p>
         * <blockquote>
         * <p> Each tag key that you specify must already exist. Each tag value that you specify must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>room</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The new values of the product tags. Each tag value must be 1 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateProductTagsRequestProductTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductTagsRequestProductTag self = new UpdateProductTagsRequestProductTag();
            return TeaModel.build(map, self);
        }

        public UpdateProductTagsRequestProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateProductTagsRequestProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
