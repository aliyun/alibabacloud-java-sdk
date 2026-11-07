// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserRestrictedURLsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListBrowserRestrictedURLsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>D4A13D91-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBrowserRestrictedURLsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserRestrictedURLsResponseBody self = new ListBrowserRestrictedURLsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBrowserRestrictedURLsResponseBody setData(java.util.List<ListBrowserRestrictedURLsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBrowserRestrictedURLsResponseBodyData> getData() {
        return this.data;
    }

    public ListBrowserRestrictedURLsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowserRestrictedURLsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBrowserRestrictedURLsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBrowserRestrictedURLsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBrowserRestrictedURLsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ru-3jm9d0abc00example</p>
         */
        @NameInMap("RestrictedURLId")
        public String restrictedURLId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListBrowserRestrictedURLsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserRestrictedURLsResponseBodyData self = new ListBrowserRestrictedURLsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBrowserRestrictedURLsResponseBodyData setRestrictedURLId(String restrictedURLId) {
            this.restrictedURLId = restrictedURLId;
            return this;
        }
        public String getRestrictedURLId() {
            return this.restrictedURLId;
        }

        public ListBrowserRestrictedURLsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
