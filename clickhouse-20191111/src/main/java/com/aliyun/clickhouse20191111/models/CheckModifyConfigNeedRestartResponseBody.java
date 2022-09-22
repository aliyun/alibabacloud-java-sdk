// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    @NameInMap("NeedRestart")
    public Boolean needRestart;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckModifyConfigNeedRestartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyConfigNeedRestartResponseBody self = new CheckModifyConfigNeedRestartResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckModifyConfigNeedRestartResponseBody setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }
    public Boolean getNeedRestart() {
        return this.needRestart;
    }

    public CheckModifyConfigNeedRestartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
