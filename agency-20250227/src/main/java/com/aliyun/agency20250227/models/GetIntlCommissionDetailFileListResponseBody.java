// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetIntlCommissionDetailFileListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public GetIntlCommissionDetailFileListResponseBodyData data;

    /**
     * <p>The message information.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>2103a30617045934095083027d88c5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetIntlCommissionDetailFileListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntlCommissionDetailFileListResponseBody self = new GetIntlCommissionDetailFileListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntlCommissionDetailFileListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIntlCommissionDetailFileListResponseBody setData(GetIntlCommissionDetailFileListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIntlCommissionDetailFileListResponseBodyData getData() {
        return this.data;
    }

    public GetIntlCommissionDetailFileListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIntlCommissionDetailFileListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIntlCommissionDetailFileListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIntlCommissionDetailFileListResponseBodyDataFileList extends TeaModel {
        /**
         * <p>The OSS file push status. Valid values: init, processing, succeeded, or failed.</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("BucketSyncStatus")
        public String bucketSyncStatus;

        /**
         * <p>The commission policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>202606_FY27_TEST</p>
         */
        @NameInMap("CommissionPolicyName")
        public String commissionPolicyName;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>202606_FY27_TEST_4397912340.xlsx</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static GetIntlCommissionDetailFileListResponseBodyDataFileList build(java.util.Map<String, ?> map) throws Exception {
            GetIntlCommissionDetailFileListResponseBodyDataFileList self = new GetIntlCommissionDetailFileListResponseBodyDataFileList();
            return TeaModel.build(map, self);
        }

        public GetIntlCommissionDetailFileListResponseBodyDataFileList setBucketSyncStatus(String bucketSyncStatus) {
            this.bucketSyncStatus = bucketSyncStatus;
            return this;
        }
        public String getBucketSyncStatus() {
            return this.bucketSyncStatus;
        }

        public GetIntlCommissionDetailFileListResponseBodyDataFileList setCommissionPolicyName(String commissionPolicyName) {
            this.commissionPolicyName = commissionPolicyName;
            return this;
        }
        public String getCommissionPolicyName() {
            return this.commissionPolicyName;
        }

        public GetIntlCommissionDetailFileListResponseBodyDataFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetIntlCommissionDetailFileListResponseBodyData extends TeaModel {
        /**
         * <p>The bill month.</p>
         * 
         * <strong>example:</strong>
         * <p>202502</p>
         */
        @NameInMap("BillMonth")
        public String billMonth;

        /**
         * <p>The file list object.</p>
         */
        @NameInMap("FileList")
        public java.util.List<GetIntlCommissionDetailFileListResponseBodyDataFileList> fileList;

        /**
         * <p>The UID of the partner.</p>
         * 
         * <strong>example:</strong>
         * <p>1112332432</p>
         */
        @NameInMap("PartnerUid")
        public String partnerUid;

        public static GetIntlCommissionDetailFileListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIntlCommissionDetailFileListResponseBodyData self = new GetIntlCommissionDetailFileListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIntlCommissionDetailFileListResponseBodyData setBillMonth(String billMonth) {
            this.billMonth = billMonth;
            return this;
        }
        public String getBillMonth() {
            return this.billMonth;
        }

        public GetIntlCommissionDetailFileListResponseBodyData setFileList(java.util.List<GetIntlCommissionDetailFileListResponseBodyDataFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<GetIntlCommissionDetailFileListResponseBodyDataFileList> getFileList() {
            return this.fileList;
        }

        public GetIntlCommissionDetailFileListResponseBodyData setPartnerUid(String partnerUid) {
            this.partnerUid = partnerUid;
            return this;
        }
        public String getPartnerUid() {
            return this.partnerUid;
        }

    }

}
