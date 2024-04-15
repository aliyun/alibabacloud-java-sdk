// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListUserAdOrganizationUnitsResponseBody extends TeaModel {
    /**
     * <p>A pagination token.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The OUs of the AD domain.</p>
     */
    @NameInMap("OUNames")
    public java.util.List<ListUserAdOrganizationUnitsResponseBodyOUNames> OUNames;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserAdOrganizationUnitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAdOrganizationUnitsResponseBody self = new ListUserAdOrganizationUnitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAdOrganizationUnitsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The name of the OU.</p>
         */
        @NameInMap("DisplayOUName")
        public String displayOUName;

        /**
         * <p>The canonical name (CNAME) of the OU in the AD domain controller.</p>
         */
        @NameInMap("OUName")
        public String OUName;

        /**
         * <p>The enterprise AD office network ID.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        public static ListUserAdOrganizationUnitsResponseBodyOUNames build(java.util.Map<String, ?> map) throws Exception {
            ListUserAdOrganizationUnitsResponseBodyOUNames self = new ListUserAdOrganizationUnitsResponseBodyOUNames();
            return TeaModel.build(map, self);
        }

        public ListUserAdOrganizationUnitsResponseBodyOUNames setDisplayOUName(String displayOUName) {
            this.displayOUName = displayOUName;
            return this;
        }
        public String getDisplayOUName() {
            return this.displayOUName;
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
