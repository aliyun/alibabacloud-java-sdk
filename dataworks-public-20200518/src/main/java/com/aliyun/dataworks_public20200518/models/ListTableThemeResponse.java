// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTableThemeResponseData data;

    public static ListTableThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableThemeResponse self = new ListTableThemeResponse();
        return TeaModel.build(map, self);
    }

    public ListTableThemeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableThemeResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableThemeResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTableThemeResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTableThemeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTableThemeResponse setData(ListTableThemeResponseData data) {
        this.data = data;
        return this;
    }
    public ListTableThemeResponseData getData() {
        return this.data;
    }

    public static class ListTableThemeResponseDataThemeList extends TeaModel {
        @NameInMap("ThemeId")
        @Validation(required = true)
        public Long themeId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Level")
        @Validation(required = true)
        public Integer level;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("CreateTimeStamp")
        @Validation(required = true)
        public Long createTimeStamp;

        public static ListTableThemeResponseDataThemeList build(java.util.Map<String, ?> map) throws Exception {
            ListTableThemeResponseDataThemeList self = new ListTableThemeResponseDataThemeList();
            return TeaModel.build(map, self);
        }

        public ListTableThemeResponseDataThemeList setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ListTableThemeResponseDataThemeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableThemeResponseDataThemeList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListTableThemeResponseDataThemeList setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListTableThemeResponseDataThemeList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTableThemeResponseDataThemeList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTableThemeResponseDataThemeList setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

    }

    public static class ListTableThemeResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("ThemeList")
        @Validation(required = true)
        public java.util.List<ListTableThemeResponseDataThemeList> themeList;

        public static ListTableThemeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTableThemeResponseData self = new ListTableThemeResponseData();
            return TeaModel.build(map, self);
        }

        public ListTableThemeResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListTableThemeResponseData setThemeList(java.util.List<ListTableThemeResponseDataThemeList> themeList) {
            this.themeList = themeList;
            return this;
        }
        public java.util.List<ListTableThemeResponseDataThemeList> getThemeList() {
            return this.themeList;
        }

    }

}
