// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScenegroupResponseBody extends TeaModel {
    @NameInMap("groupUrl")
    public String groupUrl;

    @NameInMap("icon")
    public String icon;

    @NameInMap("managementOptions")
    public GetScenegroupResponseBodyManagementOptions managementOptions;

    @NameInMap("openConversationId")
    public String openConversationId;

    @NameInMap("ownerStaffId")
    public String ownerStaffId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("subAdminStaffIds")
    public java.util.List<String> subAdminStaffIds;

    @NameInMap("templateId")
    public String templateId;

    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static GetScenegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenegroupResponseBody self = new GetScenegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenegroupResponseBody setGroupUrl(String groupUrl) {
        this.groupUrl = groupUrl;
        return this;
    }
    public String getGroupUrl() {
        return this.groupUrl;
    }

    public GetScenegroupResponseBody setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public GetScenegroupResponseBody setManagementOptions(GetScenegroupResponseBodyManagementOptions managementOptions) {
        this.managementOptions = managementOptions;
        return this;
    }
    public GetScenegroupResponseBodyManagementOptions getManagementOptions() {
        return this.managementOptions;
    }

    public GetScenegroupResponseBody setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetScenegroupResponseBody setOwnerStaffId(String ownerStaffId) {
        this.ownerStaffId = ownerStaffId;
        return this;
    }
    public String getOwnerStaffId() {
        return this.ownerStaffId;
    }

    public GetScenegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenegroupResponseBody setSubAdminStaffIds(java.util.List<String> subAdminStaffIds) {
        this.subAdminStaffIds = subAdminStaffIds;
        return this;
    }
    public java.util.List<String> getSubAdminStaffIds() {
        return this.subAdminStaffIds;
    }

    public GetScenegroupResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetScenegroupResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetScenegroupResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetScenegroupResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetScenegroupResponseBodyManagementOptions extends TeaModel {
        @NameInMap("ChatBannedType")
        public String chatBannedType;

        @NameInMap("ManagementType")
        public String managementType;

        @NameInMap("MentionAllAuthority")
        public String mentionAllAuthority;

        @NameInMap("Searchable")
        public String searchable;

        @NameInMap("ShowHistoryType")
        public String showHistoryType;

        @NameInMap("ValidationType")
        public String validationType;

        public static GetScenegroupResponseBodyManagementOptions build(java.util.Map<String, ?> map) throws Exception {
            GetScenegroupResponseBodyManagementOptions self = new GetScenegroupResponseBodyManagementOptions();
            return TeaModel.build(map, self);
        }

        public GetScenegroupResponseBodyManagementOptions setChatBannedType(String chatBannedType) {
            this.chatBannedType = chatBannedType;
            return this;
        }
        public String getChatBannedType() {
            return this.chatBannedType;
        }

        public GetScenegroupResponseBodyManagementOptions setManagementType(String managementType) {
            this.managementType = managementType;
            return this;
        }
        public String getManagementType() {
            return this.managementType;
        }

        public GetScenegroupResponseBodyManagementOptions setMentionAllAuthority(String mentionAllAuthority) {
            this.mentionAllAuthority = mentionAllAuthority;
            return this;
        }
        public String getMentionAllAuthority() {
            return this.mentionAllAuthority;
        }

        public GetScenegroupResponseBodyManagementOptions setSearchable(String searchable) {
            this.searchable = searchable;
            return this;
        }
        public String getSearchable() {
            return this.searchable;
        }

        public GetScenegroupResponseBodyManagementOptions setShowHistoryType(String showHistoryType) {
            this.showHistoryType = showHistoryType;
            return this;
        }
        public String getShowHistoryType() {
            return this.showHistoryType;
        }

        public GetScenegroupResponseBodyManagementOptions setValidationType(String validationType) {
            this.validationType = validationType;
            return this;
        }
        public String getValidationType() {
            return this.validationType;
        }

    }

}
