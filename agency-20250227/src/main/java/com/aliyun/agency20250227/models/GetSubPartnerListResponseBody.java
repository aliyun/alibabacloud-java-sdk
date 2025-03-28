// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubPartnerList")
    public java.util.List<GetSubPartnerListResponseBodySubPartnerList> subPartnerList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetSubPartnerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubPartnerListResponseBody self = new GetSubPartnerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubPartnerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubPartnerListResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetSubPartnerListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetSubPartnerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubPartnerListResponseBody setSubPartnerList(java.util.List<GetSubPartnerListResponseBodySubPartnerList> subPartnerList) {
        this.subPartnerList = subPartnerList;
        return this;
    }
    public java.util.List<GetSubPartnerListResponseBodySubPartnerList> getSubPartnerList() {
        return this.subPartnerList;
    }

    public GetSubPartnerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSubPartnerListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetSubPartnerListResponseBodySubPartnerList extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AgreementStatus")
        public String agreementStatus;

        @NameInMap("AgreementStatusDesc")
        public String agreementStatusDesc;

        @NameInMap("City")
        public String city;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("Contact")
        public String contact;

        @NameInMap("District")
        public String district;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("MasterAccount")
        public String masterAccount;

        @NameInMap("MasterUid")
        public String masterUid;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Province")
        public String province;

        public static GetSubPartnerListResponseBodySubPartnerList build(java.util.Map<String, ?> map) throws Exception {
            GetSubPartnerListResponseBodySubPartnerList self = new GetSubPartnerListResponseBodySubPartnerList();
            return TeaModel.build(map, self);
        }

        public GetSubPartnerListResponseBodySubPartnerList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetSubPartnerListResponseBodySubPartnerList setAgreementStatus(String agreementStatus) {
            this.agreementStatus = agreementStatus;
            return this;
        }
        public String getAgreementStatus() {
            return this.agreementStatus;
        }

        public GetSubPartnerListResponseBodySubPartnerList setAgreementStatusDesc(String agreementStatusDesc) {
            this.agreementStatusDesc = agreementStatusDesc;
            return this;
        }
        public String getAgreementStatusDesc() {
            return this.agreementStatusDesc;
        }

        public GetSubPartnerListResponseBodySubPartnerList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetSubPartnerListResponseBodySubPartnerList setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public GetSubPartnerListResponseBodySubPartnerList setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public GetSubPartnerListResponseBodySubPartnerList setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public GetSubPartnerListResponseBodySubPartnerList setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public GetSubPartnerListResponseBodySubPartnerList setMasterAccount(String masterAccount) {
            this.masterAccount = masterAccount;
            return this;
        }
        public String getMasterAccount() {
            return this.masterAccount;
        }

        public GetSubPartnerListResponseBodySubPartnerList setMasterUid(String masterUid) {
            this.masterUid = masterUid;
            return this;
        }
        public String getMasterUid() {
            return this.masterUid;
        }

        public GetSubPartnerListResponseBodySubPartnerList setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetSubPartnerListResponseBodySubPartnerList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
