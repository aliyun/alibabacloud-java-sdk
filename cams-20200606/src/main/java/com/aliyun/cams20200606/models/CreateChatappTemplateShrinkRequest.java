// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateShrinkRequest extends TeaModel {
    // The category of the message template. Valid values:
    // 
    // *   **ACCOUNT_UPDATE**: account update
    // *   **PAYMENT_UPDATE**: payment update
    // *   **PERSONAL_FINANCE\_UPDATE**: personal finance update
    // *   **SHIPPING_UPDATE**: traffic update
    // *   **RESERVATION_UPDATE**: reservation update
    // *   **ISSUE_RESOLUTION**: issue resolution
    // *   **APPOINTMENT_UPDATE**: appointment update
    // *   **TRANSPORTATION_UPDATE**: logistics information update
    // *   **TICKET_UPDATE**: ticket update
    // *   **ALERT_UPDATE**: alert update
    // *   **AUTO_REPLY**: auto reply
    @NameInMap("Category")
    public String category;

    // The components of the message template.
    @NameInMap("Components")
    public String componentsShrink;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    // The unique identifier of the WhatsApp account that you register.
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    // The examples of variables that are used when you create the message template.
    @NameInMap("Example")
    public String exampleShrink;

    // Assigned by ISV for RAM user authentication and authorization.
    @NameInMap("IsvCode")
    public String isvCode;

    // The language that is used in the message template.
    @NameInMap("Language")
    public String language;

    // The name of the message template.
    @NameInMap("Name")
    public String name;

    // The type of the message template. Valid values:
    // 
    // *   **WHATSAPP**
    // *   VIBER (under development)
    // *   LINE (under development)
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateShrinkRequest self = new CreateChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateChatappTemplateShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public CreateChatappTemplateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreateChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public CreateChatappTemplateShrinkRequest setExampleShrink(String exampleShrink) {
        this.exampleShrink = exampleShrink;
        return this;
    }
    public String getExampleShrink() {
        return this.exampleShrink;
    }

    public CreateChatappTemplateShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public CreateChatappTemplateShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateChatappTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatappTemplateShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
