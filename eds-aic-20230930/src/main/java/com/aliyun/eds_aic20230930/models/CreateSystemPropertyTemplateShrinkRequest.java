// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateSystemPropertyTemplateShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically generate preset system properties.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuto")
    public Boolean enableAuto;

    /**
     * <p>The URL of the property template file. The API parses the file synchronously. An error is returned if the file format is invalid.</p>
     * <blockquote>
     * <p>The file must be in the following format: <code>{ &quot;properties&quot;:{&quot;key1&quot;:&quot;value1&quot;}}</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://filepath****.com">https://filepath****.com</a></p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The information about the system property template.</p>
     */
    @NameInMap("SystemPropertyInfo")
    public String systemPropertyInfoShrink;

    /**
     * <p>The name of the template. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>Be 2 to 32 characters in length.</p>
     * </li>
     * <li><p>Start with an uppercase or lowercase letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>Contain letters, digits, colons (:), underscores (_), and hyphens (-). Periods (.) are not supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Template1</p>
     */
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
