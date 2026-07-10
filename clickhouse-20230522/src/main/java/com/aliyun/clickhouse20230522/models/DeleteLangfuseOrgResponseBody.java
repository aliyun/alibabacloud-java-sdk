// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseOrgResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
     */
    @NameInMap("Data")
    public DeleteLangfuseOrgResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLangfuseOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseOrgResponseBody self = new DeleteLangfuseOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseOrgResponseBody setData(DeleteLangfuseOrgResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLangfuseOrgResponseBodyData getData() {
        return this.data;
    }

    public DeleteLangfuseOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLangfuseOrgResponseBodyData extends TeaModel {
        /**
         * <p>The Langfuse instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DeleteLangfuseOrgResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLangfuseOrgResponseBodyData self = new DeleteLangfuseOrgResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLangfuseOrgResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

}
