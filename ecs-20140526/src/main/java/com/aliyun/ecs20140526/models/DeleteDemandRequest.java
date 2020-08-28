// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDemandRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DemandId")
    @Validation(required = true)
    public String demandId;

    @NameInMap("Reason")
    public String reason;

    public static DeleteDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDemandRequest self = new DeleteDemandRequest();
        return TeaModel.build(map, self);
    }

}
