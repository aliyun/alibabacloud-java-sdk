// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileTypeStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramTypeAndCounts")
    public java.util.List<GetFileTypeStatisticResponseBodyProgramTypeAndCounts> programTypeAndCounts;

    public static GetFileTypeStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileTypeStatisticResponseBody self = new GetFileTypeStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileTypeStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileTypeStatisticResponseBody setProgramTypeAndCounts(java.util.List<GetFileTypeStatisticResponseBodyProgramTypeAndCounts> programTypeAndCounts) {
        this.programTypeAndCounts = programTypeAndCounts;
        return this;
    }
    public java.util.List<GetFileTypeStatisticResponseBodyProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    public static class GetFileTypeStatisticResponseBodyProgramTypeAndCounts extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("ProgramType")
        public String programType;

        public static GetFileTypeStatisticResponseBodyProgramTypeAndCounts build(java.util.Map<String, ?> map) throws Exception {
            GetFileTypeStatisticResponseBodyProgramTypeAndCounts self = new GetFileTypeStatisticResponseBodyProgramTypeAndCounts();
            return TeaModel.build(map, self);
        }

        public GetFileTypeStatisticResponseBodyProgramTypeAndCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetFileTypeStatisticResponseBodyProgramTypeAndCounts setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

    }

}
