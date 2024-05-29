// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DetachSceneDefenseObjectRequest extends TeaModel {
    /**
     * <p>The type of the object. Set the value to **Domain**, which indicates a domain name.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The protection asset that you want to remove from a policy. Separate multiple protection assets with commas (,).</p>
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

    public static DetachSceneDefenseObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachSceneDefenseObjectRequest self = new DetachSceneDefenseObjectRequest();
        return TeaModel.build(map, self);
    }

    public DetachSceneDefenseObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DetachSceneDefenseObjectRequest setObjects(String objects) {
        this.objects = objects;
        return this;
    }
    public String getObjects() {
        return this.objects;
    }

    public DetachSceneDefenseObjectRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
