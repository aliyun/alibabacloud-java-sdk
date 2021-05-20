// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableLevelResponse extends TeaModel {
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

    @NameInMap("TableLevelInfo")
    @Validation(required = true)
    public ListTableLevelResponseTableLevelInfo tableLevelInfo;

    public static ListTableLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableLevelResponse self = new ListTableLevelResponse();
        return TeaModel.build(map, self);
    }

    public ListTableLevelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableLevelResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableLevelResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTableLevelResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTableLevelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTableLevelResponse setTableLevelInfo(ListTableLevelResponseTableLevelInfo tableLevelInfo) {
        this.tableLevelInfo = tableLevelInfo;
        return this;
    }
    public ListTableLevelResponseTableLevelInfo getTableLevelInfo() {
        return this.tableLevelInfo;
    }

    public static class ListTableLevelResponseTableLevelInfoLevelList extends TeaModel {
        @NameInMap("LevelId")
        @Validation(required = true)
        public Long levelId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("LevelType")
        @Validation(required = true)
        public Integer levelType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static ListTableLevelResponseTableLevelInfoLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListTableLevelResponseTableLevelInfoLevelList self = new ListTableLevelResponseTableLevelInfoLevelList();
            return TeaModel.build(map, self);
        }

        public ListTableLevelResponseTableLevelInfoLevelList setLevelId(Long levelId) {
            this.levelId = levelId;
            return this;
        }
        public Long getLevelId() {
            return this.levelId;
        }

        public ListTableLevelResponseTableLevelInfoLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableLevelResponseTableLevelInfoLevelList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTableLevelResponseTableLevelInfoLevelList setLevelType(Integer levelType) {
            this.levelType = levelType;
            return this;
        }
        public Integer getLevelType() {
            return this.levelType;
        }

        public ListTableLevelResponseTableLevelInfoLevelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListTableLevelResponseTableLevelInfo extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("LevelList")
        @Validation(required = true)
        public java.util.List<ListTableLevelResponseTableLevelInfoLevelList> levelList;

        public static ListTableLevelResponseTableLevelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTableLevelResponseTableLevelInfo self = new ListTableLevelResponseTableLevelInfo();
            return TeaModel.build(map, self);
        }

        public ListTableLevelResponseTableLevelInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListTableLevelResponseTableLevelInfo setLevelList(java.util.List<ListTableLevelResponseTableLevelInfoLevelList> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<ListTableLevelResponseTableLevelInfoLevelList> getLevelList() {
            return this.levelList;
        }

    }

}
