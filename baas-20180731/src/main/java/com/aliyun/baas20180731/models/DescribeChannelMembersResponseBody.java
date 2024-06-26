// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeChannelMembersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeChannelMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelMembersResponseBody self = new DescribeChannelMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelMembersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeChannelMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelMembersResponseBody setResult(java.util.List<DescribeChannelMembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeChannelMembersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeChannelMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeChannelMembersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("AcceptTime")
        public String acceptTime;

        /**
         * <strong>example:</strong>
         * <p>chan-channelx-1l1hmckuuisxo</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("InviteTime")
        public String inviteTime;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WithPeer")
        public Boolean withPeer;

        public static DescribeChannelMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelMembersResponseBodyResult self = new DescribeChannelMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeChannelMembersResponseBodyResult setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public String getAcceptTime() {
            return this.acceptTime;
        }

        public DescribeChannelMembersResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeChannelMembersResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeChannelMembersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeChannelMembersResponseBodyResult setInviteTime(String inviteTime) {
            this.inviteTime = inviteTime;
            return this;
        }
        public String getInviteTime() {
            return this.inviteTime;
        }

        public DescribeChannelMembersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChannelMembersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeChannelMembersResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeChannelMembersResponseBodyResult setWithPeer(Boolean withPeer) {
            this.withPeer = withPeer;
            return this;
        }
        public Boolean getWithPeer() {
            return this.withPeer;
        }

    }

}
