// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAggTaskGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a54136014dc386a92c83a6ef1e97ff22</p>
     */
    @NameInMap("aggTaskGroupConfigHash")
    public String aggTaskGroupConfigHash;

    /**
     * <strong>example:</strong>
     * <p>aggTaskGroup-5fb2c3ade63a4709bcb059d13493b7b8</p>
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
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rw-083e17834e279f8c627fe91a2d72</p>
     */
    @NameInMap("sourcePrometheusId")
    public String sourcePrometheusId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateAggTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggTaskGroupResponseBody self = new UpdateAggTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAggTaskGroupResponseBody setAggTaskGroupConfigHash(String aggTaskGroupConfigHash) {
        this.aggTaskGroupConfigHash = aggTaskGroupConfigHash;
        return this;
    }
    public String getAggTaskGroupConfigHash() {
        return this.aggTaskGroupConfigHash;
    }

    public UpdateAggTaskGroupResponseBody setAggTaskGroupId(String aggTaskGroupId) {
        this.aggTaskGroupId = aggTaskGroupId;
        return this;
    }
    public String getAggTaskGroupId() {
        return this.aggTaskGroupId;
    }

    public UpdateAggTaskGroupResponseBody setAggTaskGroupName(String aggTaskGroupName) {
        this.aggTaskGroupName = aggTaskGroupName;
        return this;
    }
    public String getAggTaskGroupName() {
        return this.aggTaskGroupName;
    }

    public UpdateAggTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAggTaskGroupResponseBody setSourcePrometheusId(String sourcePrometheusId) {
        this.sourcePrometheusId = sourcePrometheusId;
        return this;
    }
    public String getSourcePrometheusId() {
        return this.sourcePrometheusId;
    }

    public UpdateAggTaskGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
