// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The ID of the task that terminated the sessions.</p>
     * <blockquote>
     * <p> If the sessions of a PolarDB for MySQL cluster were terminated, <strong>NodeId</strong> is left empty, and <strong>KillAllSessions</strong> is set to <strong>true</strong>, the task IDs are returned based on the number of nodes. Example: [&quot;f77d535b45405bd462b21caa3ee8\<em>\</em>\<em>\</em>&quot;, &quot;e93ab549abb081eb5dcd5396a29b\<em>\</em>\<em>\</em>&quot;].</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f77d535b45405bd462b21caa3ee8****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateKillInstanceSessionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKillInstanceSessionTaskResponseBody self = new CreateKillInstanceSessionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKillInstanceSessionTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateKillInstanceSessionTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateKillInstanceSessionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKillInstanceSessionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKillInstanceSessionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
