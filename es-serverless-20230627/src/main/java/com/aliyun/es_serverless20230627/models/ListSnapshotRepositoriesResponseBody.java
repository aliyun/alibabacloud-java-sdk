// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListSnapshotRepositoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>56E0591D-7D62-56A2-993E-952FB2026C69</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListSnapshotRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotRepositoriesResponseBody self = new ListSnapshotRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotRepositoriesResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
