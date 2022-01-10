// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListProductAuthorizationsRequest extends TeaModel {
    // 逗号分隔的角色名 AliyunODPSPAIDefaultRole,AliyunPAIAccessingOSSRole,AliyunPAIDLCAccessingOSSRole,AliyunPAIDLCDefaultRole,AliyunPAIDSWDefaultRole
    @NameInMap("RamRoleNames")
    public String ramRoleNames;

    public static ListProductAuthorizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductAuthorizationsRequest self = new ListProductAuthorizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductAuthorizationsRequest setRamRoleNames(String ramRoleNames) {
        this.ramRoleNames = ramRoleNames;
        return this;
    }
    public String getRamRoleNames() {
        return this.ramRoleNames;
    }

}
