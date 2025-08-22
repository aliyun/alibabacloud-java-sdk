// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteTerraformPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>terraform {
     *   required_providers {
     *     alicloud = {
     *       source   = &quot;aliyun/alicloud&quot;
     *       version  = &quot;1.254.0&quot;
     *     }
     *   }
     * }</p>
     * <p>resource &quot;alicloud_vpc&quot; &quot;default&quot; {
     *   is_default                                  = false
     *   enable_ipv6                                 = false
     *   classic_link_enabled                        = false
     *   force_delete                                = false
     *   system_route_table_route_propagation_enable = false
     *   dry_run                                     = false
     * }</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>task-xxx</p>
     */
    @NameInMap("stateId")
    public String stateId;

    public static ExecuteTerraformPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTerraformPlanRequest self = new ExecuteTerraformPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTerraformPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteTerraformPlanRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteTerraformPlanRequest setStateId(String stateId) {
        this.stateId = stateId;
        return this;
    }
    public String getStateId() {
        return this.stateId;
    }

}
