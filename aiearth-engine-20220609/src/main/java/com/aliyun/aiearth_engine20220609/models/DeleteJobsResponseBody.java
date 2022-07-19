// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteJobsResponseBody extends TeaModel {
    @NameInMap("Num")
    public Integer num;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsResponseBody self = new DeleteJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobsResponseBody setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public DeleteJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
