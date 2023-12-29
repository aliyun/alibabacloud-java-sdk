// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyCreateVerifySchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GateVerifySchemeData")
    public JyCreateVerifySchemeResponseBodyGateVerifySchemeData gateVerifySchemeData;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static JyCreateVerifySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JyCreateVerifySchemeResponseBody self = new JyCreateVerifySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public JyCreateVerifySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public JyCreateVerifySchemeResponseBody setGateVerifySchemeData(JyCreateVerifySchemeResponseBodyGateVerifySchemeData gateVerifySchemeData) {
        this.gateVerifySchemeData = gateVerifySchemeData;
        return this;
    }
    public JyCreateVerifySchemeResponseBodyGateVerifySchemeData getGateVerifySchemeData() {
        return this.gateVerifySchemeData;
    }

    public JyCreateVerifySchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JyCreateVerifySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class JyCreateVerifySchemeResponseBodyGateVerifySchemeData extends TeaModel {
        @NameInMap("SchemeCode")
        public String schemeCode;

        public static JyCreateVerifySchemeResponseBodyGateVerifySchemeData build(java.util.Map<String, ?> map) throws Exception {
            JyCreateVerifySchemeResponseBodyGateVerifySchemeData self = new JyCreateVerifySchemeResponseBodyGateVerifySchemeData();
            return TeaModel.build(map, self);
        }

        public JyCreateVerifySchemeResponseBodyGateVerifySchemeData setSchemeCode(String schemeCode) {
            this.schemeCode = schemeCode;
            return this;
        }
        public String getSchemeCode() {
            return this.schemeCode;
        }

    }

}
