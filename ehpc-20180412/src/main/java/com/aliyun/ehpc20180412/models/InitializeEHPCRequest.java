// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InitializeEHPCRequest extends TeaModel {
    /**
     * <p>The ID of the region where the service-linked role is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> operation to obtain the IDs of regions supported by E-HPC.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the service for which you must create a service-linked role. Valid values:</p>
     * <ul>
     * <li>E-HPC: You must create the AliyunServiceRoleForEHPC service-linked role.</li>
     * <li>E-HPC Instant: You must create the AliyunServiceRoleForEHPCManagedNetwork service-linked role.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>E-HPC</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static InitializeEHPCRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeEHPCRequest self = new InitializeEHPCRequest();
        return TeaModel.build(map, self);
    }

    public InitializeEHPCRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InitializeEHPCRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
