// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateModuleResponseBodyData data;

    public static CreateModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleResponseBody self = new CreateModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModuleResponseBody setData(CreateModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModuleResponseBodyData getData() {
        return this.data;
    }

    public static class CreateModuleResponseBodyData extends TeaModel {
        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TargetAppSource")
        public String targetAppSource;

        public static CreateModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModuleResponseBodyData self = new CreateModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModuleResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public CreateModuleResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateModuleResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public CreateModuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModuleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateModuleResponseBodyData setTargetAppSource(String targetAppSource) {
            this.targetAppSource = targetAppSource;
            return this;
        }
        public String getTargetAppSource() {
            return this.targetAppSource;
        }

    }

}
