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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AlertSetting")
        public String alertSetting;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        public String crossAccountType;

        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        @NameInMap("HanaName")
        public String hanaName;

        @NameInMap("Host")
        public String host;

        @NameInMap("InstanceNumber")
        public Integer instanceNumber;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("Tags")
        public DescribeHanaInstancesResponseBodyHanasHanaTags tags;

        @NameInMap("UseSsl")
        public Boolean useSsl;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ValidateCertificate")
        public Boolean validateCertificate;

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
