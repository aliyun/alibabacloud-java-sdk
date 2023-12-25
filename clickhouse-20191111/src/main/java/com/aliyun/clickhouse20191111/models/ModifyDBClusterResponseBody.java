// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponseBody extends TeaModel {
    /**
     * <p>The information about the cluster.</p>
     */
    @NameInMap("DBCluster")
    public ModifyDBClusterResponseBodyDBCluster DBCluster;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResponseBody self = new ModifyDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResponseBody setDBCluster(ModifyDBClusterResponseBodyDBCluster DBCluster) {
        this.DBCluster = DBCluster;
        return this;
    }
    public ModifyDBClusterResponseBodyDBCluster getDBCluster() {
        return this.DBCluster;
    }

    public ModifyDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBClusterResponseBodyDBCluster extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("dbClusterId")
        public String dbClusterId;

        /**
         * <p>The order ID.</p>
         */
        @NameInMap("orderId")
        public String orderId;

        public static ModifyDBClusterResponseBodyDBCluster build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBClusterResponseBodyDBCluster self = new ModifyDBClusterResponseBodyDBCluster();
            return TeaModel.build(map, self);
        }

        public ModifyDBClusterResponseBodyDBCluster setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public ModifyDBClusterResponseBodyDBCluster setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
