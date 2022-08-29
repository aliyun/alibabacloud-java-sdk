// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccAlgModelingsRequest extends TeaModel {
    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("ModelingClassificationId")
    public Long modelingClassificationId;

    public static ListCsccAlgModelingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccAlgModelingsRequest self = new ListCsccAlgModelingsRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccAlgModelingsRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ListCsccAlgModelingsRequest setModelingClassificationId(Long modelingClassificationId) {
        this.modelingClassificationId = modelingClassificationId;
        return this;
    }
    public Long getModelingClassificationId() {
        return this.modelingClassificationId;
    }

}
