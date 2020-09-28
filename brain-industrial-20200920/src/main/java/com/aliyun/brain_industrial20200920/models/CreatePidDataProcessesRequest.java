// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidDataProcessesRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    @NameInMap("DataProcessTime")
    @Validation(required = true)
    public java.util.List<CreatePidDataProcessesRequestDataProcessTime> dataProcessTime;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CreatePidDataProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidDataProcessesRequest self = new CreatePidDataProcessesRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidDataProcessesRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public CreatePidDataProcessesRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

    public CreatePidDataProcessesRequest setDataProcessTime(java.util.List<CreatePidDataProcessesRequestDataProcessTime> dataProcessTime) {
        this.dataProcessTime = dataProcessTime;
        return this;
    }
    public java.util.List<CreatePidDataProcessesRequestDataProcessTime> getDataProcessTime() {
        return this.dataProcessTime;
    }

    public CreatePidDataProcessesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreatePidDataProcessesRequestDataProcessTime extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static CreatePidDataProcessesRequestDataProcessTime build(java.util.Map<String, ?> map) throws Exception {
            CreatePidDataProcessesRequestDataProcessTime self = new CreatePidDataProcessesRequestDataProcessTime();
            return TeaModel.build(map, self);
        }

        public CreatePidDataProcessesRequestDataProcessTime setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreatePidDataProcessesRequestDataProcessTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

}
