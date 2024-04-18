// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeSpotDiscountHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpotDiscounts")
    public java.util.List<DescribeSpotDiscountHistoryResponseBodySpotDiscounts> spotDiscounts;

    public static DescribeSpotDiscountHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotDiscountHistoryResponseBody self = new DescribeSpotDiscountHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSpotDiscountHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSpotDiscountHistoryResponseBody setSpotDiscounts(java.util.List<DescribeSpotDiscountHistoryResponseBodySpotDiscounts> spotDiscounts) {
        this.spotDiscounts = spotDiscounts;
        return this;
    }
    public java.util.List<DescribeSpotDiscountHistoryResponseBodySpotDiscounts> getSpotDiscounts() {
        return this.spotDiscounts;
    }

    public static class DescribeSpotDiscountHistoryResponseBodySpotDiscounts extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotDiscount")
        public String spotDiscount;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSpotDiscountHistoryResponseBodySpotDiscounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSpotDiscountHistoryResponseBodySpotDiscounts self = new DescribeSpotDiscountHistoryResponseBodySpotDiscounts();
            return TeaModel.build(map, self);
        }

        public DescribeSpotDiscountHistoryResponseBodySpotDiscounts setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSpotDiscountHistoryResponseBodySpotDiscounts setSpotDiscount(String spotDiscount) {
            this.spotDiscount = spotDiscount;
            return this;
        }
        public String getSpotDiscount() {
            return this.spotDiscount;
        }

        public DescribeSpotDiscountHistoryResponseBodySpotDiscounts setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeSpotDiscountHistoryResponseBodySpotDiscounts setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
