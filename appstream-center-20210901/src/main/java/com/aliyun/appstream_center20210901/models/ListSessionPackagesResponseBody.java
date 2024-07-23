// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListSessionPackagesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSessionPackagesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5Fxxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSessionPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSessionPackagesResponseBody self = new ListSessionPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSessionPackagesResponseBody setData(java.util.List<ListSessionPackagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSessionPackagesResponseBodyData> getData() {
        return this.data;
    }

    public ListSessionPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSessionPackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSessionPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSessionPackagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSessionPackagesResponseBodyDataInstanceObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-05-28T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>tp-xxxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>appstreaming.general.entry</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>p-xxxxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>AppSessionPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>2023-11-28T04:14:07Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        @NameInMap("TotalTime")
        public Long totalTime;

        /**
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("UsedTime")
        public Long usedTime;

        public static ListSessionPackagesResponseBodyDataInstanceObject build(java.util.Map<String, ?> map) throws Exception {
            ListSessionPackagesResponseBodyDataInstanceObject self = new ListSessionPackagesResponseBodyDataInstanceObject();
            return TeaModel.build(map, self);
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public ListSessionPackagesResponseBodyDataInstanceObject setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

    }

    public static class ListSessionPackagesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("AvailableHours")
        public Long availableHours;

        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeleteStatus")
        public Integer deleteStatus;

        /**
         * <strong>example:</strong>
         * <p>1701170196000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1701170203000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("InstanceObject")
        public ListSessionPackagesResponseBodyDataInstanceObject instanceObject;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxHours")
        public Long maxHours;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxSessions")
        public Long maxSessions;

        /**
         * <strong>example:</strong>
         * <p>p-xxxxxxxxxxxx</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>tp-xxxxxxxxx</p>
         */
        @NameInMap("SessionPackageId")
        public String sessionPackageId;

        @NameInMap("SessionPackageName")
        public String sessionPackageName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SessionPackageTypeId")
        public String sessionPackageTypeId;

        /**
         * <strong>example:</strong>
         * <p>appstreaming.general.entry</p>
         */
        @NameInMap("SessionSpec")
        public String sessionSpec;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("SessionUsageRate")
        public Long sessionUsageRate;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("State")
        public Integer state;

        /**
         * <strong>example:</strong>
         * <p>156xxxxxxxxxx</p>
         */
        @NameInMap("UserIdentification")
        public Long userIdentification;

        public static ListSessionPackagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSessionPackagesResponseBodyData self = new ListSessionPackagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSessionPackagesResponseBodyData setAvailableHours(Long availableHours) {
            this.availableHours = availableHours;
            return this;
        }
        public Long getAvailableHours() {
            return this.availableHours;
        }

        public ListSessionPackagesResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListSessionPackagesResponseBodyData setDeleteStatus(Integer deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Integer getDeleteStatus() {
            return this.deleteStatus;
        }

        public ListSessionPackagesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSessionPackagesResponseBodyData setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListSessionPackagesResponseBodyData setInstanceObject(ListSessionPackagesResponseBodyDataInstanceObject instanceObject) {
            this.instanceObject = instanceObject;
            return this;
        }
        public ListSessionPackagesResponseBodyDataInstanceObject getInstanceObject() {
            return this.instanceObject;
        }

        public ListSessionPackagesResponseBodyData setMaxHours(Long maxHours) {
            this.maxHours = maxHours;
            return this;
        }
        public Long getMaxHours() {
            return this.maxHours;
        }

        public ListSessionPackagesResponseBodyData setMaxSessions(Long maxSessions) {
            this.maxSessions = maxSessions;
            return this;
        }
        public Long getMaxSessions() {
            return this.maxSessions;
        }

        public ListSessionPackagesResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListSessionPackagesResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListSessionPackagesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListSessionPackagesResponseBodyData setSessionPackageId(String sessionPackageId) {
            this.sessionPackageId = sessionPackageId;
            return this;
        }
        public String getSessionPackageId() {
            return this.sessionPackageId;
        }

        public ListSessionPackagesResponseBodyData setSessionPackageName(String sessionPackageName) {
            this.sessionPackageName = sessionPackageName;
            return this;
        }
        public String getSessionPackageName() {
            return this.sessionPackageName;
        }

        public ListSessionPackagesResponseBodyData setSessionPackageTypeId(String sessionPackageTypeId) {
            this.sessionPackageTypeId = sessionPackageTypeId;
            return this;
        }
        public String getSessionPackageTypeId() {
            return this.sessionPackageTypeId;
        }

        public ListSessionPackagesResponseBodyData setSessionSpec(String sessionSpec) {
            this.sessionSpec = sessionSpec;
            return this;
        }
        public String getSessionSpec() {
            return this.sessionSpec;
        }

        public ListSessionPackagesResponseBodyData setSessionUsageRate(Long sessionUsageRate) {
            this.sessionUsageRate = sessionUsageRate;
            return this;
        }
        public Long getSessionUsageRate() {
            return this.sessionUsageRate;
        }

        public ListSessionPackagesResponseBodyData setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListSessionPackagesResponseBodyData setUserIdentification(Long userIdentification) {
            this.userIdentification = userIdentification;
            return this;
        }
        public Long getUserIdentification() {
            return this.userIdentification;
        }

    }

}
