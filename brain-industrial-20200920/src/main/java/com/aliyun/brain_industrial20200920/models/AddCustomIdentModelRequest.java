// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class AddCustomIdentModelRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("Key")
    @Validation(required = true)
    public String key;

    @NameInMap("Value")
    @Validation(required = true)
    public Float value;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static AddCustomIdentModelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomIdentModelRequest self = new AddCustomIdentModelRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomIdentModelRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public AddCustomIdentModelRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AddCustomIdentModelRequest setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

    public AddCustomIdentModelRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
