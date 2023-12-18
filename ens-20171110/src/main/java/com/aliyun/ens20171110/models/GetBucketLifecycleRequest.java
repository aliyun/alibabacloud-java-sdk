// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetBucketLifecycleRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The ID of the rule to be queried. If this parameter is not specified, all rules are returned.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static GetBucketLifecycleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBucketLifecycleRequest self = new GetBucketLifecycleRequest();
        return TeaModel.build(map, self);
    }

    public GetBucketLifecycleRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public GetBucketLifecycleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
