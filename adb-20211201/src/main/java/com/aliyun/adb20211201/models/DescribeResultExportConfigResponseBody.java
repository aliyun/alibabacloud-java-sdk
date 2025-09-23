// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeResultExportConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeResultExportConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeResultExportConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResultExportConfigResponseBody self = new DescribeResultExportConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResultExportConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResultExportConfigResponseBody setData(DescribeResultExportConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResultExportConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeResultExportConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeResultExportConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResultExportConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResultExportConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResultExportConfigResponseBodyDataOssInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://testBucketName/data_result</p>
         */
        @NameInMap("ExportBasePath")
        public String exportBasePath;

        /**
         * <strong>example:</strong>
         * <p>aps</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResultFileTtl")
        public Integer resultFileTtl;

        public static DescribeResultExportConfigResponseBodyDataOssInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeResultExportConfigResponseBodyDataOssInfo self = new DescribeResultExportConfigResponseBodyDataOssInfo();
            return TeaModel.build(map, self);
        }

        public DescribeResultExportConfigResponseBodyDataOssInfo setExportBasePath(String exportBasePath) {
            this.exportBasePath = exportBasePath;
            return this;
        }
        public String getExportBasePath() {
            return this.exportBasePath;
        }

        public DescribeResultExportConfigResponseBodyDataOssInfo setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeResultExportConfigResponseBodyDataOssInfo setResultFileTtl(Integer resultFileTtl) {
            this.resultFileTtl = resultFileTtl;
            return this;
        }
        public Integer getResultFileTtl() {
            return this.resultFileTtl;
        }

    }

    public static class DescribeResultExportConfigResponseBodyDataSlsInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LogstoreTtl")
        public Integer logstoreTtl;

        /**
         * <strong>example:</strong>
         * <p>aps</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        public static DescribeResultExportConfigResponseBodyDataSlsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeResultExportConfigResponseBodyDataSlsInfo self = new DescribeResultExportConfigResponseBodyDataSlsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeResultExportConfigResponseBodyDataSlsInfo setLogstoreTtl(Integer logstoreTtl) {
            this.logstoreTtl = logstoreTtl;
            return this;
        }
        public Integer getLogstoreTtl() {
            return this.logstoreTtl;
        }

        public DescribeResultExportConfigResponseBodyDataSlsInfo setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeResultExportConfigResponseBodyDataSlsInfo setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

    }

    public static class DescribeResultExportConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        @NameInMap("OssInfo")
        public DescribeResultExportConfigResponseBodyDataOssInfo ossInfo;

        @NameInMap("SlsInfo")
        public DescribeResultExportConfigResponseBodyDataSlsInfo slsInfo;

        public static DescribeResultExportConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResultExportConfigResponseBodyData self = new DescribeResultExportConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResultExportConfigResponseBodyData setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public DescribeResultExportConfigResponseBodyData setOssInfo(DescribeResultExportConfigResponseBodyDataOssInfo ossInfo) {
            this.ossInfo = ossInfo;
            return this;
        }
        public DescribeResultExportConfigResponseBodyDataOssInfo getOssInfo() {
            return this.ossInfo;
        }

        public DescribeResultExportConfigResponseBodyData setSlsInfo(DescribeResultExportConfigResponseBodyDataSlsInfo slsInfo) {
            this.slsInfo = slsInfo;
            return this;
        }
        public DescribeResultExportConfigResponseBodyDataSlsInfo getSlsInfo() {
            return this.slsInfo;
        }

    }

}
