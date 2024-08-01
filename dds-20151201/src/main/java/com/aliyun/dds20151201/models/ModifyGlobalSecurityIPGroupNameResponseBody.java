// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupNameResponseBody extends TeaModel {
    /**
     * <p>The global IP whitelist templates.</p>
     */
    @NameInMap("GlobalSecurityIPGroup")
    public java.util.List<ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8CA8312-530A-413A-9129-F2BB32A8D404</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalSecurityIPGroupNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupNameResponseBody self = new ModifyGlobalSecurityIPGroupNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupNameResponseBody setGlobalSecurityIPGroup(java.util.List<ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup) {
        this.globalSecurityIPGroup = globalSecurityIPGroup;
        return this;
    }
    public java.util.List<ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    public ModifyGlobalSecurityIPGroupNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup extends TeaModel {
        /**
         * <p>The IP addresses in the whitelist template.</p>
         * <blockquote>
         * <p>Separate multiple IP addresses with commas (,). You can create up to 1,000 IP addresses or CIDR blocks for all IP address whitelists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>222.70.197.187</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The name of the IP whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The ID of the IP whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>g-qiawi8ec1urcx9swoy37</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup self = new ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public ModifyGlobalSecurityIPGroupNameResponseBodyGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
