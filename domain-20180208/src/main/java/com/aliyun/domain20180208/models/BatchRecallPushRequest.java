// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchRecallPushRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;NL12312323123&quot;, &quot;NL12312323124&quot;]</p>
     */
    @NameInMap("OutBizIds")
    public java.util.List<String> outBizIds;

    public static BatchRecallPushRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRecallPushRequest self = new BatchRecallPushRequest();
        return TeaModel.build(map, self);
    }

    public BatchRecallPushRequest setOutBizIds(java.util.List<String> outBizIds) {
        this.outBizIds = outBizIds;
        return this;
    }
    public java.util.List<String> getOutBizIds() {
        return this.outBizIds;
    }

}
