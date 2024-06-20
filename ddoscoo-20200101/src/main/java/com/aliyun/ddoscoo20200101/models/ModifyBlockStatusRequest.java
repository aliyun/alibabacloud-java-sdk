// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBlockStatusRequest extends TeaModel {
    /**
     * <p>The blocking period. Valid values: <strong>15</strong> to <strong>43200</strong>. Unit: minutes.</p>
     * <blockquote>
     * <p>If you set <strong>Status</strong> to <strong>do</strong>, you must also specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the Anti-DDoS Pro instance to manage.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>An array consisting of the Internet service provider (ISP) lines from which traffic is blocked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ct</p>
     */
    @NameInMap("Lines")
    public java.util.List<String> lines;

    /**
     * <p>Specifies the status of the Diversion from Origin Server policy. Valid values:</p>
     * <ul>
     * <li><strong>do</strong>: enables the policy.</li>
     * <li><strong>undo</strong>: disables the policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>do</p>
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
