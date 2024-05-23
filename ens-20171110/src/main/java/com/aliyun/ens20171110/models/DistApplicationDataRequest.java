// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DistApplicationDataRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplications operation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The list of data files that you want to distribute. The value must be a JSON string.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The canary release policy. The value must be a JSON string. You can specify multiple distribution policies. By default, all data files are distributed.</p>
     */
    @NameInMap("DistStrategy")
    public String distStrategy;

    public static DistApplicationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DistApplicationDataRequest self = new DistApplicationDataRequest();
        return TeaModel.build(map, self);
    }

    public DistApplicationDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DistApplicationDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DistApplicationDataRequest setDistStrategy(String distStrategy) {
        this.distStrategy = distStrategy;
        return this;
    }
    public String getDistStrategy() {
        return this.distStrategy;
    }

}
