// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallResponseBody extends TeaModel {
    /**
     * <p>Unique receipt ID for this call.</p>
     * 
     * <strong>example:</strong>
     * <p>116012854210^10281427****</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Request status code. A return value of &quot;OK&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AiccsSmartCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AiccsSmartCallResponseBody self = new AiccsSmartCallResponseBody();
        return TeaModel.build(map, self);
    }

    public AiccsSmartCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AiccsSmartCallResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AiccsSmartCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AiccsSmartCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
