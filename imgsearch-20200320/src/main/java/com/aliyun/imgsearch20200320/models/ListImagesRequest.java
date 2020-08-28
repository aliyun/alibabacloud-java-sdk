// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("Token")
    public String token;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Order")
    public String order;

    @NameInMap("EntityIdPrefix")
    public String entityIdPrefix;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

}
