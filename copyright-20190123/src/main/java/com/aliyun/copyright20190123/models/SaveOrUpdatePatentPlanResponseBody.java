// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveOrUpdatePatentPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public java.util.List<String> id;

    public static SaveOrUpdatePatentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdatePatentPlanResponseBody self = new SaveOrUpdatePatentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdatePatentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveOrUpdatePatentPlanResponseBody setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

}
