// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PreviewMetastoreCrawlerResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PreviewMetastoreCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewMetastoreCrawlerResponseBody self = new PreviewMetastoreCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewMetastoreCrawlerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PreviewMetastoreCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewMetastoreCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
