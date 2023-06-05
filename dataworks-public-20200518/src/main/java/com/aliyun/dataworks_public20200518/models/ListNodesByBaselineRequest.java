// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByBaselineRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    public static ListNodesByBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByBaselineRequest self = new ListNodesByBaselineRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesByBaselineRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

}
