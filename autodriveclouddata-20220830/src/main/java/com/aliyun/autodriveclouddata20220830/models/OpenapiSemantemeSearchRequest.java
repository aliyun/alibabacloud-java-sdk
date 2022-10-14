// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.autodriveclouddata20220830.models;

import com.aliyun.tea.*;

public class OpenapiSemantemeSearchRequest extends TeaModel {
    @NameInMap("semanteme")
    public String semanteme;

    @NameInMap("tenantCode")
    public String tenantCode;

    @NameInMap("topN")
    public Integer topN;

    @NameInMap("workspaceCode")
    public String workspaceCode;

    public static OpenapiSemantemeSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenapiSemantemeSearchRequest self = new OpenapiSemantemeSearchRequest();
        return TeaModel.build(map, self);
    }

    public OpenapiSemantemeSearchRequest setSemanteme(String semanteme) {
        this.semanteme = semanteme;
        return this;
    }
    public String getSemanteme() {
        return this.semanteme;
    }

    public OpenapiSemantemeSearchRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public OpenapiSemantemeSearchRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public OpenapiSemantemeSearchRequest setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }
    public String getWorkspaceCode() {
        return this.workspaceCode;
    }

}
