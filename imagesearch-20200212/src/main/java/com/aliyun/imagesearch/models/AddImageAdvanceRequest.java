// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch.models;

import com.aliyun.tea.*;

public class AddImageAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("PicName")
    @Validation(required = true)
    public String picName;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("StrAttr")
    public String strAttr;

    public static AddImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAdvanceRequest self = new AddImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
