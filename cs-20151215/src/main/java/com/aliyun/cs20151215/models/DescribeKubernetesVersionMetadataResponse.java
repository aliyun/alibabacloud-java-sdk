// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public DescribeKubernetesVersionMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
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

        // 操作系统发行版。取值范围： CentOS,AliyunLinux,Windows,WindowsCore。
        @NameInMap("platform")
        public String platform;

        // 镜像版本。
        @NameInMap("os_version")
        public String osVersion;

        // 镜像类型。
        @NameInMap("image_type")
        public String imageType;

        // 操作系统发行版本号。
        @NameInMap("os_type")
        public String osType;

        // 镜像分类
        @NameInMap("image_category")
        public String imageCategory;

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

        public DescribeKubernetesVersionMetadataResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeKubernetesVersionMetadataResponseBodyImages setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
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

        public DescribeKubernetesVersionMetadataResponseBodyImages setImageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public String getImageCategory() {
            return this.imageCategory;
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

        // 容器运行时详情。
        @NameInMap("runtimes")
        public java.util.List<Runtime> runtimes;

        // Kubernetes版本。
        @NameInMap("version")
        public String version;

        // 是否为多可用区。
        @NameInMap("multi_az")
        public String multiAz;

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

        public DescribeKubernetesVersionMetadataResponseBody setRuntimes(java.util.List<Runtime> runtimes) {
            this.runtimes = runtimes;
            return this;
        }
        public java.util.List<Runtime> getRuntimes() {
            return this.runtimes;
        }

        public DescribeKubernetesVersionMetadataResponseBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeKubernetesVersionMetadataResponseBody setMultiAz(String multiAz) {
            this.multiAz = multiAz;
            return this;
        }
        public String getMultiAz() {
            return this.multiAz;
        }

    }

}
