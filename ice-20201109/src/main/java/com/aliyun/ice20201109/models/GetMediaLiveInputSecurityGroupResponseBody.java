// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveInputSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security group information.</p>
     */
    @NameInMap("SecurityGroup")
    public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup securityGroup;

    public static GetMediaLiveInputSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveInputSecurityGroupResponseBody self = new GetMediaLiveInputSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveInputSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaLiveInputSecurityGroupResponseBody setSecurityGroup(GetMediaLiveInputSecurityGroupResponseBodySecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }
    public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup getSecurityGroup() {
        return this.securityGroup;
    }

    public static class GetMediaLiveInputSecurityGroupResponseBodySecurityGroup extends TeaModel {
        /**
         * <p>The time when the security group was created. It follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:31:56Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The IDs of the inputs associated with the security group.</p>
         */
        @NameInMap("InputIds")
        public java.util.List<String> inputIds;

        /**
         * <p>The name of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>mysg</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("WhitelistRules")
        public java.util.List<String> whitelistRules;

        public static GetMediaLiveInputSecurityGroupResponseBodySecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveInputSecurityGroupResponseBodySecurityGroup self = new GetMediaLiveInputSecurityGroupResponseBodySecurityGroup();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup setInputIds(java.util.List<String> inputIds) {
            this.inputIds = inputIds;
            return this;
        }
        public java.util.List<String> getInputIds() {
            return this.inputIds;
        }

        public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetMediaLiveInputSecurityGroupResponseBodySecurityGroup setWhitelistRules(java.util.List<String> whitelistRules) {
            this.whitelistRules = whitelistRules;
            return this;
        }
        public java.util.List<String> getWhitelistRules() {
            return this.whitelistRules;
        }

    }

}
