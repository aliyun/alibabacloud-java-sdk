// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeRecordDataRequest extends TeaModel {
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

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Acid")
    public String acid;

    @NameInMap("SecLevel")
    public Integer secLevel;

    public static DescribeRecordDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordDataRequest self = new DescribeRecordDataRequest();
        return TeaModel.build(map, self);
    }

}
