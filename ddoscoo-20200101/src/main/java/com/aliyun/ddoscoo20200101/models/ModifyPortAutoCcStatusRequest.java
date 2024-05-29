// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortAutoCcStatusRequest extends TeaModel {
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
     * <p>The mode of the Intelligent Protection policy. Valid values:</p>
     * <br>
     * <p>*   **normal**</p>
     * <p>*   **loose**</p>
     * <p>*   **strict**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Specifies the status of the Intelligent Protection policy. Valid values:</p>
     * <br>
     * <p>*   **on**: enables the policy.</p>
     * <p>*   **off**: disables the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
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
