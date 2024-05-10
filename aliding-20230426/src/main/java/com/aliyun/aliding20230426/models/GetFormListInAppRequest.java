// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormListInAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormTypes")
    public String formTypes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static GetFormListInAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFormListInAppRequest self = new GetFormListInAppRequest();
        return TeaModel.build(map, self);
    }

    public GetFormListInAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetFormListInAppRequest setFormTypes(String formTypes) {
        this.formTypes = formTypes;
        return this;
    }
    public String getFormTypes() {
        return this.formTypes;
    }

    public GetFormListInAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetFormListInAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFormListInAppRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
