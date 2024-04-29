// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabReservationRequest extends TeaModel {
    @NameInMap("LabReservationId")
    public String labReservationId;

    public static DescribeLabReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabReservationRequest self = new DescribeLabReservationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLabReservationRequest setLabReservationId(String labReservationId) {
        this.labReservationId = labReservationId;
        return this;
    }
    public String getLabReservationId() {
        return this.labReservationId;
    }

}
