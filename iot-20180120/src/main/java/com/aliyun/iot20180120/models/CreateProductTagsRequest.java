// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTagsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The **ProductKey** of the product. A **ProductKey** is a GUID that is issued by IoT Platform to a product.</p>
     * <br>
     * <p>You can use the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products within the current account.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProductTag")
    public java.util.List<CreateProductTagsRequestProductTag> productTag;

    public static CreateProductTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTagsRequest self = new CreateProductTagsRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateProductTagsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateProductTagsRequest setProductTag(java.util.List<CreateProductTagsRequestProductTag> productTag) {
        this.productTag = productTag;
        return this;
    }
    public java.util.List<CreateProductTagsRequestProductTag> getProductTag() {
        return this.productTag;
    }

    public static class CreateProductTagsRequestProductTag extends TeaModel {
        /**
         * <p>The keys of product tags. Each key must be 1 to 30 characters in length, and can contain letters, digits, and periods (.).</p>
         * <br>
         * <br>
         * <p>**Important** `abc` is a **key** that is reserved by IoT Platform. You cannot set a **key** to `abc`. If you set a `key` to abc, the key is automatically filtered when you query tags.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The values of the product tags. Each tag value must be 1 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-).</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateProductTagsRequestProductTag build(java.util.Map<String, ?> map) throws Exception {
            CreateProductTagsRequestProductTag self = new CreateProductTagsRequestProductTag();
            return TeaModel.build(map, self);
        }

        public CreateProductTagsRequestProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateProductTagsRequestProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
