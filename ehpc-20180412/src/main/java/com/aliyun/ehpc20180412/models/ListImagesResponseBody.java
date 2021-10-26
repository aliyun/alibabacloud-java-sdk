// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    @NameInMap("OsTags")
    public ListImagesResponseBodyOsTags osTags;

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
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Platform")
        public String platform;

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
