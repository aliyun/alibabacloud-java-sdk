// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentVehicleAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentVehicleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentVehicleAdvanceRequest self = new SegmentVehicleAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
