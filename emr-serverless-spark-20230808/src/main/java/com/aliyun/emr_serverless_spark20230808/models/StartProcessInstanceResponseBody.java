// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartProcessInstanceResponseBody extends TeaModel {
    /**
     * <p>The code that is returned by the backend server.</p>
     * 
     * <strong>example:</strong>
     * <p>1400009</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sessionBizId\&quot;: \&quot;sc-dc85644dba1c8c63\&quot;, \&quot;bizId\&quot;: \&quot;st-aeed3b0d4f87418a9a9dcbd757477658\&quot;, \&quot;gmtCreated\&quot;: \&quot;Thu Sep 12 02:28:45 UTC 2024\&quot;}</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>Indicates whether the workflow fails to be run manually.</p>
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
     * <p>The description of the returned code.</p>
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

    public static StartProcessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartProcessInstanceResponseBody self = new StartProcessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartProcessInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public StartProcessInstanceResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public StartProcessInstanceResponseBody setFailed(Boolean failed) {
        this.failed = failed;
        return this;
    }
    public Boolean getFailed() {
        return this.failed;
    }

    public StartProcessInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartProcessInstanceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public StartProcessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartProcessInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
