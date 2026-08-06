// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrawlerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrawlerRequest self = new GetCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public GetCrawlerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
