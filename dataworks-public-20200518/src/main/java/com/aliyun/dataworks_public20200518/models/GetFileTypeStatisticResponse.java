// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileTypeStatisticResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProgramTypeAndCounts")
    @Validation(required = true)
    public java.util.List<GetFileTypeStatisticResponseProgramTypeAndCounts> programTypeAndCounts;

    public static GetFileTypeStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileTypeStatisticResponse self = new GetFileTypeStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetFileTypeStatisticResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileTypeStatisticResponse setProgramTypeAndCounts(java.util.List<GetFileTypeStatisticResponseProgramTypeAndCounts> programTypeAndCounts) {
        this.programTypeAndCounts = programTypeAndCounts;
        return this;
    }
    public java.util.List<GetFileTypeStatisticResponseProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    public static class GetFileTypeStatisticResponseProgramTypeAndCounts extends TeaModel {
        @NameInMap("ProgramType")
        @Validation(required = true)
        public String programType;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        public static GetFileTypeStatisticResponseProgramTypeAndCounts build(java.util.Map<String, ?> map) throws Exception {
            GetFileTypeStatisticResponseProgramTypeAndCounts self = new GetFileTypeStatisticResponseProgramTypeAndCounts();
            return TeaModel.build(map, self);
        }

        public GetFileTypeStatisticResponseProgramTypeAndCounts setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetFileTypeStatisticResponseProgramTypeAndCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
