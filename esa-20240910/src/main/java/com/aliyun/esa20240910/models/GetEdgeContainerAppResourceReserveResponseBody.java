// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResourceReserveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("DurationTime")
    public String durationTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Forever")
    public Boolean forever;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReserveSet")
    public java.util.List<GetEdgeContainerAppResourceReserveResponseBodyReserveSet> reserveSet;

    public static GetEdgeContainerAppResourceReserveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResourceReserveResponseBody self = new GetEdgeContainerAppResourceReserveResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResourceReserveResponseBody setDurationTime(String durationTime) {
        this.durationTime = durationTime;
        return this;
    }
    public String getDurationTime() {
        return this.durationTime;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setForever(Boolean forever) {
        this.forever = forever;
        return this;
    }
    public Boolean getForever() {
        return this.forever;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerAppResourceReserveResponseBody setReserveSet(java.util.List<GetEdgeContainerAppResourceReserveResponseBodyReserveSet> reserveSet) {
        this.reserveSet = reserveSet;
        return this;
    }
    public java.util.List<GetEdgeContainerAppResourceReserveResponseBodyReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static class GetEdgeContainerAppResourceReserveResponseBodyReserveSet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cmcc</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>huazhong</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        public static GetEdgeContainerAppResourceReserveResponseBodyReserveSet build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResourceReserveResponseBodyReserveSet self = new GetEdgeContainerAppResourceReserveResponseBodyReserveSet();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResourceReserveResponseBodyReserveSet setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetEdgeContainerAppResourceReserveResponseBodyReserveSet setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetEdgeContainerAppResourceReserveResponseBodyReserveSet setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
