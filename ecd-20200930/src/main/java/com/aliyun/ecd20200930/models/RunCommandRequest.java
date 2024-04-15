// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The content of the command. The command content can be plaintext or Base64-encoded.\</p>
     * <p>The Base64-encoded command content cannot exceed 16 KB in size.</p>
     * <br>
     * <p>> If the command content is Base64-encoded, you must set the ContentEncoding parameter to Base64.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The encoding mode of the command content. Valid values:</p>
     * <br>
     * <p>*   PlainText: The command content is not encoded.</p>
     * <p>*   Base64: The command content is Base64-encoded.</p>
     * <br>
     * <p>Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The ID of cloud desktop N. Valid values of N: 1 to 50.\</p>
     * <p>If multiple cloud desktops are specified and the command execution succeeds on at least one of the cloud desktops, the operation is considered successful. If multiple cloud desktops are specified and the command execution fails on all the cloud desktops, verify the value of the parameter and try again.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the end user. If you specify a value, you run the command as the end user that is granted specific permissions. Note: The end user has sessions on a cloud computer. That is, when the cloud computer is started, the end user logs on to a WUYING client and connects to the cloud computer, and the cloud computer is not preempted by another end user during the connection. This parameter is not available for Linux cloud computers.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period for the command to run. Unit: seconds. Default value: 60.\</p>
     * <p>A timeout error occurs if the command cannot be run because the process slows down or because a specific module or the Cloud Assistant client does not exist. When a timeout error occurs, the command process is forcibly terminated.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The language of the O\&M command. Valid values:</p>
     * <br>
     * <p>*   RunBatScript</p>
     * <p>*   RunPowerShellScript</p>
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
