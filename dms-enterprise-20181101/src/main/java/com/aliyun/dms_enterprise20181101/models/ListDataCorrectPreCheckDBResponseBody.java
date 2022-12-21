// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataCorrectPreCheckDBResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The information about the databases that are involved in the precheck.
    @NameInMap("PreCheckDBList")
    public java.util.List<ListDataCorrectPreCheckDBResponseBodyPreCheckDBList> preCheckDBList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
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
        // The ID of the database.
        @NameInMap("DbId")
        public Long dbId;

        // The name of the database.
        @NameInMap("SearchName")
        public String searchName;

        // The number of SQL statements.
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
