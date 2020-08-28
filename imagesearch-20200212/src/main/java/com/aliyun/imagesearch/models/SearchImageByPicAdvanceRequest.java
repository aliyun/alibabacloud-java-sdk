// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch.models;

import com.aliyun.tea.*;

public class SearchImageByPicAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Filter")
    public String filter;

    public static SearchImageByPicAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicAdvanceRequest self = new SearchImageByPicAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
