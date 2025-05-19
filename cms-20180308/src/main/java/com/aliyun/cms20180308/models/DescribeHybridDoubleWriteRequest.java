// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeHybridDoubleWriteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-source</p>
     */
    @NameInMap("SourceNamespace")
    public String sourceNamespace;

    /**
     * <strong>example:</strong>
     * <p>12706766**********</p>
     */
    @NameInMap("SourceUserId")
    public String sourceUserId;

    @NameInMap("TargetNamespace")
    public String targetNamespace;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static DescribeHybridDoubleWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridDoubleWriteRequest self = new DescribeHybridDoubleWriteRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridDoubleWriteRequest setSourceNamespace(String sourceNamespace) {
        this.sourceNamespace = sourceNamespace;
        return this;
    }
    public String getSourceNamespace() {
        return this.sourceNamespace;
    }

    public DescribeHybridDoubleWriteRequest setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    public DescribeHybridDoubleWriteRequest setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public DescribeHybridDoubleWriteRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
