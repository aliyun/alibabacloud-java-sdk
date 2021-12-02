// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MonitorExaminationRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    // A short description of struct
    @NameInMap("Type")
    public Long type;

    public static MonitorExaminationRequest build(java.util.Map<String, ?> map) throws Exception {
        MonitorExaminationRequest self = new MonitorExaminationRequest();
        return TeaModel.build(map, self);
    }

    public MonitorExaminationRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public MonitorExaminationRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
