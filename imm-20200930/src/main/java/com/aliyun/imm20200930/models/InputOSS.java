// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InputOSS extends TeaModel {
    /**
     * <p>The name of the OSS bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-bucket</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The match expressions.</p>
     */
    @NameInMap("MatchExpressions")
    public java.util.List<String> matchExpressions;

    /**
     * <p>The object key prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>test-object</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    public static InputOSS build(java.util.Map<String, ?> map) throws Exception {
        InputOSS self = new InputOSS();
        return TeaModel.build(map, self);
    }

    public InputOSS setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public InputOSS setMatchExpressions(java.util.List<String> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public java.util.List<String> getMatchExpressions() {
        return this.matchExpressions;
    }

    public InputOSS setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
