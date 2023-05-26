// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteCmsExporterResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCmsExporterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCmsExporterResponseBody self = new DeleteCmsExporterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCmsExporterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteCmsExporterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
