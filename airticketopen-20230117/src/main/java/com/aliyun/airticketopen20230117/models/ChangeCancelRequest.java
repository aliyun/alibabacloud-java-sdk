// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeCancelRequest extends TeaModel {
    @NameInMap("change_order_num")
    public Long changeOrderNum;

    public static ChangeCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCancelRequest self = new ChangeCancelRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCancelRequest setChangeOrderNum(Long changeOrderNum) {
        this.changeOrderNum = changeOrderNum;
        return this;
    }
    public Long getChangeOrderNum() {
        return this.changeOrderNum;
    }

}
