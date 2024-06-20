// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeStsGrantStatusRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the RAM role to query. Set the value to <strong>AliyunDDoSCOODefaultRole</strong>, which indicates the default role of Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * <blockquote>
     * <p>Anti-DDoS Pro or Anti-DDoS Premium uses the default role to access other cloud services.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunDDoSCOODefaultRole</p>
     */
    @NameInMap("Role")
    public String role;

    public static DescribeStsGrantStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStsGrantStatusRequest self = new DescribeStsGrantStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStsGrantStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeStsGrantStatusRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
