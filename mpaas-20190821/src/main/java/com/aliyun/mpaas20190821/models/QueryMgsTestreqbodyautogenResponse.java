// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMgsTestreqbodyautogenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ResultContent")
    @Validation(required = true)
    public String resultContent;

    public static QueryMgsTestreqbodyautogenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsTestreqbodyautogenResponse self = new QueryMgsTestreqbodyautogenResponse();
        return TeaModel.build(map, self);
    }

}
