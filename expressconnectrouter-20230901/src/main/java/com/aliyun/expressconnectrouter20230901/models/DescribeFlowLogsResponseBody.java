// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("FlowLogs")
    public java.util.List<DescribeFlowLogsResponseBodyFlowLogs> flowLogs;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFlowLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsResponseBody self = new DescribeFlowLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeFlowLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFlowLogsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeFlowLogsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeFlowLogsResponseBody setFlowLogs(java.util.List<DescribeFlowLogsResponseBodyFlowLogs> flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }
    public java.util.List<DescribeFlowLogsResponseBodyFlowLogs> getFlowLogs() {
        return this.flowLogs;
    }

    public DescribeFlowLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeFlowLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFlowLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFlowLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFlowLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFlowLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFlowLogsResponseBodyFlowLogsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFlowLogsResponseBodyFlowLogsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogsTags self = new DescribeFlowLogsResponseBodyFlowLogsTags();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFlowLogsResponseBodyFlowLogsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeFlowLogsResponseBodyFlowLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-09-21T04:20Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ecr-h4cop1khw98*****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <strong>example:</strong>
         * <p>flowlog-leypqehtgtia2*****</p>
         */
        @NameInMap("FlowLogId")
        public String flowLogId;

        /**
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("FlowLogName")
        public String flowLogName;

        /**
         * <strong>example:</strong>
         * <p>vbr-9dpty76irpf4u15*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>FlowLogStore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <strong>example:</strong>
         * <p>FlowLogProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzb3xwrexc4ry</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>1:4096</p>
         */
        @NameInMap("SamplingRate")
        public String samplingRate;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SlsRegionId")
        public String slsRegionId;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsTags> tags;

        public static DescribeFlowLogsResponseBodyFlowLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsResponseBodyFlowLogs self = new DescribeFlowLogsResponseBodyFlowLogs();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsResponseBodyFlowLogs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setFlowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public String getFlowLogId() {
            return this.flowLogId;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setFlowLogName(String flowLogName) {
            this.flowLogName = flowLogName;
            return this;
        }
        public String getFlowLogName() {
            return this.flowLogName;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setSamplingRate(String samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public String getSamplingRate() {
            return this.samplingRate;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFlowLogsResponseBodyFlowLogs setTags(java.util.List<DescribeFlowLogsResponseBodyFlowLogsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeFlowLogsResponseBodyFlowLogsTags> getTags() {
            return this.tags;
        }

    }

}
