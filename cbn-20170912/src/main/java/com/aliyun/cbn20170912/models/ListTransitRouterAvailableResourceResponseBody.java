// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public java.util.List<String> availableZones;

    /**
     * <p>ListTransitRouterAvailableResource</p>
     */
    @NameInMap("MasterZones")
    public java.util.List<String> masterZones;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation that you want to perform. Set the value to **ListTransitRouterAvailableResource**.</p>
     */
    @NameInMap("SlaveZones")
    public java.util.List<String> slaveZones;

    /**
     * <p>是否为支持组播功能的可用区信息。</p>
     */
    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    public static ListTransitRouterAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterAvailableResourceResponseBody self = new ListTransitRouterAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterAvailableResourceResponseBody setAvailableZones(java.util.List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<String> getAvailableZones() {
        return this.availableZones;
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

    public ListTransitRouterAvailableResourceResponseBody setSupportMulticast(Boolean supportMulticast) {
        this.supportMulticast = supportMulticast;
        return this;
    }
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

}
