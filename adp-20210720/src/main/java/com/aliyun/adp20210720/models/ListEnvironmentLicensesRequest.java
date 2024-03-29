// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentLicensesRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("scope")
    public String scope;

    @NameInMap("type")
    public String type;

    public static ListEnvironmentLicensesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentLicensesRequest self = new ListEnvironmentLicensesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentLicensesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEnvironmentLicensesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEnvironmentLicensesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListEnvironmentLicensesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
