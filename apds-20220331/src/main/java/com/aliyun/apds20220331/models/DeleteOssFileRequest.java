// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteOssFileRequest extends TeaModel {
    @NameInMap("objectName")
    public String objectName;

    @NameInMap("regionId")
    public String regionId;

    public static DeleteOssFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssFileRequest self = new DeleteOssFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOssFileRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public DeleteOssFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
