// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StopApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c627c157-560d*******</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance on which you want to stop the application. You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see <a href="https://help.aliyun.com/document_detail/149394.html">QueryApplicationStatus</a>.</p>
     * <ul>
     * <li>If you want to stop the application on multiple ECS instances, separate the ECC IDs with commas (,).</li>
     * <li>If you leave this parameter empty, the application will be stopped on all ECS instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>74ee9166-<strong><strong>1f6-bcb60e5b</strong></strong></p>
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
