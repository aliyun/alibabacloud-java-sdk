// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class SearchImageRequest extends TeaModel {
    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("ImageUrl")
    @Validation(required = true)
    public String imageUrl;

    @NameInMap("Limit")
    @Validation(required = true)
    public Integer limit;

    public static SearchImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageRequest self = new SearchImageRequest();
        return TeaModel.build(map, self);
    }

}
