// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAgentSkillRequest extends TeaModel {
    /**
     * <p>The list of files in the skill package.</p>
     */
    @NameInMap("FileList")
    public java.util.List<String> fileList;

    /**
     * <p>The icon of the custom skill.</p>
     * 
     * <strong>example:</strong>
     * <p>icon01</p>
     */
    @NameInMap("IconKey")
    public String iconKey;

    /**
     * <p>The OSS path of the skill package. This parameter is reserved by the system and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>test/sk-test/current/skill.zip</p>
     */
    @NameInMap("PackageOssKey")
    public String packageOssKey;

    /**
     * <p>The skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>Current weather and forecasts with wttr.in via curl for locations, rain, temperature, travel planning.</p>
     */
    @NameInMap("SkillDescription")
    public String skillDescription;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>weather-enhanced</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The OSS download URL of the skill package. This parameter is required for API calls.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/weather_skill.zip?Expires=1788168088&OSSAccessKeyId=">https://test.oss-cn-hangzhou.aliyuncs.com/weather_skill.zip?Expires=1788168088&amp;OSSAccessKeyId=</a>****</p>
     */
    @NameInMap("SkillPackageUrl")
    public String skillPackageUrl;

    public static CreateAgentSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSkillRequest self = new CreateAgentSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSkillRequest setFileList(java.util.List<String> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<String> getFileList() {
        return this.fileList;
    }

    public CreateAgentSkillRequest setIconKey(String iconKey) {
        this.iconKey = iconKey;
        return this;
    }
    public String getIconKey() {
        return this.iconKey;
    }

    public CreateAgentSkillRequest setPackageOssKey(String packageOssKey) {
        this.packageOssKey = packageOssKey;
        return this;
    }
    public String getPackageOssKey() {
        return this.packageOssKey;
    }

    public CreateAgentSkillRequest setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
        return this;
    }
    public String getSkillDescription() {
        return this.skillDescription;
    }

    public CreateAgentSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CreateAgentSkillRequest setSkillPackageUrl(String skillPackageUrl) {
        this.skillPackageUrl = skillPackageUrl;
        return this;
    }
    public String getSkillPackageUrl() {
        return this.skillPackageUrl;
    }

}
