// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
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
     * <p>The description of the instance.</p>
     * <p>The value can contain letters, digits, and some special characters, such as<code>, . + - * / _</code> The value can be up to 500 characters in length.</p>
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
