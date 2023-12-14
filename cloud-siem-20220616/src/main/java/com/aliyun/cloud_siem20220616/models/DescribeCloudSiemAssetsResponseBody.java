// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemAssetsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeCloudSiemAssetsResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudSiemAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemAssetsResponseBody self = new DescribeCloudSiemAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemAssetsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCloudSiemAssetsResponseBody setData(DescribeCloudSiemAssetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudSiemAssetsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudSiemAssetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudSiemAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudSiemAssetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudSiemAssetsResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCloudSiemAssetsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemAssetsResponseBodyDataPageInfo self = new DescribeCloudSiemAssetsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemAssetsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudSiemAssetsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudSiemAssetsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo extends TeaModel {
        /**
         * <p>The attribute key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the key.</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The value of the key.</p>
         */
        @NameInMap("Values")
        public String values;

        public static DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo self = new DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeCloudSiemAssetsResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The UUID of the alert associated with the event.</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The ID of the Alibaba Cloud account in SIEM.</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The logical ID of the asset.</p>
         */
        @NameInMap("AssetId")
        public String assetId;

        /**
         * <p>The display information of the asset is in the JSON format.</p>
         */
        @NameInMap("AssetInfo")
        public java.util.List<DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo> assetInfo;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   ip</p>
         * <p>*   domain</p>
         * <p>*   url</p>
         * <p>*   process</p>
         * <p>*   file</p>
         * <p>*   host</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The cloud code of the entity. Valid values:</p>
         * <br>
         * <p>*   aliyun: Alibaba Cloud</p>
         * <p>*   qcloud: Tencent Cloud</p>
         * <p>*   hcloud: Huawei Cloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The time when the asset was synchronized.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the asset was last updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the asset.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UUID of the event.</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The ID of the associated account to which the asset belongs.</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        public static DescribeCloudSiemAssetsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemAssetsResponseBodyDataResponseData self = new DescribeCloudSiemAssetsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setAssetInfo(java.util.List<DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo> assetInfo) {
            this.assetInfo = assetInfo;
            return this;
        }
        public java.util.List<DescribeCloudSiemAssetsResponseBodyDataResponseDataAssetInfo> getAssetInfo() {
            return this.assetInfo;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeCloudSiemAssetsResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

    public static class DescribeCloudSiemAssetsResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeCloudSiemAssetsResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<DescribeCloudSiemAssetsResponseBodyDataResponseData> responseData;

        public static DescribeCloudSiemAssetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemAssetsResponseBodyData self = new DescribeCloudSiemAssetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemAssetsResponseBodyData setPageInfo(DescribeCloudSiemAssetsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeCloudSiemAssetsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeCloudSiemAssetsResponseBodyData setResponseData(java.util.List<DescribeCloudSiemAssetsResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeCloudSiemAssetsResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
