// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class FoundationVersion extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // documents
    @NameInMap("documents")
    public String documents;

    // name
    @NameInMap("name")
    public String name;

    // platforms
    @NameInMap("platforms")
    public FoundationVersionPlatforms platforms;

    // status
    @NameInMap("status")
    public String status;

    // uid
    @NameInMap("uid")
    public String uid;

    // version
    @NameInMap("version")
    public String version;

    public static FoundationVersion build(java.util.Map<String, ?> map) throws Exception {
        FoundationVersion self = new FoundationVersion();
        return TeaModel.build(map, self);
    }

    public FoundationVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FoundationVersion setDocuments(String documents) {
        this.documents = documents;
        return this;
    }
    public String getDocuments() {
        return this.documents;
    }

    public FoundationVersion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FoundationVersion setPlatforms(FoundationVersionPlatforms platforms) {
        this.platforms = platforms;
        return this;
    }
    public FoundationVersionPlatforms getPlatforms() {
        return this.platforms;
    }

    public FoundationVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FoundationVersion setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public FoundationVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class FoundationVersionPlatforms extends TeaModel {
        // architecture
        @NameInMap("architecture")
        public String architecture;

        // os
        @NameInMap("os")
        public String os;

        public static FoundationVersionPlatforms build(java.util.Map<String, ?> map) throws Exception {
            FoundationVersionPlatforms self = new FoundationVersionPlatforms();
            return TeaModel.build(map, self);
        }

        public FoundationVersionPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public FoundationVersionPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}
