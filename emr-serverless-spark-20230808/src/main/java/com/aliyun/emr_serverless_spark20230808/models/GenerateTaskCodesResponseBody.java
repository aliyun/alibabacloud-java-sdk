// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GenerateTaskCodesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<Long> data;

    /**
     * <p>Indicates whether the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("failed")
    public Boolean failed;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>No permission for resource action</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GenerateTaskCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTaskCodesResponseBody self = new GenerateTaskCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTaskCodesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GenerateTaskCodesResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public GenerateTaskCodesResponseBody setFailed(Boolean failed) {
        this.failed = failed;
        return this;
    }
    public Boolean getFailed() {
        return this.failed;
    }

    public GenerateTaskCodesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateTaskCodesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GenerateTaskCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateTaskCodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
