// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetInitDmsAIServiceK8sEnvInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static GetInitDmsAIServiceK8sEnvInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInitDmsAIServiceK8sEnvInfoRequest self = new GetInitDmsAIServiceK8sEnvInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetInitDmsAIServiceK8sEnvInfoRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetInitDmsAIServiceK8sEnvInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetInitDmsAIServiceK8sEnvInfoRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
