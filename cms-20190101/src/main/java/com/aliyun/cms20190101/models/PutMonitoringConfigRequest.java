// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitoringConfigRequest extends TeaModel {
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    @NameInMap("EnableInstallAgentNewECS")
    public Boolean enableInstallAgentNewECS;

    public static PutMonitoringConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMonitoringConfigRequest self = new PutMonitoringConfigRequest();
        return TeaModel.build(map, self);
    }

}
