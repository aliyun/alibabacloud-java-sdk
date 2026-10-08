// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateApplicationResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The API information.</p>
     */
    @NameInMap("data")
    public MigrateApplicationResponseBodyData data;

    public static MigrateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateApplicationResponseBody self = new MigrateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MigrateApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateApplicationResponseBody setData(MigrateApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MigrateApplicationResponseBodyData getData() {
        return this.data;
    }

    public static class MigrateApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The migration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a3de82d7-83a4-4cca-8d1e-63f87651ce78</p>
         */
        @NameInMap("migrationId")
        public String migrationId;

        public static MigrateApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MigrateApplicationResponseBodyData self = new MigrateApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MigrateApplicationResponseBodyData setMigrationId(String migrationId) {
            this.migrationId = migrationId;
            return this;
        }
        public String getMigrationId() {
            return this.migrationId;
        }

    }

}
