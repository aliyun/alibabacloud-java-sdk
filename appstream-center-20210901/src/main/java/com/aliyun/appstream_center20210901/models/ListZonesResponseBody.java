// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListZonesResponseBody extends TeaModel {
    /**
     * <p>The zone query result.</p>
     */
    @NameInMap("ListZonesModel")
    public ListZonesResponseBodyListZonesModel listZonesModel;

    /**
     * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZonesResponseBody self = new ListZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZonesResponseBody setListZonesModel(ListZonesResponseBodyListZonesModel listZonesModel) {
        this.listZonesModel = listZonesModel;
        return this;
    }
    public ListZonesResponseBodyListZonesModel getListZonesModel() {
        return this.listZonesModel;
    }

    public ListZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListZonesResponseBodyListZonesModel extends TeaModel {
        /**
         * <p>The list of available zone IDs for the specified product type and operating system type in the current region. When creating a resource that requires a vSwitch, select a vSwitch in one of these zones.</p>
         */
        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static ListZonesResponseBodyListZonesModel build(java.util.Map<String, ?> map) throws Exception {
            ListZonesResponseBodyListZonesModel self = new ListZonesResponseBodyListZonesModel();
            return TeaModel.build(map, self);
        }

        public ListZonesResponseBodyListZonesModel setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
