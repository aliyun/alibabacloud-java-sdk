// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetTemplateDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DataSource")
    public java.util.List<GetTemplateDataSourceResponseBodyDataSource> dataSource;

    public static GetTemplateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateDataSourceResponseBody self = new GetTemplateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateDataSourceResponseBody setDataSource(java.util.List<GetTemplateDataSourceResponseBodyDataSource> dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public java.util.List<GetTemplateDataSourceResponseBodyDataSource> getDataSource() {
        return this.dataSource;
    }

    public static class GetTemplateDataSourceResponseBodyDataSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Config")
        public String config;

        public static GetTemplateDataSourceResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateDataSourceResponseBodyDataSource self = new GetTemplateDataSourceResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetTemplateDataSourceResponseBodyDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTemplateDataSourceResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplateDataSourceResponseBodyDataSource setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
