// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountDeliveryAddressInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAccountDeliveryAddressInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountDeliveryAddressInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountDeliveryAddressInfoResponseBody self = new QueryAccountDeliveryAddressInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountDeliveryAddressInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountDeliveryAddressInfoResponseBody setData(java.util.List<QueryAccountDeliveryAddressInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAccountDeliveryAddressInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryAccountDeliveryAddressInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountDeliveryAddressInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountDeliveryAddressInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision extends TeaModel {
        @NameInMap("DivisionAbbName")
        public String divisionAbbName;

        @NameInMap("DivisionId")
        public Long divisionId;

        @NameInMap("DivisionLevel")
        public Long divisionLevel;

        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("DivisionTname")
        public String divisionTname;

        @NameInMap("NewDivisionId")
        public Long newDivisionId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("Remark")
        public String remark;

        public static QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision self = new QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision();
            return TeaModel.build(map, self);
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setDivisionAbbName(String divisionAbbName) {
            this.divisionAbbName = divisionAbbName;
            return this;
        }
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setDivisionId(Long divisionId) {
            this.divisionId = divisionId;
            return this;
        }
        public Long getDivisionId() {
            return this.divisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setDivisionLevel(Long divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setDivisionTname(String divisionTname) {
            this.divisionTname = divisionTname;
            return this;
        }
        public String getDivisionTname() {
            return this.divisionTname;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setNewDivisionId(Long newDivisionId) {
            this.newDivisionId = newDivisionId;
            return this;
        }
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision extends TeaModel {
        @NameInMap("DivisionAbbName")
        public String divisionAbbName;

        @NameInMap("DivisionId")
        public Long divisionId;

        @NameInMap("DivisionLevel")
        public Long divisionLevel;

        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("DivisionTname")
        public String divisionTname;

        @NameInMap("NewDivisionId")
        public Long newDivisionId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("Remark")
        public String remark;

        public static QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision self = new QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision();
            return TeaModel.build(map, self);
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setDivisionAbbName(String divisionAbbName) {
            this.divisionAbbName = divisionAbbName;
            return this;
        }
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setDivisionId(Long divisionId) {
            this.divisionId = divisionId;
            return this;
        }
        public Long getDivisionId() {
            return this.divisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setDivisionLevel(Long divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setDivisionTname(String divisionTname) {
            this.divisionTname = divisionTname;
            return this;
        }
        public String getDivisionTname() {
            return this.divisionTname;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setNewDivisionId(Long newDivisionId) {
            this.newDivisionId = newDivisionId;
            return this;
        }
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision extends TeaModel {
        @NameInMap("DivisionAbbName")
        public String divisionAbbName;

        @NameInMap("DivisionId")
        public Long divisionId;

        @NameInMap("DivisionLevel")
        public Long divisionLevel;

        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("DivisionTname")
        public String divisionTname;

        @NameInMap("NewDivisionId")
        public Long newDivisionId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("Remark")
        public String remark;

        public static QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision self = new QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision();
            return TeaModel.build(map, self);
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setDivisionAbbName(String divisionAbbName) {
            this.divisionAbbName = divisionAbbName;
            return this;
        }
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setDivisionId(Long divisionId) {
            this.divisionId = divisionId;
            return this;
        }
        public Long getDivisionId() {
            return this.divisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setDivisionLevel(Long divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setDivisionTname(String divisionTname) {
            this.divisionTname = divisionTname;
            return this;
        }
        public String getDivisionTname() {
            return this.divisionTname;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setNewDivisionId(Long newDivisionId) {
            this.newDivisionId = newDivisionId;
            return this;
        }
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision extends TeaModel {
        @NameInMap("DivisionAbbName")
        public String divisionAbbName;

        @NameInMap("DivisionId")
        public Long divisionId;

        @NameInMap("DivisionLevel")
        public Long divisionLevel;

        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("DivisionTname")
        public String divisionTname;

        @NameInMap("NewDivisionId")
        public Long newDivisionId;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("Remark")
        public String remark;

        public static QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision self = new QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision();
            return TeaModel.build(map, self);
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setDivisionAbbName(String divisionAbbName) {
            this.divisionAbbName = divisionAbbName;
            return this;
        }
        public String getDivisionAbbName() {
            return this.divisionAbbName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setDivisionId(Long divisionId) {
            this.divisionId = divisionId;
            return this;
        }
        public Long getDivisionId() {
            return this.divisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setDivisionLevel(Long divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setDivisionTname(String divisionTname) {
            this.divisionTname = divisionTname;
            return this;
        }
        public String getDivisionTname() {
            return this.divisionTname;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setNewDivisionId(Long newDivisionId) {
            this.newDivisionId = newDivisionId;
            return this;
        }
        public Long getNewDivisionId() {
            return this.newDivisionId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class QueryAccountDeliveryAddressInfoResponseBodyData extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AreaDivision")
        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision areaDivision;

        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("CityDivision")
        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision cityDivision;

        @NameInMap("CityId")
        public String cityId;

        @NameInMap("Contacts")
        public String contacts;

        @NameInMap("DefaultAddress")
        public Boolean defaultAddress;

        @NameInMap("Email")
        public String email;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Postalcode")
        public String postalcode;

        @NameInMap("ProviceDivision")
        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision proviceDivision;

        @NameInMap("ProviceId")
        public String proviceId;

        @NameInMap("TownDivision")
        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision townDivision;

        @NameInMap("TownId")
        public String townId;

        public static QueryAccountDeliveryAddressInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountDeliveryAddressInfoResponseBodyData self = new QueryAccountDeliveryAddressInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setAreaDivision(QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision areaDivision) {
            this.areaDivision = areaDivision;
            return this;
        }
        public QueryAccountDeliveryAddressInfoResponseBodyDataAreaDivision getAreaDivision() {
            return this.areaDivision;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setCityDivision(QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision cityDivision) {
            this.cityDivision = cityDivision;
            return this;
        }
        public QueryAccountDeliveryAddressInfoResponseBodyDataCityDivision getCityDivision() {
            return this.cityDivision;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setContacts(String contacts) {
            this.contacts = contacts;
            return this;
        }
        public String getContacts() {
            return this.contacts;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setDefaultAddress(Boolean defaultAddress) {
            this.defaultAddress = defaultAddress;
            return this;
        }
        public Boolean getDefaultAddress() {
            return this.defaultAddress;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setPostalcode(String postalcode) {
            this.postalcode = postalcode;
            return this;
        }
        public String getPostalcode() {
            return this.postalcode;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setProviceDivision(QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision proviceDivision) {
            this.proviceDivision = proviceDivision;
            return this;
        }
        public QueryAccountDeliveryAddressInfoResponseBodyDataProviceDivision getProviceDivision() {
            return this.proviceDivision;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setProviceId(String proviceId) {
            this.proviceId = proviceId;
            return this;
        }
        public String getProviceId() {
            return this.proviceId;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setTownDivision(QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision townDivision) {
            this.townDivision = townDivision;
            return this;
        }
        public QueryAccountDeliveryAddressInfoResponseBodyDataTownDivision getTownDivision() {
            return this.townDivision;
        }

        public QueryAccountDeliveryAddressInfoResponseBodyData setTownId(String townId) {
            this.townId = townId;
            return this;
        }
        public String getTownId() {
            return this.townId;
        }

    }

}
