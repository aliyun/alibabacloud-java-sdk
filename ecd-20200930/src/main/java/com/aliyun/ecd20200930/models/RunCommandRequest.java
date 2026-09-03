// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The plaintext or Base64-encoded content of the script. The Base64-encoded script content cannot exceed 16 KB.</p>
     * <blockquote>
     * <p>If the script content is Base64-encoded, set the ContentEncoding parameter to Base64.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipconfig</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The role used when the command is executed on the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("CommandRole")
    public String commandRole;

    /**
     * <p>The encoding method of the script content.</p>
     * <blockquote>
     * <p>If the specified value is not within the valid values, the value is treated as PlainText.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The IDs of cloud computers. Valid values of N: 1 to 50. If you specify multiple cloud computers, the API call succeeds as long as the script is successfully executed on at least one cloud computer. If the script fails to be executed on all specified cloud computers, reset this parameter.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the end user. If this parameter is specified, the command is executed with the permissions of the end user.</p>
     * <blockquote>
     * <p>The user must have a session record on the cloud computer (the user has logged on and connected to the cloud computer after it is started, and the connection was not preempted by another user). This parameter is not supported for Linux cloud computers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period for executing the script. Unit: seconds. Default value: 300. A timeout may occur when the script cannot run due to process issues, missing modules, or missing Cloud Assistant Agent. After a timeout, the script process is forcefully terminated.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The language type of the O&amp;M script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunPowerShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    public static RunCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandRequest self = new RunCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandRequest setCommandRole(String commandRole) {
        this.commandRole = commandRole;
        return this;
    }
    public String getCommandRole() {
        return this.commandRole;
    }

    public RunCommandRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RunCommandRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RunCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public RunCommandRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
