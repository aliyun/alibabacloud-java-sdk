// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeImportedLogCountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeImportedLogCountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImportedLogCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportedLogCountResponseBody self = new DescribeImportedLogCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImportedLogCountResponseBody setData(DescribeImportedLogCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImportedLogCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeImportedLogCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImportedLogCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of logs that are added.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImportedLogCount")
        public Integer importedLogCount;

        /**
         * <p>The total number of logs.</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("TotalLogCount")
        public Integer totalLogCount;

        /**
         * <p>The number of logs that are not added.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("UnImportedLogCount")
        public Integer unImportedLogCount;

        public static DescribeImportedLogCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImportedLogCountResponseBodyData self = new DescribeImportedLogCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImportedLogCountResponseBodyData setImportedLogCount(Integer importedLogCount) {
            this.importedLogCount = importedLogCount;
            return this;
        }
        public Integer getImportedLogCount() {
            return this.importedLogCount;
        }

        public DescribeImportedLogCountResponseBodyData setTotalLogCount(Integer totalLogCount) {
            this.totalLogCount = totalLogCount;
            return this;
        }
        public Integer getTotalLogCount() {
            return this.totalLogCount;
        }

        public DescribeImportedLogCountResponseBodyData setUnImportedLogCount(Integer unImportedLogCount) {
            this.unImportedLogCount = unImportedLogCount;
            return this;
        }
        public Integer getUnImportedLogCount() {
            return this.unImportedLogCount;
        }

    }

}
