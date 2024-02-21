// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of returned trails.</p>
     */
    @NameInMap("TrailList")
    public java.util.List<DescribeTrailsResponseBodyTrailList> trailList;

    public static DescribeTrailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailsResponseBody self = new DescribeTrailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrailsResponseBody setTrailList(java.util.List<DescribeTrailsResponseBodyTrailList> trailList) {
        this.trailList = trailList;
        return this;
    }
    public java.util.List<DescribeTrailsResponseBodyTrailList> getTrailList() {
        return this.trailList;
    }

    public static class DescribeTrailsResponseBodyTrailList extends TeaModel {
        /**
         * <p>The time when the trail was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The read/write type of the events that are delivered. Valid values:</p>
         * <br>
         * <p>*   Write: write events. This is the default value.</p>
         * <p>*   Read: read events.</p>
         * <p>*   All: read and write events.</p>
         */
        @NameInMap("EventRW")
        public String eventRW;

        /**
         * <p>The home region of the trail.</p>
         */
        @NameInMap("HomeRegion")
        public String homeRegion;

        /**
         * <p>Indicates whether the trail is a multi-account trail. Valid values:</p>
         * <br>
         * <p>*   false (default)</p>
         * <p>*   true</p>
         */
        @NameInMap("IsOrganizationTrail")
        public Boolean isOrganizationTrail;

        @NameInMap("MaxComputeProjectArn")
        public String maxComputeProjectArn;

        @NameInMap("MaxComputeWriteRoleArn")
        public String maxComputeWriteRoleArn;

        /**
         * <p>The name of the trail.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource directory.</p>
         * <br>
         * <p>>  This parameter is returned only when the trail is a multi-account trail.</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The region where the OSS bucket resides.</p>
         */
        @NameInMap("OssBucketLocation")
        public String ossBucketLocation;

        /**
         * <p>The name of the OSS bucket to which events are delivered.</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>The prefix of the files that are stored in the Object Storage Service (OSS) bucket.</p>
         */
        @NameInMap("OssKeyPrefix")
        public String ossKeyPrefix;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
         */
        @NameInMap("OssWriteRoleArn")
        public String ossWriteRoleArn;

        /**
         * <p>The region where the trail resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ARN of the Log Service project to which events are delivered.</p>
         */
        @NameInMap("SlsProjectArn")
        public String slsProjectArn;

        /**
         * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the Log Service project.</p>
         */
        @NameInMap("SlsWriteRoleArn")
        public String slsWriteRoleArn;

        /**
         * <p>The time when the trail was last enabled.</p>
         */
        @NameInMap("StartLoggingTime")
        public String startLoggingTime;

        /**
         * <p>The status of the trail. Valid values:</p>
         * <br>
         * <p>*   Disable: disabled.</p>
         * <p>*   Enable: enabled.</p>
         * <p>*   Fresh: The trail is created but is not enabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the trail was last disabled.</p>
         */
        @NameInMap("StopLoggingTime")
        public String stopLoggingTime;

        /**
         * <p>The ARN of the trail.</p>
         */
        @NameInMap("TrailArn")
        public String trailArn;

        /**
         * <p>The region of the trail.</p>
         */
        @NameInMap("TrailRegion")
        public String trailRegion;

        /**
         * <p>The time when the configurations of the trail were last updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeTrailsResponseBodyTrailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrailsResponseBodyTrailList self = new DescribeTrailsResponseBodyTrailList();
            return TeaModel.build(map, self);
        }

        public DescribeTrailsResponseBodyTrailList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTrailsResponseBodyTrailList setEventRW(String eventRW) {
            this.eventRW = eventRW;
            return this;
        }
        public String getEventRW() {
            return this.eventRW;
        }

        public DescribeTrailsResponseBodyTrailList setHomeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }
        public String getHomeRegion() {
            return this.homeRegion;
        }

        public DescribeTrailsResponseBodyTrailList setIsOrganizationTrail(Boolean isOrganizationTrail) {
            this.isOrganizationTrail = isOrganizationTrail;
            return this;
        }
        public Boolean getIsOrganizationTrail() {
            return this.isOrganizationTrail;
        }

        public DescribeTrailsResponseBodyTrailList setMaxComputeProjectArn(String maxComputeProjectArn) {
            this.maxComputeProjectArn = maxComputeProjectArn;
            return this;
        }
        public String getMaxComputeProjectArn() {
            return this.maxComputeProjectArn;
        }

        public DescribeTrailsResponseBodyTrailList setMaxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
            this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
            return this;
        }
        public String getMaxComputeWriteRoleArn() {
            return this.maxComputeWriteRoleArn;
        }

        public DescribeTrailsResponseBodyTrailList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTrailsResponseBodyTrailList setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeTrailsResponseBodyTrailList setOssBucketLocation(String ossBucketLocation) {
            this.ossBucketLocation = ossBucketLocation;
            return this;
        }
        public String getOssBucketLocation() {
            return this.ossBucketLocation;
        }

        public DescribeTrailsResponseBodyTrailList setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public DescribeTrailsResponseBodyTrailList setOssKeyPrefix(String ossKeyPrefix) {
            this.ossKeyPrefix = ossKeyPrefix;
            return this;
        }
        public String getOssKeyPrefix() {
            return this.ossKeyPrefix;
        }

        public DescribeTrailsResponseBodyTrailList setOssWriteRoleArn(String ossWriteRoleArn) {
            this.ossWriteRoleArn = ossWriteRoleArn;
            return this;
        }
        public String getOssWriteRoleArn() {
            return this.ossWriteRoleArn;
        }

        public DescribeTrailsResponseBodyTrailList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeTrailsResponseBodyTrailList setSlsProjectArn(String slsProjectArn) {
            this.slsProjectArn = slsProjectArn;
            return this;
        }
        public String getSlsProjectArn() {
            return this.slsProjectArn;
        }

        public DescribeTrailsResponseBodyTrailList setSlsWriteRoleArn(String slsWriteRoleArn) {
            this.slsWriteRoleArn = slsWriteRoleArn;
            return this;
        }
        public String getSlsWriteRoleArn() {
            return this.slsWriteRoleArn;
        }

        public DescribeTrailsResponseBodyTrailList setStartLoggingTime(String startLoggingTime) {
            this.startLoggingTime = startLoggingTime;
            return this;
        }
        public String getStartLoggingTime() {
            return this.startLoggingTime;
        }

        public DescribeTrailsResponseBodyTrailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTrailsResponseBodyTrailList setStopLoggingTime(String stopLoggingTime) {
            this.stopLoggingTime = stopLoggingTime;
            return this;
        }
        public String getStopLoggingTime() {
            return this.stopLoggingTime;
        }

        public DescribeTrailsResponseBodyTrailList setTrailArn(String trailArn) {
            this.trailArn = trailArn;
            return this;
        }
        public String getTrailArn() {
            return this.trailArn;
        }

        public DescribeTrailsResponseBodyTrailList setTrailRegion(String trailRegion) {
            this.trailRegion = trailRegion;
            return this;
        }
        public String getTrailRegion() {
            return this.trailRegion;
        }

        public DescribeTrailsResponseBodyTrailList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
