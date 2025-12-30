// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBizMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteBizMetricCommand")
    public DeleteBizMetricRequestDeleteBizMetricCommand deleteBizMetricCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteBizMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizMetricRequest self = new DeleteBizMetricRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBizMetricRequest setDeleteBizMetricCommand(DeleteBizMetricRequestDeleteBizMetricCommand deleteBizMetricCommand) {
        this.deleteBizMetricCommand = deleteBizMetricCommand;
        return this;
    }
    public DeleteBizMetricRequestDeleteBizMetricCommand getDeleteBizMetricCommand() {
        return this.deleteBizMetricCommand;
    }

    public DeleteBizMetricRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteBizMetricRequestDeleteBizMetricCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric1</p>
         */
        @NameInMap("Name")
        public String name;

        public static DeleteBizMetricRequestDeleteBizMetricCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteBizMetricRequestDeleteBizMetricCommand self = new DeleteBizMetricRequestDeleteBizMetricCommand();
            return TeaModel.build(map, self);
        }

        public DeleteBizMetricRequestDeleteBizMetricCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
