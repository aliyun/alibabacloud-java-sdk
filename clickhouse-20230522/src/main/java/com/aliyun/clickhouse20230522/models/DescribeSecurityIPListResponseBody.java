// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSecurityIPListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPListResponseBody self = new DescribeSecurityIPListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPListResponseBody setData(DescribeSecurityIPListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSecurityIPListResponseBodyData getData() {
        return this.data;
    }

    public DescribeSecurityIPListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecurityIPListResponseBodyDataGroupItems extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupTag")
        public String groupTag;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("SecurityIPType")
        public String securityIPType;

        @NameInMap("WhitelistNetType")
        public String whitelistNetType;

        public static DescribeSecurityIPListResponseBodyDataGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPListResponseBodyDataGroupItems self = new DescribeSecurityIPListResponseBodyDataGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPListResponseBodyDataGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeSecurityIPListResponseBodyDataGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeSecurityIPListResponseBodyDataGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeSecurityIPListResponseBodyDataGroupItems setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public DescribeSecurityIPListResponseBodyDataGroupItems setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

    public static class DescribeSecurityIPListResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("GroupItems")
        public java.util.List<DescribeSecurityIPListResponseBodyDataGroupItems> groupItems;

        public static DescribeSecurityIPListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPListResponseBodyData self = new DescribeSecurityIPListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPListResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeSecurityIPListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSecurityIPListResponseBodyData setGroupItems(java.util.List<DescribeSecurityIPListResponseBodyDataGroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }
        public java.util.List<DescribeSecurityIPListResponseBodyDataGroupItems> getGroupItems() {
            return this.groupItems;
        }

    }

}
