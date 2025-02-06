// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class KillProcessResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public KillProcessResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillProcessResponseBody self = new KillProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public KillProcessResponseBody setData(KillProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KillProcessResponseBodyData getData() {
        return this.data;
    }

    public KillProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class KillProcessResponseBodyData extends TeaModel {
        /**
         * <p>The number of queries that are terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxxxxx</p>
         */
        @NameInMap("DBInstanceID")
        public Integer DBInstanceID;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static KillProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KillProcessResponseBodyData self = new KillProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KillProcessResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public KillProcessResponseBodyData setDBInstanceID(Integer DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        public KillProcessResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
