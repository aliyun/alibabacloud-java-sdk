// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetPublishPublishResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Submit")
    public String submit;

    public static DatasetPublishPublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetPublishPublishResponseBody self = new DatasetPublishPublishResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetPublishPublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetPublishPublishResponseBody setSubmit(String submit) {
        this.submit = submit;
        return this;
    }
    public String getSubmit() {
        return this.submit;
    }

}
