// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPGroupRelationResponseBody extends TeaModel {
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
    public DescribeSecurityIPGroupRelationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A6D1C8EE-013C-541F-83EB-B13C8xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPGroupRelationResponseBody self = new DescribeSecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSecurityIPGroupRelationResponseBody setData(DescribeSecurityIPGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSecurityIPGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public DescribeSecurityIPGroupRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityIPGroupRelationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.1.28/32</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <strong>example:</strong>
         * <p>g-1no2rzybnqcv0xxxxxx</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel self = new DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeSecurityIPGroupRelationResponseBodyData extends TeaModel {
        @NameInMap("GlobalSecurityIPGroupRel")
        public java.util.List<DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

        /**
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeSecurityIPGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPGroupRelationResponseBodyData self = new DescribeSecurityIPGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPGroupRelationResponseBodyData setGlobalSecurityIPGroupRel(java.util.List<DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
            this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
            return this;
        }
        public java.util.List<DescribeSecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
            return this.globalSecurityIPGroupRel;
        }

        public DescribeSecurityIPGroupRelationResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
