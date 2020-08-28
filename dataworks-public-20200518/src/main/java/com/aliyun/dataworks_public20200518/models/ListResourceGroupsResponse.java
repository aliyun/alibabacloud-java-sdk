// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponse extends TeaModel {
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
    public java.util.List<ListResourceGroupsResponseData> data;

    public static ListResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponse self = new ListResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListResourceGroupsResponseData extends TeaModel {
        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("Cluster")
        @Validation(required = true)
        public String cluster;

        @NameInMap("BizExtKey")
        @Validation(required = true)
        public String bizExtKey;

        @NameInMap("EnableKp")
        @Validation(required = true)
        public Boolean enableKp;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ResourceGroupType")
        @Validation(required = true)
        public String resourceGroupType;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("Sequence")
        @Validation(required = true)
        public Integer sequence;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Specs")
        @Validation(required = true)
        public java.util.Map<String, ?> specs;

        public static ListResourceGroupsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseData self = new ListResourceGroupsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
