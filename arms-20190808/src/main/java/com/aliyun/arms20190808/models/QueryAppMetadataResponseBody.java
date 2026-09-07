// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppMetadataResponseBody extends TeaModel {
    /**
     * <p>The API call status.</p>
     * <ul>
     * <li><p>2xx: The request was successful.</p>
     * </li>
     * <li><p>3xx: The request was redirected.</p>
     * </li>
     * <li><p>4xx: A client-side error occurred.</p>
     * </li>
     * <li><p>5xx: A server-side error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned object.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;408d5533\&quot;: \&quot;SELECT * FROM user_base_info\&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51877BAC-330C-5845-BDFD-C7859AD33FB7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the query was successful.</p>
     * <ul>
     * <li><p><code>true</code>: The query was successful.</p>
     * </li>
     * <li><p><code>false</code>: The query failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAppMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppMetadataResponseBody self = new QueryAppMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppMetadataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAppMetadataResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public QueryAppMetadataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAppMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppMetadataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
