// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204716107.models;

import com.aliyun.tea.*;

public class AddResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static AddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddResponseBody self = new AddResponseBody();
        return TeaModel.build(map, self);
    }

    public AddResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
