// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AccessPageGetAclRequest extends TeaModel {
    @NameInMap("AccessPageId")
    public String accessPageId;

    public static AccessPageGetAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessPageGetAclRequest self = new AccessPageGetAclRequest();
        return TeaModel.build(map, self);
    }

    public AccessPageGetAclRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

}
