// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPageRequest extends TeaModel {
    /**
     * <p>The ID of the custom error page, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850223.html">ListPages</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>50000001</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageRequest self = new GetPageRequest();
        return TeaModel.build(map, self);
    }

    public GetPageRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
