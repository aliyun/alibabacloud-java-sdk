// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangupOperateResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of \&quot;OK\&quot; indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Mesage")
    public String mesage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFD543DD-E087-54A2-AC0B-54E0656511D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the operation. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The hang-up was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The hang-up operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static HangupOperateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HangupOperateResponseBody self = new HangupOperateResponseBody();
        return TeaModel.build(map, self);
    }

    public HangupOperateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HangupOperateResponseBody setMesage(String mesage) {
        this.mesage = mesage;
        return this;
    }
    public String getMesage() {
        return this.mesage;
    }

    public HangupOperateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HangupOperateResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
