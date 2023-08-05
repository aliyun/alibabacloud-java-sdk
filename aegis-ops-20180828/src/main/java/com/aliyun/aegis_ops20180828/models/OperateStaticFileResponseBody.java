// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class OperateStaticFileResponseBody extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    public static OperateStaticFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateStaticFileResponseBody self = new OperateStaticFileResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateStaticFileResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
