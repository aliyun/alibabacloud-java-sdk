// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchShrinkRequest extends TeaModel {
    /**
     * <p>Query filter</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScgFilter")
    public String scgFilterShrink;

    /**
     * <p>Selection pool ID. Optional values: MC201132 (Ethnic Chinese Style), MC201136 (Pop Music), MC201139 (Sweet Love), MC201133 (Folk), MC201137 (Relaxing Reading), MC201138 (Happiness), PA202029 (Stories), PA202030 (Children\&quot;s Songs), PA202028 (Chinese Classics and History), PA202032 (Encyclopedia), PA202031 (English Children\&quot;s Songs)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MC201132</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    public static ScgSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScgSearchShrinkRequest self = new ScgSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScgSearchShrinkRequest setScgFilterShrink(String scgFilterShrink) {
        this.scgFilterShrink = scgFilterShrink;
        return this;
    }
    public String getScgFilterShrink() {
        return this.scgFilterShrink;
    }

    public ScgSearchShrinkRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

}
