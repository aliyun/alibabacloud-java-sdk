// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSTrafficResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DefenseInBytes")
    @Validation(required = true)
    public Long defenseInBytes;

    @NameInMap("SourceInBytes")
    @Validation(required = true)
    public Long sourceInBytes;

    @NameInMap("DDoSTrafficPoints")
    @Validation(required = true)
    public java.util.List<DescribeDDoSTrafficResponseDDoSTrafficPoints> DDoSTrafficPoints;

    public static DescribeDDoSTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSTrafficResponse self = new DescribeDDoSTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSTrafficResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSTrafficResponse setDefenseInBytes(Long defenseInBytes) {
        this.defenseInBytes = defenseInBytes;
        return this;
    }
    public Long getDefenseInBytes() {
        return this.defenseInBytes;
    }

    public DescribeDDoSTrafficResponse setSourceInBytes(Long sourceInBytes) {
        this.sourceInBytes = sourceInBytes;
        return this;
    }
    public Long getSourceInBytes() {
        return this.sourceInBytes;
    }

    public DescribeDDoSTrafficResponse setDDoSTrafficPoints(java.util.List<DescribeDDoSTrafficResponseDDoSTrafficPoints> DDoSTrafficPoints) {
        this.DDoSTrafficPoints = DDoSTrafficPoints;
        return this;
    }
    public java.util.List<DescribeDDoSTrafficResponseDDoSTrafficPoints> getDDoSTrafficPoints() {
        return this.DDoSTrafficPoints;
    }

    public static class DescribeDDoSTrafficResponseDDoSTrafficPoints extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        @NameInMap("DefenseMaxInBps")
        @Validation(required = true)
        public Long defenseMaxInBps;

        @NameInMap("SourceMaxInBps")
        @Validation(required = true)
        public Long sourceMaxInBps;

        public static DescribeDDoSTrafficResponseDDoSTrafficPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSTrafficResponseDDoSTrafficPoints self = new DescribeDDoSTrafficResponseDDoSTrafficPoints();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSTrafficResponseDDoSTrafficPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDDoSTrafficResponseDDoSTrafficPoints setDefenseMaxInBps(Long defenseMaxInBps) {
            this.defenseMaxInBps = defenseMaxInBps;
            return this;
        }
        public Long getDefenseMaxInBps() {
            return this.defenseMaxInBps;
        }

        public DescribeDDoSTrafficResponseDDoSTrafficPoints setSourceMaxInBps(Long sourceMaxInBps) {
            this.sourceMaxInBps = sourceMaxInBps;
            return this;
        }
        public Long getSourceMaxInBps() {
            return this.sourceMaxInBps;
        }

    }

}
