// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetFormDataByIdListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormInstanceIdList")
    public java.util.List<String> formInstanceIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("NeedFormInstanceValue")
    public Boolean needFormInstanceValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static BatchGetFormDataByIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFormDataByIdListRequest self = new BatchGetFormDataByIdListRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetFormDataByIdListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchGetFormDataByIdListRequest setFormInstanceIdList(java.util.List<String> formInstanceIdList) {
        this.formInstanceIdList = formInstanceIdList;
        return this;
    }
    public java.util.List<String> getFormInstanceIdList() {
        return this.formInstanceIdList;
    }

    public BatchGetFormDataByIdListRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchGetFormDataByIdListRequest setNeedFormInstanceValue(Boolean needFormInstanceValue) {
        this.needFormInstanceValue = needFormInstanceValue;
        return this;
    }
    public Boolean getNeedFormInstanceValue() {
        return this.needFormInstanceValue;
    }

    public BatchGetFormDataByIdListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
