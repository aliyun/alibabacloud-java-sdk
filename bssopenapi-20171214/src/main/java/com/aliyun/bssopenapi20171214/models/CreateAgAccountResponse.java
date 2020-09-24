// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("AgRelationDto")
    @Validation(required = true)
    public CreateAgAccountResponseAgRelationDto agRelationDto;

    public static CreateAgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountResponse self = new CreateAgAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgAccountResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgAccountResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgAccountResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAgAccountResponse setAgRelationDto(CreateAgAccountResponseAgRelationDto agRelationDto) {
        this.agRelationDto = agRelationDto;
        return this;
    }
    public CreateAgAccountResponseAgRelationDto getAgRelationDto() {
        return this.agRelationDto;
    }

    public static class CreateAgAccountResponseAgRelationDto extends TeaModel {
        @NameInMap("Pk")
        @Validation(required = true)
        public String pk;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Mpk")
        @Validation(required = true)
        public String mpk;

        @NameInMap("RamAdminRoleName")
        @Validation(required = true)
        public String ramAdminRoleName;

        public static CreateAgAccountResponseAgRelationDto build(java.util.Map<String, ?> map) throws Exception {
            CreateAgAccountResponseAgRelationDto self = new CreateAgAccountResponseAgRelationDto();
            return TeaModel.build(map, self);
        }

        public CreateAgAccountResponseAgRelationDto setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public CreateAgAccountResponseAgRelationDto setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAgAccountResponseAgRelationDto setMpk(String mpk) {
            this.mpk = mpk;
            return this;
        }
        public String getMpk() {
            return this.mpk;
        }

        public CreateAgAccountResponseAgRelationDto setRamAdminRoleName(String ramAdminRoleName) {
            this.ramAdminRoleName = ramAdminRoleName;
            return this;
        }
        public String getRamAdminRoleName() {
            return this.ramAdminRoleName;
        }

    }

}
