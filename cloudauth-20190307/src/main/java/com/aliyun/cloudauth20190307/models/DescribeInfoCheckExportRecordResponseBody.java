// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeInfoCheckExportRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeInfoCheckExportRecordResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeInfoCheckExportRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInfoCheckExportRecordResponseBody self = new DescribeInfoCheckExportRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInfoCheckExportRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInfoCheckExportRecordResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInfoCheckExportRecordResponseBody setItems(java.util.List<DescribeInfoCheckExportRecordResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeInfoCheckExportRecordResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeInfoCheckExportRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInfoCheckExportRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInfoCheckExportRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInfoCheckExportRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInfoCheckExportRecordResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInfoCheckExportRecordResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeInfoCheckExportRecordResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1758250979000</p>
         */
        @NameInMap("DownloadDate")
        public String downloadDate;

        /**
         * <strong>example:</strong>
         * <p>202510189017278</p>
         */
        @NameInMap("DownloadTaskId")
        public String downloadTaskId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxxxx.xlsx">https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxxxx.xlsx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeInfoCheckExportRecordResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInfoCheckExportRecordResponseBodyItems self = new DescribeInfoCheckExportRecordResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setDownloadDate(String downloadDate) {
            this.downloadDate = downloadDate;
            return this;
        }
        public String getDownloadDate() {
            return this.downloadDate;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setDownloadTaskId(String downloadTaskId) {
            this.downloadTaskId = downloadTaskId;
            return this;
        }
        public String getDownloadTaskId() {
            return this.downloadTaskId;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeInfoCheckExportRecordResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
