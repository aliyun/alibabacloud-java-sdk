// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeIMVInfosResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The queried materialized views.</p>
     */
    @NameInMap("ImvInfos")
    public java.util.List<DescribeIMVInfosResponseBodyImvInfos> imvInfos;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIMVInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMVInfosResponseBody self = new DescribeIMVInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIMVInfosResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeIMVInfosResponseBody setImvInfos(java.util.List<DescribeIMVInfosResponseBodyImvInfos> imvInfos) {
        this.imvInfos = imvInfos;
        return this;
    }
    public java.util.List<DescribeIMVInfosResponseBodyImvInfos> getImvInfos() {
        return this.imvInfos;
    }

    public DescribeIMVInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIMVInfosResponseBodyImvInfos extends TeaModel {
        /**
         * <p>The name of the table based on which the materialized view is created.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;public.&quot;t2&quot;</p>
         */
        @NameInMap("Base")
        public String base;

        /**
         * <p>The dependency between the materialized view and the base table and all metric values, which can be used to build a lineage graph.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;maintenance_calls\&quot; : 1, \&quot;avg_apply_time\&quot; : 2, \&quot;avg_calc_rows\&quot; : 1, \&quot;avg_calc_time\&quot; : 11, \&quot;avg_delta_rows\&quot; : 1, \&quot;avg_maintenance_total_time\&quot; : 14, \&quot;avg_maintenance_total_time_total\&quot; : 14, \&quot;max_apply_time\&quot; : 2, \&quot;max_calc_rows\&quot; : 1, \&quot;max_calc_time\&quot; : 11, \&quot;max_delta_rows\&quot; : 1, \&quot;max_maintenance_total_time\&quot; : 14, \&quot;max_maintenance_total_time_total\&quot; : 14, \&quot;min_apply_time\&quot; : 2, \&quot;min_calc_rows\&quot; : 1, \&quot;min_calc_time\&quot; : 11, \&quot;min_delta_rows\&quot; : 1, \&quot;min_maintenance_total_time\&quot; : 14, \&quot;min_maintenance_total_time_total\&quot; : 14, \&quot;max_outerjoin_apply_time\&quot; : null, \&quot;max_outerjoin_calc_rows\&quot; : null, \&quot;max_outerjoin_calc_time\&quot; : null, \&quot;max_outerjoin_delta_rows\&quot; : null, \&quot;avg_outerjoin_apply_time\&quot; : null, \&quot;avg_outerjoin_calc_rows\&quot; : null, \&quot;avg_outerjoin_calc_time\&quot; : null, \&quot;avg_outerjoin_delta_rows\&quot; : null, \&quot;min_outerjoin_apply_time\&quot; : null, \&quot;min_outerjoin_calc_rows\&quot; : null, \&quot;min_outerjoin_calc_time\&quot; : null, \&quot;min_outerjoin_delta_rows\&quot; : null, \&quot;create_rows\&quot; : null, \&quot;create_time\&quot; : null, \&quot;direct_visited\&quot; : null, \&quot;indirect_visited\&quot; : null, \&quot;max_refresh_rows\&quot; : null, \&quot;max_refresh_time\&quot; : null, \&quot;avg_refresh_rows\&quot; : null, \&quot;avg_refresh_time\&quot; : null, \&quot;min_refresh_rows\&quot; : null, \&quot;min_refresh_time\&quot; : null, \&quot;refresh_calls\&quot; : null, \&quot;avg_wait_lock_time\&quot; : null, \&quot;max_wait_lock_time\&quot; : null, \&quot;min_wait_lock_time\&quot; : null, \&quot;latest_maintenance_time\&quot; : \&quot;2023-08-09T07:39:14.753252+00:00\&quot;}</p>
         */
        @NameInMap("DetailInfo")
        public String detailInfo;

        /**
         * <p>The name of the materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>public.&quot;mv1&quot;</p>
         */
        @NameInMap("MV")
        public String MV;

        public static DescribeIMVInfosResponseBodyImvInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeIMVInfosResponseBodyImvInfos self = new DescribeIMVInfosResponseBodyImvInfos();
            return TeaModel.build(map, self);
        }

        public DescribeIMVInfosResponseBodyImvInfos setBase(String base) {
            this.base = base;
            return this;
        }
        public String getBase() {
            return this.base;
        }

        public DescribeIMVInfosResponseBodyImvInfos setDetailInfo(String detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public String getDetailInfo() {
            return this.detailInfo;
        }

        public DescribeIMVInfosResponseBodyImvInfos setMV(String MV) {
            this.MV = MV;
            return this;
        }
        public String getMV() {
            return this.MV;
        }

    }

}
