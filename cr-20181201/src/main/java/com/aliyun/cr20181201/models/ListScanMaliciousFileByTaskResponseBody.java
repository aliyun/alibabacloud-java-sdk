// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanMaliciousFileByTaskResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the API request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: successful</li>
     * <li><code>false</code>: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52AE49C8-B91A-5C1A-821F-C34324B42F7C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried malicious files.</p>
     */
    @NameInMap("ScanMaliciousFiles")
    public java.util.List<ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles> scanMaliciousFiles;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListScanMaliciousFileByTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScanMaliciousFileByTaskResponseBody self = new ListScanMaliciousFileByTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScanMaliciousFileByTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListScanMaliciousFileByTaskResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListScanMaliciousFileByTaskResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListScanMaliciousFileByTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScanMaliciousFileByTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScanMaliciousFileByTaskResponseBody setScanMaliciousFiles(java.util.List<ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles> scanMaliciousFiles) {
        this.scanMaliciousFiles = scanMaliciousFiles;
        return this;
    }
    public java.util.List<ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles> getScanMaliciousFiles() {
        return this.scanMaliciousFiles;
    }

    public ListScanMaliciousFileByTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles extends TeaModel {
        /**
         * <p>The time when the image was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10 11:42:06</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The path of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant/0000000000000000/</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The time when the image was first scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10 11:42:06</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The severity of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The MD5 hash value of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>e76c9759783cbbc9be0ff91ca3xxxxxx</p>
         */
        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        /**
         * <p>The type of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>Suspected to contain Webshell code</p>
         */
        @NameInMap("MaliciousName")
        public String maliciousName;

        /**
         * <p>The ID of the image scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>fe2d8980-de45-4f55-b57d-e438e6d2e972</p>
         */
        @NameInMap("ScanTaskId")
        public String scanTaskId;

        /**
         * <p>The time when the image was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10 11:42:06</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles build(java.util.Map<String, ?> map) throws Exception {
            ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles self = new ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles();
            return TeaModel.build(map, self);
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setMaliciousName(String maliciousName) {
            this.maliciousName = maliciousName;
            return this;
        }
        public String getMaliciousName() {
            return this.maliciousName;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setScanTaskId(String scanTaskId) {
            this.scanTaskId = scanTaskId;
            return this;
        }
        public String getScanTaskId() {
            return this.scanTaskId;
        }

        public ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
