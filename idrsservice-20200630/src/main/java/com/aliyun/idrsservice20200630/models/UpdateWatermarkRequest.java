// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateWatermarkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    @NameInMap("WatermarkId")
    public String watermarkId;

    public static UpdateWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatermarkRequest self = new UpdateWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWatermarkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
