// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetBillDetailRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("BillId")
    public Long billId;

    @NameInMap("Hid")
    public Long hid;

    public static GetBillDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailRequest self = new GetBillDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetBillDetailRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetBillDetailRequest setBillId(Long billId) {
        this.billId = billId;
        return this;
    }
    public Long getBillId() {
        return this.billId;
    }

    public GetBillDetailRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

}
