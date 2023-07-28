// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRoleAclOnObjectRequest extends TeaModel {
    /**
     * <p>The name of the object.</p>
     */
    @NameInMap("objectName")
    public String objectName;

    /**
     * <p>The type of the object.</p>
     */
    @NameInMap("objectType")
    public String objectType;

    public static GetRoleAclOnObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleAclOnObjectRequest self = new GetRoleAclOnObjectRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleAclOnObjectRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public GetRoleAclOnObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
