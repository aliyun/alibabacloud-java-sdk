// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PublishRealRequest extends TeaModel {
    // datasetId
    @NameInMap("DatasetId")
    public Long datasetId;

    // tag
    @NameInMap("Tag")
    public String tag;

    // projectId
    @NameInMap("ProjectId")
    public Long projectId;

    public static PublishRealRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishRealRequest self = new PublishRealRequest();
        return TeaModel.build(map, self);
    }

    public PublishRealRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public PublishRealRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public PublishRealRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
