// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountResponseBody extends TeaModel {
    /**
     * <p>The list of node types and quantity.</p>
     */
    @NameInMap("ProgramTypeAndCounts")
    public java.util.List<ListProgramTypeCountResponseBodyProgramTypeAndCounts> programTypeAndCounts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProgramTypeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountResponseBody self = new ListProgramTypeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountResponseBody setProgramTypeAndCounts(java.util.List<ListProgramTypeCountResponseBodyProgramTypeAndCounts> programTypeAndCounts) {
        this.programTypeAndCounts = programTypeAndCounts;
        return this;
    }
    public java.util.List<ListProgramTypeCountResponseBodyProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    public ListProgramTypeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProgramTypeCountResponseBodyProgramTypeAndCounts extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        public static ListProgramTypeCountResponseBodyProgramTypeAndCounts build(java.util.Map<String, ?> map) throws Exception {
            ListProgramTypeCountResponseBodyProgramTypeAndCounts self = new ListProgramTypeCountResponseBodyProgramTypeAndCounts();
            return TeaModel.build(map, self);
        }

        public ListProgramTypeCountResponseBodyProgramTypeAndCounts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListProgramTypeCountResponseBodyProgramTypeAndCounts setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

    }

}
