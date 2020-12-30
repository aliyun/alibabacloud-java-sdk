// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSTrafficResponseBody extends TeaModel {
    @NameInMap("DefenseInBytes")
    public Long defenseInBytes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceInBytes")
    public Long sourceInBytes;

    @NameInMap("DDoSTrafficPoints")
    public java.util.List<DescribeDDoSTrafficResponseBodyDDoSTrafficPoints> DDoSTrafficPoints;

    public static DescribeDDoSTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSTrafficResponseBody self = new DescribeDDoSTrafficResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDDoSTrafficResponseBody setDDoSTrafficPoints(java.util.List<DescribeDDoSTrafficResponseBodyDDoSTrafficPoints> DDoSTrafficPoints) {
        this.DDoSTrafficPoints = DDoSTrafficPoints;
        return this;
    }
    public java.util.List<DescribeDDoSTrafficResponseBodyDDoSTrafficPoints> getDDoSTrafficPoints() {
        return this.DDoSTrafficPoints;
    }

    public static class DescribeDDoSTrafficResponseBodyDDoSTrafficPoints extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("SourceMaxInBps")
        public Long sourceMaxInBps;

        @NameInMap("DefenseMaxInBps")
        public Long defenseMaxInBps;

        public static DescribeDDoSTrafficResponseBodyDDoSTrafficPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSTrafficResponseBodyDDoSTrafficPoints self = new DescribeDDoSTrafficResponseBodyDDoSTrafficPoints();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSTrafficResponseBodyDDoSTrafficPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDDoSTrafficResponseBodyDDoSTrafficPoints setSourceMaxInBps(Long sourceMaxInBps) {
            this.sourceMaxInBps = sourceMaxInBps;
            return this;
        }
        public Long getSourceMaxInBps() {
            return this.sourceMaxInBps;
        }

        public DescribeDDoSTrafficResponseBodyDDoSTrafficPoints setDefenseMaxInBps(Long defenseMaxInBps) {
            this.defenseMaxInBps = defenseMaxInBps;
            return this;
        }
        public Long getDefenseMaxInBps() {
            return this.defenseMaxInBps;
        }

    }

}
