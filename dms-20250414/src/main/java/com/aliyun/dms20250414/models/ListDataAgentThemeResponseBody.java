// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentThemeResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataAgentThemeResponseBodyData> data;

    /**
     * <p>The error code returned when the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The current page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListDataAgentThemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentThemeResponseBody self = new ListDataAgentThemeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentThemeResponseBody setData(java.util.List<ListDataAgentThemeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataAgentThemeResponseBodyData> getData() {
        return this.data;
    }

    public ListDataAgentThemeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentThemeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentThemeResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentThemeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentThemeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAgentThemeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentThemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentThemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataAgentThemeResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListDataAgentThemeResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListDataAgentThemeResponseBodyData extends TeaModel {
        /**
         * <p>The common scenarios. Valid values: report, infographic, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>report</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The creation time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-15T08:30:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The modification time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-20T10:15:30Z</p>
         */
        @NameInMap("ModifiedAt")
        public String modifiedAt;

        /**
         * <p>The tracing reference that points to the UUID of the source theme.</p>
         * 
         * <strong>example:</strong>
         * <p>6d1e3f9a-<strong><strong>-</strong></strong>-****-2b8c4e6f0a1d</p>
         */
        @NameInMap("ReferTo")
        public String referTo;

        /**
         * <p>The source of the theme. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>custom</li>
         * <li>derived</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ThemeFrom")
        public String themeFrom;

        /**
         * <p>The business identifier of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>0f8b2c1d-<strong><strong>-</strong></strong>-****-9a3e5f7b1c2d</p>
         */
        @NameInMap("ThemeId")
        public String themeId;

        /**
         * <p>The display name of the theme.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly report</p>
         */
        @NameInMap("ThemeName")
        public String themeName;

        /**
         * <p>The theme stage. Valid values:</p>
         * <ul>
         * <li>design: contains only design.md.</li>
         * <li>template: complete and renderable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        @NameInMap("ThemeType")
        public String themeType;

        public static ListDataAgentThemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentThemeResponseBodyData self = new ListDataAgentThemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentThemeResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDataAgentThemeResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDataAgentThemeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataAgentThemeResponseBodyData setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public ListDataAgentThemeResponseBodyData setReferTo(String referTo) {
            this.referTo = referTo;
            return this;
        }
        public String getReferTo() {
            return this.referTo;
        }

        public ListDataAgentThemeResponseBodyData setThemeFrom(String themeFrom) {
            this.themeFrom = themeFrom;
            return this;
        }
        public String getThemeFrom() {
            return this.themeFrom;
        }

        public ListDataAgentThemeResponseBodyData setThemeId(String themeId) {
            this.themeId = themeId;
            return this;
        }
        public String getThemeId() {
            return this.themeId;
        }

        public ListDataAgentThemeResponseBodyData setThemeName(String themeName) {
            this.themeName = themeName;
            return this;
        }
        public String getThemeName() {
            return this.themeName;
        }

        public ListDataAgentThemeResponseBodyData setThemeType(String themeType) {
            this.themeType = themeType;
            return this;
        }
        public String getThemeType() {
            return this.themeType;
        }

    }

}
