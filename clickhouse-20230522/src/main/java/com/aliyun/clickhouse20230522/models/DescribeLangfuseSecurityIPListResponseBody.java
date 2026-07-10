// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseSecurityIPListResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseSecurityIPListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseSecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseSecurityIPListResponseBody self = new DescribeLangfuseSecurityIPListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseSecurityIPListResponseBody setData(DescribeLangfuseSecurityIPListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseSecurityIPListResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseSecurityIPListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseSecurityIPListResponseBodyDataGroupItems extends TeaModel {
        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The group tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The list of IP addresses in the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The IP address type. The value is fixed to IPv4. IPv6 is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        /**
         * <p>The network type of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("WhitelistNetType")
        public String whitelistNetType;

        public static DescribeLangfuseSecurityIPListResponseBodyDataGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseSecurityIPListResponseBodyDataGroupItems self = new DescribeLangfuseSecurityIPListResponseBodyDataGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseSecurityIPListResponseBodyDataGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeLangfuseSecurityIPListResponseBodyDataGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeLangfuseSecurityIPListResponseBodyDataGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeLangfuseSecurityIPListResponseBodyDataGroupItems setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public DescribeLangfuseSecurityIPListResponseBodyDataGroupItems setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

    public static class DescribeLangfuseSecurityIPListResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-****</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The whitelist group list.</p>
         */
        @NameInMap("GroupItems")
        public java.util.List<DescribeLangfuseSecurityIPListResponseBodyDataGroupItems> groupItems;

        public static DescribeLangfuseSecurityIPListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseSecurityIPListResponseBodyData self = new DescribeLangfuseSecurityIPListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseSecurityIPListResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeLangfuseSecurityIPListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeLangfuseSecurityIPListResponseBodyData setGroupItems(java.util.List<DescribeLangfuseSecurityIPListResponseBodyDataGroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }
        public java.util.List<DescribeLangfuseSecurityIPListResponseBodyDataGroupItems> getGroupItems() {
            return this.groupItems;
        }

    }

}
