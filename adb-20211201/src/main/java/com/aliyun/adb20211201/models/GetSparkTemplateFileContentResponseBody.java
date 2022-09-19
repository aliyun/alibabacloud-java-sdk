// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFileContentResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSparkTemplateFileContentResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkTemplateFileContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFileContentResponseBody self = new GetSparkTemplateFileContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFileContentResponseBody setData(GetSparkTemplateFileContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSparkTemplateFileContentResponseBodyData getData() {
        return this.data;
    }

    public GetSparkTemplateFileContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSparkTemplateFileContentResponseBodyData extends TeaModel {
        @NameInMap("AppType")
        public String appType;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("Type")
        public String type;

        public static GetSparkTemplateFileContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSparkTemplateFileContentResponseBodyData self = new GetSparkTemplateFileContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSparkTemplateFileContentResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetSparkTemplateFileContentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSparkTemplateFileContentResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSparkTemplateFileContentResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetSparkTemplateFileContentResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
