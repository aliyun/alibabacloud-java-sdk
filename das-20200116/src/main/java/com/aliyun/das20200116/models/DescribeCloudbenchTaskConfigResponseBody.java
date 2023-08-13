// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     */
    @NameInMap("Data")
    public DescribeCloudbenchTaskConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeCloudbenchTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskConfigResponseBody self = new DescribeCloudbenchTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCloudbenchTaskConfigResponseBody setData(DescribeCloudbenchTaskConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudbenchTaskConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudbenchTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudbenchTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudbenchTaskConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCloudbenchTaskConfigResponseBodyData extends TeaModel {
        /**
         * <p>The path in which the files are archived.</p>
         */
        @NameInMap("ArchiveFolder")
        public String archiveFolder;

        /**
         * <p>The command that was run to start the stress testing task.</p>
         */
        @NameInMap("BenchCmd")
        public String benchCmd;

        /**
         * <p>The path to the JAR file that is used for stress testing.</p>
         */
        @NameInMap("ClientJarPath")
        public String clientJarPath;

        /**
         * <p>The path to the JAR file that is stored in OSS. The JAR file is used for stress testing.</p>
         */
        @NameInMap("JarOnOss")
        public String jarOnOss;

        /**
         * <p>The command that was run to preload the file that stores the analysis result of full SQL statistics.</p>
         */
        @NameInMap("LoadCmd")
        public String loadCmd;

        /**
         * <p>The name of the metadata file.</p>
         */
        @NameInMap("MetaFileName")
        public String metaFileName;

        /**
         * <p>The name of the metadata file stored in Object Storage Service (OSS).</p>
         */
        @NameInMap("MetaFileOnOss")
        public String metaFileOnOss;

        /**
         * <p>The path to the metadata file.</p>
         */
        @NameInMap("MetaFilePath")
        public String metaFilePath;

        /**
         * <p>The command that was run to parse the file that stores the analysis result of full SQL statistics.</p>
         */
        @NameInMap("ParseCmd")
        public String parseCmd;

        /**
         * <p>The path to the file that is parsed. The file stores the analysis result of full SQL statistics.</p>
         */
        @NameInMap("ParseFilePath")
        public String parseFilePath;

        /**
         * <p>The location where the RocksDB storage system is deployed in the stress testing client.</p>
         */
        @NameInMap("RocksDbPath")
        public String rocksDbPath;

        /**
         * <p>The name of the file that stores the analysis result of full SQL statistics.</p>
         */
        @NameInMap("SqlFileName")
        public String sqlFileName;

        /**
         * <p>The name of the file that stores the analysis result of full SQL statistics and that is stored in OSS.</p>
         */
        @NameInMap("SqlFileOnOss")
        public String sqlFileOnOss;

        /**
         * <p>The path to the file that stores the analysis result of full SQL statistics.</p>
         */
        @NameInMap("SqlFilePath")
        public String sqlFilePath;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The path of the temporary directory that is generated for stress testing.</p>
         */
        @NameInMap("WorkDir")
        public String workDir;

        public static DescribeCloudbenchTaskConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudbenchTaskConfigResponseBodyData self = new DescribeCloudbenchTaskConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setArchiveFolder(String archiveFolder) {
            this.archiveFolder = archiveFolder;
            return this;
        }
        public String getArchiveFolder() {
            return this.archiveFolder;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setBenchCmd(String benchCmd) {
            this.benchCmd = benchCmd;
            return this;
        }
        public String getBenchCmd() {
            return this.benchCmd;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setClientJarPath(String clientJarPath) {
            this.clientJarPath = clientJarPath;
            return this;
        }
        public String getClientJarPath() {
            return this.clientJarPath;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setJarOnOss(String jarOnOss) {
            this.jarOnOss = jarOnOss;
            return this;
        }
        public String getJarOnOss() {
            return this.jarOnOss;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setLoadCmd(String loadCmd) {
            this.loadCmd = loadCmd;
            return this;
        }
        public String getLoadCmd() {
            return this.loadCmd;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setMetaFileName(String metaFileName) {
            this.metaFileName = metaFileName;
            return this;
        }
        public String getMetaFileName() {
            return this.metaFileName;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setMetaFileOnOss(String metaFileOnOss) {
            this.metaFileOnOss = metaFileOnOss;
            return this;
        }
        public String getMetaFileOnOss() {
            return this.metaFileOnOss;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setMetaFilePath(String metaFilePath) {
            this.metaFilePath = metaFilePath;
            return this;
        }
        public String getMetaFilePath() {
            return this.metaFilePath;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setParseCmd(String parseCmd) {
            this.parseCmd = parseCmd;
            return this;
        }
        public String getParseCmd() {
            return this.parseCmd;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setParseFilePath(String parseFilePath) {
            this.parseFilePath = parseFilePath;
            return this;
        }
        public String getParseFilePath() {
            return this.parseFilePath;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setRocksDbPath(String rocksDbPath) {
            this.rocksDbPath = rocksDbPath;
            return this;
        }
        public String getRocksDbPath() {
            return this.rocksDbPath;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setSqlFileName(String sqlFileName) {
            this.sqlFileName = sqlFileName;
            return this;
        }
        public String getSqlFileName() {
            return this.sqlFileName;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setSqlFileOnOss(String sqlFileOnOss) {
            this.sqlFileOnOss = sqlFileOnOss;
            return this;
        }
        public String getSqlFileOnOss() {
            return this.sqlFileOnOss;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setSqlFilePath(String sqlFilePath) {
            this.sqlFilePath = sqlFilePath;
            return this;
        }
        public String getSqlFilePath() {
            return this.sqlFilePath;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeCloudbenchTaskConfigResponseBodyData setWorkDir(String workDir) {
            this.workDir = workDir;
            return this;
        }
        public String getWorkDir() {
            return this.workDir;
        }

    }

}
