// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowConstantsRequest extends TeaModel {
    @NameInMap("DagConstants")
    public java.util.List<UpdateTaskFlowConstantsRequestDagConstants> dagConstants;

    @NameInMap("DagId")
    public Long dagId;

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
        @NameInMap("Key")
        public String key;

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
