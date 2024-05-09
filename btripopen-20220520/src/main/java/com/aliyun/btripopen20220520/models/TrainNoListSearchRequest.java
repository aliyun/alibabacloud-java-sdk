// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoListSearchRequest extends TeaModel {
    @NameInMap("arr_location")
    public String arrLocation;

    @NameInMap("dep_date")
    public String depDate;

    @NameInMap("dep_location")
    public String depLocation;

    @NameInMap("option")
    public TrainNoListSearchRequestOption option;

    @NameInMap("order_id")
    public String orderId;

    public static TrainNoListSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainNoListSearchRequest self = new TrainNoListSearchRequest();
        return TeaModel.build(map, self);
    }

    public TrainNoListSearchRequest setArrLocation(String arrLocation) {
        this.arrLocation = arrLocation;
        return this;
    }
    public String getArrLocation() {
        return this.arrLocation;
    }

    public TrainNoListSearchRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public TrainNoListSearchRequest setDepLocation(String depLocation) {
        this.depLocation = depLocation;
        return this;
    }
    public String getDepLocation() {
        return this.depLocation;
    }

    public TrainNoListSearchRequest setOption(TrainNoListSearchRequestOption option) {
        this.option = option;
        return this;
    }
    public TrainNoListSearchRequestOption getOption() {
        return this.option;
    }

    public TrainNoListSearchRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public static class TrainNoListSearchRequestOption extends TeaModel {
        @NameInMap("need_transfer")
        public Boolean needTransfer;

        public static TrainNoListSearchRequestOption build(java.util.Map<String, ?> map) throws Exception {
            TrainNoListSearchRequestOption self = new TrainNoListSearchRequestOption();
            return TeaModel.build(map, self);
        }

        public TrainNoListSearchRequestOption setNeedTransfer(Boolean needTransfer) {
            this.needTransfer = needTransfer;
            return this;
        }
        public Boolean getNeedTransfer() {
            return this.needTransfer;
        }

    }

}
