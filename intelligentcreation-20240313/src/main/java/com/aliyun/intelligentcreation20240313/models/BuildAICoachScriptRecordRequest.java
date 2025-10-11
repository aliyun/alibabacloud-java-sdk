// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BuildAICoachScriptRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://yic-pre.oss-cn-hangzhou.aliyuncs.com/0922test/%E6%B5%8B%E8%AF%95%E5%89%A7%E6%9C%AC0925-%E5%9B%BA%E5%AE%9A%E9%97%AE%E7%AD%94%202.json">https://yic-pre.oss-cn-hangzhou.aliyuncs.com/0922test/%E6%B5%8B%E8%AF%95%E5%89%A7%E6%9C%AC0925-%E5%9B%BA%E5%AE%9A%E9%97%AE%E7%AD%94%202.json</a></p>
     */
    @NameInMap("scriptJsonUrl")
    public String scriptJsonUrl;

    public static BuildAICoachScriptRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildAICoachScriptRecordRequest self = new BuildAICoachScriptRecordRequest();
        return TeaModel.build(map, self);
    }

    public BuildAICoachScriptRecordRequest setScriptJsonUrl(String scriptJsonUrl) {
        this.scriptJsonUrl = scriptJsonUrl;
        return this;
    }
    public String getScriptJsonUrl() {
        return this.scriptJsonUrl;
    }

}
