// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchSyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6d4d****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("FailedList")
    public java.util.List<CreateAppSessionBatchSyncResponseBodyFailedList> failedList;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultList")
    public java.util.List<CreateAppSessionBatchSyncResponseBodyResultList> resultList;

    public static CreateAppSessionBatchSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchSyncResponseBody self = new CreateAppSessionBatchSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchSyncResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CreateAppSessionBatchSyncResponseBody setFailedList(java.util.List<CreateAppSessionBatchSyncResponseBodyFailedList> failedList) {
        this.failedList = failedList;
        return this;
    }
    public java.util.List<CreateAppSessionBatchSyncResponseBodyFailedList> getFailedList() {
        return this.failedList;
    }

    public CreateAppSessionBatchSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppSessionBatchSyncResponseBody setResultList(java.util.List<CreateAppSessionBatchSyncResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<CreateAppSessionBatchSyncResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>App type not support.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo self = new CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class CreateAppSessionBatchSyncResponseBodyFailedList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>1ADE0****</p>
         */
        @NameInMap("CustomSessionId")
        public String customSessionId;

        @NameInMap("FailedInfo")
        public CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo failedInfo;

        public static CreateAppSessionBatchSyncResponseBodyFailedList build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncResponseBodyFailedList self = new CreateAppSessionBatchSyncResponseBodyFailedList();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncResponseBodyFailedList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppSessionBatchSyncResponseBodyFailedList setCustomSessionId(String customSessionId) {
            this.customSessionId = customSessionId;
            return this;
        }
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        public CreateAppSessionBatchSyncResponseBodyFailedList setFailedInfo(CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo failedInfo) {
            this.failedInfo = failedInfo;
            return this;
        }
        public CreateAppSessionBatchSyncResponseBodyFailedListFailedInfo getFailedInfo() {
            return this.failedInfo;
        }

    }

    public static class CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>127.0.X.X</p>
         */
        @NameInMap("AccessHost")
        public String accessHost;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("AccessPort")
        public String accessPort;

        /**
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("DistrictId")
        public String districtId;

        /**
         * <strong>example:</strong>
         * <p>bgp</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>exampleName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Native</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints self = new CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints setAccessHost(String accessHost) {
            this.accessHost = accessHost;
            return this;
        }
        public String getAccessHost() {
            return this.accessHost;
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints setAccessPort(String accessPort) {
            this.accessPort = accessPort;
            return this;
        }
        public String getAccessPort() {
            return this.accessPort;
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAppSessionBatchSyncResponseBodyResultListBizInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>authToken</p>
         */
        @NameInMap("Biz")
        public java.util.Map<String, ?> biz;

        @NameInMap("Endpoints")
        public java.util.List<CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints> endpoints;

        public static CreateAppSessionBatchSyncResponseBodyResultListBizInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncResponseBodyResultListBizInfo self = new CreateAppSessionBatchSyncResponseBodyResultListBizInfo();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfo setBiz(java.util.Map<String, ?> biz) {
            this.biz = biz;
            return this;
        }
        public java.util.Map<String, ?> getBiz() {
            return this.biz;
        }

        public CreateAppSessionBatchSyncResponseBodyResultListBizInfo setEndpoints(java.util.List<CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<CreateAppSessionBatchSyncResponseBodyResultListBizInfoEndpoints> getEndpoints() {
            return this.endpoints;
        }

    }

    public static class CreateAppSessionBatchSyncResponseBodyResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13027****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>35067****</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("BizInfo")
        public CreateAppSessionBatchSyncResponseBodyResultListBizInfo bizInfo;

        /**
         * <strong>example:</strong>
         * <p>1ADE0****</p>
         */
        @NameInMap("CustomSessionId")
        public String customSessionId;

        /**
         * <strong>example:</strong>
         * <p>100****</p>
         */
        @NameInMap("PlatformSessionId")
        public String platformSessionId;

        public static CreateAppSessionBatchSyncResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            CreateAppSessionBatchSyncResponseBodyResultList self = new CreateAppSessionBatchSyncResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public CreateAppSessionBatchSyncResponseBodyResultList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppSessionBatchSyncResponseBodyResultList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public CreateAppSessionBatchSyncResponseBodyResultList setBizInfo(CreateAppSessionBatchSyncResponseBodyResultListBizInfo bizInfo) {
            this.bizInfo = bizInfo;
            return this;
        }
        public CreateAppSessionBatchSyncResponseBodyResultListBizInfo getBizInfo() {
            return this.bizInfo;
        }

        public CreateAppSessionBatchSyncResponseBodyResultList setCustomSessionId(String customSessionId) {
            this.customSessionId = customSessionId;
            return this;
        }
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        public CreateAppSessionBatchSyncResponseBodyResultList setPlatformSessionId(String platformSessionId) {
            this.platformSessionId = platformSessionId;
            return this;
        }
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

    }

}
