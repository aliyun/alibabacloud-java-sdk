// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretBindDTO")
    public BindAxnExtensionResponseBodySecretBindDTO secretBindDTO;

    public static BindAxnExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionResponseBody self = new BindAxnExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnExtensionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnExtensionResponseBody setSecretBindDTO(BindAxnExtensionResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxnExtensionResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxnExtensionResponseBodySecretBindDTO extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("SecretNo")
        public String secretNo;

        @NameInMap("SubsId")
        public String subsId;

        public static BindAxnExtensionResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxnExtensionResponseBodySecretBindDTO self = new BindAxnExtensionResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxnExtensionResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxnExtensionResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxnExtensionResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
