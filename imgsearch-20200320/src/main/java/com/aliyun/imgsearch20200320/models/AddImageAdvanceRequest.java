// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class AddImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("EntityId")
    @Validation(required = true)
    public String entityId;

    public static AddImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAdvanceRequest self = new AddImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
