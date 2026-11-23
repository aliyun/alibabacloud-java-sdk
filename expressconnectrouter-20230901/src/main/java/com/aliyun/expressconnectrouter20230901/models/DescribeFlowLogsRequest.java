// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: send a check request and do not modify service resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): send a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-a5xqrgbeidz1w8****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The instance ID of the flow log instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-flog-jqnr0veifo5d****</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The name of the flow log. The name must be 0 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>same-flowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The instance ID of the VBR instance loaded on the Express Connect Router (ECR).</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-j6cwxhgg0s5nuephp****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The Simple Log Service Logstore used to capture traffic.</p>
     * <ul>
     * <li><p>If you have created a Logstore in the current region, you can enter the name of the existing Logstore.</p>
     * </li>
     * <li><p>If you have not created a Logstore in the current region, you can specify a custom name for the Logstore, and the system automatically creates the Logstore. The naming rules are as follows:</p>
     * </li>
     * <li><p>The Logstore name must be unique within the same project.</p>
     * </li>
     * <li><p>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>It must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>It must be 3 to 63 characters in length.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 2147483647. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, no next query is available.</li>
     * <li>If NextToken has a return value, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABkWw*******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The Simple Log Service project used to capture traffic.</p>
     * <ul>
     * <li>If you have created a project in the current region, you can enter the name of the existing project.</li>
     * <li>If you have not created a project in the current region, you can specify a custom name for the project, and the system automatically creates the project.</li>
     * </ul>
     * <p>The project name must be globally unique within an Alibaba Cloud region and cannot be modified after creation. The naming rules are as follows:</p>
     * <ul>
     * <li>The project name must be globally unique.</li>
     * <li>It can contain only lowercase</li>
     * <li>letters, digits, and hyphens (-).</li>
     * <li>It must start and end with a lowercase letter or a digit.</li>
     * <li>It must be 3 to 63 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the resource group to which the flow log instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2aq7f4va****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeFlowLogsRequestTag> tag;

    @NameInMap("Version")
    public String version;

    public static DescribeFlowLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsRequest self = new DescribeFlowLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeFlowLogsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeFlowLogsRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeFlowLogsRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public DescribeFlowLogsRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public DescribeFlowLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFlowLogsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeFlowLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFlowLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFlowLogsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeFlowLogsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeFlowLogsRequest setTag(java.util.List<DescribeFlowLogsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFlowLogsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeFlowLogsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeFlowLogsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFlowLogsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsRequestTag self = new DescribeFlowLogsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFlowLogsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
