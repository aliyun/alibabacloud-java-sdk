// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The description of the instance.</p>
     * <br>
     * <p>The value can contain letters, digits, and some special characters, such as`, . + - * / _` The value can be up to 500 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
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
