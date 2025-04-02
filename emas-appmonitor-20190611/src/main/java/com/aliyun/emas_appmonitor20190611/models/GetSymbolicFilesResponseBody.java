// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetSymbolicFilesResponseBody extends TeaModel {
    /**
     * <p>Args</p>
     */
    @NameInMap("Args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetSymbolicFilesResponseBodyModel model;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>B3AD0FE4-36EF-1641-90B1-77618166F2ff</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSymbolicFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSymbolicFilesResponseBody self = new GetSymbolicFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSymbolicFilesResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public GetSymbolicFilesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetSymbolicFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSymbolicFilesResponseBody setModel(GetSymbolicFilesResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetSymbolicFilesResponseBodyModel getModel() {
        return this.model;
    }

    public GetSymbolicFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSymbolicFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSymbolicFilesResponseBodyModelItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>e8a1a2b9ab653780b34383a942ac91b2</p>
         */
        @NameInMap("BuildId")
        public String buildId;

        /**
         * <strong>example:</strong>
         * <p>EXPORT_SUCCESS</p>
         */
        @NameInMap("ExportStatus")
        public String exportStatus;

        /**
         * <strong>example:</strong>
         * <p>app_so.zip</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>24781204@android/1743506690915-app_so.zip</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>APP_SO</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p>1655962713000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>392522</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>uuid</p>
         * 
         * <strong>example:</strong>
         * <p>9634758587856312DEV</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetSymbolicFilesResponseBodyModelItems build(java.util.Map<String, ?> map) throws Exception {
            GetSymbolicFilesResponseBodyModelItems self = new GetSymbolicFilesResponseBodyModelItems();
            return TeaModel.build(map, self);
        }

        public GetSymbolicFilesResponseBodyModelItems setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetSymbolicFilesResponseBodyModelItems setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public GetSymbolicFilesResponseBodyModelItems setExportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }
        public String getExportStatus() {
            return this.exportStatus;
        }

        public GetSymbolicFilesResponseBodyModelItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSymbolicFilesResponseBodyModelItems setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetSymbolicFilesResponseBodyModelItems setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetSymbolicFilesResponseBodyModelItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSymbolicFilesResponseBodyModelItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSymbolicFilesResponseBodyModelItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSymbolicFilesResponseBodyModelItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetSymbolicFilesResponseBodyModel extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetSymbolicFilesResponseBodyModelItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Pages")
        public Integer pages;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSymbolicFilesResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetSymbolicFilesResponseBodyModel self = new GetSymbolicFilesResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetSymbolicFilesResponseBodyModel setItems(java.util.List<GetSymbolicFilesResponseBodyModelItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetSymbolicFilesResponseBodyModelItems> getItems() {
            return this.items;
        }

        public GetSymbolicFilesResponseBodyModel setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetSymbolicFilesResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSymbolicFilesResponseBodyModel setPages(Integer pages) {
            this.pages = pages;
            return this;
        }
        public Integer getPages() {
            return this.pages;
        }

        public GetSymbolicFilesResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
