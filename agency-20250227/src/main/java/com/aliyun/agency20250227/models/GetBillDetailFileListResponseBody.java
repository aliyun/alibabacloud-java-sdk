// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetBillDetailFileListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetBillDetailFileListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>210bc4b416874189683843905d9f9a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBillDetailFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBillDetailFileListResponseBody self = new GetBillDetailFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBillDetailFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBillDetailFileListResponseBody setData(java.util.List<GetBillDetailFileListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBillDetailFileListResponseBodyData> getData() {
        return this.data;
    }

    public GetBillDetailFileListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBillDetailFileListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetBillDetailFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBillDetailFileListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBillDetailFileListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>202502</p>
         */
        @NameInMap("BillMonth")
        public String billMonth;

        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>aps.ailyun.com/file/download?resourceId=1234&amp;type=1</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static GetBillDetailFileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBillDetailFileListResponseBodyData self = new GetBillDetailFileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBillDetailFileListResponseBodyData setBillMonth(String billMonth) {
            this.billMonth = billMonth;
            return this;
        }
        public String getBillMonth() {
            return this.billMonth;
        }

        public GetBillDetailFileListResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetBillDetailFileListResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetBillDetailFileListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBillDetailFileListResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
