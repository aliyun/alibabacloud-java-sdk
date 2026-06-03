// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSchemeResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemeResponseBody self = new ListSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSchemeResponseBody setData(java.util.List<ListSchemeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSchemeResponseBodyData> getData() {
        return this.data;
    }

    public ListSchemeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSchemeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSchemeResponseBodyData extends TeaModel {
        @NameInMap("ApplyTime")
        public Long applyTime;

        @NameInMap("AuditDesc")
        public String auditDesc;

        @NameInMap("BusinessTypeList")
        public java.util.List<Integer> businessTypeList;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("SchemeId")
        public Long schemeId;

        @NameInMap("SchemeName")
        public String schemeName;

        @NameInMap("SchemeType")
        public Integer schemeType;

        @NameInMap("Status")
        public Integer status;

        public static ListSchemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSchemeResponseBodyData self = new ListSchemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSchemeResponseBodyData setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public ListSchemeResponseBodyData setAuditDesc(String auditDesc) {
            this.auditDesc = auditDesc;
            return this;
        }
        public String getAuditDesc() {
            return this.auditDesc;
        }

        public ListSchemeResponseBodyData setBusinessTypeList(java.util.List<Integer> businessTypeList) {
            this.businessTypeList = businessTypeList;
            return this;
        }
        public java.util.List<Integer> getBusinessTypeList() {
            return this.businessTypeList;
        }

        public ListSchemeResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public ListSchemeResponseBodyData setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

        public ListSchemeResponseBodyData setSchemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }
        public String getSchemeName() {
            return this.schemeName;
        }

        public ListSchemeResponseBodyData setSchemeType(Integer schemeType) {
            this.schemeType = schemeType;
            return this;
        }
        public Integer getSchemeType() {
            return this.schemeType;
        }

        public ListSchemeResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
