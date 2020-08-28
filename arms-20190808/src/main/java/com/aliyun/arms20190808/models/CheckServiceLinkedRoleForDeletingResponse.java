// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Deletable")
    @Validation(required = true)
    public Boolean deletable;

    @NameInMap("RoleUsages")
    @Validation(required = true)
    public java.util.List<CheckServiceLinkedRoleForDeletingResponseRoleUsages> roleUsages;

    public static CheckServiceLinkedRoleForDeletingResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingResponse self = new CheckServiceLinkedRoleForDeletingResponse();
        return TeaModel.build(map, self);
    }

    public static class CheckServiceLinkedRoleForDeletingResponseRoleUsages extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Resources")
        @Validation(required = true)
        public java.util.List<String> resources;

        public static CheckServiceLinkedRoleForDeletingResponseRoleUsages build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleForDeletingResponseRoleUsages self = new CheckServiceLinkedRoleForDeletingResponseRoleUsages();
            return TeaModel.build(map, self);
        }

    }

}
