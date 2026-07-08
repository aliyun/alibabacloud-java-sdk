// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPackageTypeInfoResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><p>OK indicates that the request is successful.</p>
     * </li>
     * <li><p>For other error codes, see the <a href="https://help.aliyun.com/document_detail/109196.html">error code list</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Example</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;efactorVerification&quot;:&quot;平台风控-二要素核验查询套餐包&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Example</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPackageTypeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPackageTypeInfoResponseBody self = new QueryPackageTypeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPackageTypeInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPackageTypeInfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public QueryPackageTypeInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPackageTypeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPackageTypeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
