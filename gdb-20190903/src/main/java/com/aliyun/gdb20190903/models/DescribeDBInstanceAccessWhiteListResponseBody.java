// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDBInstanceAccessWhiteListResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAccessWhiteListResponseBody self = new DescribeDBInstanceAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAccessWhiteListResponseBody setItems(DescribeDBInstanceAccessWhiteListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAccessWhiteListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray extends TeaModel {
        @NameInMap("DBInstanceIPArrayAttribute")
        public String DBInstanceIPArrayAttribute;

        @NameInMap("DBInstanceIPArrayName")
        public String DBInstanceIPArrayName;

        @NameInMap("SecurityIps")
        public String securityIps;

        public static DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray self = new DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
            this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
            return this;
        }
        public String getDBInstanceIPArrayAttribute() {
            return this.DBInstanceIPArrayAttribute;
        }

        public DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
        }
        public String getDBInstanceIPArrayName() {
            return this.DBInstanceIPArrayName;
        }

        public DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray setSecurityIps(String securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public String getSecurityIps() {
            return this.securityIps;
        }

    }

    public static class DescribeDBInstanceAccessWhiteListResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceIPArray")
        public java.util.List<DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray;

        public static DescribeDBInstanceAccessWhiteListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAccessWhiteListResponseBodyItems self = new DescribeDBInstanceAccessWhiteListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAccessWhiteListResponseBodyItems setDBInstanceIPArray(java.util.List<DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray> DBInstanceIPArray) {
            this.DBInstanceIPArray = DBInstanceIPArray;
            return this;
        }
        public java.util.List<DescribeDBInstanceAccessWhiteListResponseBodyItemsDBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

    }

}
