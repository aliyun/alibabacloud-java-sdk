// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OnlineBizEntityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OnlineCommand")
    public OnlineBizEntityRequestOnlineCommand onlineCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OnlineBizEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineBizEntityRequest self = new OnlineBizEntityRequest();
        return TeaModel.build(map, self);
    }

    public OnlineBizEntityRequest setOnlineCommand(OnlineBizEntityRequestOnlineCommand onlineCommand) {
        this.onlineCommand = onlineCommand;
        return this;
    }
    public OnlineBizEntityRequestOnlineCommand getOnlineCommand() {
        return this.onlineCommand;
    }

    public OnlineBizEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class OnlineBizEntityRequestOnlineCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6798087749072704</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

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
         * <p>101001201</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static OnlineBizEntityRequestOnlineCommand build(java.util.Map<String, ?> map) throws Exception {
            OnlineBizEntityRequestOnlineCommand self = new OnlineBizEntityRequestOnlineCommand();
            return TeaModel.build(map, self);
        }

        public OnlineBizEntityRequestOnlineCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public OnlineBizEntityRequestOnlineCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public OnlineBizEntityRequestOnlineCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OnlineBizEntityRequestOnlineCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
