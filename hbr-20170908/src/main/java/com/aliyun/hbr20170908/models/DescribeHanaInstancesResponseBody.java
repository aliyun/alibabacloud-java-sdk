// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaInstancesResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the SAP HANA instances.</p>
     */
    @NameInMap("Hanas")
    public DescribeHanaInstancesResponseBodyHanas hanas;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4003DD68-3C3C-5071-B4FC-631A6C1BAC1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
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
         * 
         * <strong>example:</strong>
         * <p>ace:rm:rgld</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwutpyat2kwy</p>
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
         * <p>The alert settings. Valid value: INHERITED, which indicates that the Cloud Backup client sends alert notifications by using the same method configured for the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>INHERITED</p>
         */
        @NameInMap("AlertSetting")
        public String alertSetting;

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-0004cf6g6******0yd7y</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li><strong>SELF_ACCOUNT</strong>: Data is backed up within the same Alibaba Cloud account.</li>
         * <li><strong>CROSS_ACCOUNT</strong>: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxx4625</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The name of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>HANA-DEV</p>
         */
        @NameInMap("HanaName")
        public String hanaName;

        /**
         * <p>The private or internal IP address of the host where the primary node of the SAP HANA instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The instance number of the SAP HANA system.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("InstanceNumber")
        public Integer instanceNumber;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvnf22m7itha</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the SAP HANA instance. Valid values:</p>
         * <ul>
         * <li>INITIALIZING: The instance is being initialized.</li>
         * <li>INITIALIZED: The instance is registered.</li>
         * <li>INVALID_HANA_NODE: The instance is invalid.</li>
         * <li>INITIALIZE_FAILED: The client fails to be installed on the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INITIALIZED</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The status information.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTALL_CLIENT_FAILED</p>
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
         * <ul>
         * <li>true: The SAP HANA instance is connected over SSL.</li>
         * <li>false: The SAP HANA instance is not connected over SSL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseSsl")
        public Boolean useSsl;

        /**
         * <p>The username of the SYSTEMDB database.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>Indicates whether the SSL certificate of the SAP HANA instance is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ValidateCertificate")
        public Boolean validateCertificate;

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0000s974******1hl</p>
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

        public DescribeHanaInstancesResponseBodyHanasHana setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public DescribeHanaInstancesResponseBodyHanasHana setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
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
