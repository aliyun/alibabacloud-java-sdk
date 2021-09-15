// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetModuleResponseBodyData data;

    public static GetModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleResponseBody self = new GetModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModuleResponseBody setData(GetModuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModuleResponseBodyData getData() {
        return this.data;
    }

    public static class GetModuleResponseBodyData extends TeaModel {
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

        public static GetModuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModuleResponseBodyData self = new GetModuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModuleResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetModuleResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetModuleResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetModuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModuleResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModuleResponseBodyData setTargetAppSource(String targetAppSource) {
            this.targetAppSource = targetAppSource;
            return this;
        }
        public String getTargetAppSource() {
            return this.targetAppSource;
        }

    }

}
