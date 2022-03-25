// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadDeleteOneResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DatasetUploadDeleteOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadDeleteOneResponseBody self = new DatasetUploadDeleteOneResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUploadDeleteOneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DatasetUploadDeleteOneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DatasetUploadDeleteOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
