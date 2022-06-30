// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteSurveyJobRequest extends TeaModel {
    @NameInMap("id")
    public Long id;

    public static DeleteSurveyJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSurveyJobRequest self = new DeleteSurveyJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSurveyJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
