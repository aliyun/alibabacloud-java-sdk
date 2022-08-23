// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class JudgeXingTianBusinessRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("RealmId")
    public String realmId;

    public static JudgeXingTianBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeXingTianBusinessRequest self = new JudgeXingTianBusinessRequest();
        return TeaModel.build(map, self);
    }

    public JudgeXingTianBusinessRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public JudgeXingTianBusinessRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public JudgeXingTianBusinessRequest setRealmId(String realmId) {
        this.realmId = realmId;
        return this;
    }
    public String getRealmId() {
        return this.realmId;
    }

}
