// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CheckResourceNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>24B9B06B-16D8-5558-9FE1-C29757EB1689</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static CheckResourceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceNameResponseBody self = new CheckResourceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResourceNameResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
