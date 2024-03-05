// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetYunQiTaskByRecordIdRequest extends TeaModel {
    @NameInMap("recordId")
    public String recordId;

    public static GetYunQiTaskByRecordIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYunQiTaskByRecordIdRequest self = new GetYunQiTaskByRecordIdRequest();
        return TeaModel.build(map, self);
    }

    public GetYunQiTaskByRecordIdRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
