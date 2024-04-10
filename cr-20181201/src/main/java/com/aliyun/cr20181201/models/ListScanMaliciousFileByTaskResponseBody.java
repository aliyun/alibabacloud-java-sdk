// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanMaliciousFileByTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanMaliciousFiles")
    public java.util.List<ListScanMaliciousFileByTaskResponseBodyScanMaliciousFiles> scanMaliciousFiles;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        @NameInMap("MaliciousName")
        public String maliciousName;

        @NameInMap("ScanTaskId")
        public String scanTaskId;

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
