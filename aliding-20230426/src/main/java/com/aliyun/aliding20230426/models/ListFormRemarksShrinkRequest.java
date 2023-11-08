// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListFormRemarksShrinkRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormInstanceIdList")
    public String formInstanceIdListShrink;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("SystemToken")
    public String systemToken;

    public static ListFormRemarksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFormRemarksShrinkRequest self = new ListFormRemarksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFormRemarksShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListFormRemarksShrinkRequest setFormInstanceIdListShrink(String formInstanceIdListShrink) {
        this.formInstanceIdListShrink = formInstanceIdListShrink;
        return this;
    }
    public String getFormInstanceIdListShrink() {
        return this.formInstanceIdListShrink;
    }

    public ListFormRemarksShrinkRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public ListFormRemarksShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
