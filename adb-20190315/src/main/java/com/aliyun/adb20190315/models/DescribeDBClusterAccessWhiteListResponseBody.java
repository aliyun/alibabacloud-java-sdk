// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information of IP whitelists.</p>
     */
    @NameInMap("Items")
    public DescribeDBClusterAccessWhiteListResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhiteListResponseBody self = new DescribeDBClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhiteListResponseBody setItems(DescribeDBClusterAccessWhiteListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterAccessWhiteListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray extends TeaModel {
        /**
         * <p>The attribute of the whitelist group. It is empty by default.</p>
         * <br>
         * <p>>  The groups with hidden attribute are not displayed in the console. The groups with hidden attribute are used to access DTS and PolarDB-X.</p>
         */
        @NameInMap("DBClusterIPArrayAttribute")
        public String DBClusterIPArrayAttribute;

        /**
         * <p>The name of the IP address whitelist.</p>
         * <br>
         * <p>*   The name of the IP address whitelist group must be 2 to 32 characters in length and can contain lowercase letters, digits, and underscores (\_). The name must start with a lowercase letter and end with a digit or lowercase letter.</p>
         * <p>*   You can create up to 50 whitelists for a cluster.</p>
         */
        @NameInMap("DBClusterIPArrayName")
        public String DBClusterIPArrayName;

        /**
         * <p>The IP addresses in an IP address whitelist. A maximum of 1,000 IP addresses can be returned. These addresses are separated with commas (,).</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray self = new DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

        public DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray setDBClusterIPArrayName(String DBClusterIPArrayName) {
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        public DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeDBClusterAccessWhiteListResponseBodyItems extends TeaModel {
        @NameInMap("IPArray")
        public java.util.List<DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray> IPArray;

        public static DescribeDBClusterAccessWhiteListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhiteListResponseBodyItems self = new DescribeDBClusterAccessWhiteListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhiteListResponseBodyItems setIPArray(java.util.List<DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray> IPArray) {
            this.IPArray = IPArray;
            return this;
        }
        public java.util.List<DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray> getIPArray() {
            return this.IPArray;
        }

    }

}
