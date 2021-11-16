// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableLevelResponseBody extends TeaModel {
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

    @NameInMap("TableLevelInfo")
    public ListTableLevelResponseBodyTableLevelInfo tableLevelInfo;

    public static ListTableLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableLevelResponseBody self = new ListTableLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTableLevelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTableLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTableLevelResponseBody setTableLevelInfo(ListTableLevelResponseBodyTableLevelInfo tableLevelInfo) {
        this.tableLevelInfo = tableLevelInfo;
        return this;
    }
    public ListTableLevelResponseBodyTableLevelInfo getTableLevelInfo() {
        return this.tableLevelInfo;
    }

    public static class ListTableLevelResponseBodyTableLevelInfoLevelList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("LevelId")
        public Long levelId;

        @NameInMap("LevelType")
        public Integer levelType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        public static ListTableLevelResponseBodyTableLevelInfoLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListTableLevelResponseBodyTableLevelInfoLevelList self = new ListTableLevelResponseBodyTableLevelInfoLevelList();
            return TeaModel.build(map, self);
        }

        public ListTableLevelResponseBodyTableLevelInfoLevelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTableLevelResponseBodyTableLevelInfoLevelList setLevelId(Long levelId) {
            this.levelId = levelId;
            return this;
        }
        public Long getLevelId() {
            return this.levelId;
        }

        public ListTableLevelResponseBodyTableLevelInfoLevelList setLevelType(Integer levelType) {
            this.levelType = levelType;
            return this;
        }
        public Integer getLevelType() {
            return this.levelType;
        }

        public ListTableLevelResponseBodyTableLevelInfoLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableLevelResponseBodyTableLevelInfoLevelList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListTableLevelResponseBodyTableLevelInfo extends TeaModel {
        @NameInMap("LevelList")
        public java.util.List<ListTableLevelResponseBodyTableLevelInfoLevelList> levelList;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListTableLevelResponseBodyTableLevelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTableLevelResponseBodyTableLevelInfo self = new ListTableLevelResponseBodyTableLevelInfo();
            return TeaModel.build(map, self);
        }

        public ListTableLevelResponseBodyTableLevelInfo setLevelList(java.util.List<ListTableLevelResponseBodyTableLevelInfoLevelList> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<ListTableLevelResponseBodyTableLevelInfoLevelList> getLevelList() {
            return this.levelList;
        }

        public ListTableLevelResponseBodyTableLevelInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
