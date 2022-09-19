// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeClusterAccessWhiteListResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAccessWhiteListResponseBody self = new DescribeClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAccessWhiteListResponseBody setItems(DescribeClusterAccessWhiteListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeClusterAccessWhiteListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterAccessWhiteListResponseBodyItemsIPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayAttribute")
        public String DBClusterIPArrayAttribute;

        @NameInMap("DBClusterIPArrayName")
        public String DBClusterIPArrayName;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeClusterAccessWhiteListResponseBodyItemsIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAccessWhiteListResponseBodyItemsIPArray self = new DescribeClusterAccessWhiteListResponseBodyItemsIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAccessWhiteListResponseBodyItemsIPArray setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

        public DescribeClusterAccessWhiteListResponseBodyItemsIPArray setDBClusterIPArrayName(String DBClusterIPArrayName) {
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        public DescribeClusterAccessWhiteListResponseBodyItemsIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeClusterAccessWhiteListResponseBodyItems extends TeaModel {
        @NameInMap("IPArray")
        public java.util.List<DescribeClusterAccessWhiteListResponseBodyItemsIPArray> IPArray;

        public static DescribeClusterAccessWhiteListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAccessWhiteListResponseBodyItems self = new DescribeClusterAccessWhiteListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAccessWhiteListResponseBodyItems setIPArray(java.util.List<DescribeClusterAccessWhiteListResponseBodyItemsIPArray> IPArray) {
            this.IPArray = IPArray;
            return this;
        }
        public java.util.List<DescribeClusterAccessWhiteListResponseBodyItemsIPArray> getIPArray() {
            return this.IPArray;
        }

    }

}
