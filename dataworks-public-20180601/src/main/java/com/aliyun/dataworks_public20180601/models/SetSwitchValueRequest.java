// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SetSwitchValueRequest extends TeaModel {
    @NameInMap("SwitchName")
    public String switchName;

    @NameInMap("SwitchValue")
    public String switchValue;

    public static SetSwitchValueRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSwitchValueRequest self = new SetSwitchValueRequest();
        return TeaModel.build(map, self);
    }

    public SetSwitchValueRequest setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }
    public String getSwitchName() {
        return this.switchName;
    }

    public SetSwitchValueRequest setSwitchValue(String switchValue) {
        this.switchValue = switchValue;
        return this;
    }
    public String getSwitchValue() {
        return this.switchValue;
    }

}
