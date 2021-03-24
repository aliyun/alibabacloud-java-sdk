// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListAppInfosRequest extends TeaModel {
    @NameInMap("RequestParams")
    public ListAppInfosRequestRequestParams requestParams;

    public static ListAppInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfosRequest self = new ListAppInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInfosRequest setRequestParams(ListAppInfosRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ListAppInfosRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ListAppInfosRequestRequestParams extends TeaModel {
        // 关键字类型，包含appName、appId两类
        @NameInMap("Type")
        public String type;

        // 关键字
        @NameInMap("Keyword")
        public String keyword;

        // 分页大小，大于0的任意数
        @NameInMap("PageSize")
        public Integer pageSize;

        // 页码，从1开始
        @NameInMap("PageNumber")
        public Integer pageNumber;

        public static ListAppInfosRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfosRequestRequestParams self = new ListAppInfosRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ListAppInfosRequestRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppInfosRequestRequestParams setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListAppInfosRequestRequestParams setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppInfosRequestRequestParams setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

    }

}
