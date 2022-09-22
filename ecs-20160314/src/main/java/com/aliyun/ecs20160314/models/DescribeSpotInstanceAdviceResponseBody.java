// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeSpotInstanceAdviceResponseBody extends TeaModel {
    @NameInMap("AvailableSpotZones")
    public AvailableSpotZones availableSpotZones;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSpotInstanceAdviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotInstanceAdviceResponseBody self = new DescribeSpotInstanceAdviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpotInstanceAdviceResponseBody setAvailableSpotZones(AvailableSpotZones availableSpotZones) {
        this.availableSpotZones = availableSpotZones;
        return this;
    }
    public AvailableSpotZones getAvailableSpotZones() {
        return this.availableSpotZones;
    }

    public DescribeSpotInstanceAdviceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSpotInstanceAdviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AvailableSpotZones extends TeaModel {
        @NameInMap("AvailableSpotZone")
        public java.util.List<String> availableSpotZone;

        public static AvailableSpotZones build(java.util.Map<String, ?> map) throws Exception {
            AvailableSpotZones self = new AvailableSpotZones();
            return TeaModel.build(map, self);
        }

        public AvailableSpotZones setAvailableSpotZone(java.util.List<String> availableSpotZone) {
            this.availableSpotZone = availableSpotZone;
            return this;
        }
        public java.util.List<String> getAvailableSpotZone() {
            return this.availableSpotZone;
        }

    }

}
