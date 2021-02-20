// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserOrganizationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Organizations")
    public java.util.List<ListUserOrganizationsResponseBodyOrganizations> organizations;

    public static ListUserOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserOrganizationsResponseBody self = new ListUserOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserOrganizationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserOrganizationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserOrganizationsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserOrganizationsResponseBody setOrganizations(java.util.List<ListUserOrganizationsResponseBodyOrganizations> organizations) {
        this.organizations = organizations;
        return this;
    }
    public java.util.List<ListUserOrganizationsResponseBodyOrganizations> getOrganizations() {
        return this.organizations;
    }

    public static class ListUserOrganizationsResponseBodyOrganizations extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Description")
        public String description;

        @NameInMap("OrgId")
        public Integer orgId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Name")
        public String name;

        public static ListUserOrganizationsResponseBodyOrganizations build(java.util.Map<String, ?> map) throws Exception {
            ListUserOrganizationsResponseBodyOrganizations self = new ListUserOrganizationsResponseBodyOrganizations();
            return TeaModel.build(map, self);
        }

        public ListUserOrganizationsResponseBodyOrganizations setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserOrganizationsResponseBodyOrganizations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserOrganizationsResponseBodyOrganizations setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListUserOrganizationsResponseBodyOrganizations setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListUserOrganizationsResponseBodyOrganizations setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserOrganizationsResponseBodyOrganizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
