// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CalcPlanJsonResourceResponseBody extends TeaModel {
    @NameInMap("PlanJsonResource")
    public CalcPlanJsonResourceResponseBodyPlanJsonResource planJsonResource;

    @NameInMap("RequestId")
    public String requestId;

    public static CalcPlanJsonResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalcPlanJsonResourceResponseBody self = new CalcPlanJsonResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CalcPlanJsonResourceResponseBody setPlanJsonResource(CalcPlanJsonResourceResponseBodyPlanJsonResource planJsonResource) {
        this.planJsonResource = planJsonResource;
        return this;
    }
    public CalcPlanJsonResourceResponseBodyPlanJsonResource getPlanJsonResource() {
        return this.planJsonResource;
    }

    public CalcPlanJsonResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CalcPlanJsonResourceResponseBodyPlanJsonResource extends TeaModel {
        @NameInMap("Cores")
        public Float cores;

        @NameInMap("MemoryGB")
        public Float memoryGB;

        public static CalcPlanJsonResourceResponseBodyPlanJsonResource build(java.util.Map<String, ?> map) throws Exception {
            CalcPlanJsonResourceResponseBodyPlanJsonResource self = new CalcPlanJsonResourceResponseBodyPlanJsonResource();
            return TeaModel.build(map, self);
        }

        public CalcPlanJsonResourceResponseBodyPlanJsonResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public CalcPlanJsonResourceResponseBodyPlanJsonResource setMemoryGB(Float memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Float getMemoryGB() {
            return this.memoryGB;
        }

    }

}
