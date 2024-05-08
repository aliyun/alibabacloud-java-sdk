// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByVpcAccessResponseBody extends TeaModel {
    @NameInMap("ApiVpcAccessInfos")
    public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos apiVpcAccessInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApisByVpcAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByVpcAccessResponseBody self = new DescribeApisByVpcAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisByVpcAccessResponseBody setApiVpcAccessInfos(DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos apiVpcAccessInfos) {
        this.apiVpcAccessInfos = apiVpcAccessInfos;
        return this;
    }
    public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos getApiVpcAccessInfos() {
        return this.apiVpcAccessInfos;
    }

    public DescribeApisByVpcAccessResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByVpcAccessResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByVpcAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisByVpcAccessResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Method")
        public String method;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>vpc id</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo self = new DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos extends TeaModel {
        @NameInMap("ApiVpcAccessInfo")
        public java.util.List<DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo> apiVpcAccessInfo;

        public static DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos self = new DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos();
            return TeaModel.build(map, self);
        }

        public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos setApiVpcAccessInfo(java.util.List<DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo> apiVpcAccessInfo) {
            this.apiVpcAccessInfo = apiVpcAccessInfo;
            return this;
        }
        public java.util.List<DescribeApisByVpcAccessResponseBodyApiVpcAccessInfosApiVpcAccessInfo> getApiVpcAccessInfo() {
            return this.apiVpcAccessInfo;
        }

    }

}
