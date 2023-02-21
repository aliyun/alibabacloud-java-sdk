// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcAdminLicenseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcAdminLicenseResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcIcAdminLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcAdminLicenseResponseBody self = new GetOcIcAdminLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcAdminLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcAdminLicenseResponseBody setData(java.util.List<GetOcIcAdminLicenseResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcAdminLicenseResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcAdminLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcAdminLicenseResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcAdminLicenseResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcAdminLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcAdminLicenseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcAdminLicenseResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcAdminLicenseResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Department")
        public String department;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("LicenseName")
        public String licenseName;

        @NameInMap("LicenseNo")
        public String licenseNo;

        @NameInMap("StartDate")
        public String startDate;

        public static GetOcIcAdminLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcAdminLicenseResponseBodyData self = new GetOcIcAdminLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcAdminLicenseResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetOcIcAdminLicenseResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcIcAdminLicenseResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetOcIcAdminLicenseResponseBodyData setLicenseName(String licenseName) {
            this.licenseName = licenseName;
            return this;
        }
        public String getLicenseName() {
            return this.licenseName;
        }

        public GetOcIcAdminLicenseResponseBodyData setLicenseNo(String licenseNo) {
            this.licenseNo = licenseNo;
            return this;
        }
        public String getLicenseNo() {
            return this.licenseNo;
        }

        public GetOcIcAdminLicenseResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

}
