// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateInput extends TeaModel {
    /**
     * <p>The template build configuration.</p>
     */
    @NameInMap("buildConfig")
    public CreateTemplateBuildConfig buildConfig;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The template runtime configuration.</p>
     */
    @NameInMap("runtimeConfig")
    public CreateTemplateRuntimeConfig runtimeConfig;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static CreateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateInput self = new CreateTemplateInput();
        return TeaModel.build(map, self);
    }

    public CreateTemplateInput setBuildConfig(CreateTemplateBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public CreateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public CreateTemplateInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTemplateInput setRuntimeConfig(CreateTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public CreateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public CreateTemplateInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
