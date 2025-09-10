// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAggTaskGroupStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a54136014dc386a92c83a6ef1e97ff22</p>
     */
    @NameInMap("aggTaskGroupConfigHash")
    public String aggTaskGroupConfigHash;

    /**
     * <strong>example:</strong>
     * <p>aggTaskGroup-xxx</p>
     */
    @NameInMap("aggTaskGroupId")
    public String aggTaskGroupId;

    /**
     * <strong>example:</strong>
     * <p>pipeline-aggtask-group</p>
     */
    @NameInMap("aggTaskGroupName")
    public String aggTaskGroupName;

    /**
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rw-xxx</p>
     */
    @NameInMap("sourcePrometheusId")
    public String sourcePrometheusId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateAggTaskGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggTaskGroupStatusResponseBody self = new UpdateAggTaskGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggTaskGroupStatusResponseBody setAggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
        this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
        return this;
    }
    public String getAggTaskGroupConfigHash() {
        return this.aggTaskGroupConfigHash;
    }

    public UpdateAggTaskGroupStatusResponseBody setAggTaskGroupId(String aggTaskGroupId) {
        this.aggTaskGroupId = aggTaskGroupId;
        return this;
    }
    public String getAggTaskGroupId() {
        return this.aggTaskGroupId;
    }

    public UpdateAggTaskGroupStatusResponseBody setAggTaskGroupName(String aggTaskGroupName) {
        this.aggTaskGroupName = aggTaskGroupName;
        return this;
    }
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    public UpdateAggTaskGroupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAggTaskGroupStatusResponseBody setSourcePrometheusId(String sourcePrometheusId) {
        this.sourcePrometheusId = sourcePrometheusId;
        return this;
    }
    public String getSourcePrometheusId() {
        return this.sourcePrometheusId;
    }

    public UpdateAggTaskGroupStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
