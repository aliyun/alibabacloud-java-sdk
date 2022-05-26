// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryBindsByOuterIdRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MinorOuterId")
    public String minorOuterId;

    @NameInMap("OuterId")
    public String outerId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryBindsByOuterIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBindsByOuterIdRequest self = new QueryBindsByOuterIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryBindsByOuterIdRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryBindsByOuterIdRequest setMinorOuterId(String minorOuterId) {
        this.minorOuterId = minorOuterId;
        return this;
    }
    public String getMinorOuterId() {
        return this.minorOuterId;
    }

    public QueryBindsByOuterIdRequest setOuterId(String outerId) {
        this.outerId = outerId;
        return this;
    }
    public String getOuterId() {
        return this.outerId;
    }

    public QueryBindsByOuterIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
