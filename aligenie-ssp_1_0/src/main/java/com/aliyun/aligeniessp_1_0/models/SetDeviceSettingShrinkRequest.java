// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SetDeviceSettingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nightMode</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:true}</p>
     */
    @NameInMap("Value")
    public Object value;

    public static SetDeviceSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceSettingShrinkRequest self = new SetDeviceSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceSettingShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public SetDeviceSettingShrinkRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SetDeviceSettingShrinkRequest setValue(Object value) {
        this.value = value;
        return this;
    }
    public Object getValue() {
        return this.value;
    }

}
