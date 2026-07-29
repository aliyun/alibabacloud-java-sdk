// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    /**
     * <p>The list of databases.</p>
     */
    @NameInMap("DatabaseList")
    public java.util.List<ListDatabasesResponseBodyDatabaseList> databaseList;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C4935F5-6217-569A-902F-931B2F3E28BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setDatabaseList(java.util.List<ListDatabasesResponseBodyDatabaseList> databaseList) {
        this.databaseList = databaseList;
        return this;
    }
    public java.util.List<ListDatabasesResponseBodyDatabaseList> getDatabaseList() {
        return this.databaseList;
    }

    public ListDatabasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDatabasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDatabasesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListDatabasesResponseBodyDatabaseList extends TeaModel {
        /**
         * <p>Indicates whether the table is a foreign table. \<code>true\\</code>: The table is a foreign table. \<code>false\\</code>: The table is not a foreign table.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("External")
        public Boolean external;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_db</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The permission model. For more information, see <a href="https://help.aliyun.com/document_detail/198734.html">Hologres permission models</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SPM</p>
         */
        @NameInMap("PermissionModel")
        public String permissionModel;

        /**
         * <p>The permission.</p>
         * 
         * <strong>example:</strong>
         * <p>developer</p>
         */
        @NameInMap("Privilege")
        public String privilege;

        public static ListDatabasesResponseBodyDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabaseList self = new ListDatabasesResponseBodyDatabaseList();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabaseList setExternal(Boolean external) {
            this.external = external;
            return this;
        }
        public Boolean getExternal() {
            return this.external;
        }

        public ListDatabasesResponseBodyDatabaseList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatabasesResponseBodyDatabaseList setPermissionModel(String permissionModel) {
            this.permissionModel = permissionModel;
            return this;
        }
        public String getPermissionModel() {
            return this.permissionModel;
        }

        public ListDatabasesResponseBodyDatabaseList setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

}
