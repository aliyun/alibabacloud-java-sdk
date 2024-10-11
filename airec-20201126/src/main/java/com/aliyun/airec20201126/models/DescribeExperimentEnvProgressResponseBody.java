// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeExperimentEnvProgressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeExperimentEnvProgressResponseBodyResult result;

    public static DescribeExperimentEnvProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExperimentEnvProgressResponseBody self = new DescribeExperimentEnvProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExperimentEnvProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExperimentEnvProgressResponseBody setResult(DescribeExperimentEnvProgressResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeExperimentEnvProgressResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeExperimentEnvProgressResponseBodyResult extends TeaModel {
        @NameInMap("progress")
        public Integer progress;

        @NameInMap("status")
        public String status;

        public static DescribeExperimentEnvProgressResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeExperimentEnvProgressResponseBodyResult self = new DescribeExperimentEnvProgressResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeExperimentEnvProgressResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeExperimentEnvProgressResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
