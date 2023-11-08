// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListFormRemarksRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormInstanceIdList")
    public java.util.List<String> formInstanceIdList;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("SystemToken")
    public String systemToken;

    public static ListFormRemarksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFormRemarksRequest self = new ListFormRemarksRequest();
        return TeaModel.build(map, self);
    }

    public ListFormRemarksRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListFormRemarksRequest setFormInstanceIdList(java.util.List<String> formInstanceIdList) {
        this.formInstanceIdList = formInstanceIdList;
        return this;
    }
    public java.util.List<String> getFormInstanceIdList() {
        return this.formInstanceIdList;
    }

    public ListFormRemarksRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public ListFormRemarksRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
