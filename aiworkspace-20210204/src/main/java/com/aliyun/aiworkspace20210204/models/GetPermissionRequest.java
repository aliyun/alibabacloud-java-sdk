// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionRequest extends TeaModel {
    // 待鉴权实例的可见性 PUBLIC表示当前工作空间所有人都可以访问 PRIVATE表示只有Owner可以访问
    @NameInMap("Accessibility")
    public String accessibility;

    // 创建者
    @NameInMap("Creator")
    public String creator;

    public static GetPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionRequest self = new GetPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetPermissionRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

}
