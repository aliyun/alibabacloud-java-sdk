// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppStatusResponseBody extends TeaModel {
    /**
     * <p>The application status information.</p>
     */
    @NameInMap("AppStatus")
    public GetEdgeContainerAppStatusResponseBodyAppStatus appStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppStatusResponseBody self = new GetEdgeContainerAppStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppStatusResponseBody setAppStatus(GetEdgeContainerAppStatusResponseBodyAppStatus appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public GetEdgeContainerAppStatusResponseBodyAppStatus getAppStatus() {
        return this.appStatus;
    }

    public GetEdgeContainerAppStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppStatusResponseBodyAppStatusRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<String> region;

        public static GetEdgeContainerAppStatusResponseBodyAppStatusRegions build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppStatusResponseBodyAppStatusRegions self = new GetEdgeContainerAppStatusResponseBodyAppStatusRegions();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatusRegions setRegion(java.util.List<String> region) {
            this.region = region;
            return this;
        }
        public java.util.List<String> getRegion() {
            return this.region;
        }

    }

    public static class GetEdgeContainerAppStatusResponseBodyAppStatus extends TeaModel {
        /**
         * <p>The baseline version of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-123123123123****</p>
         */
        @NameInMap("BaseLineVersion")
        public String baseLineVersion;

        /**
         * <p>The deployment status of the application. Valid values:</p>
         * <ul>
         * <li><strong>undeploy</strong>: not deployed.</li>
         * <li><strong>deploying</strong>: being deployed.</li>
         * <li><strong>deployed</strong>: deployed.</li>
         * <li><strong>undeploying</strong>: being undeployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>undeploy</p>
         */
        @NameInMap("DeployStatus")
        public String deployStatus;

        /**
         * <p>The deployment time of the application. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-25T05:58:05Z</p>
         */
        @NameInMap("DeployTime")
        public String deployTime;

        /**
         * <p>The deployed version of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-123123123123****</p>
         */
        @NameInMap("DeployedVersion")
        public String deployedVersion;

        /**
         * <p>The expected publishing percentage of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>50%</p>
         */
        @NameInMap("ExpectPercentage")
        public Integer expectPercentage;

        /**
         * <p>Indicates whether a full release is performed. This field takes effect only when PublishType is set to region.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullRelease")
        public Boolean fullRelease;

        /**
         * <p>The publishing environment. Valid values:</p>
         * <ul>
         * <li><strong>prod</strong>: production environment.</li>
         * <li><strong>staging</strong>: staging environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("PublishEnv")
        public String publishEnv;

        /**
         * <p>The publishing percentage of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>50%</p>
         */
        @NameInMap("PublishPercentage")
        public Integer publishPercentage;

        /**
         * <p>The publishing status of the application. Valid values:</p>
         * <ul>
         * <li><strong>publishing</strong>: being published.</li>
         * <li><strong>published</strong>: published.</li>
         * <li><strong>rollbacking</strong>: being rolled back.</li>
         * <li><strong>rollbacked</strong>: rolled back.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pubishing</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        /**
         * <p>The publishing time of the application. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-25T05:58:05Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The publishing type. Valid values:</p>
         * <ul>
         * <li><p><strong>percentage</strong>: publish by percentage.</p>
         * </li>
         * <li><p><strong>region</strong>: publish by region.</p>
         * </li>
         * </ul>
         * <p>If this parameter is not specified, the default value percentage is used.</p>
         * 
         * <strong>example:</strong>
         * <p>percentage</p>
         */
        @NameInMap("PublishType")
        public String publishType;

        /**
         * <p>The publishing version of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-123123123123****</p>
         */
        @NameInMap("PublishingVersion")
        public String publishingVersion;

        @NameInMap("Regions")
        public GetEdgeContainerAppStatusResponseBodyAppStatusRegions regions;

        /**
         * <p>The most recent rollback time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-25T05:58:05Z</p>
         */
        @NameInMap("RollbackTime")
        public String rollbackTime;

        /**
         * <p>The undeployment time of the application. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-25T05:58:05Z</p>
         */
        @NameInMap("UnDeployTime")
        public String unDeployTime;

        public static GetEdgeContainerAppStatusResponseBodyAppStatus build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppStatusResponseBodyAppStatus self = new GetEdgeContainerAppStatusResponseBodyAppStatus();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setBaseLineVersion(String baseLineVersion) {
            this.baseLineVersion = baseLineVersion;
            return this;
        }
        public String getBaseLineVersion() {
            return this.baseLineVersion;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setDeployedVersion(String deployedVersion) {
            this.deployedVersion = deployedVersion;
            return this;
        }
        public String getDeployedVersion() {
            return this.deployedVersion;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setExpectPercentage(Integer expectPercentage) {
            this.expectPercentage = expectPercentage;
            return this;
        }
        public Integer getExpectPercentage() {
            return this.expectPercentage;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setFullRelease(Boolean fullRelease) {
            this.fullRelease = fullRelease;
            return this;
        }
        public Boolean getFullRelease() {
            return this.fullRelease;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setPublishEnv(String publishEnv) {
            this.publishEnv = publishEnv;
            return this;
        }
        public String getPublishEnv() {
            return this.publishEnv;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setPublishPercentage(Integer publishPercentage) {
            this.publishPercentage = publishPercentage;
            return this;
        }
        public Integer getPublishPercentage() {
            return this.publishPercentage;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setPublishingVersion(String publishingVersion) {
            this.publishingVersion = publishingVersion;
            return this;
        }
        public String getPublishingVersion() {
            return this.publishingVersion;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setRegions(GetEdgeContainerAppStatusResponseBodyAppStatusRegions regions) {
            this.regions = regions;
            return this;
        }
        public GetEdgeContainerAppStatusResponseBodyAppStatusRegions getRegions() {
            return this.regions;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setRollbackTime(String rollbackTime) {
            this.rollbackTime = rollbackTime;
            return this;
        }
        public String getRollbackTime() {
            return this.rollbackTime;
        }

        public GetEdgeContainerAppStatusResponseBodyAppStatus setUnDeployTime(String unDeployTime) {
            this.unDeployTime = unDeployTime;
            return this;
        }
        public String getUnDeployTime() {
            return this.unDeployTime;
        }

    }

}
