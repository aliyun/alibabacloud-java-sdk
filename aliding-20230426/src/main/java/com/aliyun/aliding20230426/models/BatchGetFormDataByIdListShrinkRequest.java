// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetFormDataByIdListShrinkRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormInstanceIdList")
    public String formInstanceIdListShrink;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("NeedFormInstanceValue")
    public Boolean needFormInstanceValue;

    @NameInMap("SystemToken")
    public String systemToken;

    public static BatchGetFormDataByIdListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFormDataByIdListShrinkRequest self = new BatchGetFormDataByIdListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetFormDataByIdListShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchGetFormDataByIdListShrinkRequest setFormInstanceIdListShrink(String formInstanceIdListShrink) {
        this.formInstanceIdListShrink = formInstanceIdListShrink;
        return this;
    }
    public String getFormInstanceIdListShrink() {
        return this.formInstanceIdListShrink;
    }

    public BatchGetFormDataByIdListShrinkRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchGetFormDataByIdListShrinkRequest setNeedFormInstanceValue(Boolean needFormInstanceValue) {
        this.needFormInstanceValue = needFormInstanceValue;
        return this;
    }
    public Boolean getNeedFormInstanceValue() {
        return this.needFormInstanceValue;
    }

    public BatchGetFormDataByIdListShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
