// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCarsResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cars")
    public java.util.List<Car> cars;

    /**
     * <strong>example:</strong>
     * <p>A8745209-DD0E-027E-8ABA-085E0C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageCarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCarsResponseBody self = new DetectImageCarsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageCarsResponseBody setCars(java.util.List<Car> cars) {
        this.cars = cars;
        return this;
    }
    public java.util.List<Car> getCars() {
        return this.cars;
    }

    public DetectImageCarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
