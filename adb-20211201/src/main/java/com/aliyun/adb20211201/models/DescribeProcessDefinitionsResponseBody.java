// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessDefinitionsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProcessDefinitions")
    public java.util.List<DescribeProcessDefinitionsResponseBodyProcessDefinitions> processDefinitions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProcessDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessDefinitionsResponseBody self = new DescribeProcessDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessDefinitionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProcessDefinitionsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessDefinitionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessDefinitionsResponseBody setProcessDefinitions(java.util.List<DescribeProcessDefinitionsResponseBodyProcessDefinitions> processDefinitions) {
        this.processDefinitions = processDefinitions;
        return this;
    }
    public java.util.List<DescribeProcessDefinitionsResponseBodyProcessDefinitions> getProcessDefinitions() {
        return this.processDefinitions;
    }

    public DescribeProcessDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProcessDefinitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProcessDefinitionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProcessDefinitionsResponseBodyProcessDefinitions extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DirectoryId")
        public Long directoryId;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("GlobalParamJson")
        public String globalParamJson;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LocationJson")
        public String locationJson;

        @NameInMap("ModifyBy")
        public String modifyBy;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentDirectoryId")
        public Long parentDirectoryId;

        @NameInMap("ParentDirectoryName")
        public String parentDirectoryName;

        @NameInMap("ProjectCode")
        public Long projectCode;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ReleaseState")
        public String releaseState;

        @NameInMap("ScheduleReleaseState")
        public String scheduleReleaseState;

        @NameInMap("TenantCode")
        public String tenantCode;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Version")
        public Long version;

        @NameInMap("WarningGroupId")
        public Long warningGroupId;

        public static DescribeProcessDefinitionsResponseBodyProcessDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessDefinitionsResponseBodyProcessDefinitions self = new DescribeProcessDefinitionsResponseBodyProcessDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setDirectoryId(Long directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Long getDirectoryId() {
            return this.directoryId;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setGlobalParamJson(String globalParamJson) {
            this.globalParamJson = globalParamJson;
            return this;
        }
        public String getGlobalParamJson() {
            return this.globalParamJson;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setLocationJson(String locationJson) {
            this.locationJson = locationJson;
            return this;
        }
        public String getLocationJson() {
            return this.locationJson;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setModifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
            return this;
        }
        public String getModifyBy() {
            return this.modifyBy;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setParentDirectoryId(Long parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public Long getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setParentDirectoryName(String parentDirectoryName) {
            this.parentDirectoryName = parentDirectoryName;
            return this;
        }
        public String getParentDirectoryName() {
            return this.parentDirectoryName;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setProjectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public Long getProjectCode() {
            return this.projectCode;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setReleaseState(String releaseState) {
            this.releaseState = releaseState;
            return this;
        }
        public String getReleaseState() {
            return this.releaseState;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setScheduleReleaseState(String scheduleReleaseState) {
            this.scheduleReleaseState = scheduleReleaseState;
            return this;
        }
        public String getScheduleReleaseState() {
            return this.scheduleReleaseState;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProcessDefinitionsResponseBodyProcessDefinitions setWarningGroupId(Long warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }
        public Long getWarningGroupId() {
            return this.warningGroupId;
        }

    }

}
