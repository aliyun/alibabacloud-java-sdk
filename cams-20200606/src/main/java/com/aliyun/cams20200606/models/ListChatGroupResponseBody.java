// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupResponseBody extends TeaModel {
    /**
     * <p>Details about the access denied error.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li><p><code>OK</code>: The request succeeded.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListChatGroupResponseBodyData data;

    /**
     * <p>The response message. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListChatGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatGroupResponseBody self = new ListChatGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListChatGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatGroupResponseBody setData(ListChatGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChatGroupResponseBodyData getData() {
        return this.data;
    }

    public ListChatGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChatGroupResponseBodyDataList extends TeaModel {
        /**
         * <p>The business number.</p>
         * 
         * <strong>example:</strong>
         * <p>8613800**</p>
         */
        @NameInMap("BusinessNumber")
        public String businessNumber;

        /**
         * <p>The role of the bot in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("BusinessRole")
        public String businessRole;

        /**
         * <p>The group description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time the group was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
        @NameInMap("GmtModifier")
        public Long gmtModifier;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EA30d***</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The group link.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("GroupLink")
        public String groupLink;

        /**
         * <p>The group status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("GroupStatus")
        public String groupStatus;

        /**
         * <p>The group type.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The group invitation link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://chat.whatsapp.com/">https://chat.whatsapp.com/</a>***</p>
         */
        @NameInMap("InviteLink")
        public String inviteLink;

        /**
         * <p>The group\&quot;s profile picture.</p>
         */
        @NameInMap("ProfilePictureFile")
        public String profilePictureFile;

        /**
         * <p>The group subject.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test subject</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>The total number of group participants.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("TotalParticipantCount")
        public Long totalParticipantCount;

        public static ListChatGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListChatGroupResponseBodyDataList self = new ListChatGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListChatGroupResponseBodyDataList setBusinessNumber(String businessNumber) {
            this.businessNumber = businessNumber;
            return this;
        }
        public String getBusinessNumber() {
            return this.businessNumber;
        }

        public ListChatGroupResponseBodyDataList setBusinessRole(String businessRole) {
            this.businessRole = businessRole;
            return this;
        }
        public String getBusinessRole() {
            return this.businessRole;
        }

        public ListChatGroupResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChatGroupResponseBodyDataList setGmtModifier(Long gmtModifier) {
            this.gmtModifier = gmtModifier;
            return this;
        }
        public Long getGmtModifier() {
            return this.gmtModifier;
        }

        public ListChatGroupResponseBodyDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListChatGroupResponseBodyDataList setGroupLink(String groupLink) {
            this.groupLink = groupLink;
            return this;
        }
        public String getGroupLink() {
            return this.groupLink;
        }

        public ListChatGroupResponseBodyDataList setGroupStatus(String groupStatus) {
            this.groupStatus = groupStatus;
            return this;
        }
        public String getGroupStatus() {
            return this.groupStatus;
        }

        public ListChatGroupResponseBodyDataList setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListChatGroupResponseBodyDataList setInviteLink(String inviteLink) {
            this.inviteLink = inviteLink;
            return this;
        }
        public String getInviteLink() {
            return this.inviteLink;
        }

        public ListChatGroupResponseBodyDataList setProfilePictureFile(String profilePictureFile) {
            this.profilePictureFile = profilePictureFile;
            return this;
        }
        public String getProfilePictureFile() {
            return this.profilePictureFile;
        }

        public ListChatGroupResponseBodyDataList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ListChatGroupResponseBodyDataList setTotalParticipantCount(Long totalParticipantCount) {
            this.totalParticipantCount = totalParticipantCount;
            return this;
        }
        public Long getTotalParticipantCount() {
            return this.totalParticipantCount;
        }

    }

    public static class ListChatGroupResponseBodyData extends TeaModel {
        /**
         * <p>The group list.</p>
         */
        @NameInMap("List")
        public java.util.List<ListChatGroupResponseBodyDataList> list;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListChatGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChatGroupResponseBodyData self = new ListChatGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChatGroupResponseBodyData setList(java.util.List<ListChatGroupResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListChatGroupResponseBodyDataList> getList() {
            return this.list;
        }

        public ListChatGroupResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
