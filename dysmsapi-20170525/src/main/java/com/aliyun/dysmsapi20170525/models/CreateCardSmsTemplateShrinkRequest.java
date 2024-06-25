// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The mobile phone manufacturer. Valid values:</p>
     * <ul>
     * <li><strong>HuaWei</strong>: HUAWEI</li>
     * <li><strong>XiaoMi</strong>: Xiaomi</li>
     * <li><strong>OPPO</strong>: OPPO</li>
     * <li><strong>VIVO</strong>: vivo</li>
     * <li><strong>MEIZU</strong>: MEIZU</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the system automatically specifies a supported mobile phone manufacturer.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>XiaoMi</p>
     */
    @NameInMap("Factorys")
    public String factorys;

    /**
     * <p>The description of the message template.</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <p>The content of the card message template.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>For information about fields such as Template, ExtendInfo, TemplateContent, TmpCard, and Action, see <a href="https://help.aliyun.com/document_detail/434929.html">Parameters of card message templates</a>.</p>
     * </li>
     * <li><p>Message template content varies based on the template type. For more information, see <a href="https://help.aliyun.com/document_detail/435361.html">Sample message templates</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public String templateShrink;

    /**
     * <p>The name of the card message template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateCardSmsTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateShrinkRequest self = new CreateCardSmsTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateShrinkRequest setFactorys(String factorys) {
        this.factorys = factorys;
        return this;
    }
    public String getFactorys() {
        return this.factorys;
    }

    public CreateCardSmsTemplateShrinkRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateCardSmsTemplateShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

    public CreateCardSmsTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
