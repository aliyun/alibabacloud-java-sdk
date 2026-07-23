// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteEventAnalysisJobShrinkRequest extends TeaModel {
    /**
     * <p>The identifier of the source resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kafka&quot;:{&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;InstanceId&quot;:&quot;alikafka_post-cn-xxx&quot;,&quot;Topic&quot;:&quot;my_topic&quot;}}</p>
     */
    @NameInMap("SourceResource")
    public String sourceResourceShrink;

    public static DeleteEventAnalysisJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventAnalysisJobShrinkRequest self = new DeleteEventAnalysisJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventAnalysisJobShrinkRequest setSourceResourceShrink(String sourceResourceShrink) {
        this.sourceResourceShrink = sourceResourceShrink;
        return this;
    }
    public String getSourceResourceShrink() {
        return this.sourceResourceShrink;
    }

}
