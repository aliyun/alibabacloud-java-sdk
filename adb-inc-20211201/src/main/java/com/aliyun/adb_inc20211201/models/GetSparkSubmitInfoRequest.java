// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetSparkSubmitInfoRequest extends TeaModel {
    @NameInMap("Conf")
    public String conf;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("TrustedCallerParentId")
    public Long trustedCallerParentId;

    @NameInMap("TrustedCallerType")
    public String trustedCallerType;

    @NameInMap("TrustedCallerUid")
    public Long trustedCallerUid;

    public static GetSparkSubmitInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSubmitInfoRequest self = new GetSparkSubmitInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkSubmitInfoRequest setConf(String conf) {
        this.conf = conf;
        return this;
    }
    public String getConf() {
        return this.conf;
    }

    public GetSparkSubmitInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetSparkSubmitInfoRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetSparkSubmitInfoRequest setTrustedCallerParentId(Long trustedCallerParentId) {
        this.trustedCallerParentId = trustedCallerParentId;
        return this;
    }
    public Long getTrustedCallerParentId() {
        return this.trustedCallerParentId;
    }

    public GetSparkSubmitInfoRequest setTrustedCallerType(String trustedCallerType) {
        this.trustedCallerType = trustedCallerType;
        return this;
    }
    public String getTrustedCallerType() {
        return this.trustedCallerType;
    }

    public GetSparkSubmitInfoRequest setTrustedCallerUid(Long trustedCallerUid) {
        this.trustedCallerUid = trustedCallerUid;
        return this;
    }
    public Long getTrustedCallerUid() {
        return this.trustedCallerUid;
    }

}
