// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSTrafficResponseBody extends TeaModel {
    @NameInMap("DDoSTrafficPoints")
    public java.util.List<DescribeDDoSTrafficResponseBodyDDoSTrafficPoints> DDoSTrafficPoints;

    /**
     * <strong>example:</strong>
     * <p>23482234</p>
     */
    @NameInMap("DefenseInBytes")
    public Long defenseInBytes;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>19284762</p>
     */
    @NameInMap("SourceInBytes")
    public Long sourceInBytes;

    public static DescribeDDoSTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSTrafficResponseBody self = new DescribeDDoSTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSTrafficResponseBody setDDoSTrafficPoints(java.util.List<DescribeDDoSTrafficResponseBodyDDoSTrafficPoints> DDoSTrafficPoints) {
        this.DDoSTrafficPoints = DDoSTrafficPoints;
        return this;
    }
    public java.util.List<DescribeDDoSTrafficResponseBodyDDoSTrafficPoints> getDDoSTrafficPoints() {
        return this.DDoSTrafficPoints;
    }

    public DescribeDDoSTrafficResponseBody setDefenseInBytes(Long defenseInBytes) {
        this.defenseInBytes = defenseInBytes;
        return this;
    }
    public Long getDefenseInBytes() {
        return this.defenseInBytes;
    }

    public DescribeDDoSTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSTrafficResponseBody setSourceInBytes(Long sourceInBytes) {
        this.sourceInBytes = sourceInBytes;
        return this;
    }
    public Long getSourceInBytes() {
        return this.sourceInBytes;
    }

    public static class DescribeDDoSTrafficResponseBodyDDoSTrafficPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>129867</p>
         */
        @NameInMap("DefenseMaxInBps")
        public Long defenseMaxInBps;

        /**
         * <strong>example:</strong>
         * <p>129867</p>
         */
        @NameInMap("SourceMaxInBps")
        public Long sourceMaxInBps;

        /**
         * <strong>example:</strong>
         * <p>234082304</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeDDoSTrafficResponseBodyDDoSTrafficPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSTrafficResponseBodyDDoSTrafficPoints self = new DescribeDDoSTrafficResponseBodyDDoSTrafficPoints();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSTrafficResponseBodyDDoSTrafficPoints setDefenseMaxInBps(Long defenseMaxInBps) {
            this.defenseMaxInBps = defenseMaxInBps;
            return this;
        }
        public Long getDefenseMaxInBps() {
            return this.defenseMaxInBps;
        }

        public DescribeDDoSTrafficResponseBodyDDoSTrafficPoints setSourceMaxInBps(Long sourceMaxInBps) {
            this.sourceMaxInBps = sourceMaxInBps;
            return this;
        }
        public Long getSourceMaxInBps() {
            return this.sourceMaxInBps;
        }

        public DescribeDDoSTrafficResponseBodyDDoSTrafficPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
