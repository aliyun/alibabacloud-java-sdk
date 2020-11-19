// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDataImportDbTopologysResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static DescribeEvaluateDataImportDbTopologysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDataImportDbTopologysResponse self = new DescribeEvaluateDataImportDbTopologysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDataImportDbTopologysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateDataImportDbTopologysResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEvaluateDataImportDbTopologysResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
