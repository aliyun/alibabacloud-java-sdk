// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDifyInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public ListDifyInstancesResponseBodyRoot root;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tags")
    public java.util.List<ListDifyInstancesResponseBodyTags> tags;

    public static ListDifyInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDifyInstancesResponseBody self = new ListDifyInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDifyInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDifyInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDifyInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDifyInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDifyInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDifyInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDifyInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDifyInstancesResponseBody setRoot(ListDifyInstancesResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public ListDifyInstancesResponseBodyRoot getRoot() {
        return this.root;
    }

    public ListDifyInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDifyInstancesResponseBody setTags(java.util.List<ListDifyInstancesResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListDifyInstancesResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListDifyInstancesResponseBodyRootData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AppUuid")
        public String appUuid;

        /**
         * <strong>example:</strong>
         * <p>2025-04-20T00:14:38Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>实例描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DifyInstanceId")
        public String difyInstanceId;

        /**
         * <strong>example:</strong>
         * <p>this is a dify instance</p>
         */
        @NameInMap("DifyInstanceName")
        public String difyInstanceName;

        /**
         * <strong>example:</strong>
         * <p>Community</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0</p>
         */
        @NameInMap("EnterpriseInternetUrl")
        public String enterpriseInternetUrl;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("EnterpriseIntranetUrl")
        public String enterpriseIntranetUrl;

        /**
         * <strong>example:</strong>
         * <p>2818729</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>public_lts_zb_10</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0</p>
         */
        @NameInMap("InternetUrl")
        public String internetUrl;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("IntranetUrl")
        public String intranetUrl;

        /**
         * <strong>example:</strong>
         * <p>1.4.x</p>
         */
        @NameInMap("MajorVersion")
        public String majorVersion;

        /**
         * <strong>example:</strong>
         * <p>地域信息</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-2ze2aigcxhjohtldnyml</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1ig49b0bbbx33aiqbgu</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-2ze5ar1uh249xpqrfgfbj</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>8609287469406252</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListDifyInstancesResponseBodyRootData build(java.util.Map<String, ?> map) throws Exception {
            ListDifyInstancesResponseBodyRootData self = new ListDifyInstancesResponseBodyRootData();
            return TeaModel.build(map, self);
        }

        public ListDifyInstancesResponseBodyRootData setAppUuid(String appUuid) {
            this.appUuid = appUuid;
            return this;
        }
        public String getAppUuid() {
            return this.appUuid;
        }

        public ListDifyInstancesResponseBodyRootData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDifyInstancesResponseBodyRootData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDifyInstancesResponseBodyRootData setDifyInstanceId(String difyInstanceId) {
            this.difyInstanceId = difyInstanceId;
            return this;
        }
        public String getDifyInstanceId() {
            return this.difyInstanceId;
        }

        public ListDifyInstancesResponseBodyRootData setDifyInstanceName(String difyInstanceName) {
            this.difyInstanceName = difyInstanceName;
            return this;
        }
        public String getDifyInstanceName() {
            return this.difyInstanceName;
        }

        public ListDifyInstancesResponseBodyRootData setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public ListDifyInstancesResponseBodyRootData setEnterpriseInternetUrl(String enterpriseInternetUrl) {
            this.enterpriseInternetUrl = enterpriseInternetUrl;
            return this;
        }
        public String getEnterpriseInternetUrl() {
            return this.enterpriseInternetUrl;
        }

        public ListDifyInstancesResponseBodyRootData setEnterpriseIntranetUrl(String enterpriseIntranetUrl) {
            this.enterpriseIntranetUrl = enterpriseIntranetUrl;
            return this;
        }
        public String getEnterpriseIntranetUrl() {
            return this.enterpriseIntranetUrl;
        }

        public ListDifyInstancesResponseBodyRootData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDifyInstancesResponseBodyRootData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListDifyInstancesResponseBodyRootData setInternetUrl(String internetUrl) {
            this.internetUrl = internetUrl;
            return this;
        }
        public String getInternetUrl() {
            return this.internetUrl;
        }

        public ListDifyInstancesResponseBodyRootData setIntranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        public ListDifyInstancesResponseBodyRootData setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public ListDifyInstancesResponseBodyRootData setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public ListDifyInstancesResponseBodyRootData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDifyInstancesResponseBodyRootData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListDifyInstancesResponseBodyRootData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDifyInstancesResponseBodyRootData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListDifyInstancesResponseBodyRootData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListDifyInstancesResponseBodyRootData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListDifyInstancesResponseBodyRootData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListDifyInstancesResponseBodyRoot extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListDifyInstancesResponseBodyRootData> data;

        public static ListDifyInstancesResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            ListDifyInstancesResponseBodyRoot self = new ListDifyInstancesResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public ListDifyInstancesResponseBodyRoot setData(java.util.List<ListDifyInstancesResponseBodyRootData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListDifyInstancesResponseBodyRootData> getData() {
            return this.data;
        }

    }

    public static class ListDifyInstancesResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>opt_measure_group</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListDifyInstancesResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListDifyInstancesResponseBodyTags self = new ListDifyInstancesResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListDifyInstancesResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListDifyInstancesResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
