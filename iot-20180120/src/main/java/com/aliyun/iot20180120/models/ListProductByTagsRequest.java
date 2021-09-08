// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductByTagsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductTag")
    public java.util.List<ListProductByTagsRequestProductTag> productTag;

    public static ListProductByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductByTagsRequest self = new ListProductByTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductByTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListProductByTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListProductByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductByTagsRequest setProductTag(java.util.List<ListProductByTagsRequestProductTag> productTag) {
        this.productTag = productTag;
        return this;
    }
    public java.util.List<ListProductByTagsRequestProductTag> getProductTag() {
        return this.productTag;
    }

    public static class ListProductByTagsRequestProductTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListProductByTagsRequestProductTag build(java.util.Map<String, ?> map) throws Exception {
            ListProductByTagsRequestProductTag self = new ListProductByTagsRequestProductTag();
            return TeaModel.build(map, self);
        }

        public ListProductByTagsRequestProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListProductByTagsRequestProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
