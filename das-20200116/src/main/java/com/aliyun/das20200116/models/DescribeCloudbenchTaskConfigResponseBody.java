// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>/tmp/das/cloudbench/archive-sqls/</p>
         */
        @NameInMap("ArchiveFolder")
        public String archiveFolder;

        /**
         * <p>The command that was run to start the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>java -jar /tmp/das/cloudbench/CloudBenchClient.jar --bench --rocksdb /tmp/das/cloudbench/rocksdb --meta /tmp/das/cloudbench/cl-1621353601000-360****.meta --task_name 2777bba9-a836-49e6-9f70-1c3822fc9239 --result_file /tmp/das/cloudbench/null.result --user cloudb**** --pwd \&quot;cloudbench@<strong><strong>\&quot; --host rm-bp1j5f8s5x26kq79216</strong></strong>.mysql.rds.aliyuncs.com --port 3306 --charset utf8mb4 --interval 1 --bench_time 3600 --rate_factor 1.0 --start_time 1621353601 --rt &gt; /tmp/das/cloudbench/null.log</p>
         */
        @NameInMap("BenchCmd")
        public String benchCmd;

        /**
         * <p>The path to the JAR file that is used for stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/das/cloudbench/CloudBenchClient.jar</p>
         */
        @NameInMap("ClientJarPath")
        public String clientJarPath;

        /**
         * <p>The path to the JAR file that is stored in OSS. The JAR file is used for stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cloudbench-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/CloudBenchClient.jar?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&Expires=1622441372&Signature=28p%2BCe4tNHpr9VPOcHc3Si9iOb">https://cloudbench-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/CloudBenchClient.jar?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&amp;Expires=1622441372&amp;Signature=28p%2BCe4tNHpr9VPOcHc3Si9iOb</a>****</p>
         */
        @NameInMap("JarOnOss")
        public String jarOnOss;

        /**
         * <p>The command that was run to preload the file that stores the analysis result of full SQL statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>java -jar /tmp/das/cloudbench/CloudBenchClient.jar --load --out /tmp/das/cloudbench/cl-1621353601000-360****.sc --meta /tmp/das/cloudbench/cl-1621353601000-360****.meta --task_name 2777bba9-<strong><strong>-49e6-9f70-1c3822fc</strong></strong> --rocksdb /tmp/das/cloudbench/rocksdb</p>
         */
        @NameInMap("LoadCmd")
        public String loadCmd;

        /**
         * <p>The name of the metadata file.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-1621353601000-360****.meta</p>
         */
        @NameInMap("MetaFileName")
        public String metaFileName;

        /**
         * <p>The name of the metadata file stored in Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.meta?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&Expires=1622441372&Signature=Qsehg3tzeA57M%2BIixAbWPWAtvl">https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.meta?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&amp;Expires=1622441372&amp;Signature=Qsehg3tzeA57M%2BIixAbWPWAtvl</a>****</p>
         */
        @NameInMap("MetaFileOnOss")
        public String metaFileOnOss;

        /**
         * <p>The path to the metadata file.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/das/cloudbench/cl-1621353601000-360****.meta</p>
         */
        @NameInMap("MetaFilePath")
        public String metaFilePath;

        /**
         * <p>The command that was run to parse the file that stores the analysis result of full SQL statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>cd /tmp/das/cloudbench &amp;&amp; java -jar CloudBenchClient.jar --parse --threads 32 --file /tmp/das/cloudbench/2777bba9-a836-49e6-9f70-1c3822fc9239.archiveSql --meta /tmp/das/cloudbench/cl-1621353601000-360****.meta --out /tmp/das/cloudbench/cl-1621353601000-360****.sc --parent_patmp/das/cloudbench --source RDS --h /thost rm-bp1j5f8s5x266****.mysql.rds.aliyuncs.com --port 3306 --user cloudb**** --pwd \&quot;cloudbench@****\&quot; --cutSqlLen 8192 --db_black_list=information_schema,test,unknow,null</p>
         */
        @NameInMap("ParseCmd")
        public String parseCmd;

        /**
         * <p>The path to the file that is parsed. The file stores the analysis result of full SQL statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/das/cloudbench/2777bba9-a836-49e6-9f70-1c3822fc****.archiveSql</p>
         */
        @NameInMap("ParseFilePath")
        public String parseFilePath;

        /**
         * <p>The location where the RocksDB storage system is deployed in the stress testing client.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/das/cloudbench/rocksdb</p>
         */
        @NameInMap("RocksDbPath")
        public String rocksDbPath;

        /**
         * <p>The name of the file that stores the analysis result of full SQL statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-1621353601000-360****.sc</p>
         */
        @NameInMap("SqlFileName")
        public String sqlFileName;

        /**
         * <p>The name of the file that stores the analysis result of full SQL statistics and that is stored in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.sc?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&Expires=1622441372&Signature=LYMADwo%2BRrJeqR3e4d8OlIkVmw">https://cb-rm-bp1w9g06h560l****.oss-cn-hangzhou.aliyuncs.com/cl-1621353601000-360****.sc?OSSAccessKeyId=LTAI5tKj8B4wikkVtupK****&amp;Expires=1622441372&amp;Signature=LYMADwo%2BRrJeqR3e4d8OlIkVmw</a>****</p>
         */
        @NameInMap("SqlFileOnOss")
        public String sqlFileOnOss;

        /**
         * <p>The path to the file that stores the analysis result of full SQL statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/das/cloudbench/cl-1621353601000-360****.sc</p>
         */
        @NameInMap("SqlFilePath")
        public String sqlFilePath;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e5cec704-0518-430f-8263-76f4dcds****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1091411816252****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The path of the temporary directory that is generated for stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/bench/</p>
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
