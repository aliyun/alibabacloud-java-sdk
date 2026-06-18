// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class DeleteQuotaRequest extends TeaModel {
    @NameInMap("tagValue")
    public String tagValue;

    public static DeleteQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaRequest self = new DeleteQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
