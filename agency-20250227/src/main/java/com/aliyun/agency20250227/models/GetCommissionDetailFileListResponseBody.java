// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCommissionDetailFileListResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCommissionDetailFileListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCommissionDetailFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionDetailFileListResponseBody self = new GetCommissionDetailFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommissionDetailFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCommissionDetailFileListResponseBody setData(GetCommissionDetailFileListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCommissionDetailFileListResponseBodyData getData() {
        return this.data;
    }

    public GetCommissionDetailFileListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCommissionDetailFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommissionDetailFileListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCommissionDetailFileListResponseBodyDataFileList extends TeaModel {
        @NameInMap("CommissionPolicyName")
        public String commissionPolicyName;

        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>aps.ailyun.com/file/download?resourceId=1234&amp;type=1</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetCommissionDetailFileListResponseBodyDataFileList build(java.util.Map<String, ?> map) throws Exception {
            GetCommissionDetailFileListResponseBodyDataFileList self = new GetCommissionDetailFileListResponseBodyDataFileList();
            return TeaModel.build(map, self);
        }

        public GetCommissionDetailFileListResponseBodyDataFileList setCommissionPolicyName(String commissionPolicyName) {
            this.commissionPolicyName = commissionPolicyName;
            return this;
        }
        public String getCommissionPolicyName() {
            return this.commissionPolicyName;
        }

        public GetCommissionDetailFileListResponseBodyDataFileList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetCommissionDetailFileListResponseBodyDataFileList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class GetCommissionDetailFileListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>202502</p>
         */
        @NameInMap("BillMonth")
        public String billMonth;

        @NameInMap("FileList")
        public java.util.List<GetCommissionDetailFileListResponseBodyDataFileList> fileList;

        /**
         * <strong>example:</strong>
         * <p>1112332432</p>
         */
        @NameInMap("PartnerUid")
        public String partnerUid;

        public static GetCommissionDetailFileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCommissionDetailFileListResponseBodyData self = new GetCommissionDetailFileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCommissionDetailFileListResponseBodyData setBillMonth(String billMonth) {
            this.billMonth = billMonth;
            return this;
        }
        public String getBillMonth() {
            return this.billMonth;
        }

        public GetCommissionDetailFileListResponseBodyData setFileList(java.util.List<GetCommissionDetailFileListResponseBodyDataFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<GetCommissionDetailFileListResponseBodyDataFileList> getFileList() {
            return this.fileList;
        }

        public GetCommissionDetailFileListResponseBodyData setPartnerUid(String partnerUid) {
            this.partnerUid = partnerUid;
            return this;
        }
        public String getPartnerUid() {
            return this.partnerUid;
        }

    }

}
