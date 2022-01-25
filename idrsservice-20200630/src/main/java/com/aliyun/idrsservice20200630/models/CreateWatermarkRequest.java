// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateWatermarkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    public static CreateWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWatermarkRequest self = new CreateWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWatermarkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
