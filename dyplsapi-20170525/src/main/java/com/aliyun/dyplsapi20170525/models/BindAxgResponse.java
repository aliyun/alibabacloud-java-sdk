// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxgResponse extends TeaModel {
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
    public BindAxgResponseSecretBindDTO secretBindDTO;

    public static BindAxgResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxgResponse self = new BindAxgResponse();
        return TeaModel.build(map, self);
    }

    public BindAxgResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxgResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxgResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxgResponse setSecretBindDTO(BindAxgResponseSecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxgResponseSecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxgResponseSecretBindDTO extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public String subsId;

        @NameInMap("SecretNo")
        @Validation(required = true)
        public String secretNo;

        @NameInMap("Extension")
        @Validation(required = true)
        public String extension;

        public static BindAxgResponseSecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxgResponseSecretBindDTO self = new BindAxgResponseSecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxgResponseSecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public BindAxgResponseSecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxgResponseSecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

    }

}
