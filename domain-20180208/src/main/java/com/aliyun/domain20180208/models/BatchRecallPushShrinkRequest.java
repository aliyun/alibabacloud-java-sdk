// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchRecallPushShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;NL12312323123&quot;, &quot;NL12312323124&quot;]</p>
     */
    @NameInMap("OutBizIds")
    public String outBizIdsShrink;

    public static BatchRecallPushShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRecallPushShrinkRequest self = new BatchRecallPushShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchRecallPushShrinkRequest setOutBizIdsShrink(String outBizIdsShrink) {
        this.outBizIdsShrink = outBizIdsShrink;
        return this;
    }
    public String getOutBizIdsShrink() {
        return this.outBizIdsShrink;
    }

}
