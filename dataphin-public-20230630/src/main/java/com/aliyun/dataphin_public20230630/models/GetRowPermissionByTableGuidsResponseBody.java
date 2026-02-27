// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRowPermissionByTableGuidsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetRowPermissionByTableGuidsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRowPermissionByTableGuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRowPermissionByTableGuidsResponseBody self = new GetRowPermissionByTableGuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRowPermissionByTableGuidsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRowPermissionByTableGuidsResponseBody setData(java.util.List<GetRowPermissionByTableGuidsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRowPermissionByTableGuidsResponseBodyData> getData() {
        return this.data;
    }

    public GetRowPermissionByTableGuidsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRowPermissionByTableGuidsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRowPermissionByTableGuidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRowPermissionByTableGuidsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRowPermissionByTableGuidsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Restrict query region</p>
         */
        @NameInMap("RowPermissionDesc")
        public String rowPermissionDesc;

        /**
         * <strong>example:</strong>
         * <p>300000001</p>
         */
        @NameInMap("RowPermissionId")
        public String rowPermissionId;

        /**
         * <strong>example:</strong>
         * <p>Region</p>
         */
        @NameInMap("RowPermissionName")
        public String rowPermissionName;

        public static GetRowPermissionByTableGuidsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRowPermissionByTableGuidsResponseBodyData self = new GetRowPermissionByTableGuidsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRowPermissionByTableGuidsResponseBodyData setRowPermissionDesc(String rowPermissionDesc) {
            this.rowPermissionDesc = rowPermissionDesc;
            return this;
        }
        public String getRowPermissionDesc() {
            return this.rowPermissionDesc;
        }

        public GetRowPermissionByTableGuidsResponseBodyData setRowPermissionId(String rowPermissionId) {
            this.rowPermissionId = rowPermissionId;
            return this;
        }
        public String getRowPermissionId() {
            return this.rowPermissionId;
        }

        public GetRowPermissionByTableGuidsResponseBodyData setRowPermissionName(String rowPermissionName) {
            this.rowPermissionName = rowPermissionName;
            return this;
        }
        public String getRowPermissionName() {
            return this.rowPermissionName;
        }

    }

}
