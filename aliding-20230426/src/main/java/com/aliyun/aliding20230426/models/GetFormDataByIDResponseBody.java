// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormDataByIDResponseBody extends TeaModel {
    @NameInMap("formData")
    public java.util.Map<String, ?> formData;

    @NameInMap("formInstId")
    public String formInstId;

    @NameInMap("modifiedTimeGMT")
    public String modifiedTimeGMT;

    @NameInMap("originator")
    public GetFormDataByIDResponseBodyOriginator originator;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetFormDataByIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFormDataByIDResponseBody self = new GetFormDataByIDResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFormDataByIDResponseBody setFormData(java.util.Map<String, ?> formData) {
        this.formData = formData;
        return this;
    }
    public java.util.Map<String, ?> getFormData() {
        return this.formData;
    }

    public GetFormDataByIDResponseBody setFormInstId(String formInstId) {
        this.formInstId = formInstId;
        return this;
    }
    public String getFormInstId() {
        return this.formInstId;
    }

    public GetFormDataByIDResponseBody setModifiedTimeGMT(String modifiedTimeGMT) {
        this.modifiedTimeGMT = modifiedTimeGMT;
        return this;
    }
    public String getModifiedTimeGMT() {
        return this.modifiedTimeGMT;
    }

    public GetFormDataByIDResponseBody setOriginator(GetFormDataByIDResponseBodyOriginator originator) {
        this.originator = originator;
        return this;
    }
    public GetFormDataByIDResponseBodyOriginator getOriginator() {
        return this.originator;
    }

    public GetFormDataByIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFormDataByIDResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetFormDataByIDResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetFormDataByIDResponseBodyOriginatorName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        @NameInMap("Type")
        public String type;

        public static GetFormDataByIDResponseBodyOriginatorName build(java.util.Map<String, ?> map) throws Exception {
            GetFormDataByIDResponseBodyOriginatorName self = new GetFormDataByIDResponseBodyOriginatorName();
            return TeaModel.build(map, self);
        }

        public GetFormDataByIDResponseBodyOriginatorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetFormDataByIDResponseBodyOriginatorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetFormDataByIDResponseBodyOriginatorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetFormDataByIDResponseBodyOriginator extends TeaModel {
        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetFormDataByIDResponseBodyOriginatorName name;

        @NameInMap("UserId")
        public String userId;

        public static GetFormDataByIDResponseBodyOriginator build(java.util.Map<String, ?> map) throws Exception {
            GetFormDataByIDResponseBodyOriginator self = new GetFormDataByIDResponseBodyOriginator();
            return TeaModel.build(map, self);
        }

        public GetFormDataByIDResponseBodyOriginator setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetFormDataByIDResponseBodyOriginator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetFormDataByIDResponseBodyOriginator setName(GetFormDataByIDResponseBodyOriginatorName name) {
            this.name = name;
            return this;
        }
        public GetFormDataByIDResponseBodyOriginatorName getName() {
            return this.name;
        }

        public GetFormDataByIDResponseBodyOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
