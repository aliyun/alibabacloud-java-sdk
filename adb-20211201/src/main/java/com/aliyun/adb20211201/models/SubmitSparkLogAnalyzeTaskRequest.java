// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SubmitSparkLogAnalyzeTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static SubmitSparkLogAnalyzeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkLogAnalyzeTaskRequest self = new SubmitSparkLogAnalyzeTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkLogAnalyzeTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
