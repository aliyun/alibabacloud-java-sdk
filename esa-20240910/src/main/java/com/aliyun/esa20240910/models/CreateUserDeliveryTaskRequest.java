// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The real-time log type. Valid values:</p>
     * <ul>
     * <li><p><strong>dcdn_log_access_l1</strong> (default): access log.</p>
     * </li>
     * <li><p><strong>dcdn_log_er</strong>: edge function log.</p>
     * </li>
     * <li><p><strong>dcdn_log_waf</strong>: WAF log.</p>
     * </li>
     * <li><p><strong>dcdn_log_ipa</strong>: Layer-4 acceleration log.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li><p><strong>cn</strong>: Chinese mainland.</p>
     * </li>
     * <li><p><strong>sg</strong>: global (excluding the Chinese mainland).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The log delivery destination. Valid values:</p>
     * <ul>
     * <li><p><strong>sls</strong>: Log Service (SLS).</p>
     * </li>
     * <li><p><strong>http</strong>: an HTTP service.</p>
     * </li>
     * <li><p><strong>aws3</strong>: Amazon S3.</p>
     * </li>
     * <li><p><strong>oss</strong>: Object Storage Service (OSS).</p>
     * </li>
     * <li><p><strong>kafka</strong>: Kafka.</p>
     * </li>
     * <li><p><strong>aws3cmpt</strong>: an S3-compatible service.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    @NameInMap("Details")
    public String details;

    /**
     * <p>The log discard rate. Defaults to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The fields to be delivered. Separate multiple fields with a comma.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_agent,ip_address,ip_port</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FilterVer")
    public String filterVer;

    /**
     * <p>Configuration for delivering logs to an HTTP or HTTPS endpoint.</p>
     */
    @NameInMap("HttpDelivery")
    public CreateUserDeliveryTaskRequestHttpDelivery httpDelivery;

    /**
     * <p>Configuration for delivering logs to Kafka.</p>
     */
    @NameInMap("KafkaDelivery")
    public CreateUserDeliveryTaskRequestKafkaDelivery kafkaDelivery;

    /**
     * <p>Configuration for delivering logs to Object Storage Service (OSS).</p>
     */
    @NameInMap("OssDelivery")
    public CreateUserDeliveryTaskRequestOssDelivery ossDelivery;

    /**
     * <p>Configuration for delivering logs to Amazon S3 or an S3-compatible service.</p>
     */
    @NameInMap("S3Delivery")
    public CreateUserDeliveryTaskRequestS3Delivery s3Delivery;

    /**
     * <p>Configuration for delivering logs to Log Service (SLS).</p>
     */
    @NameInMap("SlsDelivery")
    public CreateUserDeliveryTaskRequestSlsDelivery slsDelivery;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateUserDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDeliveryTaskRequest self = new CreateUserDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserDeliveryTaskRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateUserDeliveryTaskRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateUserDeliveryTaskRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateUserDeliveryTaskRequest setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public CreateUserDeliveryTaskRequest setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public CreateUserDeliveryTaskRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateUserDeliveryTaskRequest setFilterVer(String filterVer) {
        this.filterVer = filterVer;
        return this;
    }
    public String getFilterVer() {
        return this.filterVer;
    }

    public CreateUserDeliveryTaskRequest setHttpDelivery(CreateUserDeliveryTaskRequestHttpDelivery httpDelivery) {
        this.httpDelivery = httpDelivery;
        return this;
    }
    public CreateUserDeliveryTaskRequestHttpDelivery getHttpDelivery() {
        return this.httpDelivery;
    }

    public CreateUserDeliveryTaskRequest setKafkaDelivery(CreateUserDeliveryTaskRequestKafkaDelivery kafkaDelivery) {
        this.kafkaDelivery = kafkaDelivery;
        return this;
    }
    public CreateUserDeliveryTaskRequestKafkaDelivery getKafkaDelivery() {
        return this.kafkaDelivery;
    }

    public CreateUserDeliveryTaskRequest setOssDelivery(CreateUserDeliveryTaskRequestOssDelivery ossDelivery) {
        this.ossDelivery = ossDelivery;
        return this;
    }
    public CreateUserDeliveryTaskRequestOssDelivery getOssDelivery() {
        return this.ossDelivery;
    }

    public CreateUserDeliveryTaskRequest setS3Delivery(CreateUserDeliveryTaskRequestS3Delivery s3Delivery) {
        this.s3Delivery = s3Delivery;
        return this;
    }
    public CreateUserDeliveryTaskRequestS3Delivery getS3Delivery() {
        return this.s3Delivery;
    }

    public CreateUserDeliveryTaskRequest setSlsDelivery(CreateUserDeliveryTaskRequestSlsDelivery slsDelivery) {
        this.slsDelivery = slsDelivery;
        return this;
    }
    public CreateUserDeliveryTaskRequestSlsDelivery getSlsDelivery() {
        return this.slsDelivery;
    }

    public CreateUserDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam extends TeaModel {
        /**
         * <p>The expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ExpiredTime")
        public Integer expiredTime;

        /**
         * <p>The private key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PrivateKey")
        public String privateKey;

        /**
         * <p>The URL path.</p>
         * 
         * <strong>example:</strong>
         * <p>v1/log/upload</p>
         */
        @NameInMap("UrlPath")
        public String urlPath;

        public static CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam build(java.util.Map<String, ?> map) throws Exception {
            CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam self = new CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam();
            return TeaModel.build(map, self);
        }

        public CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Integer getExpiredTime() {
            return this.expiredTime;
        }

        public CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam setUrlPath(String urlPath) {
            this.urlPath = urlPath;
            return this;
        }
        public String getUrlPath() {
            return this.urlPath;
        }

    }

    public static class CreateUserDeliveryTaskRequestHttpDelivery extends TeaModel {
        /**
         * <p>The compression method.</p>
         * 
         * <strong>example:</strong>
         * <p>gzip</p>
         */
        @NameInMap("Compress")
        public String compress;

        /**
         * <p>The URL of the destination endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.aliyun.com/v1/log/upload">http://xxx.aliyun.com/v1/log/upload</a></p>
         */
        @NameInMap("DestUrl")
        public String destUrl;

        /**
         * <p>Custom HTTP headers.</p>
         */
        @NameInMap("HeaderParam")
        public java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam;

        /**
         * <p>The trailing delimiter.</p>
         * 
         * <strong>example:</strong>
         * <p>\n</p>
         */
        @NameInMap("LastLogSplit")
        public Boolean lastLogSplit;

        /**
         * <p>The prefix to add to the log delivery payload.</p>
         * 
         * <strong>example:</strong>
         * <p>cdnVersion:1.0</p>
         */
        @NameInMap("LogBodyPrefix")
        public String logBodyPrefix;

        /**
         * <p>The suffix to add to the log delivery payload.</p>
         * 
         * <strong>example:</strong>
         * <p>cdnVersion:1.0</p>
         */
        @NameInMap("LogBodySuffix")
        public String logBodySuffix;

        /**
         * <p>Specifies whether to split log entries. Defaults to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogSplit")
        public Boolean logSplit;

        /**
         * <p>The delimiter for log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>\n</p>
         */
        @NameInMap("LogSplitWords")
        public String logSplitWords;

        /**
         * <p>The maximum size of a delivery batch, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxBatchMB")
        public Long maxBatchMB;

        /**
         * <p>The maximum number of log entries per delivery request.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxBatchSize")
        public Long maxBatchSize;

        /**
         * <p>The maximum number of retries if a delivery fails.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRetry")
        public Long maxRetry;

        /**
         * <p>Custom query parameters.</p>
         */
        @NameInMap("QueryParam")
        public java.util.Map<String, HttpDeliveryQueryParamValue> queryParam;

        /**
         * <p>Specifies whether to enable standard authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StandardAuthOn")
        public Boolean standardAuthOn;

        /**
         * <p>Configuration for standard authentication.</p>
         */
        @NameInMap("StandardAuthParam")
        public CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam standardAuthParam;

        /**
         * <p>The delivery timeout, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TransformTimeout")
        public Long transformTimeout;

        public static CreateUserDeliveryTaskRequestHttpDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateUserDeliveryTaskRequestHttpDelivery self = new CreateUserDeliveryTaskRequestHttpDelivery();
            return TeaModel.build(map, self);
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setCompress(String compress) {
            this.compress = compress;
            return this;
        }
        public String getCompress() {
            return this.compress;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setDestUrl(String destUrl) {
            this.destUrl = destUrl;
            return this;
        }
        public String getDestUrl() {
            return this.destUrl;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setHeaderParam(java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam) {
            this.headerParam = headerParam;
            return this;
        }
        public java.util.Map<String, HttpDeliveryHeaderParamValue> getHeaderParam() {
            return this.headerParam;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setLastLogSplit(Boolean lastLogSplit) {
            this.lastLogSplit = lastLogSplit;
            return this;
        }
        public Boolean getLastLogSplit() {
            return this.lastLogSplit;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setLogBodyPrefix(String logBodyPrefix) {
            this.logBodyPrefix = logBodyPrefix;
            return this;
        }
        public String getLogBodyPrefix() {
            return this.logBodyPrefix;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setLogBodySuffix(String logBodySuffix) {
            this.logBodySuffix = logBodySuffix;
            return this;
        }
        public String getLogBodySuffix() {
            return this.logBodySuffix;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setLogSplit(Boolean logSplit) {
            this.logSplit = logSplit;
            return this;
        }
        public Boolean getLogSplit() {
            return this.logSplit;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setLogSplitWords(String logSplitWords) {
            this.logSplitWords = logSplitWords;
            return this;
        }
        public String getLogSplitWords() {
            return this.logSplitWords;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setMaxBatchMB(Long maxBatchMB) {
            this.maxBatchMB = maxBatchMB;
            return this;
        }
        public Long getMaxBatchMB() {
            return this.maxBatchMB;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setMaxBatchSize(Long maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }
        public Long getMaxBatchSize() {
            return this.maxBatchSize;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setMaxRetry(Long maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Long getMaxRetry() {
            return this.maxRetry;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setQueryParam(java.util.Map<String, HttpDeliveryQueryParamValue> queryParam) {
            this.queryParam = queryParam;
            return this;
        }
        public java.util.Map<String, HttpDeliveryQueryParamValue> getQueryParam() {
            return this.queryParam;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setStandardAuthOn(Boolean standardAuthOn) {
            this.standardAuthOn = standardAuthOn;
            return this;
        }
        public Boolean getStandardAuthOn() {
            return this.standardAuthOn;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setStandardAuthParam(CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam standardAuthParam) {
            this.standardAuthParam = standardAuthParam;
            return this;
        }
        public CreateUserDeliveryTaskRequestHttpDeliveryStandardAuthParam getStandardAuthParam() {
            return this.standardAuthParam;
        }

        public CreateUserDeliveryTaskRequestHttpDelivery setTransformTimeout(Long transformTimeout) {
            this.transformTimeout = transformTimeout;
            return this;
        }
        public Long getTransformTimeout() {
            return this.transformTimeout;
        }

    }

    public static class CreateUserDeliveryTaskRequestKafkaDelivery extends TeaModel {
        /**
         * <p>The load balancing method.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka.LeastBytes</p>
         */
        @NameInMap("Balancer")
        public String balancer;

        /**
         * <p>A list of Kafka brokers.</p>
         */
        @NameInMap("Brokers")
        public java.util.List<String> brokers;

        /**
         * <p>The compression method. Disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>lz4</p>
         */
        @NameInMap("Compress")
        public String compress;

        /**
         * <p>The authentication mechanism.</p>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        @NameInMap("MachanismType")
        public String machanismType;

        /**
         * <p>The password for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The Kafka topic.</p>
         * 
         * <strong>example:</strong>
         * <p>dqc_test2</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>Specifies whether to enable user authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserAuth")
        public Boolean userAuth;

        /**
         * <p>The username for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateUserDeliveryTaskRequestKafkaDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateUserDeliveryTaskRequestKafkaDelivery self = new CreateUserDeliveryTaskRequestKafkaDelivery();
            return TeaModel.build(map, self);
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setBalancer(String balancer) {
            this.balancer = balancer;
            return this;
        }
        public String getBalancer() {
            return this.balancer;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setBrokers(java.util.List<String> brokers) {
            this.brokers = brokers;
            return this;
        }
        public java.util.List<String> getBrokers() {
            return this.brokers;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setCompress(String compress) {
            this.compress = compress;
            return this;
        }
        public String getCompress() {
            return this.compress;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setMachanismType(String machanismType) {
            this.machanismType = machanismType;
            return this;
        }
        public String getMachanismType() {
            return this.machanismType;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setUserAuth(Boolean userAuth) {
            this.userAuth = userAuth;
            return this;
        }
        public Boolean getUserAuth() {
            return this.userAuth;
        }

        public CreateUserDeliveryTaskRequestKafkaDelivery setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateUserDeliveryTaskRequestOssDelivery extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234***</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rlog</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The object key prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>test/</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The region of the destination OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static CreateUserDeliveryTaskRequestOssDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateUserDeliveryTaskRequestOssDelivery self = new CreateUserDeliveryTaskRequestOssDelivery();
            return TeaModel.build(map, self);
        }

        public CreateUserDeliveryTaskRequestOssDelivery setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public CreateUserDeliveryTaskRequestOssDelivery setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateUserDeliveryTaskRequestOssDelivery setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public CreateUserDeliveryTaskRequestOssDelivery setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class CreateUserDeliveryTaskRequestS3Delivery extends TeaModel {
        /**
         * <p>The access key ID for the S3 account.</p>
         * 
         * <strong>example:</strong>
         * <p>g0f46623ll0g0</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The bucket path.</p>
         * 
         * <strong>example:</strong>
         * <p>logriver-test/log</p>
         */
        @NameInMap("BucketPath")
        public String bucketPath;

        /**
         * <p>The S3 endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://s3.oss-cn-hangzhou.aliyuncs.com">https://s3.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The object key prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>logriver-test/log</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Specifies whether the destination is an S3-compatible service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("S3Cmpt")
        public Boolean s3Cmpt;

        /**
         * <p>The secret access key for the S3 account.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("ServerSideEncryption")
        public Boolean serverSideEncryption;

        @NameInMap("VertifyType")
        public String vertifyType;

        public static CreateUserDeliveryTaskRequestS3Delivery build(java.util.Map<String, ?> map) throws Exception {
            CreateUserDeliveryTaskRequestS3Delivery self = new CreateUserDeliveryTaskRequestS3Delivery();
            return TeaModel.build(map, self);
        }

        public CreateUserDeliveryTaskRequestS3Delivery setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setS3Cmpt(Boolean s3Cmpt) {
            this.s3Cmpt = s3Cmpt;
            return this;
        }
        public Boolean getS3Cmpt() {
            return this.s3Cmpt;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setServerSideEncryption(Boolean serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public Boolean getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        public CreateUserDeliveryTaskRequestS3Delivery setVertifyType(String vertifyType) {
            this.vertifyType = vertifyType;
            return this;
        }
        public String getVertifyType() {
            return this.vertifyType;
        }

    }

    public static class CreateUserDeliveryTaskRequestSlsDelivery extends TeaModel {
        /**
         * <p>The name of the destination logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>accesslog-test</p>
         */
        @NameInMap("SLSLogStore")
        public String SLSLogStore;

        /**
         * <p>The name of the destination project.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn-test20240417</p>
         */
        @NameInMap("SLSProject")
        public String SLSProject;

        /**
         * <p>The region of the destination project.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SLSRegion")
        public String SLSRegion;

        public static CreateUserDeliveryTaskRequestSlsDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateUserDeliveryTaskRequestSlsDelivery self = new CreateUserDeliveryTaskRequestSlsDelivery();
            return TeaModel.build(map, self);
        }

        public CreateUserDeliveryTaskRequestSlsDelivery setSLSLogStore(String SLSLogStore) {
            this.SLSLogStore = SLSLogStore;
            return this;
        }
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        public CreateUserDeliveryTaskRequestSlsDelivery setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public CreateUserDeliveryTaskRequestSlsDelivery setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

    }

}
