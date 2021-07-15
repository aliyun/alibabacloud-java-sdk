// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210715_103740905.models;

import com.aliyun.tea.*;

public class YxTestSingleApiResponseBody extends TeaModel {
    @NameInMap("sum")
    public String sum;

    public static YxTestSingleApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleApiResponseBody self = new YxTestSingleApiResponseBody();
        return TeaModel.build(map, self);
    }

    public YxTestSingleApiResponseBody setSum(String sum) {
        this.sum = sum;
        return this;
    }
    public String getSum() {
        return this.sum;
    }

}
