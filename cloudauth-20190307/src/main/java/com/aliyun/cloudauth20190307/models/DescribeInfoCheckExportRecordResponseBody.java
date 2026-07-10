// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeInfoCheckExportRecordResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of results.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeInfoCheckExportRecordResponseBodyItems> items;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of entries per page.</p>
     * 
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
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
         * <p>The download date.</p>
         * 
         * <strong>example:</strong>
         * <p>1758250979000</p>
         */
        @NameInMap("DownloadDate")
        public String downloadDate;

        /**
         * <p>The ID of the download task.</p>
         * 
         * <strong>example:</strong>
         * <p>202510189017278</p>
         */
        @NameInMap("DownloadTaskId")
        public String downloadTaskId;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>手机号二要素统计202509013975081.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The product type name. Valid values:</p>
         * <ul>
         * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
         * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
         * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration.</li>
         * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status.</li>
         * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition).</li>
         * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition).</li>
         * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification.</li>
         * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition).</li>
         * <li><strong>MOBILE_DETECT</strong>: phone number detection.</li>
         * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition).</li>
         * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition.</li>
         * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition.</li>
         * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query.</li>
         * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>身份证二要素</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The file is being generated.</li>
         * <li><strong>2</strong>: The file has been generated.</li>
         * <li><strong>3</strong>: The file failed to be generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The task URL.</p>
         * 
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
