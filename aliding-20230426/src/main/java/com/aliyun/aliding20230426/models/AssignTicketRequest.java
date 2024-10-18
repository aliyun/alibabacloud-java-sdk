// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AssignTicketRequest extends TeaModel {
    @NameInMap("Notify")
    public AssignTicketRequestNotify notify;

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

    @NameInMap("ProcessorUserIds")
    public java.util.List<String> processorUserIds;

    @NameInMap("TenantContext")
    public AssignTicketRequestTenantContext tenantContext;

    @NameInMap("TicketMemo")
    public AssignTicketRequestTicketMemo ticketMemo;

    public static AssignTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignTicketRequest self = new AssignTicketRequest();
        return TeaModel.build(map, self);
    }

    public AssignTicketRequest setNotify(AssignTicketRequestNotify notify) {
        this.notify = notify;
        return this;
    }
    public AssignTicketRequestNotify getNotify() {
        return this.notify;
    }

    public AssignTicketRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public AssignTicketRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public AssignTicketRequest setProcessorUserIds(java.util.List<String> processorUserIds) {
        this.processorUserIds = processorUserIds;
        return this;
    }
    public java.util.List<String> getProcessorUserIds() {
        return this.processorUserIds;
    }

    public AssignTicketRequest setTenantContext(AssignTicketRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AssignTicketRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public AssignTicketRequest setTicketMemo(AssignTicketRequestTicketMemo ticketMemo) {
        this.ticketMemo = ticketMemo;
        return this;
    }
    public AssignTicketRequestTicketMemo getTicketMemo() {
        return this.ticketMemo;
    }

    public static class AssignTicketRequestNotify extends TeaModel {
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

        public static AssignTicketRequestNotify build(java.util.Map<String, ?> map) throws Exception {
            AssignTicketRequestNotify self = new AssignTicketRequestNotify();
            return TeaModel.build(map, self);
        }

        public AssignTicketRequestNotify setGroupNoticeReceiverUserIds(java.util.List<String> groupNoticeReceiverUserIds) {
            this.groupNoticeReceiverUserIds = groupNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getGroupNoticeReceiverUserIds() {
            return this.groupNoticeReceiverUserIds;
        }

        public AssignTicketRequestNotify setNoticeAllGroupMember(Boolean noticeAllGroupMember) {
            this.noticeAllGroupMember = noticeAllGroupMember;
            return this;
        }
        public Boolean getNoticeAllGroupMember() {
            return this.noticeAllGroupMember;
        }

        public AssignTicketRequestNotify setWorkNoticeReceiverUserIds(java.util.List<String> workNoticeReceiverUserIds) {
            this.workNoticeReceiverUserIds = workNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getWorkNoticeReceiverUserIds() {
            return this.workNoticeReceiverUserIds;
        }

    }

    public static class AssignTicketRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AssignTicketRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AssignTicketRequestTenantContext self = new AssignTicketRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AssignTicketRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class AssignTicketRequestTicketMemoAttachments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ticket/image/44708069/43003/e27aec4499.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>wahaha.txt</p>
         */
        @NameInMap("Key")
        public String key;

        public static AssignTicketRequestTicketMemoAttachments build(java.util.Map<String, ?> map) throws Exception {
            AssignTicketRequestTicketMemoAttachments self = new AssignTicketRequestTicketMemoAttachments();
            return TeaModel.build(map, self);
        }

        public AssignTicketRequestTicketMemoAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public AssignTicketRequestTicketMemoAttachments setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class AssignTicketRequestTicketMemo extends TeaModel {
        @NameInMap("Attachments")
        public java.util.List<AssignTicketRequestTicketMemoAttachments> attachments;

        @NameInMap("Memo")
        public String memo;

        public static AssignTicketRequestTicketMemo build(java.util.Map<String, ?> map) throws Exception {
            AssignTicketRequestTicketMemo self = new AssignTicketRequestTicketMemo();
            return TeaModel.build(map, self);
        }

        public AssignTicketRequestTicketMemo setAttachments(java.util.List<AssignTicketRequestTicketMemoAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<AssignTicketRequestTicketMemoAttachments> getAttachments() {
            return this.attachments;
        }

        public AssignTicketRequestTicketMemo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

    }

}
