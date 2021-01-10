// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryAppDeviceListRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKeyList")
    public java.util.List<String> productKeyList;

    @NameInMap("CategoryKeyList")
    public java.util.List<String> categoryKeyList;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("TagList")
    public java.util.List<QueryAppDeviceListRequestTagList> tagList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static QueryAppDeviceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppDeviceListRequest self = new QueryAppDeviceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppDeviceListRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryAppDeviceListRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryAppDeviceListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryAppDeviceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAppDeviceListRequest setProductKeyList(java.util.List<String> productKeyList) {
        this.productKeyList = productKeyList;
        return this;
    }
    public java.util.List<String> getProductKeyList() {
        return this.productKeyList;
    }

    public QueryAppDeviceListRequest setCategoryKeyList(java.util.List<String> categoryKeyList) {
        this.categoryKeyList = categoryKeyList;
        return this;
    }
    public java.util.List<String> getCategoryKeyList() {
        return this.categoryKeyList;
    }

    public QueryAppDeviceListRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryAppDeviceListRequest setTagList(java.util.List<QueryAppDeviceListRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<QueryAppDeviceListRequestTagList> getTagList() {
        return this.tagList;
    }

    public QueryAppDeviceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public static class QueryAppDeviceListRequestTagList extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryAppDeviceListRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            QueryAppDeviceListRequestTagList self = new QueryAppDeviceListRequestTagList();
            return TeaModel.build(map, self);
        }

        public QueryAppDeviceListRequestTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryAppDeviceListRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
