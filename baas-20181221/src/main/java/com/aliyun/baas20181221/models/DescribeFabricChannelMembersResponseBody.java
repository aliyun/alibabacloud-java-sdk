// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelMembersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricChannelMembersResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricChannelMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelMembersResponseBody self = new DescribeFabricChannelMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelMembersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChannelMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChannelMembersResponseBody setResult(java.util.List<DescribeFabricChannelMembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricChannelMembersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricChannelMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricChannelMembersResponseBodyResult extends TeaModel {
        @NameInMap("AcceptTime")
        public String acceptTime;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("InviteTime")
        public String inviteTime;

        @NameInMap("OrganizationDescription")
        public String organizationDescription;

        @NameInMap("OrganizationDomain")
        public String organizationDomain;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("State")
        public String state;

        @NameInMap("WithPeer")
        public Boolean withPeer;

        public static DescribeFabricChannelMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelMembersResponseBodyResult self = new DescribeFabricChannelMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelMembersResponseBodyResult setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public String getAcceptTime() {
            return this.acceptTime;
        }

        public DescribeFabricChannelMembersResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFabricChannelMembersResponseBodyResult setInviteTime(String inviteTime) {
            this.inviteTime = inviteTime;
            return this;
        }
        public String getInviteTime() {
            return this.inviteTime;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationDescription(String organizationDescription) {
            this.organizationDescription = organizationDescription;
            return this;
        }
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationDomain(String organizationDomain) {
            this.organizationDomain = organizationDomain;
            return this;
        }
        public String getOrganizationDomain() {
            return this.organizationDomain;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricChannelMembersResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricChannelMembersResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricChannelMembersResponseBodyResult setWithPeer(Boolean withPeer) {
            this.withPeer = withPeer;
            return this;
        }
        public Boolean getWithPeer() {
            return this.withPeer;
        }

    }

}
