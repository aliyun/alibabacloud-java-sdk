// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateCode")
    @Validation(required = true)
    public String templateCode;

    public static QuerySmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateRequest self = new QuerySmsTemplateRequest();
        return TeaModel.build(map, self);
    }

}
