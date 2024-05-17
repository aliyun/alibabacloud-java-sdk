// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationEcuRequest extends TeaModel {
    /**
     * <p>The ID of the application whose ECUs you want to query. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the microservices namespace.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static ListApplicationEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationEcuRequest self = new ListApplicationEcuRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationEcuRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListApplicationEcuRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
