// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    /**
     * <p>The list of images that are supported by E-HPC.</p>
     */
    @NameInMap("OsTags")
    public ListImagesResponseBodyOsTags osTags;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setOsTags(ListImagesResponseBodyOsTags osTags) {
        this.osTags = osTags;
        return this;
    }
    public ListImagesResponseBodyOsTags getOsTags() {
        return this.osTags;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImagesResponseBodyOsTagsOsInfo extends TeaModel {
        /**
         * <p>The architecture of the operating system. Valid values:</p>
         * <br>
         * <p>*   i386</p>
         * <p>*   x86\_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The image tag of the operating system. The tag is used only for management nodes.</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The name of the image in English.</p>
         */
        @NameInMap("OSNameEn")
        public String OSNameEn;

        /**
         * <p>The tag that is added to the image.</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The operating system. Valid values:</p>
         * <br>
         * <p>*   CentOS</p>
         * <p>*   windows</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The version of the operating system.</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListImagesResponseBodyOsTagsOsInfo build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyOsTagsOsInfo self = new ListImagesResponseBodyOsTagsOsInfo();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyOsTagsOsInfo setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListImagesResponseBodyOsTagsOsInfo setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListImagesResponseBodyOsTagsOsInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyOsTagsOsInfo setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public ListImagesResponseBodyOsTagsOsInfo setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public ListImagesResponseBodyOsTagsOsInfo setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListImagesResponseBodyOsTagsOsInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListImagesResponseBodyOsTagsOsInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListImagesResponseBodyOsTags extends TeaModel {
        @NameInMap("OsInfo")
        public java.util.List<ListImagesResponseBodyOsTagsOsInfo> osInfo;

        public static ListImagesResponseBodyOsTags build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyOsTags self = new ListImagesResponseBodyOsTags();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyOsTags setOsInfo(java.util.List<ListImagesResponseBodyOsTagsOsInfo> osInfo) {
            this.osInfo = osInfo;
            return this;
        }
        public java.util.List<ListImagesResponseBodyOsTagsOsInfo> getOsInfo() {
            return this.osInfo;
        }

    }

}
