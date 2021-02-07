// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SecretBindDTO")
    @Validation(required = true)
    public BindAxnResponseSecretBindDTO secretBindDTO;

    public static BindAxnResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxnResponse self = new BindAxnResponse();
        return TeaModel.build(map, self);
    }

    public BindAxnResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnResponse setSecretBindDTO(BindAxnResponseSecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxnResponseSecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxnResponseSecretBindDTO extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public String subsId;

        @NameInMap("SecretNo")
        @Validation(required = true)
        public String secretNo;

        @NameInMap("Extension")
        @Validation(required = true)
        public String extension;

        public static BindAxnResponseSecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxnResponseSecretBindDTO self = new BindAxnResponseSecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxnResponseSecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public BindAxnResponseSecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxnResponseSecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

    }

}
