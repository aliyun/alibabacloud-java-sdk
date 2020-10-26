// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class ProjectQueryResponseBody extends TeaModel {
    // 返回结果
    @NameInMap("Result")
    public String result;

    public static ProjectQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectQueryResponseBody self = new ProjectQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectQueryResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
