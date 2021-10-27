// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EventRW")
        public String eventRW;

        @NameInMap("HomeRegion")
        public String homeRegion;

        @NameInMap("IsOrganizationTrail")
        public Boolean isOrganizationTrail;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OssBucketLocation")
        public String ossBucketLocation;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssKeyPrefix")
        public String ossKeyPrefix;

        @NameInMap("OssWriteRoleArn")
        public String ossWriteRoleArn;

        @NameInMap("Region")
        public String region;

        @NameInMap("SlsProjectArn")
        public String slsProjectArn;

        @NameInMap("SlsWriteRoleArn")
        public String slsWriteRoleArn;

        @NameInMap("StartLoggingTime")
        public String startLoggingTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StopLoggingTime")
        public String stopLoggingTime;

        @NameInMap("TrailArn")
        public String trailArn;

        @NameInMap("TrailRegion")
        public String trailRegion;

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
