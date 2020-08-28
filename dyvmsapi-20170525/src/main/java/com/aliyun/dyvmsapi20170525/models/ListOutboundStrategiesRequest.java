// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOutboundStrategiesRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("BuId")
    public Long buId;

    @NameInMap("Keyword")
    public String keyword;

    public static ListOutboundStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundStrategiesRequest self = new ListOutboundStrategiesRequest();
        return TeaModel.build(map, self);
    }

}
