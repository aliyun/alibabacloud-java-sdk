// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailRequest extends TeaModel {
    @NameInMap("change_order_num")
    public Long changeOrderNum;

    public static ChangeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailRequest self = new ChangeDetailRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDetailRequest setChangeOrderNum(Long changeOrderNum) {
        this.changeOrderNum = changeOrderNum;
        return this;
    }
    public Long getChangeOrderNum() {
        return this.changeOrderNum;
    }

}
