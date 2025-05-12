// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>The command type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RunPowerShellScript: the PowerShell command.</li>
     * <li>RunBatScript: the Bat command.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunPowerShellScript</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The encoding method of the command content and outputs.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Base64 (default): returns the Base64-encoded command content and command outputs.</li>
     * <li>PlainText: returns the original command content and outputs in plain text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The cloud computer ID. If you specify a cloud computer, all command execution records of the cloud computer are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-7w78ozhjcwa3u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The cloud computer IDs.</p>
     * <blockquote>
     * <p> The <code>DesktopId</code> parameter will be deprecated. We recommend using the DesktopIds parameter to specify cloud computer IDs instead.</p>
     * </blockquote>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>Specifies whether to return the execution results of the remote command on all cloud computers when executed across multiple cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeInvokeDesktops")
    public Boolean includeInvokeDesktops;

    /**
     * <p>Specifies whether to return command outputs in the response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The execution ID of the command. You can obtain the value by calling the <a href="~~RunCommand~~">RunCommand</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The execution status of the command. The value of this parameter is determined by the execution states of the command on all participating cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Finished: The command execution completes on all cloud computers. Alternatively, the command execution is manually stopped on some cloud computers while it completes on the others.</li>
     * <li>Stopped: The command execution stops.</li>
     * <li>Failed: The command execution failed on all cloud computers.</li>
     * <li>Running: Once there is a command execution in progress, the execution status defaults to Running.</li>
     * <li>PartialFailed: If the command execution failed on part of the cloud computers, the execution status is considered partially failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Valid values: 1 to 50.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value that is returned from the last call to the previous DescribeInvocations operation.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public DescribeInvocationsRequest setIncludeInvokeDesktops(Boolean includeInvokeDesktops) {
        this.includeInvokeDesktops = includeInvokeDesktops;
        return this;
    }
    public Boolean getIncludeInvokeDesktops() {
        return this.includeInvokeDesktops;
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
