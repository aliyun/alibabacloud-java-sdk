// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_7_x64_20G_alibase_20200426.vhd</p>
         */
        @NameInMap("image_id")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS 7.7</p>
         */
        @NameInMap("image_name")
        public String imageName;

        /**
         * <p>The OS platform. Valid values:</p>
         * <ul>
         * <li><code>AliyunLinux</code></li>
         * <li><code>CentOS</code></li>
         * <li><code>Windows</code></li>
         * <li><code>WindowsCore</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>7.7</p>
         */
        @NameInMap("os_version")
        public String osVersion;

        /**
         * <p>The type of OS distribution that you want to use. To specify the node OS, we recommend that you use this parameter. Valid values:</p>
         * <ul>
         * <li><code>CentOS</code></li>
         * <li><code>AliyunLinux</code></li>
         * <li><code>AliyunLinux Qboot</code></li>
         * <li><code>AliyunLinuxUEFI</code></li>
         * <li><code>AliyunLinux3</code></li>
         * <li><code>Windows</code></li>
         * <li><code>WindowsCore</code></li>
         * <li><code>AliyunLinux3Arm64</code></li>
         * <li><code>ContainerOS</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>centos_7_7_20</p>
         */
        @NameInMap("image_type")
        public String imageType;

        /**
         * <p>The type of operating system. Examples:</p>
         * <ul>
         * <li><code>Windows</code></li>
         * <li><code>Linux</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("os_type")
        public String osType;

        /**
         * <p>The type of image. Valid values:</p>
         * <ul>
         * <li><code>system</code>: public image</li>
         * <li><code>self</code>: custom image</li>
         * <li><code>others</code>: shared image from other Alibaba Cloud accounts</li>
         * <li><code>marketplace</code>: image from the marketplace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("image_category")
        public String imageCategory;

        /**
         * <p>The architecture of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("architecture")
        public String architecture;

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

        public DescribeKubernetesVersionMetadataResponseBodyImages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

    public static class DescribeKubernetesVersionMetadataResponseBody extends TeaModel {
        /**
         * <p>Features of the queried Kubernetes version.</p>
         */
        @NameInMap("capabilities")
        public java.util.Map<String, ?> capabilities;

        /**
         * <p>The OS images that are returned.</p>
         */
        @NameInMap("images")
        public java.util.List<DescribeKubernetesVersionMetadataResponseBodyImages> images;

        /**
         * <p>The metadata of the Kubernetes version.</p>
         */
        @NameInMap("meta_data")
        public java.util.Map<String, ?> metaData;

        /**
         * <p>Details of the supported container runtimes.</p>
         */
        @NameInMap("runtimes")
        public java.util.List<Runtime> runtimes;

        /**
         * <p>The Kubernetes version that is supported by ACK. For more information, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.9-aliyun.1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The release date of the Kubernetes version.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-30T00:00:00Z</p>
         */
        @NameInMap("release_date")
        public String releaseDate;

        /**
         * <p>The expiration date of the Kubernetes version.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-30T00:00:00Z</p>
         */
        @NameInMap("expiration_date")
        public String expirationDate;

        /**
         * <p>Indicates whether you can create clusters that run the Kubernetes version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("creatable")
        public Boolean creatable;

        @NameInMap("upgradable_versions")
        public java.util.List<String> upgradableVersions;

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

        public DescribeKubernetesVersionMetadataResponseBody setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public DescribeKubernetesVersionMetadataResponseBody setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public DescribeKubernetesVersionMetadataResponseBody setCreatable(Boolean creatable) {
            this.creatable = creatable;
            return this;
        }
        public Boolean getCreatable() {
            return this.creatable;
        }

        public DescribeKubernetesVersionMetadataResponseBody setUpgradableVersions(java.util.List<String> upgradableVersions) {
            this.upgradableVersions = upgradableVersions;
            return this;
        }
        public java.util.List<String> getUpgradableVersions() {
            return this.upgradableVersions;
        }

    }

}
