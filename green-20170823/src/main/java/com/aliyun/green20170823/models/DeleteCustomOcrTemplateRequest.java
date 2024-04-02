// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteCustomOcrTemplateRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    public static DeleteCustomOcrTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomOcrTemplateRequest self = new DeleteCustomOcrTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomOcrTemplateRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
