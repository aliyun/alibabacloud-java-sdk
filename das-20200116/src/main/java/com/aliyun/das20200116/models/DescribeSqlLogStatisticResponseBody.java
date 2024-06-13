// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogStatisticResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogStatisticResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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
         * <p>The size of the SQL Explorer and Audit data that is stored in cold storage. Unit: bytes.</p>
         */
        @NameInMap("ColdSqlSize")
        public Long coldSqlSize;

        /**
         * <p>The free quota for cold data storage. Unit: bytes.</p>
         */
        @NameInMap("FreeColdSqlSize")
        public Long freeColdSqlSize;

        /**
         * <p>The free quota for hot data storage. Unit: bytes.</p>
         */
        @NameInMap("FreeHotSqlSize")
        public Long freeHotSqlSize;

        /**
         * <p>The size of the SQL Explorer and Audit data that is stored in hot storage. Unit: bytes.</p>
         */
        @NameInMap("HotSqlSize")
        public Long hotSqlSize;

        /**
         * <p>The size of the SQL Explorer and Audit data that was generated in the most recent day. Unit: bytes.</p>
         */
        @NameInMap("ImportSqlSize")
        public Long importSqlSize;

        /**
         * <p>The timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

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

    }

}
