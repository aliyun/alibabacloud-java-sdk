// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DescribeKubernetesVersionMetadataResponseBody> body;

    public static DescribeKubernetesVersionMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesVersionMetadataResponse self = new DescribeKubernetesVersionMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesVersionMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKubernetesVersionMetadataResponse setBody(java.util.List<DescribeKubernetesVersionMetadataResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeKubernetesVersionMetadataResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeKubernetesVersionMetadataResponseBodyImages extends TeaModel {
        // 镜像ID。	
        @NameInMap("image_id")
        public String imageId;

        // 镜像名称。	
        @NameInMap("image_name")
        public String imageName;

        // 镜像类型。	
        @NameInMap("image_type")
        public String imageType;

        // 操作系统发行版本号。	
        @NameInMap("os_type")
        public String osType;

        // 操作系统平台类型。取值范围： Windows, Linux（默认）	
        @NameInMap("os_version")
        public String osVersion;

        // 操作系统发行版。取值范围： CentOS,AliyunLinux,Windows,WindowsCore。	
        @NameInMap("platform")
        public String platform;

        public static DescribeKubernetesVersionMetadataResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeKubernetesVersionMetadataResponseBodyImages self = new DescribeKubernetesVersionMetadataResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

    public static class DescribeKubernetesVersionMetadataResponseBodyRuntimes extends TeaModel {
        // 运行时名称。	
        @NameInMap("name")
        public String name;

        // 运行时版本。	
        @NameInMap("version")
        public String version;

        public static DescribeKubernetesVersionMetadataResponseBodyRuntimes build(java.util.Map<String, ?> map) throws Exception {
            DescribeKubernetesVersionMetadataResponseBodyRuntimes self = new DescribeKubernetesVersionMetadataResponseBodyRuntimes();
            return TeaModel.build(map, self);
        }

        public DescribeKubernetesVersionMetadataResponseBodyRuntimes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeKubernetesVersionMetadataResponseBodyRuntimes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeKubernetesVersionMetadataResponseBody extends TeaModel {
        // Kubernetes版本特性。	
        @NameInMap("capabilities")
        public java.util.Map<String, ?> capabilities;

        // ECS系统镜像列表。	
        @NameInMap("images")
        public java.util.List<DescribeKubernetesVersionMetadataResponseBodyImages> images;

        // Kubernetes版本元数据信息。	
        @NameInMap("meta_data")
        public java.util.Map<String, ?> metaData;

        // 是否为多可用区。	
        @NameInMap("multi_az")
        public String multiAz;

        // 容器运行时详情。	
        @NameInMap("runtimes")
        public java.util.List<DescribeKubernetesVersionMetadataResponseBodyRuntimes> runtimes;

        // Kubernetes版本。	
        @NameInMap("version")
        public String version;

        public static DescribeKubernetesVersionMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeKubernetesVersionMetadataResponseBody self = new DescribeKubernetesVersionMetadataResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeKubernetesVersionMetadataResponseBody setCapabilities(java.util.Map<String, ?> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.Map<String, ?> getCapabilities() {
            return this.capabilities;
        }

        public DescribeKubernetesVersionMetadataResponseBody setImages(java.util.List<DescribeKubernetesVersionMetadataResponseBodyImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<DescribeKubernetesVersionMetadataResponseBodyImages> getImages() {
            return this.images;
        }

        public DescribeKubernetesVersionMetadataResponseBody setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        public DescribeKubernetesVersionMetadataResponseBody setMultiAz(String multiAz) {
            this.multiAz = multiAz;
            return this;
        }
        public String getMultiAz() {
            return this.multiAz;
        }

        public DescribeKubernetesVersionMetadataResponseBody setRuntimes(java.util.List<DescribeKubernetesVersionMetadataResponseBodyRuntimes> runtimes) {
            this.runtimes = runtimes;
            return this;
        }
        public java.util.List<DescribeKubernetesVersionMetadataResponseBodyRuntimes> getRuntimes() {
            return this.runtimes;
        }

        public DescribeKubernetesVersionMetadataResponseBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
