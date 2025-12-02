// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyServiceInfoRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Service description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("ServiceDesc")
    public String serviceDesc;

    /**
     * <p>Service name.</p>
     * 
     * <strong>example:</strong>
     * <p>通用基线检测</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static ModifyServiceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceInfoRequest self = new ModifyServiceInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyServiceInfoRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyServiceInfoRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ModifyServiceInfoRequest setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
        return this;
    }
    public String getServiceDesc() {
        return this.serviceDesc;
    }

    public ModifyServiceInfoRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
