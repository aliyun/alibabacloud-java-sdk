// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCUploadPublishResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Submit")
    public String submit;

    public static PCUploadPublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PCUploadPublishResponseBody self = new PCUploadPublishResponseBody();
        return TeaModel.build(map, self);
    }

    public PCUploadPublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PCUploadPublishResponseBody setSubmit(String submit) {
        this.submit = submit;
        return this;
    }
    public String getSubmit() {
        return this.submit;
    }

}
