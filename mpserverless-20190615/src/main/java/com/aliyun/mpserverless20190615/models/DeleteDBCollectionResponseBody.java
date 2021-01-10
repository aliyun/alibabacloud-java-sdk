// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDBCollectionResponseBody extends TeaModel {
    @NameInMap("AffectedDocs")
    public Integer affectedDocs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DeleteDBCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBCollectionResponseBody self = new DeleteDBCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBCollectionResponseBody setAffectedDocs(Integer affectedDocs) {
        this.affectedDocs = affectedDocs;
        return this;
    }
    public Integer getAffectedDocs() {
        return this.affectedDocs;
    }

    public DeleteDBCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDBCollectionResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
