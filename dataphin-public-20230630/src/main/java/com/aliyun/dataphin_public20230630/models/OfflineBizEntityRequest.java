// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineBizEntityRequest extends TeaModel {
    /**
     * <p>The offline request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public OfflineBizEntityRequestOfflineCommand offlineCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static OfflineBizEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineBizEntityRequest self = new OfflineBizEntityRequest();
        return TeaModel.build(map, self);
    }

    public OfflineBizEntityRequest setOfflineCommand(OfflineBizEntityRequestOfflineCommand offlineCommand) {
        this.offlineCommand = offlineCommand;
        return this;
    }
    public OfflineBizEntityRequestOfflineCommand getOfflineCommand() {
        return this.offlineCommand;
    }

    public OfflineBizEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public OfflineBizEntityRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class OfflineBizEntityRequestOfflineCommand extends TeaModel {
        /**
         * <p>The ID of the business unit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6798087749072704</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The comment for the offline operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the business entity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101001201</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the business entity. For more information, see the create business entity operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static OfflineBizEntityRequestOfflineCommand build(java.util.Map<String, ?> map) throws Exception {
            OfflineBizEntityRequestOfflineCommand self = new OfflineBizEntityRequestOfflineCommand();
            return TeaModel.build(map, self);
        }

        public OfflineBizEntityRequestOfflineCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public OfflineBizEntityRequestOfflineCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public OfflineBizEntityRequestOfflineCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OfflineBizEntityRequestOfflineCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
