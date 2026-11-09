// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserBookmarksResponseBody extends TeaModel {
    /**
     * <p>The list of bookmarks on the current page.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListBrowserBookmarksResponseBodyData> data;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0C2ED-95F2-1A37-9FC6-4A395179****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of bookmarks that meet the filtering conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBrowserBookmarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserBookmarksResponseBody self = new ListBrowserBookmarksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBrowserBookmarksResponseBody setData(java.util.List<ListBrowserBookmarksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBrowserBookmarksResponseBodyData> getData() {
        return this.data;
    }

    public ListBrowserBookmarksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowserBookmarksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBrowserBookmarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBrowserBookmarksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBrowserBookmarksResponseBodyData extends TeaModel {
        /**
         * <p>The bookmark folder.</p>
         * 
         * <strong>example:</strong>
         * <p>Work</p>
         */
        @NameInMap("BookmarkFolder")
        public String bookmarkFolder;

        /**
         * <p>The bookmark ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bm-0c7loey7fzjq****</p>
         */
        @NameInMap("BookmarkId")
        public String bookmarkId;

        /**
         * <p>The bookmark name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("BookmarkName")
        public String bookmarkName;

        /**
         * <p>The bookmark URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("BookmarkURL")
        public String bookmarkURL;

        public static ListBrowserBookmarksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserBookmarksResponseBodyData self = new ListBrowserBookmarksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBrowserBookmarksResponseBodyData setBookmarkFolder(String bookmarkFolder) {
            this.bookmarkFolder = bookmarkFolder;
            return this;
        }
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        public ListBrowserBookmarksResponseBodyData setBookmarkId(String bookmarkId) {
            this.bookmarkId = bookmarkId;
            return this;
        }
        public String getBookmarkId() {
            return this.bookmarkId;
        }

        public ListBrowserBookmarksResponseBodyData setBookmarkName(String bookmarkName) {
            this.bookmarkName = bookmarkName;
            return this;
        }
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        public ListBrowserBookmarksResponseBodyData setBookmarkURL(String bookmarkURL) {
            this.bookmarkURL = bookmarkURL;
            return this;
        }
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

    }

}
