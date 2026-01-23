// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateQualityWatchSwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateQualityWatchSwitchRequestUpdateCommand updateCommand;

    public static UpdateQualityWatchSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityWatchSwitchRequest self = new UpdateQualityWatchSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityWatchSwitchRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateQualityWatchSwitchRequest setUpdateCommand(UpdateQualityWatchSwitchRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateQualityWatchSwitchRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateQualityWatchSwitchRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Open")
        public Boolean open;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("WatchIdList")
        public java.util.List<Long> watchIdList;

        public static UpdateQualityWatchSwitchRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateQualityWatchSwitchRequestUpdateCommand self = new UpdateQualityWatchSwitchRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateQualityWatchSwitchRequestUpdateCommand setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public UpdateQualityWatchSwitchRequestUpdateCommand setWatchIdList(java.util.List<Long> watchIdList) {
            this.watchIdList = watchIdList;
            return this;
        }
        public java.util.List<Long> getWatchIdList() {
            return this.watchIdList;
        }

    }

}
