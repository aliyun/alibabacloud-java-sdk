// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RunDBCommandResponseBody extends TeaModel {
    @NameInMap("AffectedDocs")
    public Integer affectedDocs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static RunDBCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDBCommandResponseBody self = new RunDBCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDBCommandResponseBody setAffectedDocs(Integer affectedDocs) {
        this.affectedDocs = affectedDocs;
        return this;
    }
    public Integer getAffectedDocs() {
        return this.affectedDocs;
    }

    public RunDBCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunDBCommandResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
