// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionResponse extends TeaModel {
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
    public GetMetaTablePartitionResponseData data;

    public static GetMetaTablePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionResponse self = new GetMetaTablePartitionResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMetaTablePartitionResponseDataDataEntityList extends TeaModel {
        @NameInMap("PartitionGuid")
        @Validation(required = true)
        public String partitionGuid;

        @NameInMap("PartitionName")
        @Validation(required = true)
        public String partitionName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("DataSize")
        @Validation(required = true)
        public Long dataSize;

        @NameInMap("RecordCount")
        @Validation(required = true)
        public Long recordCount;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        public static GetMetaTablePartitionResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionResponseDataDataEntityList self = new GetMetaTablePartitionResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMetaTablePartitionResponseData extends TeaModel {
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
        public java.util.List<GetMetaTablePartitionResponseDataDataEntityList> dataEntityList;

        public static GetMetaTablePartitionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionResponseData self = new GetMetaTablePartitionResponseData();
            return TeaModel.build(map, self);
        }

    }

}
