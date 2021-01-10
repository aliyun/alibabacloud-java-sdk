// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountProjectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectCount")
    public Integer projectCount;

    public static CountProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountProjectsResponseBody self = new CountProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountProjectsResponseBody setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
        return this;
    }
    public Integer getProjectCount() {
        return this.projectCount;
    }

}
