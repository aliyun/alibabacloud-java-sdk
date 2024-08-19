// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CopyServiceConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("ServiceDesc")
    public String serviceDesc;

    @NameInMap("ServiceName")
    public String serviceName;

    public static CopyServiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyServiceConfigRequest self = new CopyServiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyServiceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopyServiceConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CopyServiceConfigRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CopyServiceConfigRequest setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
        return this;
    }
    public String getServiceDesc() {
        return this.serviceDesc;
    }

    public CopyServiceConfigRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
