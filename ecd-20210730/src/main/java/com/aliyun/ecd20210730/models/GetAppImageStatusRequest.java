// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppImageStatusRequest extends TeaModel {
    @NameInMap("ImageUid")
    public String imageUid;

    @NameInMap("OsType")
    public String osType;

    public static GetAppImageStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppImageStatusRequest self = new GetAppImageStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAppImageStatusRequest setImageUid(String imageUid) {
        this.imageUid = imageUid;
        return this;
    }
    public String getImageUid() {
        return this.imageUid;
    }

    public GetAppImageStatusRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

}
