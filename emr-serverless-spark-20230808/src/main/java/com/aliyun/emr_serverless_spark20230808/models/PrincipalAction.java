// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class PrincipalAction extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acs:emr::workspaceId:action/create_queue</p>
     */
    @NameInMap("actionArn")
    public String actionArn;

    /**
     * <strong>example:</strong>
     * <p>acs:emr::workspaceId:user/237593691541622267</p>
     */
    @NameInMap("principalArn")
    public String principalArn;

    public static PrincipalAction build(java.util.Map<String, ?> map) throws Exception {
        PrincipalAction self = new PrincipalAction();
        return TeaModel.build(map, self);
    }

    public PrincipalAction setActionArn(String actionArn) {
        this.actionArn = actionArn;
        return this;
    }
    public String getActionArn() {
        return this.actionArn;
    }

    public PrincipalAction setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }
    public String getPrincipalArn() {
        return this.principalArn;
    }

}
