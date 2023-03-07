// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountResponseBody extends TeaModel {
    /**
     * <p>The relationship between the account that is used to call the CreateAgAccount operation and the account that is created.</p>
     */
    @NameInMap("AgRelationDto")
    public CreateAgAccountResponseBodyAgRelationDto agRelationDto;

    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountResponseBody self = new CreateAgAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgAccountResponseBody setAgRelationDto(CreateAgAccountResponseBodyAgRelationDto agRelationDto) {
        this.agRelationDto = agRelationDto;
        return this;
    }
    public CreateAgAccountResponseBodyAgRelationDto getAgRelationDto() {
        return this.agRelationDto;
    }

    public CreateAgAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgAccountResponseBodyAgRelationDto extends TeaModel {
        /**
         * <p>The ID of the account that is used to call the CreateAgAccount operation.</p>
         */
        @NameInMap("Mpk")
        public String mpk;

        /**
         * <p>The ID of the account that is created.</p>
         */
        @NameInMap("Pk")
        public String pk;

        /**
         * <p>The role of the account that is created.</p>
         */
        @NameInMap("RamAdminRoleName")
        public String ramAdminRoleName;

        /**
         * <p>The type of the relationship.</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateAgAccountResponseBodyAgRelationDto build(java.util.Map<String, ?> map) throws Exception {
            CreateAgAccountResponseBodyAgRelationDto self = new CreateAgAccountResponseBodyAgRelationDto();
            return TeaModel.build(map, self);
        }

        public CreateAgAccountResponseBodyAgRelationDto setMpk(String mpk) {
            this.mpk = mpk;
            return this;
        }
        public String getMpk() {
            return this.mpk;
        }

        public CreateAgAccountResponseBodyAgRelationDto setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public CreateAgAccountResponseBodyAgRelationDto setRamAdminRoleName(String ramAdminRoleName) {
            this.ramAdminRoleName = ramAdminRoleName;
            return this;
        }
        public String getRamAdminRoleName() {
            return this.ramAdminRoleName;
        }

        public CreateAgAccountResponseBodyAgRelationDto setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
