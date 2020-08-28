// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentVehicleRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentVehicleRequest self = new SegmentVehicleRequest();
        return TeaModel.build(map, self);
    }

}
