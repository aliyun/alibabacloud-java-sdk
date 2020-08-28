// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterAccessWhiteList")
    @Validation(required = true)
    public DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList DBClusterAccessWhiteList;

    public static DescribeDBClusterAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhiteListResponse self = new DescribeDBClusterAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhiteListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAccessWhiteListResponse setDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList DBClusterAccessWhiteList) {
        this.DBClusterAccessWhiteList = DBClusterAccessWhiteList;
        return this;
    }
    public DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList getDBClusterAccessWhiteList() {
        return this.DBClusterAccessWhiteList;
    }

    public static class DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayName")
        @Validation(required = true)
        public String DBClusterIPArrayName;

        @NameInMap("SecurityIPList")
        @Validation(required = true)
        public String securityIPList;

        @NameInMap("DBClusterIPArrayAttribute")
        @Validation(required = true)
        public String DBClusterIPArrayAttribute;

        public static DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray self = new DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray setDBClusterIPArrayName(String DBClusterIPArrayName) {
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        public DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

    }

    public static class DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList extends TeaModel {
        @NameInMap("IPArray")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray> IPArray;

        public static DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList self = new DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteList setIPArray(java.util.List<DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray> IPArray) {
            this.IPArray = IPArray;
            return this;
        }
        public java.util.List<DescribeDBClusterAccessWhiteListResponseDBClusterAccessWhiteListIPArray> getIPArray() {
            return this.IPArray;
        }

    }

}
