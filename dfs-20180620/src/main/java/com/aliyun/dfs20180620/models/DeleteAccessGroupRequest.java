// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteAccessGroupRequest extends TeaModel {
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    public static DeleteAccessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessGroupRequest self = new DeleteAccessGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessGroupRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public DeleteAccessGroupRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}
