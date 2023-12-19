// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaInstancesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the SAP HANA instances.</p>
     */
    @NameInMap("Hanas")
    public DescribeHanaInstancesResponseBodyHanas hanas;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHanaInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaInstancesResponseBody self = new DescribeHanaInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHanaInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHanaInstancesResponseBody setHanas(DescribeHanaInstancesResponseBodyHanas hanas) {
        this.hanas = hanas;
        return this;
    }
    public DescribeHanaInstancesResponseBodyHanas getHanas() {
        return this.hanas;
    }

    public DescribeHanaInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHanaInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHanaInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHanaInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHanaInstancesResponseBodyHanasHanaTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHanaInstancesResponseBodyHanasHanaTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaInstancesResponseBodyHanasHanaTagsTag self = new DescribeHanaInstancesResponseBodyHanasHanaTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeHanaInstancesResponseBodyHanasHanaTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHanaInstancesResponseBodyHanasHanaTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHanaInstancesResponseBodyHanasHanaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeHanaInstancesResponseBodyHanasHanaTagsTag> tag;

        public static DescribeHanaInstancesResponseBodyHanasHanaTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaInstancesResponseBodyHanasHanaTags self = new DescribeHanaInstancesResponseBodyHanasHanaTags();
            return TeaModel.build(map, self);
        }

        public DescribeHanaInstancesResponseBodyHanasHanaTags setTag(java.util.List<DescribeHanaInstancesResponseBodyHanasHanaTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeHanaInstancesResponseBodyHanasHanaTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeHanaInstancesResponseBodyHanasHana extends TeaModel {
        /**
         * <p>The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.</p>
         */
        @NameInMap("AlertSetting")
        public String alertSetting;

        /**
         * <p>The ID of the SAP HANA instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the SAP HANA instance.</p>
         */
        @NameInMap("HanaName")
        public String hanaName;

        /**
         * <p>The private or internal IP address of the host where the primary node of the SAP HANA instance resides.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The instance number of the SAP HANA system.</p>
         */
        @NameInMap("InstanceNumber")
        public Integer instanceNumber;

        /**
         * <p>The ID of resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the SAP HANA instance. Valid values:</p>
         * <br>
         * <p>*   INITIALIZING: The instance is being initialized.</p>
         * <p>*   INITIALIZED: The instance is registered.</p>
         * <p>*   INVALID_HANA_NODE: The instance is invalid.</p>
         * <p>*   INITIALIZE_FAILED: The client fails to be installed on the instance.</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The status information.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The tags of the SAP HANA instance.</p>
         */
        @NameInMap("Tags")
        public DescribeHanaInstancesResponseBodyHanasHanaTags tags;

        /**
         * <p>Indicates whether the SAP HANA instance is connected over Secure Sockets Layer (SSL). Valid values:</p>
         * <br>
         * <p>*   true: The SAP HANA instance is connected over SSL.</p>
         * <p>*   false: The SAP HANA instance is not connected over SSL.</p>
         */
        @NameInMap("UseSsl")
        public Boolean useSsl;

        /**
         * <p>The username of the SYSTEMDB database.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>Indicates whether the SSL certificate of the SAP HANA instance is verified.</p>
         */
        @NameInMap("ValidateCertificate")
        public Boolean validateCertificate;

        /**
         * <p>The ID of the backup vault.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeHanaInstancesResponseBodyHanasHana build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaInstancesResponseBodyHanasHana self = new DescribeHanaInstancesResponseBodyHanasHana();
            return TeaModel.build(map, self);
        }

        public DescribeHanaInstancesResponseBodyHanasHana setAlertSetting(String alertSetting) {
            this.alertSetting = alertSetting;
            return this;
        }
        public String getAlertSetting() {
            return this.alertSetting;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setHanaName(String hanaName) {
            this.hanaName = hanaName;
            return this;
        }
        public String getHanaName() {
            return this.hanaName;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setInstanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public Integer getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setTags(DescribeHanaInstancesResponseBodyHanasHanaTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeHanaInstancesResponseBodyHanasHanaTags getTags() {
            return this.tags;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setUseSsl(Boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Boolean getUseSsl() {
            return this.useSsl;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setValidateCertificate(Boolean validateCertificate) {
            this.validateCertificate = validateCertificate;
            return this;
        }
        public Boolean getValidateCertificate() {
            return this.validateCertificate;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

    public static class DescribeHanaInstancesResponseBodyHanas extends TeaModel {
        @NameInMap("Hana")
        public java.util.List<DescribeHanaInstancesResponseBodyHanasHana> hana;

        public static DescribeHanaInstancesResponseBodyHanas build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaInstancesResponseBodyHanas self = new DescribeHanaInstancesResponseBodyHanas();
            return TeaModel.build(map, self);
        }

        public DescribeHanaInstancesResponseBodyHanas setHana(java.util.List<DescribeHanaInstancesResponseBodyHanasHana> hana) {
            this.hana = hana;
            return this;
        }
        public java.util.List<DescribeHanaInstancesResponseBodyHanasHana> getHana() {
            return this.hana;
        }

    }

}
