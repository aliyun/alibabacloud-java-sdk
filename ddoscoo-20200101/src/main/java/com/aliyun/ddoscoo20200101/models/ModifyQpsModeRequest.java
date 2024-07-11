// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyQpsModeRequest extends TeaModel {
    /**
     * <p>The region ID of the Anti-DDoS Pro instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-7e225i41****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of QPS. Valid values:</p>
     * <ul>
     * <li><strong>month</strong>: monthly 95th percentile QPS.</li>
     * <li><strong>day</strong>: daily 95th percentile QPS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static ModifyQpsModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQpsModeRequest self = new ModifyQpsModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQpsModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyQpsModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
