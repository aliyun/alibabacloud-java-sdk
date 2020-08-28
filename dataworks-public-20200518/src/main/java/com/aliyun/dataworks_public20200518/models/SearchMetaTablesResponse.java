// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchMetaTablesResponseData data;

    public static SearchMetaTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesResponse self = new SearchMetaTablesResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchMetaTablesResponseDataDataEntityList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("EntityType")
        @Validation(required = true)
        public Integer entityType;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        public static SearchMetaTablesResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseDataDataEntityList self = new SearchMetaTablesResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchMetaTablesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<SearchMetaTablesResponseDataDataEntityList> dataEntityList;

        public static SearchMetaTablesResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseData self = new SearchMetaTablesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
