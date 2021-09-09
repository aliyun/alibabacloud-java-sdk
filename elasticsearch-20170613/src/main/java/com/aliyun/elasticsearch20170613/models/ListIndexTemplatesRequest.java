// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListIndexTemplatesRequest extends TeaModel {
    @NameInMap("indexTemplate")
    public String indexTemplate;

    public static ListIndexTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexTemplatesRequest self = new ListIndexTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexTemplatesRequest setIndexTemplate(String indexTemplate) {
        this.indexTemplate = indexTemplate;
        return this;
    }
    public String getIndexTemplate() {
        return this.indexTemplate;
    }

}
