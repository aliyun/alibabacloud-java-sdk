// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckToggleRequest extends TeaModel {
    /**
     * <p>The task scheduling parameter list. Each item must contain id, lastBatchId, and isScheduled.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("params")
    public java.util.List<ExecDataCheckToggleRequestParams> params;

    public static ExecDataCheckToggleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckToggleRequest self = new ExecDataCheckToggleRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckToggleRequest setParams(java.util.List<ExecDataCheckToggleRequestParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<ExecDataCheckToggleRequestParams> getParams() {
        return this.params;
    }

    public static class ExecDataCheckToggleRequestParams extends TeaModel {
        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Specifies whether to enable scheduling. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isScheduled")
        public Integer isScheduled;

        /**
         * <p>The most recent batch number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("lastBatchId")
        public Long lastBatchId;

        public static ExecDataCheckToggleRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ExecDataCheckToggleRequestParams self = new ExecDataCheckToggleRequestParams();
            return TeaModel.build(map, self);
        }

        public ExecDataCheckToggleRequestParams setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecDataCheckToggleRequestParams setIsScheduled(Integer isScheduled) {
            this.isScheduled = isScheduled;
            return this;
        }
        public Integer getIsScheduled() {
            return this.isScheduled;
        }

        public ExecDataCheckToggleRequestParams setLastBatchId(Long lastBatchId) {
            this.lastBatchId = lastBatchId;
            return this;
        }
        public Long getLastBatchId() {
            return this.lastBatchId;
        }

    }

}
