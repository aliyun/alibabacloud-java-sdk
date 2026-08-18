// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopCrawlerRequest extends TeaModel {
    /**
     * <p>The ID of the metadata crawler. You can call ListCrawlers to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    public static StopCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCrawlerRequest self = new StopCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public StopCrawlerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
