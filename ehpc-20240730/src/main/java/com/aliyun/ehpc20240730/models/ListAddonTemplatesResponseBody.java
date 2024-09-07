// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAddonTemplatesResponseBody extends TeaModel {
    @NameInMap("Addons")
    public java.util.List<ListAddonTemplatesResponseBodyAddons> addons;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAddonTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddonTemplatesResponseBody self = new ListAddonTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddonTemplatesResponseBody setAddons(java.util.List<ListAddonTemplatesResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListAddonTemplatesResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public ListAddonTemplatesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAddonTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAddonTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAddonTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAddonTemplatesResponseBodyAddons extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAddonTemplatesResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListAddonTemplatesResponseBodyAddons self = new ListAddonTemplatesResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListAddonTemplatesResponseBodyAddons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAddonTemplatesResponseBodyAddons setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAddonTemplatesResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonTemplatesResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
