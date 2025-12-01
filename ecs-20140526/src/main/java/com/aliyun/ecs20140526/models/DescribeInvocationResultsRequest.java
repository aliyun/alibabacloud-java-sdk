// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsRequest extends TeaModel {
    /**
     * <p>$.parameters[11].schema.example</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz0jdfwcsr****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <DescribeInvocationResultsResponse>
     *     <RequestId>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</RequestId>
     *     <Invocation>
     *         <InvocationResults>
     *             <InvocationResult>
     *                 <Dropped>0</Dropped>
     *                 <InvocationStatus>Success</InvocationStatus>
     *                 <InstanceId>i-bp1i7gg30r52z2em****</InstanceId>
     *                 <ExitCode>0</ExitCode>
     *                 <ErrorInfo>the specified instance does not exists</ErrorInfo>
     *                 <StartTime>2019-12-20T06:15:55Z</StartTime>
     *                 <Repeats>0</Repeats>
     *                 <InvokeRecordStatus>Running</InvokeRecordStatus>
     *                 <FinishedTime>2019-12-20T06:15:56Z</FinishedTime>
     *                 <Output>MTU6MzA6MDEK</Output>
     *                 <CommandId>c-hz0jdfwcsr****</CommandId>
     *                 <ErrorCode>InstanceNotExists</ErrorCode>
     *                 <InvokeId>t-hz0jdfwd9f****</InvokeId>
     *                 <StopTime>2020-01-19T09:15:47Z</StopTime>
     *                 <ContainerId>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</ContainerId>
     *                 <ContainerName>test-container</ContainerName>
     *                 <Tags>
     *                     <TagKey>owner</TagKey>
     *                     <TagValue>zhangsan</TagValue>
     *                 </Tags>
     *             </InvocationResult>
     *         </InvocationResults>
     *         <TotalCount>1</TotalCount>
     *         <PageSize>1</PageSize>
     *         <PageNumber>1</PageNumber>
     *     </Invocation>
     * </DescribeInvocationResultsResponse>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>{
     *   &quot;RequestId&quot; : &quot;473469C7-AA6F-4DC5-B3DB-A3DC0DE*****&quot;,
     *   &quot;Invocation&quot; : {
     *     &quot;InvocationResults&quot; : {
     *       &quot;InvocationResult&quot; : [ {
     *         &quot;Dropped&quot; : 0,
     *         &quot;InvocationStatus&quot; : &quot;Success&quot;,
     *         &quot;InstanceId&quot; : &quot;i-bp1i7gg30r52z2em****&quot;,
     *         &quot;ExitCode&quot; : 0,
     *         &quot;ErrorInfo&quot; : &quot;the specified instance does not exists&quot;,
     *         &quot;StartTime&quot; : &quot;2019-12-20T06:15:55Z&quot;,
     *         &quot;Repeats&quot; : 0,
     *         &quot;InvokeRecordStatus&quot; : &quot;Running&quot;,
     *         &quot;FinishedTime&quot; : &quot;2019-12-20T06:15:56Z&quot;,
     *         &quot;Output&quot; : &quot;MTU6MzA6MDEK&quot;,
     *         &quot;CommandId&quot; : &quot;c-hz0jdfwcsr****&quot;,
     *         &quot;ErrorCode&quot; : &quot;InstanceNotExists&quot;,
     *         &quot;InvokeId&quot; : &quot;t-hz0jdfwd9f****&quot;,
     *         &quot;StopTime&quot; : &quot;2020-01-19T09:15:47Z&quot;,
     *         &quot;ContainerId&quot;:&quot;ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****&quot;,
     *         &quot;ContainerName&quot;:&quot;test-container&quot;,<br>        &quot;Tags&quot;: [
     *                     {
     *                         &quot;TagKey&quot;: &quot;owner&quot;,
     *                         &quot;TagValue&quot;: &quot;zhangsan&quot;
     *                     }
     *                 ]
     *       } ]
     *     },
     *     &quot;TotalCount&quot; : 1,
     *     &quot;PageSize&quot; : 1,
     *     &quot;PageNumber&quot; : 1
     *   }
     * }</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeHistory")
    public Boolean includeHistory;

    /**
     * <p>$.parameters[11].schema.description</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i7gg30r52z2em****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>$.parameters[11].schema.items.enumValueTitles</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>$.parameters[11].schema.enumValueTitles</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    /**
     * <p>FEATUREecsXZ3H4M</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>dubbo</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>acs:ecs:{#regionId}:{#accountId}:command/*</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>acs:ecs:{#regionId}:{#accountId}:instance/*</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>$.parameters[11].schema.items.description</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>$.parameters[11].schema.items.example</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The region ID of the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInvocationResultsRequestTag> tag;

    public static DescribeInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsRequest self = new DescribeInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DescribeInvocationResultsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeInvocationResultsRequest setIncludeHistory(Boolean includeHistory) {
        this.includeHistory = includeHistory;
        return this;
    }
    public Boolean getIncludeHistory() {
        return this.includeHistory;
    }

    public DescribeInvocationResultsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInvocationResultsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationResultsRequest setInvokeRecordStatus(String invokeRecordStatus) {
        this.invokeRecordStatus = invokeRecordStatus;
        return this;
    }
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
    }

    public DescribeInvocationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInvocationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvocationResultsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInvocationResultsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInvocationResultsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInvocationResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInvocationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInvocationResultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInvocationResultsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInvocationResultsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInvocationResultsRequest setTag(java.util.List<DescribeInvocationResultsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInvocationResultsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInvocationResultsRequestTag extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the command task. You can call the <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> operation to query the IDs of all command tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInvocationResultsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsRequestTag self = new DescribeInvocationResultsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInvocationResultsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
