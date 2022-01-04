// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteMetastoreCrawlerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteMetastoreCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetastoreCrawlerResponseBody self = new DeleteMetastoreCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetastoreCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetastoreCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
