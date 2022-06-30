// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteSurveyResourcesRequest extends TeaModel {
    @NameInMap("ids")
    public String ids;

    public static DeleteSurveyResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSurveyResourcesRequest self = new DeleteSurveyResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSurveyResourcesRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
