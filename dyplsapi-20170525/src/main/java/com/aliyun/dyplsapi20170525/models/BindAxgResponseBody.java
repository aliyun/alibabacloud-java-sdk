// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxgResponseBody extends TeaModel {
    @NameInMap("SecretBindDTO")
    public BindAxgResponseBodySecretBindDTO secretBindDTO;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static BindAxgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxgResponseBody self = new BindAxgResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxgResponseBody setSecretBindDTO(BindAxgResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxgResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public BindAxgResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxgResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class BindAxgResponseBodySecretBindDTO extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("SubsId")
        public String subsId;

        @NameInMap("SecretNo")
        public String secretNo;

        public static BindAxgResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxgResponseBodySecretBindDTO self = new BindAxgResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxgResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxgResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public BindAxgResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

    }

}
