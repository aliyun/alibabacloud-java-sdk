// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>A list of zone IDs.</p>
     */
    @NameInMap("AvailableZones")
    public java.util.List<String> availableZones;

    /**
     * <p>A list of primary zones.</p>
     */
    @NameInMap("MasterZones")
    public java.util.List<String> masterZones;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of secondary zone IDs.</p>
     */
    @NameInMap("SlaveZones")
    public java.util.List<String> slaveZones;

    /**
     * <p>Indicates whether the zone supports the multicast feature.</p>
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
