// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StopApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance on which you want to stop the application. You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see [QueryApplicationStatus](~~149394~~).</p>
     * <br>
     * <p>*   If you want to stop the application on multiple ECS instances, separate the ECC IDs with commas (,).</p>
     * <p>*   If you leave this parameter empty, the application will be stopped on all ECS instances.</p>
     */
    @NameInMap("EccInfo")
    public String eccInfo;

    public static StopApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationRequest self = new StopApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StopApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

}
