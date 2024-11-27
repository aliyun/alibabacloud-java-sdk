// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeTablebaseInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Rows is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>B43AD641-49C2-5299-9E06-1B37EC1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TablebaseInfoList")
    public ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList tablebaseInfoList;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListDataLakeTablebaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeTablebaseInfoResponseBody self = new ListDataLakeTablebaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLakeTablebaseInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataLakeTablebaseInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataLakeTablebaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataLakeTablebaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataLakeTablebaseInfoResponseBody setTablebaseInfoList(ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList tablebaseInfoList) {
        this.tablebaseInfoList = tablebaseInfoList;
        return this;
    }
    public ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList getTablebaseInfoList() {
        return this.tablebaseInfoList;
    }

    public ListDataLakeTablebaseInfoResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList extends TeaModel {
        @NameInMap("TablebaseInfo")
        public java.util.List<DLTablebaseInfo> tablebaseInfo;

        public static ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList self = new ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList();
            return TeaModel.build(map, self);
        }

        public ListDataLakeTablebaseInfoResponseBodyTablebaseInfoList setTablebaseInfo(java.util.List<DLTablebaseInfo> tablebaseInfo) {
            this.tablebaseInfo = tablebaseInfo;
            return this;
        }
        public java.util.List<DLTablebaseInfo> getTablebaseInfo() {
            return this.tablebaseInfo;
        }

    }

}
