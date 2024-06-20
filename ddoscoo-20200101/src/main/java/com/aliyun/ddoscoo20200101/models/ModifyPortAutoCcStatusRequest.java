// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortAutoCcStatusRequest extends TeaModel {
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
     * <p>The mode of the Intelligent Protection policy. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong></li>
     * <li><strong>loose</strong></li>
     * <li><strong>strict</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Specifies the status of the Intelligent Protection policy. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the policy.</li>
     * <li><strong>off</strong>: disables the policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Switch")
    public String _switch;

    public static ModifyPortAutoCcStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortAutoCcStatusRequest self = new ModifyPortAutoCcStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPortAutoCcStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPortAutoCcStatusRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyPortAutoCcStatusRequest set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

}
