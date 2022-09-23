// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InspectImageResponseBody extends TeaModel {
    @NameInMap("ImageStatus")
    public InspectImageResponseBodyImageStatus imageStatus;

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
        @NameInMap("BootStrap")
        public String bootStrap;

        @NameInMap("BuildArch")
        public String buildArch;

        @NameInMap("BuildDate")
        public String buildDate;

        @NameInMap("ContainerVersion")
        public String containerVersion;

        @NameInMap("DefFrom")
        public String defFrom;

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
