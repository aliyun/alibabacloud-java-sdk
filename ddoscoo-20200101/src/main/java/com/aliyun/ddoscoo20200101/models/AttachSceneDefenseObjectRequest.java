// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AttachSceneDefenseObjectRequest extends TeaModel {
    /**
     * <p>The type of the object. Set the value to <strong>Domain</strong>, which indicates a domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Domain</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The object that you want to add to the policy. Separate multiple objects with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Objects")
    public String objects;

    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/159382.html">DescribeSceneDefensePolicies</a> operation to query the IDs of all policies.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>321a-fd31-df51-****</p>
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
