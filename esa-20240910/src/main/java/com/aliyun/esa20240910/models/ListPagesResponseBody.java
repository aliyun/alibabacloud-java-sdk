// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPagesResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The custom error pages. Each element in the array contains error page-specific information.</p>
     */
    @NameInMap("Pages")
    public java.util.List<ListPagesResponseBodyPages> pages;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of custom error pages after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The number of custom error pages that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Usage")
    public Long usage;

    public static ListPagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPagesResponseBody self = new ListPagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPagesResponseBody setPages(java.util.List<ListPagesResponseBodyPages> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<ListPagesResponseBodyPages> getPages() {
        return this.pages;
    }

    public ListPagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPagesResponseBody setUsage(Long usage) {
        this.usage = usage;
        return this;
    }
    public Long getUsage() {
        return this.usage;
    }

    public static class ListPagesResponseBodyPages extends TeaModel {
        /**
         * <p>The Base64-encoded content of the error page. The content type is specified by the Content-Type field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The Content-Type field in the HTTP header.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text/html</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The description of the custom error page.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom deny page</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the custom error page.<a href="~~2850223~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the custom error page.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The name of the custom error page.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the custom error page was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPagesResponseBodyPages build(java.util.Map<String, ?> map) throws Exception {
            ListPagesResponseBodyPages self = new ListPagesResponseBodyPages();
            return TeaModel.build(map, self);
        }

        public ListPagesResponseBodyPages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListPagesResponseBodyPages setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListPagesResponseBodyPages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPagesResponseBodyPages setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPagesResponseBodyPages setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListPagesResponseBodyPages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPagesResponseBodyPages setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
