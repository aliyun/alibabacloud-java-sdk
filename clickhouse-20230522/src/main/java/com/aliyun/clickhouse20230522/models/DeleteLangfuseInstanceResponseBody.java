// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseInstanceResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DeleteLangfuseInstanceResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLangfuseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseInstanceResponseBody self = new DeleteLangfuseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseInstanceResponseBody setData(DeleteLangfuseInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLangfuseInstanceResponseBodyData getData() {
        return this.data;
    }

    public DeleteLangfuseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLangfuseInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The Langfuse instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DeleteLangfuseInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLangfuseInstanceResponseBodyData self = new DeleteLangfuseInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLangfuseInstanceResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
