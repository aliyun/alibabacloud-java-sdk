// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgAccountLoginPermissionRequest extends TeaModel {
    @NameInMap("AgAccountType")
    public String agAccountType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Pk")
    public String pk;

    public static QueryAgAccountLoginPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgAccountLoginPermissionRequest self = new QueryAgAccountLoginPermissionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgAccountLoginPermissionRequest setAgAccountType(String agAccountType) {
        this.agAccountType = agAccountType;
        return this;
    }
    public String getAgAccountType() {
        return this.agAccountType;
    }

    public QueryAgAccountLoginPermissionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAgAccountLoginPermissionRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public QueryAgAccountLoginPermissionRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
