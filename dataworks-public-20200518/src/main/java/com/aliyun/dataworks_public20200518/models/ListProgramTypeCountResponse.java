// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProgramTypeAndCounts")
    @Validation(required = true)
    public java.util.List<ListProgramTypeCountResponseProgramTypeAndCounts> programTypeAndCounts;

    public static ListProgramTypeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountResponse self = new ListProgramTypeCountResponse();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProgramTypeCountResponse setProgramTypeAndCounts(java.util.List<ListProgramTypeCountResponseProgramTypeAndCounts> programTypeAndCounts) {
        this.programTypeAndCounts = programTypeAndCounts;
        return this;
    }
    public java.util.List<ListProgramTypeCountResponseProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    public static class ListProgramTypeCountResponseProgramTypeAndCounts extends TeaModel {
        @NameInMap("ProgramType")
        @Validation(required = true)
        public String programType;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static ListProgramTypeCountResponseProgramTypeAndCounts build(java.util.Map<String, ?> map) throws Exception {
            ListProgramTypeCountResponseProgramTypeAndCounts self = new ListProgramTypeCountResponseProgramTypeAndCounts();
            return TeaModel.build(map, self);
        }

        public ListProgramTypeCountResponseProgramTypeAndCounts setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListProgramTypeCountResponseProgramTypeAndCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
