// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserRestrictedURLsResponseBody extends TeaModel {
    /**
     * <p>The list of restricted URLs on the current page. Each record contains a restricted URL and its unique identifier. If no restricted URLs are configured under the specified conditions, an empty array is returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListBrowserRestrictedURLsResponseBodyData> data;

    /**
     * <p>The actual page number used in this query. This is the echoed value of the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The actual number of entries returned per page in this query. This is the echoed value of the PageSize request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request. You can use the ID to locate call records and troubleshoot issues. The example value is partially masked.</p>
     * 
     * <strong>example:</strong>
     * <p>D4A13D91-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of restricted URL records that meet the filter conditions. This value is independent of the number of records returned on the current page and can be used with PageSize to calculate the total number of pages. If no records meet the conditions, 0 is returned.</p>
     * 
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
         * <p>The unique identifier of the restricted URL record.</p>
         * 
         * <strong>example:</strong>
         * <p>ru-3jm9d0abc00example</p>
         */
        @NameInMap("RestrictedURLId")
        public String restrictedURLId;

        /**
         * <p>The URL address that is restricted from access.</p>
         * 
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
