// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_agent,ip_adress,ip_port</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("HttpDelivery")
    public CreateSiteDeliveryTaskRequestHttpDelivery httpDelivery;

    @NameInMap("KafkaDelivery")
    public CreateSiteDeliveryTaskRequestKafkaDelivery kafkaDelivery;

    @NameInMap("OssDelivery")
    public CreateSiteDeliveryTaskRequestOssDelivery ossDelivery;

    @NameInMap("S3Delivery")
    public CreateSiteDeliveryTaskRequestS3Delivery s3Delivery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312112***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SlsDelivery")
    public CreateSiteDeliveryTaskRequestSlsDelivery slsDelivery;

    /**
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
        @NameInMap("ExpiredTime")
        public Integer expiredTime;

        @NameInMap("PrivateKey")
        public String privateKey;

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
        @NameInMap("Compress")
        public String compress;

        @NameInMap("DestUrl")
        public String destUrl;

        @NameInMap("HeaderParam")
        public java.util.Map<String, HttpDeliveryHeaderParamValue> headerParam;

        @NameInMap("LogBodyPrefix")
        public String logBodyPrefix;

        @NameInMap("LogBodySuffix")
        public String logBodySuffix;

        @NameInMap("MaxBatchMB")
        public Long maxBatchMB;

        @NameInMap("MaxBatchSize")
        public Long maxBatchSize;

        @NameInMap("MaxRetry")
        public Long maxRetry;

        @NameInMap("QueryParam")
        public java.util.Map<String, HttpDeliveryQueryParamValue> queryParam;

        @NameInMap("StandardAuthOn")
        public Boolean standardAuthOn;

        @NameInMap("StandardAuthParam")
        public CreateSiteDeliveryTaskRequestHttpDeliveryStandardAuthParam standardAuthParam;

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
        @NameInMap("Balancer")
        public String balancer;

        @NameInMap("Brokers")
        public java.util.List<String> brokers;

        /**
         * <strong>example:</strong>
         * <p>gzip</p>
         */
        @NameInMap("Compress")
        public String compress;

        @NameInMap("MachanismType")
        public String machanismType;

        @NameInMap("Password")
        public String password;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("UserAuth")
        public Boolean userAuth;

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
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>logriver-test/log</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("BucketPath")
        public String bucketPath;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("PrefixPath")
        public String prefixPath;

        @NameInMap("Region")
        public String region;

        @NameInMap("S3Cmpt")
        public Boolean s3Cmpt;

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
        @NameInMap("SLSLogStore")
        public String SLSLogStore;

        @NameInMap("SLSProject")
        public String SLSProject;

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
