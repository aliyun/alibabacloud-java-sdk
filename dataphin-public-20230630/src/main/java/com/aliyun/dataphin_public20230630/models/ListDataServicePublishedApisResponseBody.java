// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListDataServicePublishedApisResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataServicePublishedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisResponseBody self = new ListDataServicePublishedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServicePublishedApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServicePublishedApisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServicePublishedApisResponseBody setPageResult(ListDataServicePublishedApisResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServicePublishedApisResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServicePublishedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServicePublishedApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10211</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>appKey</p>
         * 
         * <strong>example:</strong>
         * <p>1201</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList self = new ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyPageResultApiList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1022</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppCount")
        public Integer appCount;

        @NameInMap("AppInfoList")
        public java.util.List<ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList> appInfoList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApplyStatus")
        public Integer applyStatus;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("CallCount")
        public Integer callCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateType")
        public Integer createType;

        /**
         * <strong>example:</strong>
         * <p>0 0 0/1 * * *</p>
         */
        @NameInMap("CustomUpdateRate")
        public String customUpdateRate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("DeployTime")
        public String deployTime;

        /**
         * <strong>example:</strong>
         * <p>test xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteMode")
        public Integer executeMode;

        /**
         * <strong>example:</strong>
         * <p>102131</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>1022</p>
         */
        @NameInMap("LogicUnitNo")
        public Long logicUnitNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerUserName")
        public String ownerUserName;

        /**
         * <strong>example:</strong>
         * <p>102101</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateRate")
        public Integer updateRate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListDataServicePublishedApisResponseBodyPageResultApiList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyPageResultApiList self = new ListDataServicePublishedApisResponseBodyPageResultApiList();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setAppCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }
        public Integer getAppCount() {
            return this.appCount;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setAppInfoList(java.util.List<ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyPageResultApiListAppInfoList> getAppInfoList() {
            return this.appInfoList;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setApplyStatus(Integer applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }
        public Integer getApplyStatus() {
            return this.applyStatus;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setCallCount(Integer callCount) {
            this.callCount = callCount;
            return this;
        }
        public Integer getCallCount() {
            return this.callCount;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setCreateType(Integer createType) {
            this.createType = createType;
            return this;
        }
        public Integer getCreateType() {
            return this.createType;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setCustomUpdateRate(String customUpdateRate) {
            this.customUpdateRate = customUpdateRate;
            return this;
        }
        public String getCustomUpdateRate() {
            return this.customUpdateRate;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setExecuteMode(Integer executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public Integer getExecuteMode() {
            return this.executeMode;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setLogicUnitNo(Long logicUnitNo) {
            this.logicUnitNo = logicUnitNo;
            return this;
        }
        public Long getLogicUnitNo() {
            return this.logicUnitNo;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setOwnerUserName(String ownerUserName) {
            this.ownerUserName = ownerUserName;
            return this;
        }
        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setUpdateRate(Integer updateRate) {
            this.updateRate = updateRate;
            return this;
        }
        public Integer getUpdateRate() {
            return this.updateRate;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListDataServicePublishedApisResponseBodyPageResultApiList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyPageResult extends TeaModel {
        @NameInMap("ApiList")
        public java.util.List<ListDataServicePublishedApisResponseBodyPageResultApiList> apiList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServicePublishedApisResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyPageResult self = new ListDataServicePublishedApisResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyPageResult setApiList(java.util.List<ListDataServicePublishedApisResponseBodyPageResultApiList> apiList) {
            this.apiList = apiList;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyPageResultApiList> getApiList() {
            return this.apiList;
        }

        public ListDataServicePublishedApisResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
