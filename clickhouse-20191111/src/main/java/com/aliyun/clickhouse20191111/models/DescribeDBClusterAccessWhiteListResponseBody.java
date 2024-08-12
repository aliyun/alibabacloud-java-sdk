// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhiteListResponseBody extends TeaModel {
    /**
     * <p>The details about the IP address whitelist.</p>
     */
    @NameInMap("DBClusterAccessWhiteList")
    public DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList DBClusterAccessWhiteList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>905F13A4-5097-4897-A84D-527EC75FFF4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhiteListResponseBody self = new DescribeDBClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAccessWhiteListResponseBody setDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList DBClusterAccessWhiteList) {
        this.DBClusterAccessWhiteList = DBClusterAccessWhiteList;
        return this;
    }
    public DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList getDBClusterAccessWhiteList() {
        return this.DBClusterAccessWhiteList;
    }

    public DescribeDBClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray extends TeaModel {
        /**
         * <p>The attribute of the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DBClusterIPArrayAttribute")
        public String DBClusterIPArrayAttribute;

        /**
         * <p>The name of the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DBClusterIPArrayName")
        public String DBClusterIPArrayName;

        /**
         * <p>The IP addresses in the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx,192.168.xx.xx</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray self = new DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray setDBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

        public DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray setDBClusterIPArrayName(String DBClusterIPArrayName) {
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        public DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList extends TeaModel {
        @NameInMap("IPArray")
        public java.util.List<DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray> IPArray;

        public static DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList self = new DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteList setIPArray(java.util.List<DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray> IPArray) {
            this.IPArray = IPArray;
            return this;
        }
        public java.util.List<DescribeDBClusterAccessWhiteListResponseBodyDBClusterAccessWhiteListIPArray> getIPArray() {
            return this.IPArray;
        }

    }

}
