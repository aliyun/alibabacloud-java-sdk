// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScenegroupRequest extends TeaModel {
    @NameInMap("AddFriendForbidden")
    public Long addFriendForbidden;

    @NameInMap("AllMembersCanCreateCalendar")
    public Long allMembersCanCreateCalendar;

    @NameInMap("AllMembersCanCreateMcsConf")
    public Long allMembersCanCreateMcsConf;

    @NameInMap("ChatBannedType")
    public Long chatBannedType;

    @NameInMap("GroupEmailDisabled")
    public Long groupEmailDisabled;

    @NameInMap("GroupLiveSwitch")
    public Long groupLiveSwitch;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("ManagementType")
    public Long managementType;

    @NameInMap("MembersToAdminChat")
    public Long membersToAdminChat;

    @NameInMap("MentionAllAuthority")
    public Long mentionAllAuthority;

    @NameInMap("OnlyAdminCanDing")
    public Long onlyAdminCanDing;

    @NameInMap("OnlyAdminCanSetMsgTop")
    public Long onlyAdminCanSetMsgTop;

    @NameInMap("Searchable")
    public Long searchable;

    @NameInMap("ShowHistoryType")
    public Long showHistoryType;

    @NameInMap("SubadminIds")
    public String subadminIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("UserIds")
    public String userIds;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("ValidationType")
    public Long validationType;

    public static CreateScenegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScenegroupRequest self = new CreateScenegroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateScenegroupRequest setAddFriendForbidden(Long addFriendForbidden) {
        this.addFriendForbidden = addFriendForbidden;
        return this;
    }
    public Long getAddFriendForbidden() {
        return this.addFriendForbidden;
    }

    public CreateScenegroupRequest setAllMembersCanCreateCalendar(Long allMembersCanCreateCalendar) {
        this.allMembersCanCreateCalendar = allMembersCanCreateCalendar;
        return this;
    }
    public Long getAllMembersCanCreateCalendar() {
        return this.allMembersCanCreateCalendar;
    }

    public CreateScenegroupRequest setAllMembersCanCreateMcsConf(Long allMembersCanCreateMcsConf) {
        this.allMembersCanCreateMcsConf = allMembersCanCreateMcsConf;
        return this;
    }
    public Long getAllMembersCanCreateMcsConf() {
        return this.allMembersCanCreateMcsConf;
    }

    public CreateScenegroupRequest setChatBannedType(Long chatBannedType) {
        this.chatBannedType = chatBannedType;
        return this;
    }
    public Long getChatBannedType() {
        return this.chatBannedType;
    }

    public CreateScenegroupRequest setGroupEmailDisabled(Long groupEmailDisabled) {
        this.groupEmailDisabled = groupEmailDisabled;
        return this;
    }
    public Long getGroupEmailDisabled() {
        return this.groupEmailDisabled;
    }

    public CreateScenegroupRequest setGroupLiveSwitch(Long groupLiveSwitch) {
        this.groupLiveSwitch = groupLiveSwitch;
        return this;
    }
    public Long getGroupLiveSwitch() {
        return this.groupLiveSwitch;
    }

    public CreateScenegroupRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateScenegroupRequest setManagementType(Long managementType) {
        this.managementType = managementType;
        return this;
    }
    public Long getManagementType() {
        return this.managementType;
    }

    public CreateScenegroupRequest setMembersToAdminChat(Long membersToAdminChat) {
        this.membersToAdminChat = membersToAdminChat;
        return this;
    }
    public Long getMembersToAdminChat() {
        return this.membersToAdminChat;
    }

    public CreateScenegroupRequest setMentionAllAuthority(Long mentionAllAuthority) {
        this.mentionAllAuthority = mentionAllAuthority;
        return this;
    }
    public Long getMentionAllAuthority() {
        return this.mentionAllAuthority;
    }

    public CreateScenegroupRequest setOnlyAdminCanDing(Long onlyAdminCanDing) {
        this.onlyAdminCanDing = onlyAdminCanDing;
        return this;
    }
    public Long getOnlyAdminCanDing() {
        return this.onlyAdminCanDing;
    }

    public CreateScenegroupRequest setOnlyAdminCanSetMsgTop(Long onlyAdminCanSetMsgTop) {
        this.onlyAdminCanSetMsgTop = onlyAdminCanSetMsgTop;
        return this;
    }
    public Long getOnlyAdminCanSetMsgTop() {
        return this.onlyAdminCanSetMsgTop;
    }

    public CreateScenegroupRequest setSearchable(Long searchable) {
        this.searchable = searchable;
        return this;
    }
    public Long getSearchable() {
        return this.searchable;
    }

    public CreateScenegroupRequest setShowHistoryType(Long showHistoryType) {
        this.showHistoryType = showHistoryType;
        return this;
    }
    public Long getShowHistoryType() {
        return this.showHistoryType;
    }

    public CreateScenegroupRequest setSubadminIds(String subadminIds) {
        this.subadminIds = subadminIds;
        return this;
    }
    public String getSubadminIds() {
        return this.subadminIds;
    }

    public CreateScenegroupRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateScenegroupRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateScenegroupRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public CreateScenegroupRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateScenegroupRequest setValidationType(Long validationType) {
        this.validationType = validationType;
        return this;
    }
    public Long getValidationType() {
        return this.validationType;
    }

}
