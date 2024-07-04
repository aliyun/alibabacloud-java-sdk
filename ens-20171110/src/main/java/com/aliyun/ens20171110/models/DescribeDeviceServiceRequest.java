// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDeviceServiceRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>a2bac6f4-75dc-455e-8389-2dc8e47526d3</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chongqing-10</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5sg1owx0g4ojy66ab2tez77r2</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>2661b1dd-3453-418d-8182-bb34f79e8d3c</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chongqing-11</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Service ID</p>
     * 
     * <strong>example:</strong>
     * <p>s-cxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static DescribeDeviceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceServiceRequest self = new DescribeDeviceServiceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeDeviceServiceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeDeviceServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDeviceServiceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeDeviceServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeviceServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
