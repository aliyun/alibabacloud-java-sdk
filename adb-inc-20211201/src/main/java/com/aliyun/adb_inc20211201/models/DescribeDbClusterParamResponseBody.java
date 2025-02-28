// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterParamResponseBody extends TeaModel {
    @NameInMap("ParamJson")
    public String paramJson;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeDbClusterParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterParamResponseBody self = new DescribeDbClusterParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterParamResponseBody setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }
    public String getParamJson() {
        return this.paramJson;
    }

    public DescribeDbClusterParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbClusterParamResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDbClusterParamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDbClusterParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeDbClusterParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
