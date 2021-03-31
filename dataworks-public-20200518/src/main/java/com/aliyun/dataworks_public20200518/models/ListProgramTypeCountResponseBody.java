// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramTypeAndCounts")
    public java.util.List<ListProgramTypeCountResponseBodyProgramTypeAndCounts> programTypeAndCounts;

    public static ListProgramTypeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountResponseBody self = new ListProgramTypeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProgramTypeCountResponseBody setProgramTypeAndCounts(java.util.List<ListProgramTypeCountResponseBodyProgramTypeAndCounts> programTypeAndCounts) {
        this.programTypeAndCounts = programTypeAndCounts;
        return this;
    }
    public java.util.List<ListProgramTypeCountResponseBodyProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    public static class ListProgramTypeCountResponseBodyProgramTypeAndCounts extends TeaModel {
        @NameInMap("ProgramType")
        public String programType;

        @NameInMap("Count")
        public Integer count;

        public static ListProgramTypeCountResponseBodyProgramTypeAndCounts build(java.util.Map<String, ?> map) throws Exception {
            ListProgramTypeCountResponseBodyProgramTypeAndCounts self = new ListProgramTypeCountResponseBodyProgramTypeAndCounts();
            return TeaModel.build(map, self);
        }

        public ListProgramTypeCountResponseBodyProgramTypeAndCounts setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListProgramTypeCountResponseBodyProgramTypeAndCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
