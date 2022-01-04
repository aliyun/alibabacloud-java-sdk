// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ModifyMetastoreCrawlerResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyMetastoreCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetastoreCrawlerResponseBody self = new ModifyMetastoreCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMetastoreCrawlerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyMetastoreCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyMetastoreCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
