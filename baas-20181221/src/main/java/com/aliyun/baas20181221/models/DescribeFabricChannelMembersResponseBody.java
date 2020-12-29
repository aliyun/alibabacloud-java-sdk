// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricChannelMembersResponseBodyResult> result;

    public static DescribeFabricChannelMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelMembersResponseBody self = new DescribeFabricChannelMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChannelMembersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChannelMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricChannelMembersResponseBody setResult(java.util.List<DescribeFabricChannelMembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricChannelMembersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricChannelMembersResponseBodyResult extends TeaModel {
        @NameInMap("WithPeer")
        public Boolean withPeer;

        @NameInMap("AcceptTime")
        public String acceptTime;

        @NameInMap("OrganizationDomain")
        public String organizationDomain;

        @NameInMap("State")
        public String state;

        @NameInMap("InviteTime")
        public String inviteTime;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("OrganizationDescription")
        public String organizationDescription;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static DescribeFabricChannelMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelMembersResponseBodyResult self = new DescribeFabricChannelMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelMembersResponseBodyResult setWithPeer(Boolean withPeer) {
            this.withPeer = withPeer;
            return this;
        }
        public Boolean getWithPeer() {
            return this.withPeer;
        }

        public DescribeFabricChannelMembersResponseBodyResult setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public String getAcceptTime() {
            return this.acceptTime;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationDomain(String organizationDomain) {
            this.organizationDomain = organizationDomain;
            return this;
        }
        public String getOrganizationDomain() {
            return this.organizationDomain;
        }

        public DescribeFabricChannelMembersResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricChannelMembersResponseBodyResult setInviteTime(String inviteTime) {
            this.inviteTime = inviteTime;
            return this;
        }
        public String getInviteTime() {
            return this.inviteTime;
        }

        public DescribeFabricChannelMembersResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationDescription(String organizationDescription) {
            this.organizationDescription = organizationDescription;
            return this;
        }
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
