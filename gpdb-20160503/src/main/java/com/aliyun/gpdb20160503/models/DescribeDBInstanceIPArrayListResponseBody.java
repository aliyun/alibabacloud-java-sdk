// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListResponseBody extends TeaModel {
    /**
     * <p>The queried IP address whitelists.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstanceIPArrayListResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB7AA0BF-BE41-480E-A3DC-C97BF85A391B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceIPArrayListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListResponseBody self = new DescribeDBInstanceIPArrayListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListResponseBody setItems(DescribeDBInstanceIPArrayListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceIPArrayListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceIPArrayListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray extends TeaModel {
        /**
         * <p>The attribute of the IP address whitelist. By default, this parameter is empty. A whitelist with the <code>hidden</code> attribute is not displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>hidden</p>
         */
        @NameInMap("DBInstanceIPArrayAttribute")
        public String DBInstanceIPArrayAttribute;

        /**
         * <p>The name of the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DBInstanceIPArrayName")
        public String DBInstanceIPArrayName;

        /**
         * <p>The IP addresses listed in the whitelist. Up to 1,000 IP addresses are contained in a whitelist and separated by commas (,). The IP addresses must use one of the following formats:</p>
         * <ul>
         * <li>0.0.0.0/0</li>
         * <li>10.23.12.24. This is a standard IP address.</li>
         * <li>10.23.12.24/24. This is a CIDR block. The value <code>/24</code> indicates that the prefix of the CIDR block is 24-bit long. You can replace 24 with a value in the range of <code>1 to 32</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray self = new DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }
        public String getDBInstanceIPArrayAttribute() {
            return this.DBInstanceIPArrayAttribute;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }
        public String getDBInstanceIPArrayName() {
            return this.DBInstanceIPArrayName;
        }

        public DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeDBInstanceIPArrayListResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceIPArray")
        public java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray;

        public static DescribeDBInstanceIPArrayListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceIPArrayListResponseBodyItems self = new DescribeDBInstanceIPArrayListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceIPArrayListResponseBodyItems setDBInstanceIPArray(java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray) {
            this.DBInstanceIPArray = DBInstanceIPArray;
            return this;
        }
        public java.util.List<DescribeDBInstanceIPArrayListResponseBodyItemsDBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

    }

}
