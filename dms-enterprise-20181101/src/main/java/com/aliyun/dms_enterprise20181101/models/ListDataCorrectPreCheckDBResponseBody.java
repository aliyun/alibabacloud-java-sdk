// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckDBResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the databases that are involved in the precheck.</p>
     */
    @NameInMap("PreCheckDBList")
    public java.util.List<ListDataCorrectPreCheckDBResponseBodyPreCheckDBList> preCheckDBList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>95A972AF-FAED-4768-9360-7C0DF5D594D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataCorrectPreCheckDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCorrectPreCheckDBResponseBody self = new ListDataCorrectPreCheckDBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCorrectPreCheckDBResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataCorrectPreCheckDBResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataCorrectPreCheckDBResponseBody setPreCheckDBList(java.util.List<ListDataCorrectPreCheckDBResponseBodyPreCheckDBList> preCheckDBList) {
        this.preCheckDBList = preCheckDBList;
        return this;
    }
    public java.util.List<ListDataCorrectPreCheckDBResponseBodyPreCheckDBList> getPreCheckDBList() {
        return this.preCheckDBList;
    }

    public ListDataCorrectPreCheckDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCorrectPreCheckDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataCorrectPreCheckDBResponseBodyPreCheckDBList extends TeaModel {
        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>43***</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test@localhost:3306</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlNum")
        public Long sqlNum;

        public static ListDataCorrectPreCheckDBResponseBodyPreCheckDBList build(java.util.Map<String, ?> map) throws Exception {
            ListDataCorrectPreCheckDBResponseBodyPreCheckDBList self = new ListDataCorrectPreCheckDBResponseBodyPreCheckDBList();
            return TeaModel.build(map, self);
        }

        public ListDataCorrectPreCheckDBResponseBodyPreCheckDBList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDataCorrectPreCheckDBResponseBodyPreCheckDBList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListDataCorrectPreCheckDBResponseBodyPreCheckDBList setSqlNum(Long sqlNum) {
            this.sqlNum = sqlNum;
            return this;
        }
        public Long getSqlNum() {
            return this.sqlNum;
        }

    }

}
