// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserVectorDatasResponseBody extends TeaModel {
    @NameInMap("Num")
    public Integer num;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserVectorDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserVectorDatasResponseBody self = new DeleteUserVectorDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserVectorDatasResponseBody setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public DeleteUserVectorDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
