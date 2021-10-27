// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDataImportDbTopologysResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEvaluateDataImportDbTopologysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDataImportDbTopologysResponseBody self = new DescribeEvaluateDataImportDbTopologysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDataImportDbTopologysResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeEvaluateDataImportDbTopologysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluateDataImportDbTopologysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
