// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteEcuResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data that indicates whether the ECU is deleted. A value of <code>OK</code> indicates that the ECU is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>fb08fd29-b197-40ab-<strong><strong>-</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEcuResponseBody self = new DeleteEcuResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteEcuResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteEcuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
