// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetParserDataSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataSource")
    public GetParserDataSourceResponseBodyDataSource dataSource;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetParserDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParserDataSourceResponseBody self = new GetParserDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParserDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetParserDataSourceResponseBody setDataSource(GetParserDataSourceResponseBodyDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public GetParserDataSourceResponseBodyDataSource getDataSource() {
        return this.dataSource;
    }

    public GetParserDataSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetParserDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParserDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetParserDataSourceResponseBodyDataSource extends TeaModel {
        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("UtcCreated")
        public String utcCreated;

        public static GetParserDataSourceResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetParserDataSourceResponseBodyDataSource self = new GetParserDataSourceResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetParserDataSourceResponseBodyDataSource setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public GetParserDataSourceResponseBodyDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetParserDataSourceResponseBodyDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParserDataSourceResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParserDataSourceResponseBodyDataSource setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

}
