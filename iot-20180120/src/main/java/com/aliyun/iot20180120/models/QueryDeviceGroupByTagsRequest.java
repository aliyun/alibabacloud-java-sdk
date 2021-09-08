// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByTagsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Tag")
    public java.util.List<QueryDeviceGroupByTagsRequestTag> tag;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryDeviceGroupByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByTagsRequest self = new QueryDeviceGroupByTagsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceGroupByTagsRequest setTag(java.util.List<QueryDeviceGroupByTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryDeviceGroupByTagsRequestTag> getTag() {
        return this.tag;
    }

    public QueryDeviceGroupByTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDeviceGroupByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class QueryDeviceGroupByTagsRequestTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static QueryDeviceGroupByTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByTagsRequestTag self = new QueryDeviceGroupByTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByTagsRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDeviceGroupByTagsRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
