// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetCuHoursResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;cuHours&quot;: &quot;{2025-01-09 00:00:00=2.033333, 2025-01-09 01:00:00=2.033333, 2025-01-09 02:00:00=2.033333, 2025-01-09 03:00:00=2.033333, 2025-01-09 04:00:00=2.033333, 2025-01-09 05:00:00=2.033333, 2025-01-09 06:00:00=2.033333, 2025-01-09 07:00:00=2.033333, 2025-01-09 08:00:00=2.033333, 2025-01-09 09:00:00=1.933333, 2025-01-09 10:00:00=2.133333, 2025-01-09 11:00:00=3.100000, 2025-01-09 12:00:00=2.900000}&quot;
     * }</p>
     */
    @NameInMap("data")
    public GetCuHoursResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCuHoursResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCuHoursResponseBody self = new GetCuHoursResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCuHoursResponseBody setData(GetCuHoursResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCuHoursResponseBodyData getData() {
        return this.data;
    }

    public GetCuHoursResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCuHoursResponseBodyData extends TeaModel {
        /**
         * <p>The number of CU-hours consumed by a queue during a specified cycle. The value is an estimated value. Refer to your Alibaba Cloud bill for the actual number of consumed CU-hours.</p>
         * 
         * <strong>example:</strong>
         * <p>{2025-01-09 00:00:00=2.033333, 2025-01-09 01:00:00=2.033333, 2025-01-09 02:00:00=2.033333, 2025-01-09 03:00:00=2.033333, 2025-01-09 04:00:00=2.033333, 2025-01-09 05:00:00=2.033333, 2025-01-09 06:00:00=2.033333, 2025-01-09 07:00:00=2.033333, 2025-01-09 08:00:00=2.033333, 2025-01-09 09:00:00=1.933333, 2025-01-09 10:00:00=2.133333, 2025-01-09 11:00:00=3.100000, 2025-01-09 12:00:00=2.900000}</p>
         */
        @NameInMap("cuHours")
        public String cuHours;

        public static GetCuHoursResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCuHoursResponseBodyData self = new GetCuHoursResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCuHoursResponseBodyData setCuHours(String cuHours) {
            this.cuHours = cuHours;
            return this;
        }
        public String getCuHours() {
            return this.cuHours;
        }

    }

}
