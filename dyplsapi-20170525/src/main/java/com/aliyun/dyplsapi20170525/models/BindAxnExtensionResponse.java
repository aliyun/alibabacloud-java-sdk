// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionResponse extends TeaModel {
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
    public BindAxnExtensionResponseSecretBindDTO secretBindDTO;

    public static BindAxnExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionResponse self = new BindAxnExtensionResponse();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnExtensionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnExtensionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnExtensionResponse setSecretBindDTO(BindAxnExtensionResponseSecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxnExtensionResponseSecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxnExtensionResponseSecretBindDTO extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public String subsId;

        @NameInMap("SecretNo")
        @Validation(required = true)
        public String secretNo;

        @NameInMap("Extension")
        @Validation(required = true)
        public String extension;

        public static BindAxnExtensionResponseSecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxnExtensionResponseSecretBindDTO self = new BindAxnExtensionResponseSecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxnExtensionResponseSecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public BindAxnExtensionResponseSecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxnExtensionResponseSecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

    }

}
