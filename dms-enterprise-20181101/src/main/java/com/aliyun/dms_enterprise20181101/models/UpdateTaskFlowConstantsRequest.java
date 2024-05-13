// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsRequest extends TeaModel {
    /**
     * <p>The constants for the task flow.</p>
     */
    @NameInMap("DagConstants")
    public java.util.List<UpdateTaskFlowConstantsRequestDagConstants> dagConstants;

    /**
     * <p>The ID of the task flow. You can call the [ListTaskFlow](https://help.aliyun.com/document_detail/424565.html) or [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to query the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateTaskFlowConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowConstantsRequest self = new UpdateTaskFlowConstantsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowConstantsRequest setDagConstants(java.util.List<UpdateTaskFlowConstantsRequestDagConstants> dagConstants) {
        this.dagConstants = dagConstants;
        return this;
    }
    public java.util.List<UpdateTaskFlowConstantsRequestDagConstants> getDagConstants() {
        return this.dagConstants;
    }

    public UpdateTaskFlowConstantsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowConstantsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class UpdateTaskFlowConstantsRequestDagConstants extends TeaModel {
        /**
         * <p>The key name of a constant for the task flow.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The key value of a constant for the task flow.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateTaskFlowConstantsRequestDagConstants build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskFlowConstantsRequestDagConstants self = new UpdateTaskFlowConstantsRequestDagConstants();
            return TeaModel.build(map, self);
        }

        public UpdateTaskFlowConstantsRequestDagConstants setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateTaskFlowConstantsRequestDagConstants setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
