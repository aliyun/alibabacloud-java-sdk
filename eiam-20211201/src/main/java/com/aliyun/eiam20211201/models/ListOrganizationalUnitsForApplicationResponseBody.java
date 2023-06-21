// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForApplicationResponseBody extends TeaModel {
    /**
     * <p>The IDs of the organizations that are allowed to access the application.</p>
     */
    @NameInMap("OrganizationalUnits")
    public java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits> organizationalUnits;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOrganizationalUnitsForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForApplicationResponseBody self = new ListOrganizationalUnitsForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForApplicationResponseBody setOrganizationalUnits(java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public ListOrganizationalUnitsForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrganizationalUnitsForApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits extends TeaModel {
        /**
         * <p>The ID of the organization that is allowed to access the application.</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        public static ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits self = new ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public ListOrganizationalUnitsForApplicationResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

    }

}
