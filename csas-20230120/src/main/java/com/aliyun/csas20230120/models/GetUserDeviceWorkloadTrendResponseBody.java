// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceWorkloadTrendResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The English name of the workload type. Valid values:</p>
     * <ul>
     * <li><strong>CPU Usage</strong>: returned when WorkloadType is set to cpu.</li>
     * <li><strong>Memory Usage</strong>: returned when WorkloadType is set to mem.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU Usage</p>
     */
    @NameInMap("TitleEn")
    public String titleEn;

    /**
     * <p>The Chinese name of the workload type. Valid values:</p>
     * <ul>
     * <li><strong>CPU使用率</strong>: returned when WorkloadType is set to cpu.</li>
     * <li><strong>内存使用率</strong>: returned when WorkloadType is set to mem.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU 使用率</p>
     */
    @NameInMap("TitleZh")
    public String titleZh;

    /**
     * <p>The list of workload trend data points, sorted by time in ascending order.</p>
     */
    @NameInMap("WorkloadList")
    public java.util.List<GetUserDeviceWorkloadTrendResponseBodyWorkloadList> workloadList;

    public static GetUserDeviceWorkloadTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceWorkloadTrendResponseBody self = new GetUserDeviceWorkloadTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceWorkloadTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserDeviceWorkloadTrendResponseBody setTitleEn(String titleEn) {
        this.titleEn = titleEn;
        return this;
    }
    public String getTitleEn() {
        return this.titleEn;
    }

    public GetUserDeviceWorkloadTrendResponseBody setTitleZh(String titleZh) {
        this.titleZh = titleZh;
        return this;
    }
    public String getTitleZh() {
        return this.titleZh;
    }

    public GetUserDeviceWorkloadTrendResponseBody setWorkloadList(java.util.List<GetUserDeviceWorkloadTrendResponseBodyWorkloadList> workloadList) {
        this.workloadList = workloadList;
        return this;
    }
    public java.util.List<GetUserDeviceWorkloadTrendResponseBodyWorkloadList> getWorkloadList() {
        return this.workloadList;
    }

    public static class GetUserDeviceWorkloadTrendResponseBodyWorkloadList extends TeaModel {
        /**
         * <p>The collection time of the data point. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755360600</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The workload usage percentage. Valid values: 0 to 100, with two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>35.27</p>
         */
        @NameInMap("Workload")
        public Double workload;

        public static GetUserDeviceWorkloadTrendResponseBodyWorkloadList build(java.util.Map<String, ?> map) throws Exception {
            GetUserDeviceWorkloadTrendResponseBodyWorkloadList self = new GetUserDeviceWorkloadTrendResponseBodyWorkloadList();
            return TeaModel.build(map, self);
        }

        public GetUserDeviceWorkloadTrendResponseBodyWorkloadList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetUserDeviceWorkloadTrendResponseBodyWorkloadList setWorkload(Double workload) {
            this.workload = workload;
            return this;
        }
        public Double getWorkload() {
            return this.workload;
        }

    }

}
