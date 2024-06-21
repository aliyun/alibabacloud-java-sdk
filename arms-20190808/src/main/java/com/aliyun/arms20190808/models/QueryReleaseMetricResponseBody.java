// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;data&quot;:{&quot;SystemCpuUser&quot;:{&quot;all&quot;:[{&quot;date&quot;:1632798718000,&quot;val&quot;:4.3277,&quot;dim&quot;:&quot;SystemCpuUser&quot;},{&quot;date&quot;:1632798733000,&quot;val&quot;:8.1091,&quot;dim&quot;:&quot;SystemCpuUser&quot;}]},&quot;SystemMemUtil&quot;:{&quot;all&quot;:[{&quot;date&quot;:1632798718000,&quot;val&quot;:73.4227,&quot;dim&quot;:&quot;SystemMemUtil&quot;},{&quot;date&quot;:1632798733000,&quot;val&quot;:93.0977,&quot;dim&quot;:&quot;SystemMemUtil&quot;}]}},&quot;success&quot;:true}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>46355DD8-FC56-40C5-BFC6-269DE4F9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryReleaseMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReleaseMetricResponseBody self = new QueryReleaseMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReleaseMetricResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryReleaseMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
