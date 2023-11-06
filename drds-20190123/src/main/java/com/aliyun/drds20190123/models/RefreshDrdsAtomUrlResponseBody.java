// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RefreshDrdsAtomUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the connection after refresh was successful.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RefreshDrdsAtomUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDrdsAtomUrlResponseBody self = new RefreshDrdsAtomUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDrdsAtomUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshDrdsAtomUrlResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public RefreshDrdsAtomUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
