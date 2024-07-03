// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubsIdResponseBody extends TeaModel {
    /**
     * <p>The response code. The value OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7F99446-8191-43C0-99B5-F58A6AEAD779</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The binding ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111****</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    public static QuerySubsIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubsIdResponseBody self = new QuerySubsIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubsIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubsIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySubsIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubsIdResponseBody setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
