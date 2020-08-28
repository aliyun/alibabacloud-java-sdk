// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ModifySmsTemplateRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateType")
    @Validation(required = true)
    public Integer templateType;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("TemplateCode")
    @Validation(required = true)
    public String templateCode;

    @NameInMap("TemplateContent")
    @Validation(required = true)
    public String templateContent;

    @NameInMap("Remark")
    @Validation(required = true)
    public String remark;

    public static ModifySmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySmsTemplateRequest self = new ModifySmsTemplateRequest();
        return TeaModel.build(map, self);
    }

}
