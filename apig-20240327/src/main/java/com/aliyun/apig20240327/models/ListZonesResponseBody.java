// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListZonesResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListZonesResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E8079207-B651-592A-A565-23E9EE5673B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListZonesResponseBody self = new ListZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListZonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListZonesResponseBody setData(ListZonesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListZonesResponseBodyData getData() {
        return this.data;
    }

    public ListZonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListZonesResponseBodyDataItems extends TeaModel {
        /**
         * <p>Whether QAT (Quality Assurance Testing) is supported in this zone</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("supportQat")
        public String supportQat;

        /**
         * <p>The zone identifier</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-c</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListZonesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListZonesResponseBodyDataItems self = new ListZonesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListZonesResponseBodyDataItems setSupportQat(String supportQat) {
            this.supportQat = supportQat;
            return this;
        }
        public String getSupportQat() {
            return this.supportQat;
        }

        public ListZonesResponseBodyDataItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListZonesResponseBodyData extends TeaModel {
        /**
         * <p>The list of queried zones.</p>
         */
        @NameInMap("items")
        public java.util.List<ListZonesResponseBodyDataItems> items;

        public static ListZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListZonesResponseBodyData self = new ListZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListZonesResponseBodyData setItems(java.util.List<ListZonesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListZonesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
