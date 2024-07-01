// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFileContentResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetSparkTemplateFileContentResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
     */
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
        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li><strong>SQL</strong></li>
         * <li><strong>STREAMING</strong></li>
         * <li><strong>BATCH</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The content of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>set spark.driver.resourceSpec=medium;set spark.executor.instances=2;set spark.executor.resourceSpec=medium;set spark.app.name=Spark SQL Test;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The application template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>725204</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The file type. Valid values:</p>
         * <ul>
         * <li><strong>folder</strong></li>
         * <li><strong>file</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
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
