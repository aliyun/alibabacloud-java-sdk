// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OsTags")
    public java.util.List<ListImagesResponseBodyOsTags> osTags;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setOsTags(java.util.List<ListImagesResponseBodyOsTags> osTags) {
        this.osTags = osTags;
        return this;
    }
    public java.util.List<ListImagesResponseBodyOsTags> getOsTags() {
        return this.osTags;
    }

    public static class ListImagesResponseBodyOsTags extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Architecture")
        public String architecture;

        public static ListImagesResponseBodyOsTags build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyOsTags self = new ListImagesResponseBodyOsTags();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyOsTags setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListImagesResponseBodyOsTags setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public ListImagesResponseBodyOsTags setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListImagesResponseBodyOsTags setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public ListImagesResponseBodyOsTags setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyOsTags setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

}
