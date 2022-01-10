// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImageLabelsRequest extends TeaModel {
    // 镜像id
    @NameInMap("ImageId")
    public String imageId;

    // image过滤条件，获取满足条件的image的所有label
    @NameInMap("LabelFilter")
    public String labelFilter;

    // 标签列表，以逗号分隔
    @NameInMap("LabelKeys")
    public String labelKeys;

    // 地域
    @NameInMap("Region")
    public String region;

    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListImageLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageLabelsRequest self = new ListImageLabelsRequest();
        return TeaModel.build(map, self);
    }

    public ListImageLabelsRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListImageLabelsRequest setLabelFilter(String labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }
    public String getLabelFilter() {
        return this.labelFilter;
    }

    public ListImageLabelsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public ListImageLabelsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListImageLabelsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
