// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyUpdateOneResponseBody extends TeaModel {
    @NameInMap("ContactPerson")
    public String contactPerson;

    @NameInMap("ExtraInfo")
    public CompanyUpdateOneResponseBodyExtraInfo extraInfo;

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

    public static CompanyUpdateOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyUpdateOneResponseBody self = new CompanyUpdateOneResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyUpdateOneResponseBody setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }
    public String getContactPerson() {
        return this.contactPerson;
    }

    public CompanyUpdateOneResponseBody setExtraInfo(CompanyUpdateOneResponseBodyExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public CompanyUpdateOneResponseBodyExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public CompanyUpdateOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CompanyUpdateOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CompanyUpdateOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CompanyUpdateOneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CompanyUpdateOneResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CompanyUpdateOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompanyUpdateOneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class CompanyUpdateOneResponseBodyExtraInfo extends TeaModel {
        @NameInMap("ExtInfoMap")
        public String extInfoMap;

        @NameInMap("IsvTypeEnumList")
        public java.util.List<String> isvTypeEnumList;

        @NameInMap("SupportTypeEnumList")
        public java.util.List<String> supportTypeEnumList;

        public static CompanyUpdateOneResponseBodyExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyUpdateOneResponseBodyExtraInfo self = new CompanyUpdateOneResponseBodyExtraInfo();
            return TeaModel.build(map, self);
        }

        public CompanyUpdateOneResponseBodyExtraInfo setExtInfoMap(String extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public String getExtInfoMap() {
            return this.extInfoMap;
        }

        public CompanyUpdateOneResponseBodyExtraInfo setIsvTypeEnumList(java.util.List<String> isvTypeEnumList) {
            this.isvTypeEnumList = isvTypeEnumList;
            return this;
        }
        public java.util.List<String> getIsvTypeEnumList() {
            return this.isvTypeEnumList;
        }

        public CompanyUpdateOneResponseBodyExtraInfo setSupportTypeEnumList(java.util.List<String> supportTypeEnumList) {
            this.supportTypeEnumList = supportTypeEnumList;
            return this;
        }
        public java.util.List<String> getSupportTypeEnumList() {
            return this.supportTypeEnumList;
        }

    }

}
