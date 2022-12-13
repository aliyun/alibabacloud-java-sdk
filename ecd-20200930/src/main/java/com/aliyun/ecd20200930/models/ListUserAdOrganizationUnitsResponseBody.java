// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListUserAdOrganizationUnitsResponseBody extends TeaModel {
    // The details of the OU in the AD domain.
    @NameInMap("OUNames")
    public java.util.List<ListUserAdOrganizationUnitsResponseBodyOUNames> OUNames;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserAdOrganizationUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAdOrganizationUnitsResponseBody self = new ListUserAdOrganizationUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAdOrganizationUnitsResponseBody setOUNames(java.util.List<ListUserAdOrganizationUnitsResponseBodyOUNames> OUNames) {
        this.OUNames = OUNames;
        return this;
    }
    public java.util.List<ListUserAdOrganizationUnitsResponseBodyOUNames> getOUNames() {
        return this.OUNames;
    }

    public ListUserAdOrganizationUnitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserAdOrganizationUnitsResponseBodyOUNames extends TeaModel {
        // The name of the organization unit.
        @NameInMap("OUName")
        public String OUName;

        // The ID of the AD workspace.
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        public static ListUserAdOrganizationUnitsResponseBodyOUNames build(java.util.Map<String, ?> map) throws Exception {
            ListUserAdOrganizationUnitsResponseBodyOUNames self = new ListUserAdOrganizationUnitsResponseBodyOUNames();
            return TeaModel.build(map, self);
        }

        public ListUserAdOrganizationUnitsResponseBodyOUNames setOUName(String OUName) {
            this.OUName = OUName;
            return this;
        }
        public String getOUName() {
            return this.OUName;
        }

        public ListUserAdOrganizationUnitsResponseBodyOUNames setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

    }

}
