// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddTicketMemoRequest extends TeaModel {
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
    public AddTicketMemoRequestTenantContext tenantContext;

    @NameInMap("TicketMemo")
    public AddTicketMemoRequestTicketMemo ticketMemo;

    public static AddTicketMemoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTicketMemoRequest self = new AddTicketMemoRequest();
        return TeaModel.build(map, self);
    }

    public AddTicketMemoRequest setOpenTeamId(String openTeamId) {
        this.openTeamId = openTeamId;
        return this;
    }
    public String getOpenTeamId() {
        return this.openTeamId;
    }

    public AddTicketMemoRequest setOpenTicketId(String openTicketId) {
        this.openTicketId = openTicketId;
        return this;
    }
    public String getOpenTicketId() {
        return this.openTicketId;
    }

    public AddTicketMemoRequest setTenantContext(AddTicketMemoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddTicketMemoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public AddTicketMemoRequest setTicketMemo(AddTicketMemoRequestTicketMemo ticketMemo) {
        this.ticketMemo = ticketMemo;
        return this;
    }
    public AddTicketMemoRequestTicketMemo getTicketMemo() {
        return this.ticketMemo;
    }

    public static class AddTicketMemoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AddTicketMemoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddTicketMemoRequestTenantContext self = new AddTicketMemoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddTicketMemoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class AddTicketMemoRequestTicketMemoAttachments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;ticket/image/44xxxx9/43003/e27204b38xxxx1640499.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>wahaha.txt</p>
         */
        @NameInMap("Key")
        public String key;

        public static AddTicketMemoRequestTicketMemoAttachments build(java.util.Map<String, ?> map) throws Exception {
            AddTicketMemoRequestTicketMemoAttachments self = new AddTicketMemoRequestTicketMemoAttachments();
            return TeaModel.build(map, self);
        }

        public AddTicketMemoRequestTicketMemoAttachments setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public AddTicketMemoRequestTicketMemoAttachments setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class AddTicketMemoRequestTicketMemo extends TeaModel {
        @NameInMap("Attachments")
        public java.util.List<AddTicketMemoRequestTicketMemoAttachments> attachments;

        @NameInMap("Memo")
        public String memo;

        public static AddTicketMemoRequestTicketMemo build(java.util.Map<String, ?> map) throws Exception {
            AddTicketMemoRequestTicketMemo self = new AddTicketMemoRequestTicketMemo();
            return TeaModel.build(map, self);
        }

        public AddTicketMemoRequestTicketMemo setAttachments(java.util.List<AddTicketMemoRequestTicketMemoAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<AddTicketMemoRequestTicketMemoAttachments> getAttachments() {
            return this.attachments;
        }

        public AddTicketMemoRequestTicketMemo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

    }

}
