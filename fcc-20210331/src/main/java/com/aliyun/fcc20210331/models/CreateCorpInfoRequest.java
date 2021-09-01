// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class CreateCorpInfoRequest extends TeaModel {
    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("AppName")
    public String appName;

    public static CreateCorpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpInfoRequest self = new CreateCorpInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateCorpInfoRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateCorpInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
