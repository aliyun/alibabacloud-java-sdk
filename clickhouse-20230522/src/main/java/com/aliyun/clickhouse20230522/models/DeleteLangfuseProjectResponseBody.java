// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseProjectResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLangfuseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseProjectResponseBody self = new DeleteLangfuseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
