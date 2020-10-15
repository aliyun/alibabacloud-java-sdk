// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("AppVersions")
    public String appVersions;

    @NameInMap("Level")
    public String level;

    @NameInMap("OutDetailStatParams")
    public String outDetailStatParams;

    public static DescribeApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationRequest self = new DescribeApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationRequest setAppVersions(String appVersions) {
        this.appVersions = appVersions;
        return this;
    }
    public String getAppVersions() {
        return this.appVersions;
    }

    public DescribeApplicationRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeApplicationRequest setOutDetailStatParams(String outDetailStatParams) {
        this.outDetailStatParams = outDetailStatParams;
        return this;
    }
    public String getOutDetailStatParams() {
        return this.outDetailStatParams;
    }

}
