// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSipAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSipAccountResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSipAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSipAccountResponseBody self = new CreateSipAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSipAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSipAccountResponseBody setData(CreateSipAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSipAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateSipAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSipAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSipAccountResponseBodyData extends TeaModel {
        @NameInMap("SipAccountID")
        public String sipAccountID;

        @NameInMap("VoipName")
        public String voipName;

        @NameInMap("VoipPassword")
        public String voipPassword;

        public static CreateSipAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSipAccountResponseBodyData self = new CreateSipAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSipAccountResponseBodyData setSipAccountID(String sipAccountID) {
            this.sipAccountID = sipAccountID;
            return this;
        }
        public String getSipAccountID() {
            return this.sipAccountID;
        }

        public CreateSipAccountResponseBodyData setVoipName(String voipName) {
            this.voipName = voipName;
            return this;
        }
        public String getVoipName() {
            return this.voipName;
        }

        public CreateSipAccountResponseBodyData setVoipPassword(String voipPassword) {
            this.voipPassword = voipPassword;
            return this;
        }
        public String getVoipPassword() {
            return this.voipPassword;
        }

    }

}
