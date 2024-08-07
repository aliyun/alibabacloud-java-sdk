// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DiagnoseInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The diagnosis status. Valid values: Supported: SUCCESS, FAILED, and RUNNING.</p>
     */
    @NameInMap("Result")
    public DiagnoseInstanceResponseBodyResult result;

    public static DiagnoseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseInstanceResponseBody self = new DiagnoseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DiagnoseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiagnoseInstanceResponseBody setResult(DiagnoseInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DiagnoseInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DiagnoseInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the diagnostic instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1535745731000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>trigger__2020-08-17T17:09:02</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("state")
        public String state;

        public static DiagnoseInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseInstanceResponseBodyResult self = new DiagnoseInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DiagnoseInstanceResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DiagnoseInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DiagnoseInstanceResponseBodyResult setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public DiagnoseInstanceResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
