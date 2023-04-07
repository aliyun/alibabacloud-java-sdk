// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>The type of the command. Valid values:</p>
     * <br>
     * <p>*   RunBatScript</p>
     * <p>*   RunPowerShellScript</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The encoding method of the command content and outputs. Valid values:</p>
     * <br>
     * <p>*   PlainText</p>
     * <p>*   Base64</p>
     * <br>
     * <p>Default value: Base64.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The ID of the cloud desktop. If you specify a cloud desktop, all execution records of Cloud Assistant commands on the cloud desktop are queried.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The IDs of the cloud desktops. The DesktopId parameter will be discontinued. We recommend that you use the DesktopIds parameter to specify the IDs of cloud desktops.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The ID of the end user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>Specifies whether to return command outputs in the response. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The ID of the execution.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The overall execution status of the command. The overall execution status is determined by the execution status of the command on one or more cloud desktops. Valid values:</p>
     * <br>
     * <p>*   Running: The execution is in progress on one or more cloud desktops.</p>
     * <p>*   Finished: The execution is complete on all cloud desktops, or the execution is manually stopped on specific cloud desktops and the execution is complete on other cloud desktops.</p>
     * <p>*   Failed: The execution failed on all cloud desktops.</p>
     * <p>*   PartialFailed: The execution failed on specific cloud desktops.</p>
     * <p>*   Stopped: The execution is stopped.</p>
     * <br>
     * <p>Default value: Running.</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Set the value to the NextToken value that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     */
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
