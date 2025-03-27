// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class GetRamBindResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RamBindDto")
    public GetRamBindResponseBodyRamBindDto ramBindDto;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRamBindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRamBindResponseBody self = new GetRamBindResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRamBindResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRamBindResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRamBindResponseBody setRamBindDto(GetRamBindResponseBodyRamBindDto ramBindDto) {
        this.ramBindDto = ramBindDto;
        return this;
    }
    public GetRamBindResponseBodyRamBindDto getRamBindDto() {
        return this.ramBindDto;
    }

    public GetRamBindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRamBindResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRamBindResponseBodyRamBindDto extends TeaModel {
        @NameInMap("RoleName")
        public String roleName;

        public static GetRamBindResponseBodyRamBindDto build(java.util.Map<String, ?> map) throws Exception {
            GetRamBindResponseBodyRamBindDto self = new GetRamBindResponseBodyRamBindDto();
            return TeaModel.build(map, self);
        }

        public GetRamBindResponseBodyRamBindDto setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
