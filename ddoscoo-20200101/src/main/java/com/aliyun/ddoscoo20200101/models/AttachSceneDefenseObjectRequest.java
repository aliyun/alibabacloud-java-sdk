// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectRequest extends TeaModel {
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("Objects")
    public String objects;

    @NameInMap("PolicyId")
    public String policyId;

    public static AttachSceneDefenseObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachSceneDefenseObjectRequest self = new AttachSceneDefenseObjectRequest();
        return TeaModel.build(map, self);
    }

    public AttachSceneDefenseObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public AttachSceneDefenseObjectRequest setObjects(String objects) {
        this.objects = objects;
        return this;
    }
    public String getObjects() {
        return this.objects;
    }

    public AttachSceneDefenseObjectRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
