// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccClassificationsRequest extends TeaModel {
    @NameInMap("ClassificationName")
    public String classificationName;

    public static ListCsccClassificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccClassificationsRequest self = new ListCsccClassificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccClassificationsRequest setClassificationName(String classificationName) {
        this.classificationName = classificationName;
        return this;
    }
    public String getClassificationName() {
        return this.classificationName;
    }

}
