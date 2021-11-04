// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectRequest extends TeaModel {
    // 工程业务配置。如果是直播剪辑工程必填OutputMediaConfig.StorageLocation,   Path 不填默认合成的直播片段存储在根路径下 OutputMediaTarget 不填默认oss-object，可以填vod-media 表示存储到vod  OutputMediaTarget 为vod-media 时，Path不生效。
    @NameInMap("BusinessConfig")
    public String businessConfig;

    // 云剪辑工程封面
    @NameInMap("CoverURL")
    public String coverURL;

    // 云剪辑工程描述
    @NameInMap("Description")
    public String description;

    // 工程关联素材，多个素材以逗号（,）分隔；每种类型最多支持10个素材ID
    @NameInMap("MaterialMaps")
    public String materialMaps;

    // 剪辑工程类型，EditingProject: 普通剪辑工程；LiveEditingProject: 直播剪辑工程
    @NameInMap("ProjectType")
    public String projectType;

    // 云剪辑工程时间线，Json格式
    @NameInMap("Timeline")
    public String timeline;

    // 云剪辑工程标题
    @NameInMap("Title")
    public String title;

    public static CreateEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEditingProjectRequest self = new CreateEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateEditingProjectRequest setBusinessConfig(String businessConfig) {
        this.businessConfig = businessConfig;
        return this;
    }
    public String getBusinessConfig() {
        return this.businessConfig;
    }

    public CreateEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public CreateEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEditingProjectRequest setMaterialMaps(String materialMaps) {
        this.materialMaps = materialMaps;
        return this;
    }
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    public CreateEditingProjectRequest setProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }
    public String getProjectType() {
        return this.projectType;
    }

    public CreateEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public CreateEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
