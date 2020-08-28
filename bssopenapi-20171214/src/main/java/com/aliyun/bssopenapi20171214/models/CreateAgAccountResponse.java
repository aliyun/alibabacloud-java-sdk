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

    }

}
