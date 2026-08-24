// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogStatisticResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogStatisticResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSqlLogStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogStatisticResponseBody self = new DescribeSqlLogStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSqlLogStatisticResponseBody setData(DescribeSqlLogStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlLogStatisticResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlLogStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlLogStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlLogStatisticResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSqlLogStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The total cold storage data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>8585901</p>
         */
        @NameInMap("ColdSqlSize")
        public Long coldSqlSize;

        /**
         * <p>The free cold storage data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>5041450</p>
         */
        @NameInMap("FreeColdSqlSize")
        public Long freeColdSqlSize;

        /**
         * <p>The free hot storage data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>297245</p>
         */
        @NameInMap("FreeHotSqlSize")
        public Long freeHotSqlSize;

        /**
         * <p>The total hot storage data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1118042</p>
         */
        @NameInMap("HotSqlSize")
        public Long hotSqlSize;

        /**
         * <p>The amount of data imported in the last day. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>297245</p>
         */
        @NameInMap("ImportSqlSize")
        public Long importSqlSize;

        /**
         * <p>The timestamp in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1712568564928</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total storage data (cold data + hot data).</p>
         * 
         * <strong>example:</strong>
         * <p>9703943</p>
         */
        @NameInMap("TotalSqlSize")
        public Long totalSqlSize;

        public static DescribeSqlLogStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogStatisticResponseBodyData self = new DescribeSqlLogStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogStatisticResponseBodyData setColdSqlSize(Long coldSqlSize) {
            this.coldSqlSize = coldSqlSize;
            return this;
        }
        public Long getColdSqlSize() {
            return this.coldSqlSize;
        }

        public DescribeSqlLogStatisticResponseBodyData setFreeColdSqlSize(Long freeColdSqlSize) {
            this.freeColdSqlSize = freeColdSqlSize;
            return this;
        }
        public Long getFreeColdSqlSize() {
            return this.freeColdSqlSize;
        }

        public DescribeSqlLogStatisticResponseBodyData setFreeHotSqlSize(Long freeHotSqlSize) {
            this.freeHotSqlSize = freeHotSqlSize;
            return this;
        }
        public Long getFreeHotSqlSize() {
            return this.freeHotSqlSize;
        }

        public DescribeSqlLogStatisticResponseBodyData setHotSqlSize(Long hotSqlSize) {
            this.hotSqlSize = hotSqlSize;
            return this;
        }
        public Long getHotSqlSize() {
            return this.hotSqlSize;
        }

        public DescribeSqlLogStatisticResponseBodyData setImportSqlSize(Long importSqlSize) {
            this.importSqlSize = importSqlSize;
            return this;
        }
        public Long getImportSqlSize() {
            return this.importSqlSize;
        }

        public DescribeSqlLogStatisticResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSqlLogStatisticResponseBodyData setTotalSqlSize(Long totalSqlSize) {
            this.totalSqlSize = totalSqlSize;
            return this;
        }
        public Long getTotalSqlSize() {
            return this.totalSqlSize;
        }

    }

}
