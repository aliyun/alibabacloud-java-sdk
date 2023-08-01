// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryRegionConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about region configurations.</p>
     */
    @NameInMap("RegionConfig")
    public QueryRegionConfigResponseBodyRegionConfig regionConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryRegionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRegionConfigResponseBody self = new QueryRegionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRegionConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRegionConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRegionConfigResponseBody setRegionConfig(QueryRegionConfigResponseBodyRegionConfig regionConfig) {
        this.regionConfig = regionConfig;
        return this;
    }
    public QueryRegionConfigResponseBodyRegionConfig getRegionConfig() {
        return this.regionConfig;
    }

    public QueryRegionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryRegionConfigResponseBodyRegionConfigFileServerConfig extends TeaModel {
        /**
         * <p>The Object Storage Service (OSS) bucket of the file server.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The internal endpoint of the file server.</p>
         */
        @NameInMap("InternalUrl")
        public String internalUrl;

        /**
         * <p>The public endpoint of the file server.</p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        /**
         * <p>The virtual private cloud (VPC) endpoint of the file server.</p>
         */
        @NameInMap("VpcUrl")
        public String vpcUrl;

        public static QueryRegionConfigResponseBodyRegionConfigFileServerConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryRegionConfigResponseBodyRegionConfigFileServerConfig self = new QueryRegionConfigResponseBodyRegionConfigFileServerConfig();
            return TeaModel.build(map, self);
        }

        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig setInternalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }
        public String getInternalUrl() {
            return this.internalUrl;
        }

        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig setVpcUrl(String vpcUrl) {
            this.vpcUrl = vpcUrl;
            return this;
        }
        public String getVpcUrl() {
            return this.vpcUrl;
        }

    }

    public static class QueryRegionConfigResponseBodyRegionConfig extends TeaModel {
        /**
         * <p>The domain name of Address Server.</p>
         */
        @NameInMap("AddressServerHost")
        public String addressServerHost;

        /**
         * <p>The installation path of the script for EDAS Agent.</p>
         */
        @NameInMap("AgentInstallScript")
        public String agentInstallScript;

        /**
         * <p>The information about the file server.</p>
         */
        @NameInMap("FileServerConfig")
        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig fileServerConfig;

        /**
         * <p>The type of the file server.</p>
         */
        @NameInMap("FileServerType")
        public String fileServerType;

        /**
         * <p>The configured ID of the region.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the official image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The configured name of the region.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The serial number of the region. This parameter is deprecated.</p>
         */
        @NameInMap("No")
        public Integer no;

        /**
         * <p>The tag of the region. The value is fixed to `ALIYUN_SHARE`.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static QueryRegionConfigResponseBodyRegionConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryRegionConfigResponseBodyRegionConfig self = new QueryRegionConfigResponseBodyRegionConfig();
            return TeaModel.build(map, self);
        }

        public QueryRegionConfigResponseBodyRegionConfig setAddressServerHost(String addressServerHost) {
            this.addressServerHost = addressServerHost;
            return this;
        }
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        public QueryRegionConfigResponseBodyRegionConfig setAgentInstallScript(String agentInstallScript) {
            this.agentInstallScript = agentInstallScript;
            return this;
        }
        public String getAgentInstallScript() {
            return this.agentInstallScript;
        }

        public QueryRegionConfigResponseBodyRegionConfig setFileServerConfig(QueryRegionConfigResponseBodyRegionConfigFileServerConfig fileServerConfig) {
            this.fileServerConfig = fileServerConfig;
            return this;
        }
        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig getFileServerConfig() {
            return this.fileServerConfig;
        }

        public QueryRegionConfigResponseBodyRegionConfig setFileServerType(String fileServerType) {
            this.fileServerType = fileServerType;
            return this;
        }
        public String getFileServerType() {
            return this.fileServerType;
        }

        public QueryRegionConfigResponseBodyRegionConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRegionConfigResponseBodyRegionConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryRegionConfigResponseBodyRegionConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRegionConfigResponseBodyRegionConfig setNo(Integer no) {
            this.no = no;
            return this;
        }
        public Integer getNo() {
            return this.no;
        }

        public QueryRegionConfigResponseBodyRegionConfig setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
