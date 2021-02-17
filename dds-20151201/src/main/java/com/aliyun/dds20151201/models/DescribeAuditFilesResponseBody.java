// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditFilesResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeAuditFilesResponseBodyItems items;

    public static DescribeAuditFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditFilesResponseBody self = new DescribeAuditFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditFilesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeAuditFilesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAuditFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditFilesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuditFilesResponseBody setItems(DescribeAuditFilesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAuditFilesResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeAuditFilesResponseBodyItemsLogFile extends TeaModel {
        @NameInMap("FileID")
        public Integer fileID;

        @NameInMap("LogStartTime")
        public String logStartTime;

        @NameInMap("LogSize")
        public Long logSize;

        @NameInMap("LogDownloadURL")
        public String logDownloadURL;

        @NameInMap("LogEndTime")
        public String logEndTime;

        @NameInMap("LogStatus")
        public String logStatus;

        public static DescribeAuditFilesResponseBodyItemsLogFile build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditFilesResponseBodyItemsLogFile self = new DescribeAuditFilesResponseBodyItemsLogFile();
            return TeaModel.build(map, self);
        }

        public DescribeAuditFilesResponseBodyItemsLogFile setFileID(Integer fileID) {
            this.fileID = fileID;
            return this;
        }
        public Integer getFileID() {
            return this.fileID;
        }

        public DescribeAuditFilesResponseBodyItemsLogFile setLogStartTime(String logStartTime) {
            this.logStartTime = logStartTime;
            return this;
        }
        public String getLogStartTime() {
            return this.logStartTime;
        }

        public DescribeAuditFilesResponseBodyItemsLogFile setLogSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }
        public Long getLogSize() {
            return this.logSize;
        }

        public DescribeAuditFilesResponseBodyItemsLogFile setLogDownloadURL(String logDownloadURL) {
            this.logDownloadURL = logDownloadURL;
            return this;
        }
        public String getLogDownloadURL() {
            return this.logDownloadURL;
        }

        public DescribeAuditFilesResponseBodyItemsLogFile setLogEndTime(String logEndTime) {
            this.logEndTime = logEndTime;
            return this;
        }
        public String getLogEndTime() {
            return this.logEndTime;
        }

        public DescribeAuditFilesResponseBodyItemsLogFile setLogStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }
        public String getLogStatus() {
            return this.logStatus;
        }

    }

    public static class DescribeAuditFilesResponseBodyItems extends TeaModel {
        @NameInMap("LogFile")
        public java.util.List<DescribeAuditFilesResponseBodyItemsLogFile> logFile;

        public static DescribeAuditFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditFilesResponseBodyItems self = new DescribeAuditFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAuditFilesResponseBodyItems setLogFile(java.util.List<DescribeAuditFilesResponseBodyItemsLogFile> logFile) {
            this.logFile = logFile;
            return this;
        }
        public java.util.List<DescribeAuditFilesResponseBodyItemsLogFile> getLogFile() {
            return this.logFile;
        }

    }

}
