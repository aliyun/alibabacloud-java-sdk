// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOrderedNumbersRequest extends TeaModel {
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

    public static ListOrderedNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrderedNumbersRequest self = new ListOrderedNumbersRequest();
        return TeaModel.build(map, self);
    }

}
