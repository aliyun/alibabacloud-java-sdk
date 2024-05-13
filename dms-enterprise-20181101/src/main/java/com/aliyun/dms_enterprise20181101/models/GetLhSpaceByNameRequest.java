// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLhSpaceByNameRequest extends TeaModel {
    /**
     * <p>The name of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceName")
    public String spaceName;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetLhSpaceByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLhSpaceByNameRequest self = new GetLhSpaceByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetLhSpaceByNameRequest setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

    public GetLhSpaceByNameRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
