// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportAdminsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ImportAdminsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1CDB5C94-ACFB-59B5-85FE-C1DAF8049C63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportAdminsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportAdminsResponseBody self = new ImportAdminsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportAdminsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportAdminsResponseBody setData(java.util.List<ImportAdminsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ImportAdminsResponseBodyData> getData() {
        return this.data;
    }

    public ImportAdminsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportAdminsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportAdminsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImportAdminsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8021****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>26972543893791****</p>
         */
        @NameInMap("RamId")
        public String ramId;

        /**
         * <strong>example:</strong>
         * <p>Admin@ccc-test</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ImportAdminsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportAdminsResponseBodyData self = new ImportAdminsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportAdminsResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ImportAdminsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ImportAdminsResponseBodyData setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ImportAdminsResponseBodyData setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ImportAdminsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
