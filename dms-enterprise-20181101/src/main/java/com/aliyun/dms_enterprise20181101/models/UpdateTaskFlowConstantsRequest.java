// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsRequest extends TeaModel {
    /**
     * <p>The key value of a constant for the task flow.</p>
     */
    @NameInMap("DagConstants")
    public java.util.List<UpdateTaskFlowConstantsRequestDagConstants> dagConstants;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The constants for the task flow.</p>
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
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
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
