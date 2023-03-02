// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableLevelResponseBody extends TeaModel {
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

    /**
     * <p>The information about the table levels.</p>
     */
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
        /**
         * <p>The description of the table level.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the table level.</p>
         */
        @NameInMap("LevelId")
        public Long levelId;

        /**
         * <p>The type of the table level. Valid values: 1 and 2. A value of 1 indicates the logical level. A value of 2 indicates the physical level.</p>
         */
        @NameInMap("LevelType")
        public Integer levelType;

        /**
         * <p>The name of the table level.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         */
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
        /**
         * <p>The list of table levels.</p>
         */
        @NameInMap("LevelList")
        public java.util.List<ListTableLevelResponseBodyTableLevelInfoLevelList> levelList;

        /**
         * <p>The total number of table levels returned.</p>
         */
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
