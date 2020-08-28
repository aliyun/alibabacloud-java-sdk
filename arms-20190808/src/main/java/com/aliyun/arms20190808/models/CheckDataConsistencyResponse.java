// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckDataConsistencyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsDataConsistency")
    @Validation(required = true)
    public Boolean isDataConsistency;

    public static CheckDataConsistencyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataConsistencyResponse self = new CheckDataConsistencyResponse();
        return TeaModel.build(map, self);
    }

}
