// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResultResponseBody extends TeaModel {
    /**
     * <p>The details for obtaining the retries of the migration task.</p>
     */
    @NameInMap("ImportJobResult")
    public GetJobResultResp importJobResult;

    public static GetJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultResponseBody self = new GetJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResultResponseBody setImportJobResult(GetJobResultResp importJobResult) {
        this.importJobResult = importJobResult;
        return this;
    }
    public GetJobResultResp getImportJobResult() {
        return this.importJobResult;
    }

}
