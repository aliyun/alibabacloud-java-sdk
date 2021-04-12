// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AddQRCodeRequest extends TeaModel {
    // datasetId
    @NameInMap("DatasetId")
    public Long datasetId;

    // tag
    @NameInMap("Tag")
    public String tag;

    public static AddQRCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddQRCodeRequest self = new AddQRCodeRequest();
        return TeaModel.build(map, self);
    }

    public AddQRCodeRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public AddQRCodeRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
