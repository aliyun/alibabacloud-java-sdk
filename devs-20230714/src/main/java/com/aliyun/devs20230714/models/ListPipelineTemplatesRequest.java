// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesRequest extends TeaModel {
    @NameInMap("labelSelector")
    public java.util.List<String> labelSelector;

    public static ListPipelineTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesRequest self = new ListPipelineTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesRequest setLabelSelector(java.util.List<String> labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public java.util.List<String> getLabelSelector() {
        return this.labelSelector;
    }

}
