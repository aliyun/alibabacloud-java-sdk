// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterAvailableResourceResponseBody extends TeaModel {
    @NameInMap("MasterZones")
    public java.util.List<String> masterZones;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlaveZones")
    public java.util.List<String> slaveZones;

    public static ListTransitRouterAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterAvailableResourceResponseBody self = new ListTransitRouterAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterAvailableResourceResponseBody setMasterZones(java.util.List<String> masterZones) {
        this.masterZones = masterZones;
        return this;
    }
    public java.util.List<String> getMasterZones() {
        return this.masterZones;
    }

    public ListTransitRouterAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterAvailableResourceResponseBody setSlaveZones(java.util.List<String> slaveZones) {
        this.slaveZones = slaveZones;
        return this;
    }
    public java.util.List<String> getSlaveZones() {
        return this.slaveZones;
    }

}
