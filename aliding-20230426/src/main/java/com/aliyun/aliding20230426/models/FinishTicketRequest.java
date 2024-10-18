// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class FinishTicketRequest extends TeaModel {
    @NameInMap("Notify")
    public FinishTicketRequestNotify notify;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eKWh3xxxxiE</p>
     */
    @NameInMap("OpenTeamId")
    public String openTeamId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dq9hP8Sk2v6vQxxxxiE</p>
     */
    @NameInMap("OpenTicketId")
    public String openTicketId;

    @NameInMap("TenantContext")
    public FinishTicketRequestTenantContext tenantContext;

    @NameInMap("TicketMemo")
    public FinishTicketRequestTicketMemo ticketMemo;

    public static FinishTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishTicketRequest self = new FinishTicketRequest();
        return TeaModel.build(map, self);
    }

    public FinishTicketRequest setNotify(FinishTicketRequestNotify notify) {
        this.notify = notify;
        return this;
    }
    public FinishTicketRequestNotify getNotify() {
        return this.notify;
    }

    public FinishTicketRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public FinishTicketRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public FinishTicketRequest setTenantContext(FinishTicketRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public FinishTicketRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public FinishTicketRequest setTicketMemo(FinishTicketRequestTicketMemo ticketMemo) {
        this.ticketMemo = ticketMemo;
        return this;
    }
    public FinishTicketRequestTicketMemo getTicketMemo() {
        return this.ticketMemo;
    }

    public static class FinishTicketRequestNotify extends TeaModel {
        @NameInMap("GroupNoticeReceiverUserIds")
        public java.util.List<String> groupNoticeReceiverUserIds;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NoticeAllGroupMember")
        public Boolean noticeAllGroupMember;

        @NameInMap("WorkNoticeReceiverUserIds")
        public java.util.List<String> workNoticeReceiverUserIds;

        public static FinishTicketRequestNotify build(java.util.Map<String, ?> map) throws Exception {
            FinishTicketRequestNotify self = new FinishTicketRequestNotify();
            return TeaModel.build(map, self);
        }

        public FinishTicketRequestNotify setGroupNoticeReceiverUserIds(java.util.List<String> groupNoticeReceiverUserIds) {
            this.groupNoticeReceiverUserIds = groupNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getGroupNoticeReceiverUserIds() {
            return this.groupNoticeReceiverUserIds;
        }

        public FinishTicketRequestNotify setNoticeAllGroupMember(Boolean noticeAllGroupMember) {
            this.noticeAllGroupMember = noticeAllGroupMember;
            return this;
        }
        public Boolean getNoticeAllGroupMember() {
            return this.noticeAllGroupMember;
        }

        public FinishTicketRequestNotify setWorkNoticeReceiverUserIds(java.util.List<String> workNoticeReceiverUserIds) {
            this.workNoticeReceiverUserIds = workNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getWorkNoticeReceiverUserIds() {
            return this.workNoticeReceiverUserIds;
        }

    }

    public static class FinishTicketRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static FinishTicketRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            FinishTicketRequestTenantContext self = new FinishTicketRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public FinishTicketRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class FinishTicketRequestTicketMemoAttachments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>wahaha.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>ticket/image/44xxxx9/43003/e27xxxx1640499.txt</p>
         */
        @NameInMap("Key")
        public String key;

        public static FinishTicketRequestTicketMemoAttachments build(java.util.Map<String, ?> map) throws Exception {
            FinishTicketRequestTicketMemoAttachments self = new FinishTicketRequestTicketMemoAttachments();
            return TeaModel.build(map, self);
        }

        public FinishTicketRequestTicketMemoAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public FinishTicketRequestTicketMemoAttachments setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class FinishTicketRequestTicketMemo extends TeaModel {
        @NameInMap("Attachments")
        public java.util.List<FinishTicketRequestTicketMemoAttachments> attachments;

        @NameInMap("Memo")
        public String memo;

        public static FinishTicketRequestTicketMemo build(java.util.Map<String, ?> map) throws Exception {
            FinishTicketRequestTicketMemo self = new FinishTicketRequestTicketMemo();
            return TeaModel.build(map, self);
        }

        public FinishTicketRequestTicketMemo setAttachments(java.util.List<FinishTicketRequestTicketMemoAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<FinishTicketRequestTicketMemoAttachments> getAttachments() {
            return this.attachments;
        }

        public FinishTicketRequestTicketMemo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

    }

}
