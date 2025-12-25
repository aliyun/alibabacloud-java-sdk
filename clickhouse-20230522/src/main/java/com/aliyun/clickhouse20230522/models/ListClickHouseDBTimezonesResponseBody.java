// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListClickHouseDBTimezonesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeZones")
    public java.util.List<ListClickHouseDBTimezonesResponseBodyTimeZones> timeZones;

    public static ListClickHouseDBTimezonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClickHouseDBTimezonesResponseBody self = new ListClickHouseDBTimezonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClickHouseDBTimezonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClickHouseDBTimezonesResponseBody setTimeZones(java.util.List<ListClickHouseDBTimezonesResponseBodyTimeZones> timeZones) {
        this.timeZones = timeZones;
        return this;
    }
    public java.util.List<ListClickHouseDBTimezonesResponseBodyTimeZones> getTimeZones() {
        return this.timeZones;
    }

    public static class ListClickHouseDBTimezonesResponseBodyTimeZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClickHouseDBTimezonesResponseBodyTimeZones build(java.util.Map<String, ?> map) throws Exception {
            ListClickHouseDBTimezonesResponseBodyTimeZones self = new ListClickHouseDBTimezonesResponseBodyTimeZones();
            return TeaModel.build(map, self);
        }

        public ListClickHouseDBTimezonesResponseBodyTimeZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
