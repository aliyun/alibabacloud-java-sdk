// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InspectImageResponseBody extends TeaModel {
    /**
     * <p>The state of the container image.</p>
     */
    @NameInMap("ImageStatus")
    public InspectImageResponseBodyImageStatus imageStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InspectImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InspectImageResponseBody self = new InspectImageResponseBody();
        return TeaModel.build(map, self);
    }

    public InspectImageResponseBody setImageStatus(InspectImageResponseBodyImageStatus imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }
    public InspectImageResponseBodyImageStatus getImageStatus() {
        return this.imageStatus;
    }

    public InspectImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InspectImageResponseBodyImageStatusImageInspectInfo extends TeaModel {
        /**
         * <p>The version of the bootstrapper used by the container image.</p>
         */
        @NameInMap("BootStrap")
        public String bootStrap;

        /**
         * <p>The architecture used to build the image.</p>
         */
        @NameInMap("BuildArch")
        public String buildArch;

        /**
         * <p>The date on which the image was built.</p>
         */
        @NameInMap("BuildDate")
        public String buildDate;

        /**
         * <p>The container version of the image.</p>
         */
        @NameInMap("ContainerVersion")
        public String containerVersion;

        /**
         * <p>The mode in which the image was built.</p>
         */
        @NameInMap("DefFrom")
        public String defFrom;

        /**
         * <p>The singularity version and kernel version of the image.</p>
         */
        @NameInMap("SchemaVersion")
        public String schemaVersion;

        public static InspectImageResponseBodyImageStatusImageInspectInfo build(java.util.Map<String, ?> map) throws Exception {
            InspectImageResponseBodyImageStatusImageInspectInfo self = new InspectImageResponseBodyImageStatusImageInspectInfo();
            return TeaModel.build(map, self);
        }

        public InspectImageResponseBodyImageStatusImageInspectInfo setBootStrap(String bootStrap) {
            this.bootStrap = bootStrap;
            return this;
        }
        public String getBootStrap() {
            return this.bootStrap;
        }

        public InspectImageResponseBodyImageStatusImageInspectInfo setBuildArch(String buildArch) {
            this.buildArch = buildArch;
            return this;
        }
        public String getBuildArch() {
            return this.buildArch;
        }

        public InspectImageResponseBodyImageStatusImageInspectInfo setBuildDate(String buildDate) {
            this.buildDate = buildDate;
            return this;
        }
        public String getBuildDate() {
            return this.buildDate;
        }

        public InspectImageResponseBodyImageStatusImageInspectInfo setContainerVersion(String containerVersion) {
            this.containerVersion = containerVersion;
            return this;
        }
        public String getContainerVersion() {
            return this.containerVersion;
        }

        public InspectImageResponseBodyImageStatusImageInspectInfo setDefFrom(String defFrom) {
            this.defFrom = defFrom;
            return this;
        }
        public String getDefFrom() {
            return this.defFrom;
        }

        public InspectImageResponseBodyImageStatusImageInspectInfo setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class InspectImageResponseBodyImageStatus extends TeaModel {
        /**
         * <p>The list of Inspect information about the image.</p>
         */
        @NameInMap("ImageInspectInfo")
        public InspectImageResponseBodyImageStatusImageInspectInfo imageInspectInfo;

        public static InspectImageResponseBodyImageStatus build(java.util.Map<String, ?> map) throws Exception {
            InspectImageResponseBodyImageStatus self = new InspectImageResponseBodyImageStatus();
            return TeaModel.build(map, self);
        }

        public InspectImageResponseBodyImageStatus setImageInspectInfo(InspectImageResponseBodyImageStatusImageInspectInfo imageInspectInfo) {
            this.imageInspectInfo = imageInspectInfo;
            return this;
        }
        public InspectImageResponseBodyImageStatusImageInspectInfo getImageInspectInfo() {
            return this.imageInspectInfo;
        }

    }

}
