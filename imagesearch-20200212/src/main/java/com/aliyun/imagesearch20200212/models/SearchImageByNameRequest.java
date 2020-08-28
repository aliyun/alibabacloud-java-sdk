// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class SearchImageByNameRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("PicName")
    @Validation(required = true)
    public String picName;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Start")
    public Integer start;

    public static SearchImageByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameRequest self = new SearchImageByNameRequest();
        return TeaModel.build(map, self);
    }

}
