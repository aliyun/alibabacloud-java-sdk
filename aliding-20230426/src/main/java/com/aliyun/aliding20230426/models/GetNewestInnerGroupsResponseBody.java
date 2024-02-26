// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNewestInnerGroupsResponseBody extends TeaModel {
    @NameInMap("groupInfos")
    public java.util.List<GetNewestInnerGroupsResponseBodyGroupInfos> groupInfos;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetNewestInnerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNewestInnerGroupsResponseBody self = new GetNewestInnerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNewestInnerGroupsResponseBody setGroupInfos(java.util.List<GetNewestInnerGroupsResponseBodyGroupInfos> groupInfos) {
        this.groupInfos = groupInfos;
        return this;
    }
    public java.util.List<GetNewestInnerGroupsResponseBodyGroupInfos> getGroupInfos() {
        return this.groupInfos;
    }

    public GetNewestInnerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNewestInnerGroupsResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetNewestInnerGroupsResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetNewestInnerGroupsResponseBodyGroupInfos extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("MemberAmount")
        public String memberAmount;

        @NameInMap("OpenConversationId")
        public String openConversationId;

        @NameInMap("Title")
        public String title;

        public static GetNewestInnerGroupsResponseBodyGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            GetNewestInnerGroupsResponseBodyGroupInfos self = new GetNewestInnerGroupsResponseBodyGroupInfos();
            return TeaModel.build(map, self);
        }

        public GetNewestInnerGroupsResponseBodyGroupInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetNewestInnerGroupsResponseBodyGroupInfos setMemberAmount(String memberAmount) {
            this.memberAmount = memberAmount;
            return this;
        }
        public String getMemberAmount() {
            return this.memberAmount;
        }

        public GetNewestInnerGroupsResponseBodyGroupInfos setOpenConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }
        public String getOpenConversationId() {
            return this.openConversationId;
        }

        public GetNewestInnerGroupsResponseBodyGroupInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
