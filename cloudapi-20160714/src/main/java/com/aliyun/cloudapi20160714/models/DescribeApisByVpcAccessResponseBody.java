// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByVpcAccessResponseBody extends TeaModel {
    /**
     * <p>The returned API information. It is an array consisting of ApiInfo data.</p>
     */
    @NameInMap("ApiVpcAccessInfos")
    public DescribeApisByVpcAccessResponseBodyApiVpcAccessInfos apiVpcAccessInfos;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E707B25-5119-5ACF-9D26-7D2A2762F05C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09839002de484e76b5a213b040a6a3ca</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>iwc</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The description, which can be up to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>41c33748cbfb41f6b00870156203b72a</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the API group to which the API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>RT_PLU_IP_CTRL_group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The instance ID or IP address in the VPC access authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>Ib-04e41XXXXXd95e9c1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The HTTP request method of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/friends/rc/status</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>57e17906a69b4424914fb1e05f67c78a</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The environment to which the API is published. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the staging environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>vpc id</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze7bj64wstznvftrskbk</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC access authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>aliYun_service_prod</p>
         */
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
