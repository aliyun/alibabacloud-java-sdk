// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsResponseBody extends TeaModel {
    /**
     * <p>The queried information about the request denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
     * <blockquote>
     * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The information about the flow logs.</p>
     */
    @NameInMap("FlowLogs")
    public java.util.List<DescribeFlowLogsResponseBodyFlowLogs> flowLogs;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong></li>
     * <li><strong>False</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the query conditions.</p>
     * 
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
         * <p>The key of tag N of the instance. The tag key cannot be an empty string.</p>
         * <blockquote>
         * <p>It can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <p>It can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can be an empty string.</p>
         * </blockquote>
         * 
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
         * <p>The time when the flow log was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-21T04:20Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ECR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-h4cop1khw98*****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>flowlog-leypqehtgtia2*****</p>
         */
        @NameInMap("FlowLogId")
        public String flowLogId;

        /**
         * <p>The name of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        @NameInMap("FlowLogName")
        public String flowLogName;

        /**
         * <p>The ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-9dpty76irpf4u15*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>VBR</strong>: virtual border router (VBR)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The time window for collecting log data. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><strong>60</strong></li>
         * <li><strong>600</strong></li>
         * </ul>
         * <p>Default value: <strong>600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The Logstore that stores the captured traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogStore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The name of the project that stores the captured traffic data.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogProject</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The region ID of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the ECR belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzb3xwrexc4ry</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The sampling proportion. Valid values:</p>
         * <ul>
         * <li><strong>1:4096</strong></li>
         * <li><strong>1:2048</strong></li>
         * <li><strong>1:1024</strong></li>
         * </ul>
         * <p>Default value: <strong>1:4096</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1:4096</p>
         */
        @NameInMap("SamplingRate")
        public String samplingRate;

        /**
         * <p>The ID of the region where Log Service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SlsRegionId")
        public String slsRegionId;

        /**
         * <p>The status of the flow log. Valid values:</p>
         * <ul>
         * <li><p><strong>Active</strong></p>
         * </li>
         * <li><p><strong>Inactive</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag key.</p>
         */
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
