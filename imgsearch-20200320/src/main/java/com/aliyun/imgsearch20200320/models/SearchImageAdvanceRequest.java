// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class SearchImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("Limit")
    @Validation(required = true)
    public Integer limit;

    public static SearchImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageAdvanceRequest self = new SearchImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
