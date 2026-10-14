// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to manage.</p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new-remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static ModifyInstanceRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRemarkRequest self = new ModifyInstanceRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
