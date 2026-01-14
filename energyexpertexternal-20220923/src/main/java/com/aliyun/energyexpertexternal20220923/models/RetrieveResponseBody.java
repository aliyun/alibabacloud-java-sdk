// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class RetrieveResponseBody extends TeaModel {
    @NameInMap("data")
    public RetrieveResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RetrieveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveResponseBody self = new RetrieveResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveResponseBody setData(RetrieveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetrieveResponseBodyData getData() {
        return this.data;
    }

    public RetrieveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RetrieveResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>76cd1691-daf6-4113-8444-4998a25a5323</p>
         */
        @NameInMap("jobId")
        public String jobId;

        @NameInMap("results")
        public java.util.List<ChunkItem> results;

        public static RetrieveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetrieveResponseBodyData self = new RetrieveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetrieveResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RetrieveResponseBodyData setResults(java.util.List<ChunkItem> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ChunkItem> getResults() {
            return this.results;
        }

    }

}
