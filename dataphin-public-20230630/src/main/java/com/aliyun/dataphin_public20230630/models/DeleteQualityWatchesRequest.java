// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualityWatchesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteQualityWatchesRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteQualityWatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityWatchesRequest self = new DeleteQualityWatchesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityWatchesRequest setDeleteCommand(DeleteQualityWatchesRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteQualityWatchesRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteQualityWatchesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteQualityWatchesRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("WatchIdList")
        public java.util.List<Long> watchIdList;

        public static DeleteQualityWatchesRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteQualityWatchesRequestDeleteCommand self = new DeleteQualityWatchesRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteQualityWatchesRequestDeleteCommand setWatchIdList(java.util.List<Long> watchIdList) {
            this.watchIdList = watchIdList;
            return this;
        }
        public java.util.List<Long> getWatchIdList() {
            return this.watchIdList;
        }

    }

}
