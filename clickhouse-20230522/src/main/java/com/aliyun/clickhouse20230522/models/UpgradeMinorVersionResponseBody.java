// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public UpgradeMinorVersionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE242962-6DA3-5FC8-9691-37B62A3210F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionResponseBody self = new UpgradeMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionResponseBody setData(UpgradeMinorVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeMinorVersionResponseBodyData getData() {
        return this.data;
    }

    public UpgradeMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpgradeMinorVersionResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-uf6x229yeq166****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static UpgradeMinorVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeMinorVersionResponseBodyData self = new UpgradeMinorVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeMinorVersionResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
