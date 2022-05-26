// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgRelationResponseBody extends TeaModel {
    @NameInMap("AgRelationDto")
    public GetAgRelationResponseBodyAgRelationDto agRelationDto;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgRelationResponseBody self = new GetAgRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgRelationResponseBody setAgRelationDto(GetAgRelationResponseBodyAgRelationDto agRelationDto) {
        this.agRelationDto = agRelationDto;
        return this;
    }
    public GetAgRelationResponseBodyAgRelationDto getAgRelationDto() {
        return this.agRelationDto;
    }

    public GetAgRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgRelationResponseBodyAgRelationDto extends TeaModel {
        @NameInMap("Mpk")
        public String mpk;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Type")
        public String type;

        public static GetAgRelationResponseBodyAgRelationDto build(java.util.Map<String, ?> map) throws Exception {
            GetAgRelationResponseBodyAgRelationDto self = new GetAgRelationResponseBodyAgRelationDto();
            return TeaModel.build(map, self);
        }

        public GetAgRelationResponseBodyAgRelationDto setMpk(String mpk) {
            this.mpk = mpk;
            return this;
        }
        public String getMpk() {
            return this.mpk;
        }

        public GetAgRelationResponseBodyAgRelationDto setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public GetAgRelationResponseBodyAgRelationDto setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
