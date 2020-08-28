// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListConnectionsResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListConnectionsResponseData data;

    public static ListConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponse self = new ListConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListConnectionsResponseDataConnections extends TeaModel {
        @NameInMap("Shared")
        @Validation(required = true)
        public Boolean shared;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("ConnectStatus")
        @Validation(required = true)
        public Integer connectStatus;

        @NameInMap("BindingCalcEngineId")
        @Validation(required = true)
        public Integer bindingCalcEngineId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ConnectionType")
        @Validation(required = true)
        public String connectionType;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("DefaultEngine")
        @Validation(required = true)
        public Boolean defaultEngine;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Sequence")
        @Validation(required = true)
        public Integer sequence;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("SubType")
        @Validation(required = true)
        public String subType;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Integer projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static ListConnectionsResponseDataConnections build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseDataConnections self = new ListConnectionsResponseDataConnections();
            return TeaModel.build(map, self);
        }

    }

    public static class ListConnectionsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Connections")
        @Validation(required = true)
        public java.util.List<ListConnectionsResponseDataConnections> connections;

        public static ListConnectionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseData self = new ListConnectionsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
