// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoListSearchShrinkRequest extends TeaModel {
    @NameInMap("arr_location")
    public String arrLocation;

    @NameInMap("dep_date")
    public String depDate;

    @NameInMap("dep_location")
    public String depLocation;

    @NameInMap("option")
    public String optionShrink;

    @NameInMap("order_id")
    public String orderId;

    public static TrainNoListSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainNoListSearchShrinkRequest self = new TrainNoListSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TrainNoListSearchShrinkRequest setArrLocation(String arrLocation) {
        this.arrLocation = arrLocation;
        return this;
    }
    public String getArrLocation() {
        return this.arrLocation;
    }

    public TrainNoListSearchShrinkRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public TrainNoListSearchShrinkRequest setDepLocation(String depLocation) {
        this.depLocation = depLocation;
        return this;
    }
    public String getDepLocation() {
        return this.depLocation;
    }

    public TrainNoListSearchShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public TrainNoListSearchShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
