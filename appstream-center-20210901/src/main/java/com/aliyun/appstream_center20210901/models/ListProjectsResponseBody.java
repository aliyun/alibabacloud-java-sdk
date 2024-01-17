// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListProjectsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectsResponseBody setData(java.util.List<ListProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectsResponseBodyData extends TeaModel {
        @NameInMap("AccessPageId")
        public java.util.List<Long> accessPageId;

        @NameInMap("AvailableHours")
        public Integer availableHours;

        @NameInMap("ContentId")
        public String contentId;

        @NameInMap("ContentName")
        public String contentName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InUseSessions")
        public Long inUseSessions;

        @NameInMap("MaxHours")
        public Long maxHours;

        @NameInMap("MaxSessions")
        public Long maxSessions;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectState")
        public String projectState;

        @NameInMap("SessionSpec")
        public String sessionSpec;

        public static ListProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyData self = new ListProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyData setAccessPageId(java.util.List<Long> accessPageId) {
            this.accessPageId = accessPageId;
            return this;
        }
        public java.util.List<Long> getAccessPageId() {
            return this.accessPageId;
        }

        public ListProjectsResponseBodyData setAvailableHours(Integer availableHours) {
            this.availableHours = availableHours;
            return this;
        }
        public Integer getAvailableHours() {
            return this.availableHours;
        }

        public ListProjectsResponseBodyData setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }
        public String getContentId() {
            return this.contentId;
        }

        public ListProjectsResponseBodyData setContentName(String contentName) {
            this.contentName = contentName;
            return this;
        }
        public String getContentName() {
            return this.contentName;
        }

        public ListProjectsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyData setInUseSessions(Long inUseSessions) {
            this.inUseSessions = inUseSessions;
            return this;
        }
        public Long getInUseSessions() {
            return this.inUseSessions;
        }

        public ListProjectsResponseBodyData setMaxHours(Long maxHours) {
            this.maxHours = maxHours;
            return this;
        }
        public Long getMaxHours() {
            return this.maxHours;
        }

        public ListProjectsResponseBodyData setMaxSessions(Long maxSessions) {
            this.maxSessions = maxSessions;
            return this;
        }
        public Long getMaxSessions() {
            return this.maxSessions;
        }

        public ListProjectsResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectsResponseBodyData setProjectState(String projectState) {
            this.projectState = projectState;
            return this;
        }
        public String getProjectState() {
            return this.projectState;
        }

        public ListProjectsResponseBodyData setSessionSpec(String sessionSpec) {
            this.sessionSpec = sessionSpec;
            return this;
        }
        public String getSessionSpec() {
            return this.sessionSpec;
        }

    }

}
