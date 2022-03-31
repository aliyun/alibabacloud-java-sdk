// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLakeHouseSpaceRequest extends TeaModel {
    @NameInMap("SpaceId")
    public Long spaceId;

    @NameInMap("Tid")
    public Long tid;

    public static DeleteLakeHouseSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakeHouseSpaceRequest self = new DeleteLakeHouseSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLakeHouseSpaceRequest setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public Long getSpaceId() {
        return this.spaceId;
    }

    public DeleteLakeHouseSpaceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
