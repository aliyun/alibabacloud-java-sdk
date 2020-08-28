// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendDetailsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumber")
    @Validation(required = true)
    public String phoneNumber;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SendDate")
    @Validation(required = true)
    public String sendDate;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Long currentPage;

    public static QuerySendDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsRequest self = new QuerySendDetailsRequest();
        return TeaModel.build(map, self);
    }

}
