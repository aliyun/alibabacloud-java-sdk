// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListPermissionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KGZLxjv9VGkoG9YwHE5wx7k2V6EDybno</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    @NameInMap("Option")
    public ListPermissionsRequestOption option;

    @NameInMap("TenantContext")
    public ListPermissionsRequestTenantContext tenantContext;

    public static ListPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsRequest self = new ListPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionsRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public ListPermissionsRequest setOption(ListPermissionsRequestOption option) {
        this.option = option;
        return this;
    }
    public ListPermissionsRequestOption getOption() {
        return this.option;
    }

    public ListPermissionsRequest setTenantContext(ListPermissionsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListPermissionsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ListPermissionsRequestOption extends TeaModel {
        @NameInMap("FilterRoleIds")
        public java.util.List<String> filterRoleIds;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListPermissionsRequestOption build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionsRequestOption self = new ListPermissionsRequestOption();
            return TeaModel.build(map, self);
        }

        public ListPermissionsRequestOption setFilterRoleIds(java.util.List<String> filterRoleIds) {
            this.filterRoleIds = filterRoleIds;
            return this;
        }
        public java.util.List<String> getFilterRoleIds() {
            return this.filterRoleIds;
        }

        public ListPermissionsRequestOption setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListPermissionsRequestOption setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

    public static class ListPermissionsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListPermissionsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionsRequestTenantContext self = new ListPermissionsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListPermissionsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
