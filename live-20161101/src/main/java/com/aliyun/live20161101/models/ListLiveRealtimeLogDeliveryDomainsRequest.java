// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryDomainsRequest extends TeaModel {
    @NameInMap("Project")
    @Validation(required = true)
    public String project;

    @NameInMap("Logstore")
    @Validation(required = true)
    public String logstore;

    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    public static ListLiveRealtimeLogDeliveryDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryDomainsRequest self = new ListLiveRealtimeLogDeliveryDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListLiveRealtimeLogDeliveryDomainsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
