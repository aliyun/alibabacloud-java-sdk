// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsRequest extends TeaModel {
    /**
     * <p>The execution results.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The information about the tag.</p>
     */
    @NameInMap("IncludeHistory")
    public Boolean includeHistory;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the command execution.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The page number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the command.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The ID of the container.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the user who ran the command on the instance.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The error code returned when the command cannot be sent or run. Valid values:</p>
     * <br>
     * <p>*   If this parameter is empty, the command is run normally.</p>
     * <p>*   InstanceNotExists: The specified instance does not exist is released.</p>
     * <p>*   InstanceReleased: The instance was released while the command was being run on the instance.</p>
     * <p>*   InstanceNotRunning: The instance is not in the Running state while the command is being run.</p>
     * <p>*   CommandNotApplicable: The command is not applicable to the specified instance.</p>
     * <p>*   AccountNotExists: The specified account does not exist.</p>
     * <p>*   DirectoryNotExists: The specified directory does not exist.</p>
     * <p>*   BadCronExpression: The cron expression used to specify the execution time is invalid.</p>
     * <p>*   ClientNotRunning: The Cloud Assistant client is not running.</p>
     * <p>*   ClientNotResponse: The Cloud Assistant client is not responding.</p>
     * <p>*   ClientIsUpgrading: The Cloud Assistant client is being upgraded.</p>
     * <p>*   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</p>
     * <p>*   DeliveryTimeout: The request to send the command timed out.</p>
     * <p>*   ExecutionTimeout: The command execution timed out.</p>
     * <p>*   ExecutionException: An exception occurred while the command was being run.</p>
     * <p>*   ExecutionInterrupted: The execution was interrupted.</p>
     * <p>*   ExitCodeNonzero: The command execution is complete, but the exit code is not 0.</p>
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
         * <p>The ID of the instance</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The execution state of the command.</p>
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
