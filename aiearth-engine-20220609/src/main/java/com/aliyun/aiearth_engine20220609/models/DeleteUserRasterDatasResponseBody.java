// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DeleteUserRasterDatasResponseBody extends TeaModel {
    @NameInMap("Num")
    public Integer num;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserRasterDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserRasterDatasResponseBody self = new DeleteUserRasterDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserRasterDatasResponseBody setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public DeleteUserRasterDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
