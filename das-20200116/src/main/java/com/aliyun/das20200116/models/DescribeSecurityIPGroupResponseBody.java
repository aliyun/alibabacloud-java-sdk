// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ListResult<InstanceSSL></p>
     */
    @NameInMap("Data")
    public DescribeSecurityIPGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CAC553F1-C669-53F1-A295-2CF050E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPGroupResponseBody self = new DescribeSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSecurityIPGroupResponseBody setData(DescribeSecurityIPGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSecurityIPGroupResponseBodyData getData() {
        return this.data;
    }

    public DescribeSecurityIPGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityIPGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PolarDBMySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        public static DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList self = new DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }
        public String getEngineName() {
            return this.engineName;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

    }

    public static class DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups extends TeaModel {
        @NameInMap("DbInstances")
        public java.util.List<String> dbInstances;

        @NameInMap("EngineInfoList")
        public java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList> engineInfoList;

        @NameInMap("GEcsSgIdList")
        public String GEcsSgIdList;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.28/32</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <strong>example:</strong>
         * <p>g-1no2rzybnqcv****</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIpType")
        public String securityIpType;

        /**
         * <strong>example:</strong>
         * <p>160-79abe3f4****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p>641***</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("WhitelistNetType")
        public String whitelistNetType;

        public static DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups self = new DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setDbInstances(java.util.List<String> dbInstances) {
            this.dbInstances = dbInstances;
            return this;
        }
        public java.util.List<String> getDbInstances() {
            return this.dbInstances;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setEngineInfoList(java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList> engineInfoList) {
            this.engineInfoList = engineInfoList;
            return this;
        }
        public java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList> getEngineInfoList() {
            return this.engineInfoList;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setGEcsSgIdList(String GEcsSgIdList) {
            this.GEcsSgIdList = GEcsSgIdList;
            return this;
        }
        public String getGEcsSgIdList() {
            return this.GEcsSgIdList;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setSecurityIpType(String securityIpType) {
            this.securityIpType = securityIpType;
            return this;
        }
        public String getSecurityIpType() {
            return this.securityIpType;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

    public static class DescribeSecurityIPGroupResponseBodyData extends TeaModel {
        @NameInMap("SecurityIpGroups")
        public java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups> securityIpGroups;

        public static DescribeSecurityIPGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPGroupResponseBodyData self = new DescribeSecurityIPGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPGroupResponseBodyData setSecurityIpGroups(java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups> securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }
        public java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroups> getSecurityIpGroups() {
            return this.securityIpGroups;
        }

    }

}
