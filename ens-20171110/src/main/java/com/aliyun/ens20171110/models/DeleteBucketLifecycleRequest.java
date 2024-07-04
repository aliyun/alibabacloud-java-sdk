// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteBucketLifecycleRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The ID of the rule. If this parameter is not specified, all rules are removed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteBucketLifecycleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBucketLifecycleRequest self = new DeleteBucketLifecycleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBucketLifecycleRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public DeleteBucketLifecycleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
