// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlockStatusRequest extends TeaModel {
    /**
     * <p>The blocking period. Valid values: **15** to **43200**. Unit: minutes.</p>
     * <br>
     * <p>> If you set **Status** to **do**, you must also specify this parameter.</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the Anti-DDoS Pro instance to manage.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>An array consisting of the Internet service provider (ISP) lines from which traffic is blocked.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Lines")
    public java.util.List<String> lines;

    /**
     * <p>Specifies the status of the Diversion from Origin Server policy. Valid values:</p>
     * <br>
     * <p>*   **do**: enables the policy.</p>
     * <p>*   **undo**: disables the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyBlockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBlockStatusRequest self = new ModifyBlockStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBlockStatusRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyBlockStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBlockStatusRequest setLines(java.util.List<String> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<String> getLines() {
        return this.lines;
    }

    public ModifyBlockStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
