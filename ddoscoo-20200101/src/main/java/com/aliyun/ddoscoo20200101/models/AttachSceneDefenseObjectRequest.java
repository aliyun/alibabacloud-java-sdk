// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectRequest extends TeaModel {
    /**
     * <p>The type of the object. Set the value to **Domain**, which indicates a domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The object that you want to add to the policy. Separate multiple objects with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Objects")
    public String objects;

    /**
     * <p>The ID of the policy.</p>
     * <br>
     * <p>> You can call the [DescribeSceneDefensePolicies](https://help.aliyun.com/document_detail/159382.html) operation to query the IDs of all policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
