// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseCapacityReservationRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PrivatePoolOptions")
    public ReleaseCapacityReservationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ReleaseCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityReservationRequest self = new ReleaseCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityReservationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseCapacityReservationRequest setPrivatePoolOptions(ReleaseCapacityReservationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ReleaseCapacityReservationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ReleaseCapacityReservationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class ReleaseCapacityReservationRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static ReleaseCapacityReservationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCapacityReservationRequestPrivatePoolOptions self = new ReleaseCapacityReservationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ReleaseCapacityReservationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
