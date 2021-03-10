// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTagsRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProductTag")
    public java.util.List<CreateProductTagsRequestProductTag> productTag;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static CreateProductTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTagsRequest self = new CreateProductTagsRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductTagsRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateProductTagsRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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

    public CreateProductTagsRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public CreateProductTagsRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

    public static class CreateProductTagsRequestProductTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

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
