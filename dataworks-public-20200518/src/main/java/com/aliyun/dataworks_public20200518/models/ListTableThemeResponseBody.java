// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public ListTableThemeResponseBodyData data;

    public static ListTableThemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableThemeResponseBody self = new ListTableThemeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableThemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTableThemeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public ListTableThemeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableThemeResponseBody setData(ListTableThemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTableThemeResponseBodyData getData() {
        return this.data;
    }

    public static class ListTableThemeResponseBodyDataThemeList extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("Creator")
        public String creator;

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

        public ListTableThemeResponseBodyDataThemeList setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListTableThemeResponseBodyDataThemeList setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ListTableThemeResponseBodyDataThemeList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTableThemeResponseBodyDataThemeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableThemeResponseBodyDataThemeList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListTableThemeResponseBodyDataThemeList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

    public static class ListTableThemeResponseBodyData extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("ThemeList")
        public java.util.List<ListTableThemeResponseBodyDataThemeList> themeList;

        public static ListTableThemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTableThemeResponseBodyData self = new ListTableThemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTableThemeResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListTableThemeResponseBodyData setThemeList(java.util.List<ListTableThemeResponseBodyDataThemeList> themeList) {
            this.themeList = themeList;
            return this;
        }
        public java.util.List<ListTableThemeResponseBodyDataThemeList> getThemeList() {
            return this.themeList;
        }

    }

}
