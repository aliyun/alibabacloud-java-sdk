// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTagsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

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
        @NameInMap("TagKey")
        public String tagKey;

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
