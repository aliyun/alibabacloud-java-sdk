// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListTableThemeResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("ProjectId")
        public Long projectId;

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
        @NameInMap("ThemeList")
        public java.util.List<ListTableThemeResponseBodyDataThemeList> themeList;

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
