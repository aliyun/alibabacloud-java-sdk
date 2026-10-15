// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountResponseBody extends TeaModel {
    /**
     * <p>The level 2 relationship between the master account (MPK) and the member account (PK).</p>
     */
    @NameInMap("AgRelationDto")
    public CreateAgAccountResponseBodyAgRelationDto agRelationDto;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>LOGIN_EMAIL_HAS_BEEN_USED</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>loginEmail=<a href="mailto:685741089H@chinaunicom.cn">685741089H@chinaunicom.cn</a>,has used</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EAE08A27-386C-579E-966D-8853EC3C5D0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The UID of the master account (MPK).</p>
         * 
         * <strong>example:</strong>
         * <p>1785287436011964</p>
         */
        @NameInMap("Mpk")
        public String mpk;

        /**
         * <p>The UID of the member account (PK) that is managed by the master account (MPK).</p>
         * 
         * <strong>example:</strong>
         * <p>1728240534507590</p>
         */
        @NameInMap("Pk")
        public String pk;

        /**
         * <p>The name of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>admin-role</p>
         */
        @NameInMap("RamAdminRoleName")
        public String ramAdminRoleName;

        /**
         * <p>The type of the account linking relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>FINACE_CLOUD</p>
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
