// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifySystemPropertyTemplateShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuto")
    public Boolean enableAuto;

    /**
     * <strong>example:</strong>
     * <p><a href="https://filepath****.com">https://filepath****.com</a></p>
     */
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("SystemPropertyInfo")
    public String systemPropertyInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>ap-angyvganxlf****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    public static ModifySystemPropertyTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemPropertyTemplateShrinkRequest self = new ModifySystemPropertyTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifySystemPropertyTemplateShrinkRequest setEnableAuto(Boolean enableAuto) {
        this.enableAuto = enableAuto;
        return this;
    }
    public Boolean getEnableAuto() {
        return this.enableAuto;
    }

    public ModifySystemPropertyTemplateShrinkRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ModifySystemPropertyTemplateShrinkRequest setSystemPropertyInfoShrink(String systemPropertyInfoShrink) {
        this.systemPropertyInfoShrink = systemPropertyInfoShrink;
        return this;
    }
    public String getSystemPropertyInfoShrink() {
        return this.systemPropertyInfoShrink;
    }

    public ModifySystemPropertyTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifySystemPropertyTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
