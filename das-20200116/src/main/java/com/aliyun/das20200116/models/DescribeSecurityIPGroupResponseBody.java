// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
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
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an exception message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CAC553F1-C669-53F1-A295-2CF050E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
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
         * <p>The database engine type of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDBMySQL</p>
         */
        @NameInMap("EngineName")
        public String engineName;

        /**
         * <p>The list of database instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The number of instances under the current logon account.</p>
         * 
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
        /**
         * <p>The list of database instances bound to the cross-engine whitelist template.</p>
         */
        @NameInMap("DbInstances")
        public java.util.List<String> dbInstances;

        /**
         * <p>The instance information for each product bound to the template.</p>
         */
        @NameInMap("EngineInfoList")
        public java.util.List<DescribeSecurityIPGroupResponseBodyDataSecurityIpGroupsEngineInfoList> engineInfoList;

        /**
         * <p>The ECS security group ID. This field is invalid and contains redundant data that will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("GEcsSgIdList")
        public String GEcsSgIdList;

        /**
         * <p>The IP addresses in the whitelist template.</p>
         * <blockquote>
         * <p>Separate multiple IP addresses with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.28/32</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The IP whitelist template name. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>Contains only lowercase letters, digits, and underscores (_).</p>
         * </li>
         * <li><p>Starts with a letter and ends with a letter or digit.</p>
         * </li>
         * <li><p>Contains 2 to 120 characters in length.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The IP whitelist template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-1no2rzybnqcv****</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP type.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIpType")
        public String securityIpType;

        /**
         * <p>The account ID. You can obtain the ID of the <strong>logon account</strong> on the <strong>Security Settings</strong> page in <strong>Account Management</strong> of the Alibaba Cloud console.</p>
         * 
         * <strong>example:</strong>
         * <p>160-79abe3f4****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>641***</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The network type of the whitelist.</p>
         * 
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
        /**
         * <p>The list of all cross-engine whitelist templates for the user in the specified region.</p>
         */
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
