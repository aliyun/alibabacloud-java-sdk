// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyListByConditionResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<CompanyListByConditionResponseBodyData> data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CompanyListByConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyListByConditionResponseBody self = new CompanyListByConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyListByConditionResponseBody setData(java.util.List<CompanyListByConditionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CompanyListByConditionResponseBodyData> getData() {
        return this.data;
    }

    public CompanyListByConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompanyListByConditionResponseBodyDataExtraInfo extends TeaModel {
        @NameInMap("ExtInfoMap")
        public String extInfoMap;

        @NameInMap("IsvTypeEnumList")
        public java.util.List<String> isvTypeEnumList;

        @NameInMap("SupportTypeEnumList")
        public java.util.List<String> supportTypeEnumList;

        public static CompanyListByConditionResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyListByConditionResponseBodyDataExtraInfo self = new CompanyListByConditionResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public CompanyListByConditionResponseBodyDataExtraInfo setExtInfoMap(String extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public String getExtInfoMap() {
            return this.extInfoMap;
        }

        public CompanyListByConditionResponseBodyDataExtraInfo setIsvTypeEnumList(java.util.List<String> isvTypeEnumList) {
            this.isvTypeEnumList = isvTypeEnumList;
            return this;
        }
        public java.util.List<String> getIsvTypeEnumList() {
            return this.isvTypeEnumList;
        }

        public CompanyListByConditionResponseBodyDataExtraInfo setSupportTypeEnumList(java.util.List<String> supportTypeEnumList) {
            this.supportTypeEnumList = supportTypeEnumList;
            return this;
        }
        public java.util.List<String> getSupportTypeEnumList() {
            return this.supportTypeEnumList;
        }

    }

    public static class CompanyListByConditionResponseBodyData extends TeaModel {
        @NameInMap("ContactPerson")
        public String contactPerson;

        @NameInMap("ExtraInfo")
        public CompanyListByConditionResponseBodyDataExtraInfo extraInfo;

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

        @NameInMap("Status")
        public String status;

        public static CompanyListByConditionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyListByConditionResponseBodyData self = new CompanyListByConditionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyListByConditionResponseBodyData setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public String getContactPerson() {
            return this.contactPerson;
        }

        public CompanyListByConditionResponseBodyData setExtraInfo(CompanyListByConditionResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public CompanyListByConditionResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public CompanyListByConditionResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CompanyListByConditionResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CompanyListByConditionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompanyListByConditionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompanyListByConditionResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CompanyListByConditionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
