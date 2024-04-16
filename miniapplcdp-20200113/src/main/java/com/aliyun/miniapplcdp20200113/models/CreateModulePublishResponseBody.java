// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModulePublishResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateModulePublishResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateModulePublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModulePublishResponseBody self = new CreateModulePublishResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModulePublishResponseBody setData(CreateModulePublishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModulePublishResponseBodyData getData() {
        return this.data;
    }

    public CreateModulePublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateModulePublishResponseBodyData extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("PublishId")
        public String publishId;

        @NameInMap("Version")
        public String version;

        public static CreateModulePublishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModulePublishResponseBodyData self = new CreateModulePublishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModulePublishResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateModulePublishResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateModulePublishResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModulePublishResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateModulePublishResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public CreateModulePublishResponseBodyData setPublishId(String publishId) {
            this.publishId = publishId;
            return this;
        }
        public String getPublishId() {
            return this.publishId;
        }

        public CreateModulePublishResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
