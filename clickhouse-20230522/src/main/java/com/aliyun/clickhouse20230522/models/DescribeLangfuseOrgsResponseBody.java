// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseOrgsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseOrgsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseOrgsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseOrgsResponseBody self = new DescribeLangfuseOrgsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseOrgsResponseBody setData(DescribeLangfuseOrgsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseOrgsResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseOrgsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseOrgsResponseBodyDataOrganizations extends TeaModel {
        /**
         * <p>The time when the Langfuse organization was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-11T10:27:23Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The Langfuse organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>org_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Langfuse organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmrbhzx930005jw2q****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The time when the Langfuse organization was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-09T10:27:55</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static DescribeLangfuseOrgsResponseBodyDataOrganizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseOrgsResponseBodyDataOrganizations self = new DescribeLangfuseOrgsResponseBodyDataOrganizations();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseOrgsResponseBodyDataOrganizations setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeLangfuseOrgsResponseBodyDataOrganizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLangfuseOrgsResponseBodyDataOrganizations setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeLangfuseOrgsResponseBodyDataOrganizations setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class DescribeLangfuseOrgsResponseBodyData extends TeaModel {
        /**
         * <p>The Langfuse organization information.</p>
         */
        @NameInMap("Organizations")
        public java.util.List<DescribeLangfuseOrgsResponseBodyDataOrganizations> organizations;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeLangfuseOrgsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseOrgsResponseBodyData self = new DescribeLangfuseOrgsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseOrgsResponseBodyData setOrganizations(java.util.List<DescribeLangfuseOrgsResponseBodyDataOrganizations> organizations) {
            this.organizations = organizations;
            return this;
        }
        public java.util.List<DescribeLangfuseOrgsResponseBodyDataOrganizations> getOrganizations() {
            return this.organizations;
        }

        public DescribeLangfuseOrgsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeLangfuseOrgsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeLangfuseOrgsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
