// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    // The plaintext content or the Base64-encoded content of the command.
    // 
    // The Base64-encoded command content cannot exceed 16 KB in size.
    // 
    // >  If the command content is Base64-encoded, you must set ContentEncoding to Base64.
    @NameInMap("CommandContent")
    public String commandContent;

    // The encoding mode of the command content. Valid values:
    // 
    // *   PlainText: The content of the command is not encoded and is transmitted in plaintext.
    // *   Base64: The content of the command is encoded in Base64.
    // 
    // Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // The IDs of cloud desktops. You can specify 1 to 50 cloud desktop IDs.
    // 
    // If multiple cloud desktops are specified and the command succeeds for one or more of these cloud desktops, the operation is considered successful. If multiple cloud desktops are specified and the command fails for all of these cloud desktops, verify the values of the parameter and try again.
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The ID of the end user.
    @NameInMap("EndUserId")
    public String endUserId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The timeout period for the command to run. Unit: seconds. Default value: 60.
    // 
    // A timeout error occurs when the command cannot be executed because the process slows down or because a specific module or the Cloud Assistant client does not exist. When a timeout error occurs, the command process is forcibly terminated.
    @NameInMap("Timeout")
    public Long timeout;

    // The language of the O&M command. Valid values:
    // 
    // - RunBatScript
    // - RunPowerShellScript
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
