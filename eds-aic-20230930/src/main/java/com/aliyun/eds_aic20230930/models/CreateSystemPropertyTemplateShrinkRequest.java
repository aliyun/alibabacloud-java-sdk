// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateSystemPropertyTemplateShrinkRequest extends TeaModel {
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

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateSystemPropertyTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemPropertyTemplateShrinkRequest self = new CreateSystemPropertyTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSystemPropertyTemplateShrinkRequest setEnableAuto(Boolean enableAuto) {
        this.enableAuto = enableAuto;
        return this;
    }
    public Boolean getEnableAuto() {
        return this.enableAuto;
    }

    public CreateSystemPropertyTemplateShrinkRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateSystemPropertyTemplateShrinkRequest setSystemPropertyInfoShrink(String systemPropertyInfoShrink) {
        this.systemPropertyInfoShrink = systemPropertyInfoShrink;
        return this;
    }
    public String getSystemPropertyInfoShrink() {
        return this.systemPropertyInfoShrink;
    }

    public CreateSystemPropertyTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
