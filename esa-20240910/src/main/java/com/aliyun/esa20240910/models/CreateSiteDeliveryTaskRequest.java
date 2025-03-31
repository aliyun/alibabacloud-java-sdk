// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskRequest extends TeaModel {
    /**
     * <p>The log category. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1</strong> (default): access logs.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
     * <li><strong>dcdn_log_waf</strong>: firewall logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: TCP/UDP proxy logs.</li>
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
     * <li>cn: the Chinese mainland.</li>
     * <li>oversea: outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The destination of the delivery. Valid values:</p>
     * <ul>
     * <li>sls: Alibaba Cloud Simple Log Service (SLS).</li>
     * <li>http: HTTP server.</li>
     * <li>aws3: Amazon Simple Storage Service (S3).</li>
     * <li>oss: Alibaba Cloud Object Storage Service (OSS).</li>
     * <li>kafka: Kafka.</li>
     * <li>aws3cmpt: S3-compatible storage service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The discard rate. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The log fields, which are separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_agent,ip_adress,ip_port</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The configurations for delivery to an HTTP server.</p>
     */
    @NameInMap("HttpDelivery")
    public CreateSiteDeliveryTaskRequestHttpDelivery httpDelivery;

    /**
     * <p>The configurations for delivery to Kafka.</p>
     */
    @NameInMap("KafkaDelivery")
    public CreateSiteDeliveryTaskRequestKafkaDelivery kafkaDelivery;

    /**
     * <p>The configurations for delivery to OSS.</p>
     */
    @NameInMap("OssDelivery")
    public CreateSiteDeliveryTaskRequestOssDelivery ossDelivery;

    /**
     * <p>The configurations for delivery to Amazon S3 or an S3-compatible service.</p>
     */
    @NameInMap("S3Delivery")
    public CreateSiteDeliveryTaskRequestS3Delivery s3Delivery;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312112***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The configurations for delivery to SLS.</p>
     */
    @NameInMap("SlsDelivery")
    public CreateSiteDeliveryTaskRequestSlsDelivery slsDelivery;

    /**
     * <p>The name of the delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateSiteDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteDeliveryTaskRequest self = new CreateSiteDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteDeliveryTaskRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateSiteDeliveryTaskRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateSiteDeliveryTaskRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateSiteDeliveryTaskRequest setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public CreateSiteDeliveryTaskRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateSiteDeliveryTaskRequest setHttpDelivery(CreateSiteDeliveryTaskRequestHttpDelivery httpDelivery) {
        this.httpDelivery = httpDelivery;
        return this;
    }
    public CreateSiteDeliveryTaskRequestHttpDelivery getHttpDelivery() {
        return this.httpDelivery;
    }

    public CreateSiteDeliveryTaskRequest setKafkaDelivery(CreateSiteDeliveryTaskRequestKafkaDelivery kafkaDelivery) {
        this.kafkaDelivery = kafkaDelivery;
        return this;
    }
    public CreateSiteDeliveryTaskRequestKafkaDelivery getKafkaDelivery() {
        return this.kafkaDelivery;
    }

    public CreateSiteDeliveryTaskRequest setOssDelivery(CreateSiteDeliveryTaskRequestOssDelivery ossDelivery) {
        this.ossDelivery = ossDelivery;
        return this;
    }
    public CreateSiteDeliveryTaskRequestOssDelivery getOssDelivery() {
        return this.ossDelivery;
    }

    public CreateSiteDeliveryTaskRequest setS3Delivery(CreateSiteDeliveryTaskRequestS3Delivery s3Delivery) {
        this.s3Delivery = s3Delivery;
        return this;
    }
    public CreateSiteDeliveryTaskRequestS3Delivery getS3Delivery() {
        return this.s3Delivery;
    }

    public CreateSiteDeliveryTaskRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateSiteDeliveryTaskRequest setSlsDelivery(CreateSiteDeliveryTaskRequestSlsDelivery slsDelivery) {
        this.slsDelivery = slsDelivery;
        return this;
    }
    public CreateSiteDeliveryTaskRequestSlsDelivery getSlsDelivery() {
        return this.slsDelivery;
    }

    public CreateSiteDeliveryTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam extends TeaModel {
        /**
         * <p>The validity period of the signature.</p>
         * <blockquote>
         * <p> The value must be greater than 0. We recommend that you specify a value that is greater than 300.</p>
         * </blockquote>
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
         * <hr>
         */
        @NameInMap("PrivateKey")
        public String privateKey;

        /**
         * <p>The URI path for server authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>v1/log/upload</p>
         */
        @NameInMap("UrlPath")
        public String urlPath;

        public static CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam self = new CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam();
            return TeaModel.build(map, self);
        }

        public CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam setExpiredTime(Integer expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Integer getExpiredTime() {
            return this.expiredTime;
        }

        public CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public String getPrivateKey() {
            return this.privateKey;
        }

        public CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam setUrlPath(String urlPath) {
            this.urlPath = urlPath;
            return this;
        }
        public String getUrlPath() {
            return this.urlPath;
        }

    }

    public static class CreateSiteDeliveryTaskRequestHttpDelivery extends TeaModel {
        /**
         * <p>The compression method. By default, data is not compressed.</p>
         * 
         * <strong>example:</strong>
         * <p>gzip</p>
         */
        @NameInMap("Compress")
        public String compress;

        /**
         * <p>The address of the HTTP server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.aliyun.com/v1/log/upload">http://xxx.aliyun.com/v1/log/upload</a></p>
         */
        @NameInMap("DestUrl")
        public String destUrl;

        /**
         * <p>The custom headers.</p>
         */
        @NameInMap("HeaderParam")
        public java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam;

        /**
         * <p>The prefix of the log delivery package.</p>
         * 
         * <strong>example:</strong>
         * <p>cdnVersion:1.0</p>
         */
        @NameInMap("LogBodyPrefix")
        public String logBodyPrefix;

        /**
         * <p>The suffix of the log delivery package.</p>
         * 
         * <strong>example:</strong>
         * <p>cdnVersion:1.0</p>
         */
        @NameInMap("LogBodySuffix")
        public String logBodySuffix;

        /**
         * <p>The maximum size of data for each delivery. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxBatchMB")
        public Long maxBatchMB;

        /**
         * <p>The maximum number of entries for each delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxBatchSize")
        public Long maxBatchSize;

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxRetry")
        public Long maxRetry;

        /**
         * <p>The custom query parameters.</p>
         */
        @NameInMap("QueryParam")
        public java.util.Map<String, HttpDeliveryQueryParamValue> queryParam;

        /**
         * <p>Specifies whether to use server authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StandardAuthOn")
        public Boolean standardAuthOn;

        /**
         * <p>The authentication configurations.</p>
         */
        @NameInMap("StandardAuthParam")
        public CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam standardAuthParam;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TransformTimeout")
        public Long transformTimeout;

        public static CreateSiteDeliveryTaskRequestHttpDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteDeliveryTaskRequestHttpDelivery self = new CreateSiteDeliveryTaskRequestHttpDelivery();
            return TeaModel.build(map, self);
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setCompress(String compress) {
            this.compress = compress;
            return this;
        }
        public String getCompress() {
            return this.compress;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setDestUrl(String destUrl) {
            this.destUrl = destUrl;
            return this;
        }
        public String getDestUrl() {
            return this.destUrl;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setHeaderParam(java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam) {
            this.headerParam = headerParam;
            return this;
        }
        public java.util.Map<String, HttpDeliveryHeaderParamValue> getHeaderParam() {
            return this.headerParam;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setLogBodyPrefix(String logBodyPrefix) {
            this.logBodyPrefix = logBodyPrefix;
            return this;
        }
        public String getLogBodyPrefix() {
            return this.logBodyPrefix;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setLogBodySuffix(String logBodySuffix) {
            this.logBodySuffix = logBodySuffix;
            return this;
        }
        public String getLogBodySuffix() {
            return this.logBodySuffix;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setMaxBatchMB(Long maxBatchMB) {
            this.maxBatchMB = maxBatchMB;
            return this;
        }
        public Long getMaxBatchMB() {
            return this.maxBatchMB;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setMaxBatchSize(Long maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }
        public Long getMaxBatchSize() {
            return this.maxBatchSize;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setMaxRetry(Long maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Long getMaxRetry() {
            return this.maxRetry;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setQueryParam(java.util.Map<String, HttpDeliveryQueryParamValue> queryParam) {
            this.queryParam = queryParam;
            return this;
        }
        public java.util.Map<String, HttpDeliveryQueryParamValue> getQueryParam() {
            return this.queryParam;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setStandardAuthOn(Boolean standardAuthOn) {
            this.standardAuthOn = standardAuthOn;
            return this;
        }
        public Boolean getStandardAuthOn() {
            return this.standardAuthOn;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setStandardAuthParam(CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam standardAuthParam) {
            this.standardAuthParam = standardAuthParam;
            return this;
        }
        public CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam getStandardAuthParam() {
            return this.standardAuthParam;
        }

        public CreateSiteDeliveryTaskRequestHttpDelivery setTransformTimeout(Long transformTimeout) {
            this.transformTimeout = transformTimeout;
            return this;
        }
        public Long getTransformTimeout() {
            return this.transformTimeout;
        }

    }

    public static class CreateSiteDeliveryTaskRequestKafkaDelivery extends TeaModel {
        /**
         * <p>The load balancing method.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka.LeastBytes</p>
         */
        @NameInMap("Balancer")
        public String balancer;

        /**
         * <p>The brokers.</p>
         */
        @NameInMap("Brokers")
        public java.util.List<String> brokers;

        /**
         * <p>The compression method.</p>
         * 
         * <strong>example:</strong>
         * <p>gzip</p>
         */
        @NameInMap("Compress")
        public String compress;

        /**
         * <p>The encryption method.</p>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        @NameInMap("MachanismType")
        public String machanismType;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The topic.</p>
         * 
         * <strong>example:</strong>
         * <p>dqc_test2</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>Specifies whether to enable authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserAuth")
        public Boolean userAuth;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateSiteDeliveryTaskRequestKafkaDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteDeliveryTaskRequestKafkaDelivery self = new CreateSiteDeliveryTaskRequestKafkaDelivery();
            return TeaModel.build(map, self);
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setBalancer(String balancer) {
            this.balancer = balancer;
            return this;
        }
        public String getBalancer() {
            return this.balancer;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setBrokers(java.util.List<String> brokers) {
            this.brokers = brokers;
            return this;
        }
        public java.util.List<String> getBrokers() {
            return this.brokers;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setCompress(String compress) {
            this.compress = compress;
            return this;
        }
        public String getCompress() {
            return this.compress;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setMachanismType(String machanismType) {
            this.machanismType = machanismType;
            return this;
        }
        public String getMachanismType() {
            return this.machanismType;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setUserAuth(Boolean userAuth) {
            this.userAuth = userAuth;
            return this;
        }
        public Boolean getUserAuth() {
            return this.userAuth;
        }

        public CreateSiteDeliveryTaskRequestKafkaDelivery setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CreateSiteDeliveryTaskRequestOssDelivery extends TeaModel {
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234***</p>
         */
        @NameInMap("Aliuid")
        public String aliuid;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rlog</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The prefix of the path in which you want to store logs.</p>
         * 
         * <strong>example:</strong>
         * <p>logriver-test/log</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The region in which the bucket is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        public static CreateSiteDeliveryTaskRequestOssDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteDeliveryTaskRequestOssDelivery self = new CreateSiteDeliveryTaskRequestOssDelivery();
            return TeaModel.build(map, self);
        }

        public CreateSiteDeliveryTaskRequestOssDelivery setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public CreateSiteDeliveryTaskRequestOssDelivery setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateSiteDeliveryTaskRequestOssDelivery setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public CreateSiteDeliveryTaskRequestOssDelivery setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class CreateSiteDeliveryTaskRequestS3Delivery extends TeaModel {
        /**
         * <p>The access key ID of your Amazon S3 account.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The directory in the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>logriver-test/log</p>
         */
        @NameInMap("BucketPath")
        public String bucketPath;

        /**
         * <p>The endpoint. This parameter is required when the S3Cmpt parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://s3.oss-cn-hangzhou.aliyuncs.com">https://s3.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The prefix of the path in which you want to store logs.</p>
         * 
         * <strong>example:</strong>
         * <p>logriver-test/log</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The region ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Specifies whether the service is compatible with Amazon S3.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("S3Cmpt")
        public Boolean s3Cmpt;

        /**
         * <p>The secret access key of your Amazon S3 account.</p>
         * 
         * <strong>example:</strong>
         * <p>LDSIKh***</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("ServerSideEncryption")
        public Boolean serverSideEncryption;

        @NameInMap("VertifyType")
        public String vertifyType;

        public static CreateSiteDeliveryTaskRequestS3Delivery build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteDeliveryTaskRequestS3Delivery self = new CreateSiteDeliveryTaskRequestS3Delivery();
            return TeaModel.build(map, self);
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setS3Cmpt(Boolean s3Cmpt) {
            this.s3Cmpt = s3Cmpt;
            return this;
        }
        public Boolean getS3Cmpt() {
            return this.s3Cmpt;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setServerSideEncryption(Boolean serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public Boolean getServerSideEncryption() {
            return this.serverSideEncryption;
        }

        public CreateSiteDeliveryTaskRequestS3Delivery setVertifyType(String vertifyType) {
            this.vertifyType = vertifyType;
            return this;
        }
        public String getVertifyType() {
            return this.vertifyType;
        }

    }

    public static class CreateSiteDeliveryTaskRequestSlsDelivery extends TeaModel {
        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>accesslog-test</p>
         */
        @NameInMap("SLSLogStore")
        public String SLSLogStore;

        /**
         * <p>The name of the SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn-test20240417</p>
         */
        @NameInMap("SLSProject")
        public String SLSProject;

        /**
         * <p>The region in which the SLS project resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SLSRegion")
        public String SLSRegion;

        public static CreateSiteDeliveryTaskRequestSlsDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteDeliveryTaskRequestSlsDelivery self = new CreateSiteDeliveryTaskRequestSlsDelivery();
            return TeaModel.build(map, self);
        }

        public CreateSiteDeliveryTaskRequestSlsDelivery setSLSLogStore(String SLSLogStore) {
            this.SLSLogStore = SLSLogStore;
            return this;
        }
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        public CreateSiteDeliveryTaskRequestSlsDelivery setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public CreateSiteDeliveryTaskRequestSlsDelivery setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

    }

}
