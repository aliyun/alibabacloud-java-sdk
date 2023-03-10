// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeConfirmRequest extends TeaModel {
    @NameInMap("change_order_num")
    public Long changeOrderNum;

    public static ChangeConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeConfirmRequest self = new ChangeConfirmRequest();
        return TeaModel.build(map, self);
    }

    public ChangeConfirmRequest setChangeOrderNum(Long changeOrderNum) {
        this.changeOrderNum = changeOrderNum;
        return this;
    }
    public Long getChangeOrderNum() {
        return this.changeOrderNum;
    }

}
