// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TemplateStatus")
    @Validation(required = true)
    public Integer templateStatus;

    @NameInMap("Reason")
    @Validation(required = true)
    public String reason;

    @NameInMap("TemplateCode")
    @Validation(required = true)
    public String templateCode;

    @NameInMap("TemplateType")
    @Validation(required = true)
    public Integer templateType;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("TemplateContent")
    @Validation(required = true)
    public String templateContent;

    @NameInMap("CreateDate")
    @Validation(required = true)
    public String createDate;

    public static QuerySmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateResponse self = new QuerySmsTemplateResponse();
        return TeaModel.build(map, self);
    }

}
