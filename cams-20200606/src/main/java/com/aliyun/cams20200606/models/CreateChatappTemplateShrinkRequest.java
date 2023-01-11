// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The category of the message template. Valid values:</p>
     * <br>
     * <p>*   **ACCOUNT_UPDATE**: account update</p>
     * <p>*   **PAYMENT_UPDATE**: payment update</p>
     * <p>*   **PERSONAL_FINANCE\_UPDATE**: personal finance update</p>
     * <p>*   **SHIPPING_UPDATE**: traffic update</p>
     * <p>*   **RESERVATION_UPDATE**: reservation update</p>
     * <p>*   **ISSUE_RESOLUTION**: issue resolution</p>
     * <p>*   **APPOINTMENT_UPDATE**: appointment update</p>
     * <p>*   **TRANSPORTATION_UPDATE**: logistics information update</p>
     * <p>*   **TICKET_UPDATE**: ticket update</p>
     * <p>*   **ALERT_UPDATE**: alert update</p>
     * <p>*   **AUTO_REPLY**: auto reply</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The unique identifier of the WhatsApp account that you register.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The examples of variables that are used when you create the message template.</p>
     */
    @NameInMap("Example")
    public String exampleShrink;

    /**
     * <p>Assigned by ISV for RAM user authentication and authorization.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the message template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the message template. Valid values:</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
     * <p>*   VIBER (under development)</p>
     * <p>*   LINE (under development)</p>
     */
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
