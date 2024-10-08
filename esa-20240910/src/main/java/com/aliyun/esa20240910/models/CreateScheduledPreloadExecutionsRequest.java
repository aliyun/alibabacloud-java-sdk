// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadExecutionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Executions")
    public java.util.List<CreateScheduledPreloadExecutionsRequestExecutions> executions;

    /**
     * <strong>example:</strong>
     * <p>CreateScheduledPreloadExecutions</p>
     */
    @NameInMap("Id")
    public String id;

    public static CreateScheduledPreloadExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadExecutionsRequest self = new CreateScheduledPreloadExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadExecutionsRequest setExecutions(java.util.List<CreateScheduledPreloadExecutionsRequestExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<CreateScheduledPreloadExecutionsRequestExecutions> getExecutions() {
        return this.executions;
    }

    public CreateScheduledPreloadExecutionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public static class CreateScheduledPreloadExecutionsRequestExecutions extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SliceLen")
        public Integer sliceLen;

        @NameInMap("StartTime")
        public String startTime;

        public static CreateScheduledPreloadExecutionsRequestExecutions build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledPreloadExecutionsRequestExecutions self = new CreateScheduledPreloadExecutionsRequestExecutions();
            return TeaModel.build(map, self);
        }

        public CreateScheduledPreloadExecutionsRequestExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScheduledPreloadExecutionsRequestExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateScheduledPreloadExecutionsRequestExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public CreateScheduledPreloadExecutionsRequestExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
