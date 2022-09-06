// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PreviewSqlResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlList")
    public java.util.List<String> sqlList;

    @NameInMap("StreamGraph")
    public String streamGraph;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ValidationException")
    public String validationException;

    public static PreviewSqlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewSqlResponseBody self = new PreviewSqlResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewSqlResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public PreviewSqlResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public PreviewSqlResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public PreviewSqlResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public PreviewSqlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PreviewSqlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewSqlResponseBody setSqlList(java.util.List<String> sqlList) {
        this.sqlList = sqlList;
        return this;
    }
    public java.util.List<String> getSqlList() {
        return this.sqlList;
    }

    public PreviewSqlResponseBody setStreamGraph(String streamGraph) {
        this.streamGraph = streamGraph;
        return this;
    }
    public String getStreamGraph() {
        return this.streamGraph;
    }

    public PreviewSqlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PreviewSqlResponseBody setValidationException(String validationException) {
        this.validationException = validationException;
        return this;
    }
    public String getValidationException() {
        return this.validationException;
    }

}
