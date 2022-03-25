// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyCreateOneResponseBody extends TeaModel {
    @NameInMap("ContactPerson")
    public String contactPerson;

    @NameInMap("ExtraInfo")
    public CompanyCreateOneResponseBodyExtraInfo extraInfo;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CompanyCreateOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyCreateOneResponseBody self = new CompanyCreateOneResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyCreateOneResponseBody setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }
    public String getContactPerson() {
        return this.contactPerson;
    }

    public CompanyCreateOneResponseBody setExtraInfo(CompanyCreateOneResponseBodyExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public CompanyCreateOneResponseBodyExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public CompanyCreateOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CompanyCreateOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CompanyCreateOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CompanyCreateOneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CompanyCreateOneResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CompanyCreateOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompanyCreateOneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CompanyCreateOneResponseBodyExtraInfo extends TeaModel {
        @NameInMap("ExtInfoMap")
        public String extInfoMap;

        @NameInMap("IsvTypeEnumList")
        public java.util.List<String> isvTypeEnumList;

        @NameInMap("SupportTypeEnumList")
        public java.util.List<String> supportTypeEnumList;

        public static CompanyCreateOneResponseBodyExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyCreateOneResponseBodyExtraInfo self = new CompanyCreateOneResponseBodyExtraInfo();
            return TeaModel.build(map, self);
        }

        public CompanyCreateOneResponseBodyExtraInfo setExtInfoMap(String extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public String getExtInfoMap() {
            return this.extInfoMap;
        }

        public CompanyCreateOneResponseBodyExtraInfo setIsvTypeEnumList(java.util.List<String> isvTypeEnumList) {
            this.isvTypeEnumList = isvTypeEnumList;
            return this;
        }
        public java.util.List<String> getIsvTypeEnumList() {
            return this.isvTypeEnumList;
        }

        public CompanyCreateOneResponseBodyExtraInfo setSupportTypeEnumList(java.util.List<String> supportTypeEnumList) {
            this.supportTypeEnumList = supportTypeEnumList;
            return this;
        }
        public java.util.List<String> getSupportTypeEnumList() {
            return this.supportTypeEnumList;
        }

    }

}
