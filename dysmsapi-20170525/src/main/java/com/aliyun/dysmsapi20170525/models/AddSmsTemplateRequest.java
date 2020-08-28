// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsTemplateRequest extends TeaModel {
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

    @NameInMap("TemplateContent")
    @Validation(required = true)
    public String templateContent;

    @NameInMap("Remark")
    @Validation(required = true)
    public String remark;

    public static AddSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSmsTemplateRequest self = new AddSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

}
