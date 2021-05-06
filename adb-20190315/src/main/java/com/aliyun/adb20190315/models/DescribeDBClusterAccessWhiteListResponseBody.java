// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeDBClusterAccessWhiteListResponseBodyItems items;

    public static DescribeDBClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhiteListResponseBody self = new DescribeDBClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAccessWhiteListResponseBody setItems(DescribeDBClusterAccessWhiteListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterAccessWhiteListResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayAttribute")
        public String DBClusterIPArrayAttribute;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("DBClusterIPArrayName")
        public String DBClusterIPArrayName;

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

        public DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBClusterAccessWhiteListResponseBodyItemsIPArray setDBClusterIPArrayName(String DBClusterIPArrayName) {
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
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
