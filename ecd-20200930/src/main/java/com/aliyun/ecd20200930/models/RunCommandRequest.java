// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The script content in plaintext or Base64-encoded format.<br>
     * The Base64-encoded script content cannot exceed 16 KB.<br></p>
     * <blockquote>
     * <p>If the script content is Base64-encoded, you must set the <code>ContentEncoding</code> parameter to <code>Base64</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipconfig</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    @NameInMap("CommandRole")
    public String commandRole;

    /**
     * <p>The encoding mode of the script content.</p>
     * <blockquote>
     * <p>If you specify a value that is not a valid enumeration member, the system defaults to <code>PlainText</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The IDs of the cloud computers on which to run the script. You can specify up to 50 IDs.<br>
     * The API call is considered successful if the script runs on at least one of the specified cloud computers. The call fails only if the script fails on all of them.<br></p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>If you specify this parameter, the command runs with the permissions of the specified end user.</p>
     * <blockquote>
     * <p>This user must have a session history on the cloud computer. This means the user must have logged in after the cloud computer started and their session was not taken over by another user. This parameter is not supported for Linux cloud computers.</p>
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
     * <p>The script execution timeout, in seconds. Default value: 300.<br>
     * A command times out if the script cannot be run due to issues such as process conflicts, missing modules, or an unavailable Cloud Assistant client. When a command times out, the system forcibly terminates the script process.<br></p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The type of the script.</p>
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
