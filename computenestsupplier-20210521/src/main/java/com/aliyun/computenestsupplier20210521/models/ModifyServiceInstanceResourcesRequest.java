// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ModifyServiceInstanceResourcesRequest extends TeaModel {
    /**
     * <p>The imported resources.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;Type&quot;: &quot;ResourceIds&quot;,
     *   &quot;ResourceIds&quot;: {
     *     &quot;ALIYUN::ECS::INSTANCE&quot;: [&quot;i-xxx&quot;, &quot;i-yyy&quot;],
     *     &quot;ALIYUN::RDS::INSTANCE&quot;: [&quot;rm-xxx&quot;, &quot;rm-yyy&quot;],
     *     &quot;ALIYUN::VPC::VPC&quot;: [&quot;vpc-xxx&quot;, &quot;vpc-yyy&quot;],
     *     &quot;ALIYUN::SLB::INSTANCE&quot;: [&quot;lb-xxx&quot;, &quot;lb-yyy&quot;]
     *   }
     * }</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The ID of the service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d8a0cc2a1ee04dce****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The type of operation performed on the service instance resource. Valid values:</p>
     * <ul>
     * <li>Import: The resource is imported.</li>
     * <li>UnImport: The resource import is canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Import</p>
     */
    @NameInMap("ServiceInstanceResourcesAction")
    public String serviceInstanceResourcesAction;

    public static ModifyServiceInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceInstanceResourcesRequest self = new ModifyServiceInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceInstanceResourcesRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public ModifyServiceInstanceResourcesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public ModifyServiceInstanceResourcesRequest setServiceInstanceResourcesAction(String serviceInstanceResourcesAction) {
        this.serviceInstanceResourcesAction = serviceInstanceResourcesAction;
        return this;
    }
    public String getServiceInstanceResourcesAction() {
        return this.serviceInstanceResourcesAction;
    }

}
