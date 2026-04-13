// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBinlogFilesResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeBinlogFilesResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>F8CA8312-530A-413A-9129-F2BB32A8D404</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>240</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeBinlogFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinlogFilesResponseBody self = new DescribeBinlogFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBinlogFilesResponseBody setItems(DescribeBinlogFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeBinlogFilesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeBinlogFilesResponseBody setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeBinlogFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBinlogFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBinlogFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeBinlogFilesResponseBodyItemsLogFile extends TeaModel {
        @NameInMap("BinLogId")
        public String binLogId;

        @NameInMap("DownloadLink")
        public String downloadLink;

        @NameInMap("DumpBucket")
        public String dumpBucket;

        @NameInMap("DumpDownloadURL")
        public String dumpDownloadURL;

        @NameInMap("DumpState")
        public Integer dumpState;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        @NameInMap("LogBeginTime")
        public String logBeginTime;

        @NameInMap("LogEndTime")
        public String logEndTime;

        @NameInMap("LogFileName")
        public String logFileName;

        @NameInMap("LogStatus")
        public String logStatus;

        @NameInMap("OSSEndpoint")
        public String OSSEndpoint;

        public static DescribeBinlogFilesResponseBodyItemsLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseBodyItemsLogFile self = new DescribeBinlogFilesResponseBodyItemsLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setBinLogId(String binLogId) {
            this.binLogId = binLogId;
            return this;
        }
        public String getBinLogId() {
            return this.binLogId;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setDumpBucket(String dumpBucket) {
            this.dumpBucket = dumpBucket;
            return this;
        }
        public String getDumpBucket() {
            return this.dumpBucket;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setDumpDownloadURL(String dumpDownloadURL) {
            this.dumpDownloadURL = dumpDownloadURL;
            return this;
        }
        public String getDumpDownloadURL() {
            return this.dumpDownloadURL;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setDumpState(Integer dumpState) {
            this.dumpState = dumpState;
            return this;
        }
        public Integer getDumpState() {
            return this.dumpState;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setLogBeginTime(String logBeginTime) {
            this.logBeginTime = logBeginTime;
            return this;
        }
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }
        public String getLogFileName() {
            return this.logFileName;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setLogStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }
        public String getLogStatus() {
            return this.logStatus;
        }

        public DescribeBinlogFilesResponseBodyItemsLogFile setOSSEndpoint(String OSSEndpoint) {
            this.OSSEndpoint = OSSEndpoint;
            return this;
        }
        public String getOSSEndpoint() {
            return this.OSSEndpoint;
        }

    }

    public static class DescribeBinlogFilesResponseBodyItems extends TeaModel {
        @NameInMap("LogFile")
        public java.util.List<DescribeBinlogFilesResponseBodyItemsLogFile> logFile;

        public static DescribeBinlogFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinlogFilesResponseBodyItems self = new DescribeBinlogFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBinlogFilesResponseBodyItems setLogFile(java.util.List<DescribeBinlogFilesResponseBodyItemsLogFile> logFile) {
            this.logFile = logFile;
            return this;
        }
        public java.util.List<DescribeBinlogFilesResponseBodyItemsLogFile> getLogFile() {
            return this.logFile;
        }

    }

}
