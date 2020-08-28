// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("SystemDisk")
    @Validation(required = true)
    public DescribePriceRequestSystemDisk systemDisk;

    @NameInMap("DataDisk")
    @Validation(required = true)
    public java.util.List<DescribePriceRequestDataDisk> dataDisk;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PriceUnit")
    public String priceUnit;

    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Capacity")
    public Integer capacity;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribePriceRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static DescribePriceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestSystemDisk self = new DescribePriceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceRequestDataDisk extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("Category")
        public String category;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static DescribePriceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceRequestDataDisk self = new DescribePriceRequestDataDisk();
            return TeaModel.build(map, self);
        }

    }

}
