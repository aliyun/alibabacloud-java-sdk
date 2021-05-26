// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateAgentBusinessUnitResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public CreateAgentBusinessUnitResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentBusinessUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentBusinessUnitResponseBody self = new CreateAgentBusinessUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentBusinessUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentBusinessUnitResponseBody setData(CreateAgentBusinessUnitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentBusinessUnitResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentBusinessUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentBusinessUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentBusinessUnitResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("BuName")
        public String buName;

        @NameInMap("AdminAgentId")
        public Long adminAgentId;

        @NameInMap("BuKey")
        public String buKey;

        public static CreateAgentBusinessUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentBusinessUnitResponseBodyData self = new CreateAgentBusinessUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentBusinessUnitResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public CreateAgentBusinessUnitResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public CreateAgentBusinessUnitResponseBodyData setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public CreateAgentBusinessUnitResponseBodyData setAdminAgentId(Long adminAgentId) {
            this.adminAgentId = adminAgentId;
            return this;
        }
        public Long getAdminAgentId() {
            return this.adminAgentId;
        }

        public CreateAgentBusinessUnitResponseBodyData setBuKey(String buKey) {
            this.buKey = buKey;
            return this;
        }
        public String getBuKey() {
            return this.buKey;
        }

    }

}
