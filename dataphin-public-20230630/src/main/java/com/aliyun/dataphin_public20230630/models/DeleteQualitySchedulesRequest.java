// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualitySchedulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteQualitySchedulesRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteQualitySchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualitySchedulesRequest self = new DeleteQualitySchedulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualitySchedulesRequest setDeleteCommand(DeleteQualitySchedulesRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteQualitySchedulesRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteQualitySchedulesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteQualitySchedulesRequestDeleteCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScheduleIdList")
        public java.util.List<Long> scheduleIdList;

        public static DeleteQualitySchedulesRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteQualitySchedulesRequestDeleteCommand self = new DeleteQualitySchedulesRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteQualitySchedulesRequestDeleteCommand setScheduleIdList(java.util.List<Long> scheduleIdList) {
            this.scheduleIdList = scheduleIdList;
            return this;
        }
        public java.util.List<Long> getScheduleIdList() {
            return this.scheduleIdList;
        }

    }

}
