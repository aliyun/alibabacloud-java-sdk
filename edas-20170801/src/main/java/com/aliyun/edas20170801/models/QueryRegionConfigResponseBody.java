// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryRegionConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RegionConfig")
    public QueryRegionConfigResponseBodyRegionConfig regionConfig;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("InternalUrl")
        public String internalUrl;

        @NameInMap("PublicUrl")
        public String publicUrl;

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
        @NameInMap("AddressServerHost")
        public String addressServerHost;

        @NameInMap("AgentInstallScript")
        public String agentInstallScript;

        @NameInMap("FileServerConfig")
        public QueryRegionConfigResponseBodyRegionConfigFileServerConfig fileServerConfig;

        @NameInMap("FileServerType")
        public String fileServerType;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("No")
        public Integer no;

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
