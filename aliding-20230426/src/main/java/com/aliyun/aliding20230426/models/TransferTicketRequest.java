// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class TransferTicketRequest extends TeaModel {
    @NameInMap("Notify")
    public TransferTicketRequestNotify notify;

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
    public TransferTicketRequestTenantContext tenantContext;

    @NameInMap("TicketMemo")
    public TransferTicketRequestTicketMemo ticketMemo;

    public static TransferTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferTicketRequest self = new TransferTicketRequest();
        return TeaModel.build(map, self);
    }

    public TransferTicketRequest setNotify(TransferTicketRequestNotify notify) {
        this.notify = notify;
        return this;
    }
    public TransferTicketRequestNotify getNotify() {
        return this.notify;
    }

    public TransferTicketRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public TransferTicketRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public TransferTicketRequest setProcessorUserIds(java.util.List<String> processorUserIds) {
        this.processorUserIds = processorUserIds;
        return this;
    }
    public java.util.List<String> getProcessorUserIds() {
        return this.processorUserIds;
    }

    public TransferTicketRequest setTenantContext(TransferTicketRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public TransferTicketRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public TransferTicketRequest setTicketMemo(TransferTicketRequestTicketMemo ticketMemo) {
        this.ticketMemo = ticketMemo;
        return this;
    }
    public TransferTicketRequestTicketMemo getTicketMemo() {
        return this.ticketMemo;
    }

    public static class TransferTicketRequestNotify extends TeaModel {
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

        public static TransferTicketRequestNotify build(java.util.Map<String, ?> map) throws Exception {
            TransferTicketRequestNotify self = new TransferTicketRequestNotify();
            return TeaModel.build(map, self);
        }

        public TransferTicketRequestNotify setGroupNoticeReceiverUserIds(java.util.List<String> groupNoticeReceiverUserIds) {
            this.groupNoticeReceiverUserIds = groupNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getGroupNoticeReceiverUserIds() {
            return this.groupNoticeReceiverUserIds;
        }

        public TransferTicketRequestNotify setNoticeAllGroupMember(Boolean noticeAllGroupMember) {
            this.noticeAllGroupMember = noticeAllGroupMember;
            return this;
        }
        public Boolean getNoticeAllGroupMember() {
            return this.noticeAllGroupMember;
        }

        public TransferTicketRequestNotify setWorkNoticeReceiverUserIds(java.util.List<String> workNoticeReceiverUserIds) {
            this.workNoticeReceiverUserIds = workNoticeReceiverUserIds;
            return this;
        }
        public java.util.List<String> getWorkNoticeReceiverUserIds() {
            return this.workNoticeReceiverUserIds;
        }

    }

    public static class TransferTicketRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static TransferTicketRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            TransferTicketRequestTenantContext self = new TransferTicketRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public TransferTicketRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class TransferTicketRequestTicketMemoAttachments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auto-test-1727143229007.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        public static TransferTicketRequestTicketMemoAttachments build(java.util.Map<String, ?> map) throws Exception {
            TransferTicketRequestTicketMemoAttachments self = new TransferTicketRequestTicketMemoAttachments();
            return TeaModel.build(map, self);
        }

        public TransferTicketRequestTicketMemoAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public TransferTicketRequestTicketMemoAttachments setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class TransferTicketRequestTicketMemo extends TeaModel {
        @NameInMap("Attachments")
        public java.util.List<TransferTicketRequestTicketMemoAttachments> attachments;

        @NameInMap("Memo")
        public String memo;

        public static TransferTicketRequestTicketMemo build(java.util.Map<String, ?> map) throws Exception {
            TransferTicketRequestTicketMemo self = new TransferTicketRequestTicketMemo();
            return TeaModel.build(map, self);
        }

        public TransferTicketRequestTicketMemo setAttachments(java.util.List<TransferTicketRequestTicketMemoAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<TransferTicketRequestTicketMemoAttachments> getAttachments() {
            return this.attachments;
        }

        public TransferTicketRequestTicketMemo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

    }

}
