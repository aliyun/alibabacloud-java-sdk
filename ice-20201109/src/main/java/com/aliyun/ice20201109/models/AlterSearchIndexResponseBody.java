// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static AlterSearchIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlterSearchIndexResponseBody self = new AlterSearchIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public AlterSearchIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AlterSearchIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AlterSearchIndexResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
