// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineStandardRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public OfflineStandardRequestOfflineCommand offlineCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OfflineStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineStandardRequest self = new OfflineStandardRequest();
        return TeaModel.build(map, self);
    }

    public OfflineStandardRequest setOfflineCommand(OfflineStandardRequestOfflineCommand offlineCommand) {
        this.offlineCommand = offlineCommand;
        return this;
    }
    public OfflineStandardRequestOfflineCommand getOfflineCommand() {
        return this.offlineCommand;
    }

    public OfflineStandardRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class OfflineStandardRequestOfflineCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        public static OfflineStandardRequestOfflineCommand build(java.util.Map<String, ?> map) throws Exception {
            OfflineStandardRequestOfflineCommand self = new OfflineStandardRequestOfflineCommand();
            return TeaModel.build(map, self);
        }

        public OfflineStandardRequestOfflineCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public OfflineStandardRequestOfflineCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
