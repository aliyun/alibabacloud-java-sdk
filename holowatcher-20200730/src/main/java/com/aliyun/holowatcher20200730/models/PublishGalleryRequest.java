// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PublishGalleryRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Template")
    public String template;

    public static PublishGalleryRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishGalleryRequest self = new PublishGalleryRequest();
        return TeaModel.build(map, self);
    }

    public PublishGalleryRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public PublishGalleryRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public PublishGalleryRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
