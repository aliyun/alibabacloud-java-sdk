// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeResponseBody extends TeaModel {
    /**
     * <p>The returned data about the level of the table folder.</p>
     */
    @NameInMap("Data")
    public ListTableThemeResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTableThemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableThemeResponseBody self = new ListTableThemeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableThemeResponseBody setData(ListTableThemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTableThemeResponseBodyData getData() {
        return this.data;
    }

    public ListTableThemeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableThemeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTableThemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTableThemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableThemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTableThemeResponseBodyDataThemeList extends TeaModel {
        /**
         * <p>The time when the level was created.</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The creator of the level.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The level of the table folder. Valid values: 1 and 2. A value of 1 indicates a table folder of level 1. A value of 2 indicates a table folder of level 2.</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The name of the level of the table folder.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent node.</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the table folder.</p>
         */
        @NameInMap("ThemeId")
        public Long themeId;

        public static ListTableThemeResponseBodyDataThemeList build(java.util.Map<String, ?> map) throws Exception {
            ListTableThemeResponseBodyDataThemeList self = new ListTableThemeResponseBodyDataThemeList();
            return TeaModel.build(map, self);
        }

        public ListTableThemeResponseBodyDataThemeList setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public ListTableThemeResponseBodyDataThemeList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTableThemeResponseBodyDataThemeList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListTableThemeResponseBodyDataThemeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableThemeResponseBodyDataThemeList setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListTableThemeResponseBodyDataThemeList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTableThemeResponseBodyDataThemeList setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

    }

    public static class ListTableThemeResponseBodyData extends TeaModel {
        /**
         * <p>The list of levels of the table folders.</p>
         */
        @NameInMap("ThemeList")
        public java.util.List<ListTableThemeResponseBodyDataThemeList> themeList;

        /**
         * <p>The total number of table folders.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListTableThemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTableThemeResponseBodyData self = new ListTableThemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTableThemeResponseBodyData setThemeList(java.util.List<ListTableThemeResponseBodyDataThemeList> themeList) {
            this.themeList = themeList;
            return this;
        }
        public java.util.List<ListTableThemeResponseBodyDataThemeList> getThemeList() {
            return this.themeList;
        }

        public ListTableThemeResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
