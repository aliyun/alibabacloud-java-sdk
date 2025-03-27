// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppResourceReserveResponseBody extends TeaModel {
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
     * <p>1AB799CF-562A-5CAF-A99E-4354053D814F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReserveSet")
    public java.util.List<UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet> reserveSet;

    public static UpdateEdgeContainerAppResourceReserveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppResourceReserveResponseBody self = new UpdateEdgeContainerAppResourceReserveResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppResourceReserveResponseBody setDurationTime(String durationTime) {
        this.durationTime = durationTime;
        return this;
    }
    public String getDurationTime() {
        return this.durationTime;
    }

    public UpdateEdgeContainerAppResourceReserveResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEdgeContainerAppResourceReserveResponseBody setForever(Boolean forever) {
        this.forever = forever;
        return this;
    }
    public Boolean getForever() {
        return this.forever;
    }

    public UpdateEdgeContainerAppResourceReserveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEdgeContainerAppResourceReserveResponseBody setReserveSet(java.util.List<UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet> reserveSet) {
        this.reserveSet = reserveSet;
        return this;
    }
    public java.util.List<UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static class UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet extends TeaModel {
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

        public static UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet build(java.util.Map<String, ?> map) throws Exception {
            UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet self = new UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet();
            return TeaModel.build(map, self);
        }

        public UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateEdgeContainerAppResourceReserveResponseBodyReserveSet setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
