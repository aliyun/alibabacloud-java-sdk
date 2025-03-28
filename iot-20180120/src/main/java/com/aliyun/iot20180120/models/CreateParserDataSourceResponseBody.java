// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateParserDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DataSource")
    public CreateParserDataSourceResponseBodyDataSource dataSource;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>291438BA-6E10-4C4C-B761-243B9A0D324F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateParserDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParserDataSourceResponseBody self = new CreateParserDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParserDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateParserDataSourceResponseBody setDataSource(CreateParserDataSourceResponseBodyDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public CreateParserDataSourceResponseBodyDataSource getDataSource() {
        return this.dataSource;
    }

    public CreateParserDataSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateParserDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateParserDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateParserDataSourceResponseBodyDataSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DataSource</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2022-03-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        public static CreateParserDataSourceResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            CreateParserDataSourceResponseBodyDataSource self = new CreateParserDataSourceResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public CreateParserDataSourceResponseBodyDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public CreateParserDataSourceResponseBodyDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateParserDataSourceResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateParserDataSourceResponseBodyDataSource setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

}
