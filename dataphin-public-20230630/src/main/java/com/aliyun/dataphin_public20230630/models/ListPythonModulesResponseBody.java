// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPythonModulesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result with paging details.</p>
     */
    @NameInMap("PageResult")
    public ListPythonModulesResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPythonModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPythonModulesResponseBody self = new ListPythonModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPythonModulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPythonModulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPythonModulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPythonModulesResponseBody setPageResult(ListPythonModulesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListPythonModulesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListPythonModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPythonModulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPythonModulesResponseBodyPageResultPythonModuleList extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the Python third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The installation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("InstallTime")
        public String installTime;

        /**
         * <p>The installation method. Valid values:</p>
         * <ul>
         * <li>UPLOAD_INSTALL: upload installation package</li>
         * <li>ONLINE_INSTALL: online installation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPLOAD_INSTALL</p>
         */
        @NameInMap("InstallType")
        public String installType;

        /**
         * <p>The installer.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("Installer")
        public String installer;

        /**
         * <p>The name of the Python third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>numpy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Python version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON_3_7</p>
         */
        @NameInMap("PythonVersion")
        public String pythonVersion;

        /**
         * <p>The status of the third-party package. Valid values:</p>
         * <ul>
         * <li>INSTALL_SUCCESS: installation succeeded</li>
         * <li>INSTALL_FAILED: installation failed</li>
         * <li>INSTALLING: installing</li>
         * <li>UPGRADE_SUCCESS: upgrade succeeded</li>
         * <li>UPGRADE_FAILED: upgrade failed</li>
         * <li>UPGRADING: upgrading</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTALL_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version of the third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListPythonModulesResponseBodyPageResultPythonModuleList build(java.util.Map<String, ?> map) throws Exception {
            ListPythonModulesResponseBodyPageResultPythonModuleList self = new ListPythonModulesResponseBodyPageResultPythonModuleList();
            return TeaModel.build(map, self);
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setInstallTime(String installTime) {
            this.installTime = installTime;
            return this;
        }
        public String getInstallTime() {
            return this.installTime;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setInstallType(String installType) {
            this.installType = installType;
            return this;
        }
        public String getInstallType() {
            return this.installType;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setInstaller(String installer) {
            this.installer = installer;
            return this;
        }
        public String getInstaller() {
            return this.installer;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setPythonVersion(String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPythonModulesResponseBodyPageResultPythonModuleList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListPythonModulesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated list of Python third-party packages.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<ListPythonModulesResponseBodyPageResultPythonModuleList> pythonModuleList;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListPythonModulesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListPythonModulesResponseBodyPageResult self = new ListPythonModulesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListPythonModulesResponseBodyPageResult setPythonModuleList(java.util.List<ListPythonModulesResponseBodyPageResultPythonModuleList> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<ListPythonModulesResponseBodyPageResultPythonModuleList> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public ListPythonModulesResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
