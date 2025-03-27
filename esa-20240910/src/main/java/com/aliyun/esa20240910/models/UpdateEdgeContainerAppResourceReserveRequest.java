// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppResourceReserveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

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

    @NameInMap("ReserveSet")
    public java.util.List<UpdateEdgeContainerAppResourceReserveRequestReserveSet> reserveSet;

    public static UpdateEdgeContainerAppResourceReserveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppResourceReserveRequest self = new UpdateEdgeContainerAppResourceReserveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppResourceReserveRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setDurationTime(String durationTime) {
        this.durationTime = durationTime;
        return this;
    }
    public String getDurationTime() {
        return this.durationTime;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setForever(Boolean forever) {
        this.forever = forever;
        return this;
    }
    public Boolean getForever() {
        return this.forever;
    }

    public UpdateEdgeContainerAppResourceReserveRequest setReserveSet(java.util.List<UpdateEdgeContainerAppResourceReserveRequestReserveSet> reserveSet) {
        this.reserveSet = reserveSet;
        return this;
    }
    public java.util.List<UpdateEdgeContainerAppResourceReserveRequestReserveSet> getReserveSet() {
        return this.reserveSet;
    }

    public static class UpdateEdgeContainerAppResourceReserveRequestReserveSet extends TeaModel {
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

        public static UpdateEdgeContainerAppResourceReserveRequestReserveSet build(java.util.Map<String, ?> map) throws Exception {
            UpdateEdgeContainerAppResourceReserveRequestReserveSet self = new UpdateEdgeContainerAppResourceReserveRequestReserveSet();
            return TeaModel.build(map, self);
        }

        public UpdateEdgeContainerAppResourceReserveRequestReserveSet setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public UpdateEdgeContainerAppResourceReserveRequestReserveSet setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateEdgeContainerAppResourceReserveRequestReserveSet setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

    }

}
