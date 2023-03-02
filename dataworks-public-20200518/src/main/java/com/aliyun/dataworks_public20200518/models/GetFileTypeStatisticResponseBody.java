// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileTypeStatisticResponseBody extends TeaModel {
    /**
     * <p>An array of node types and quantity.</p>
     */
    @NameInMap("ProgramTypeAndCounts")
    public java.util.List<GetFileTypeStatisticResponseBodyProgramTypeAndCounts> programTypeAndCounts;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileTypeStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileTypeStatisticResponseBody self = new GetFileTypeStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileTypeStatisticResponseBody setProgramTypeAndCounts(java.util.List<GetFileTypeStatisticResponseBodyProgramTypeAndCounts> programTypeAndCounts) {
        this.programTypeAndCounts = programTypeAndCounts;
        return this;
    }
    public java.util.List<GetFileTypeStatisticResponseBodyProgramTypeAndCounts> getProgramTypeAndCounts() {
        return this.programTypeAndCounts;
    }

    public GetFileTypeStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileTypeStatisticResponseBodyProgramTypeAndCounts extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of the node.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>6 (Shell node), 10 (ODPS SQL node), 11 (ODPS MR node), 23 (Data Integration node), 24 (ODPS Script node), 99 (zero load node), 221 (PyODPS 2 node), 225 (ODPS Spark node), 227 (EMR Hive node), 228 (EMR Spark node), 229 (EMR Spark SQL node), 230 (EMR MR node), 239 (OSS object inspection node), 257 (EMR Shell node), 258 (EMR Spark Shell node), 259 (EMR Presto node), 260 (EMR Impala node), 900 (real-time data synchronization node), 1089 (cross-tenant collaboration node), 1091 (Hologres development node), 1093 (Hologres SQL node), 1100 (assignment node), and 1221 (PyODPS 3 node).</p>
         */
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
