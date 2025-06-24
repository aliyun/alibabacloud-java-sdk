// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListChatGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>8613800**</p>
         */
        @NameInMap("BusinessNumber")
        public String businessNumber;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>EA30d***</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("GroupStatus")
        public String groupStatus;

        /**
         * <strong>example:</strong>
         * <p><a href="https://chat.whatsapp.com/">https://chat.whatsapp.com/</a>***</p>
         */
        @NameInMap("InviteLink")
        public String inviteLink;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/png.jpg">https://aliyun.com/png.jpg</a></p>
         */
        @NameInMap("ProfilePictureFile")
        public String profilePictureFile;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Subject")
        public String subject;

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

        public ListChatGroupResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChatGroupResponseBodyDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListChatGroupResponseBodyDataList setGroupStatus(String groupStatus) {
            this.groupStatus = groupStatus;
            return this;
        }
        public String getGroupStatus() {
            return this.groupStatus;
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

    }

    public static class ListChatGroupResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListChatGroupResponseBodyDataList> list;

        /**
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
