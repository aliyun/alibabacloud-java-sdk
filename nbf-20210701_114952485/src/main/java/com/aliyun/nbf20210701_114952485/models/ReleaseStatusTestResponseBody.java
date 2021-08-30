// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class ReleaseStatusTestResponseBody extends TeaModel {
    @NameInMap("sum")
    public Integer sum;

    public static ReleaseStatusTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseStatusTestResponseBody self = new ReleaseStatusTestResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseStatusTestResponseBody setSum(Integer sum) {
        this.sum = sum;
        return this;
    }
    public Integer getSum() {
        return this.sum;
    }

}
