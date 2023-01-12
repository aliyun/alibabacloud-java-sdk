// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class PushMeteringDataRequest extends TeaModel {
    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("MeteringData")
    public java.util.List<PushMeteringDataRequestMeteringData> meteringData;

    public static PushMeteringDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataRequest self = new PushMeteringDataRequest();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PushMeteringDataRequest setMeteringData(java.util.List<PushMeteringDataRequestMeteringData> meteringData) {
        this.meteringData = meteringData;
        return this;
    }
    public java.util.List<PushMeteringDataRequestMeteringData> getMeteringData() {
        return this.meteringData;
    }

    public static class PushMeteringDataRequestMeteringData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MeteringAssist")
        public String meteringAssist;

        @NameInMap("MeteringEntity")
        public String meteringEntity;

        @NameInMap("StartTime")
        public Long startTime;

        public static PushMeteringDataRequestMeteringData build(java.util.Map<String, ?> map) throws Exception {
            PushMeteringDataRequestMeteringData self = new PushMeteringDataRequestMeteringData();
            return TeaModel.build(map, self);
        }

        public PushMeteringDataRequestMeteringData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public PushMeteringDataRequestMeteringData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PushMeteringDataRequestMeteringData setMeteringAssist(String meteringAssist) {
            this.meteringAssist = meteringAssist;
            return this;
        }
        public String getMeteringAssist() {
            return this.meteringAssist;
        }

        public PushMeteringDataRequestMeteringData setMeteringEntity(String meteringEntity) {
            this.meteringEntity = meteringEntity;
            return this;
        }
        public String getMeteringEntity() {
            return this.meteringEntity;
        }

        public PushMeteringDataRequestMeteringData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
