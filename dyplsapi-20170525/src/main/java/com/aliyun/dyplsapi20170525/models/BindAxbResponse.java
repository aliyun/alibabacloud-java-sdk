// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbResponse extends TeaModel {
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
    public BindAxbResponseSecretBindDTO secretBindDTO;

    public static BindAxbResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxbResponse self = new BindAxbResponse();
        return TeaModel.build(map, self);
    }

    public BindAxbResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxbResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxbResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxbResponse setSecretBindDTO(BindAxbResponseSecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxbResponseSecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static class BindAxbResponseSecretBindDTO extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public String subsId;

        @NameInMap("SecretNo")
        @Validation(required = true)
        public String secretNo;

        @NameInMap("Extension")
        @Validation(required = true)
        public String extension;

        public static BindAxbResponseSecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxbResponseSecretBindDTO self = new BindAxbResponseSecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxbResponseSecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public BindAxbResponseSecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxbResponseSecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

    }

}
