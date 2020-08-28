// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class SearchImageByPicRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("PicContent")
    @Validation(required = true)
    public String picContent;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Start")
    public Integer start;

    public static SearchImageByPicRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicRequest self = new SearchImageByPicRequest();
        return TeaModel.build(map, self);
    }

}
