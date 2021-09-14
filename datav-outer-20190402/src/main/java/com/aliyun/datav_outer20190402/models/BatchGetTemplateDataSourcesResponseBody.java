// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchGetTemplateDataSourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<BatchGetTemplateDataSourcesResponseBodyTemplates> templates;

    public static BatchGetTemplateDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTemplateDataSourcesResponseBody self = new BatchGetTemplateDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetTemplateDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetTemplateDataSourcesResponseBody setTemplates(java.util.List<BatchGetTemplateDataSourcesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<BatchGetTemplateDataSourcesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Config")
        public String config;

        public static BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource self = new BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource();
            return TeaModel.build(map, self);
        }

        public BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

    public static class BatchGetTemplateDataSourcesResponseBodyTemplates extends TeaModel {
        @NameInMap("ID")
        public String ID;

        @NameInMap("DataSource")
        public java.util.List<BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource> dataSource;

        public static BatchGetTemplateDataSourcesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            BatchGetTemplateDataSourcesResponseBodyTemplates self = new BatchGetTemplateDataSourcesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public BatchGetTemplateDataSourcesResponseBodyTemplates setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public BatchGetTemplateDataSourcesResponseBodyTemplates setDataSource(java.util.List<BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<BatchGetTemplateDataSourcesResponseBodyTemplatesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

}
