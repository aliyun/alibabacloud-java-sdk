// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryEccInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the ECC.</p>
     */
    @NameInMap("EccInfo")
    public QueryEccInfoResponseBodyEccInfo eccInfo;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>b197-40ab-9155-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryEccInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEccInfoResponseBody self = new QueryEccInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEccInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryEccInfoResponseBody setEccInfo(QueryEccInfoResponseBodyEccInfo eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public QueryEccInfoResponseBodyEccInfo getEccInfo() {
        return this.eccInfo;
    }

    public QueryEccInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEccInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryEccInfoResponseBodyEccInfo extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>e809****-43d7-4c6b-8e01-b0d9d1db****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>ECC ID</p>
         * 
         * <strong>example:</strong>
         * <p>a5b9****-40b4-4d7b-9c2a-55d6c1c0****</p>
         */
        @NameInMap("EccId")
        public String eccId;

        /**
         * <p>ECU ID</p>
         * 
         * <strong>example:</strong>
         * <p>0d4e****-6d87-401f-ba81-13df9877****</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The ID of the ECC group.</p>
         * 
         * <strong>example:</strong>
         * <p>57cd****-2d3b-496f-bcce-646d0a4d****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the ECC group.</p>
         * 
         * <strong>example:</strong>
         * <p>_DEFAULT_GROUP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The MD5 hash value of the deployment package version.</p>
         * 
         * <strong>example:</strong>
         * <p>bab6<strong><strong>7a090e41ca9445c9b3cd</strong></strong></p>
         */
        @NameInMap("PackageMd5")
        public String packageMd5;

        /**
         * <p>The version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>20210209.153400</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-23727****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static QueryEccInfoResponseBodyEccInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEccInfoResponseBodyEccInfo self = new QueryEccInfoResponseBodyEccInfo();
            return TeaModel.build(map, self);
        }

        public QueryEccInfoResponseBodyEccInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryEccInfoResponseBodyEccInfo setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public QueryEccInfoResponseBodyEccInfo setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryEccInfoResponseBodyEccInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryEccInfoResponseBodyEccInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryEccInfoResponseBodyEccInfo setPackageMd5(String packageMd5) {
            this.packageMd5 = packageMd5;
            return this;
        }
        public String getPackageMd5() {
            return this.packageMd5;
        }

        public QueryEccInfoResponseBodyEccInfo setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public QueryEccInfoResponseBodyEccInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
