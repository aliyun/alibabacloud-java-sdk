// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    // The type of the command. Valid values:
    // 
    // *   RunBatScript
    // *   RunPowerShellScript
    @NameInMap("CommandType")
    public String commandType;

    // The encoding method of the command content and output. Valid values:
    // 
    // *   PlainText
    // *   Base64
    // 
    // Default value: Base64.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // The ID of the cloud desktop. If you specify a cloud desktop, all the execution records of Cloud Assistant commands on the cloud desktop are queried.
    @NameInMap("DesktopId")
    public String desktopId;

    // The ID of the cloud desktop. If you specify a cloud desktop, all the execution records of Cloud Assistant commands on the cloud desktop are queried.
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    // The ID of the regular user.
    @NameInMap("EndUserId")
    public String endUserId;

    // Specifies whether to return command outputs in the response. Valid values:
    // 
    // *   true: returns command outputs.
    // *   false: does not return command outputs.
    // 
    // Default value: false.
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    // The ID of the execution.
    @NameInMap("InvokeId")
    public String invokeId;

    // The overall execution status of a command. The overall execution status is determined by the execution status of the command on one or more cloud desktops. Valid values:
    // 
    // *   Running: The execution is in progress on one or more cloud desktops.
    // *   Finished: The execution is finished on all cloud desktops, or the execution is manually stopped on some cloud desktops and the execution is finished on others.
    // *   Failed: The execution failed on all cloud desktops.
    // *   PartialFailed: The execution failed on some cloud desktops.
    // *   Stopped: The execution is stopped.
    // 
    // Default value: Running.
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    // The number of entries to return on each page.
    // 
    // Default value: 100.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The query token. Set the value to the NextToken value that is returned from the last call to the previous DescribeInvocations operation.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsRequest self = new DescribeInvocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsRequest setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public DescribeInvocationsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeInvocationsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeInvocationsRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public DescribeInvocationsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeInvocationsRequest setIncludeOutput(Boolean includeOutput) {
        this.includeOutput = includeOutput;
        return this;
    }
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    public DescribeInvocationsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationsRequest setInvokeStatus(String invokeStatus) {
        this.invokeStatus = invokeStatus;
        return this;
    }
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    public DescribeInvocationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInvocationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvocationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
