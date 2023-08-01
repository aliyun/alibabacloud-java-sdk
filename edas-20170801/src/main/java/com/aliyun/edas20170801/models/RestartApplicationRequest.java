// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the elastic compute container (ECC) that corresponds to the ECS instance on which you want to restart the application. You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see [QueryApplicationStatus](~~149394~~).</p>
     * <br>
     * <p>*   Separate multiple ECC IDs with commas (,).</p>
     * <p>*   If you leave this parameter empty, the application will be restarted on all the ECS instances deployed with the application.</p>
     */
    @NameInMap("EccInfo")
    public String eccInfo;

    public static RestartApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationRequest self = new RestartApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RestartApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

}
