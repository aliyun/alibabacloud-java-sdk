// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteStorageSetRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StorageSetId")
    @Validation(required = true)
    public String storageSetId;

    public static DeleteStorageSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageSetRequest self = new DeleteStorageSetRequest();
        return TeaModel.build(map, self);
    }

}
