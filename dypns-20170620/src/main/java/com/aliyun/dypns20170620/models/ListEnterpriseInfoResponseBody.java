// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListEnterpriseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListEnterpriseInfoResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEnterpriseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseInfoResponseBody self = new ListEnterpriseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnterpriseInfoResponseBody setData(java.util.List<ListEnterpriseInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnterpriseInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListEnterpriseInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEnterpriseInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEnterpriseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEnterpriseInfoResponseBodyData extends TeaModel {
        @NameInMap("AuditDesc")
        public String auditDesc;

        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        @NameInMap("EnterpriseName")
        public String enterpriseName;

        @NameInMap("ManagerContactNumber")
        public String managerContactNumber;

        @NameInMap("ManagerName")
        public String managerName;

        @NameInMap("OrganizationCode")
        public String organizationCode;

        @NameInMap("Status")
        public Integer status;

        public static ListEnterpriseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseInfoResponseBodyData self = new ListEnterpriseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseInfoResponseBodyData setAuditDesc(String auditDesc) {
            this.auditDesc = auditDesc;
            return this;
        }
        public String getAuditDesc() {
            return this.auditDesc;
        }

        public ListEnterpriseInfoResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public ListEnterpriseInfoResponseBodyData setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        public ListEnterpriseInfoResponseBodyData setManagerContactNumber(String managerContactNumber) {
            this.managerContactNumber = managerContactNumber;
            return this;
        }
        public String getManagerContactNumber() {
            return this.managerContactNumber;
        }

        public ListEnterpriseInfoResponseBodyData setManagerName(String managerName) {
            this.managerName = managerName;
            return this;
        }
        public String getManagerName() {
            return this.managerName;
        }

        public ListEnterpriseInfoResponseBodyData setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        public ListEnterpriseInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
