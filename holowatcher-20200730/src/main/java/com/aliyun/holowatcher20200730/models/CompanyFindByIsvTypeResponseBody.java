// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindByIsvTypeResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<CompanyFindByIsvTypeResponseBodyData> data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CompanyFindByIsvTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindByIsvTypeResponseBody self = new CompanyFindByIsvTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyFindByIsvTypeResponseBody setData(java.util.List<CompanyFindByIsvTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CompanyFindByIsvTypeResponseBodyData> getData() {
        return this.data;
    }

    public CompanyFindByIsvTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompanyFindByIsvTypeResponseBodyDataExtraInfo extends TeaModel {
        @NameInMap("ExtInfoMap")
        public String extInfoMap;

        @NameInMap("IsvTypeEnumList")
        public java.util.List<String> isvTypeEnumList;

        @NameInMap("SupportTypeEnumList")
        public java.util.List<String> supportTypeEnumList;

        public static CompanyFindByIsvTypeResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindByIsvTypeResponseBodyDataExtraInfo self = new CompanyFindByIsvTypeResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public CompanyFindByIsvTypeResponseBodyDataExtraInfo setExtInfoMap(String extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public String getExtInfoMap() {
            return this.extInfoMap;
        }

        public CompanyFindByIsvTypeResponseBodyDataExtraInfo setIsvTypeEnumList(java.util.List<String> isvTypeEnumList) {
            this.isvTypeEnumList = isvTypeEnumList;
            return this;
        }
        public java.util.List<String> getIsvTypeEnumList() {
            return this.isvTypeEnumList;
        }

        public CompanyFindByIsvTypeResponseBodyDataExtraInfo setSupportTypeEnumList(java.util.List<String> supportTypeEnumList) {
            this.supportTypeEnumList = supportTypeEnumList;
            return this;
        }
        public java.util.List<String> getSupportTypeEnumList() {
            return this.supportTypeEnumList;
        }

    }

    public static class CompanyFindByIsvTypeResponseBodyData extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("ContactPerson")
        public String contactPerson;

        @NameInMap("ExtraInfo")
        public CompanyFindByIsvTypeResponseBodyDataExtraInfo extraInfo;

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

        public static CompanyFindByIsvTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindByIsvTypeResponseBodyData self = new CompanyFindByIsvTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyFindByIsvTypeResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public CompanyFindByIsvTypeResponseBodyData setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public String getContactPerson() {
            return this.contactPerson;
        }

        public CompanyFindByIsvTypeResponseBodyData setExtraInfo(CompanyFindByIsvTypeResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public CompanyFindByIsvTypeResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public CompanyFindByIsvTypeResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CompanyFindByIsvTypeResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CompanyFindByIsvTypeResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompanyFindByIsvTypeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompanyFindByIsvTypeResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CompanyFindByIsvTypeResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
