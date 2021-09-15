// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteModuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteModuleResponseBodyData data;

    public static DeleteModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModuleResponseBody self = new DeleteModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteModuleResponseBody setData(DeleteModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteModuleResponseBodyData getData() {
        return this.data;
    }

    public static class DeleteModuleResponseBodyData extends TeaModel {
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

        public static DeleteModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteModuleResponseBodyData self = new DeleteModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteModuleResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DeleteModuleResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DeleteModuleResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public DeleteModuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteModuleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DeleteModuleResponseBodyData setTargetAppSource(String targetAppSource) {
            this.targetAppSource = targetAppSource;
            return this;
        }
        public String getTargetAppSource() {
            return this.targetAppSource;
        }

    }

}
