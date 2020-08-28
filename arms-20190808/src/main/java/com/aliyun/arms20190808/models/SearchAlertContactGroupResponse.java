// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContactGroups")
    @Validation(required = true)
    public java.util.List<SearchAlertContactGroupResponseContactGroups> contactGroups;

    public static SearchAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupResponse self = new SearchAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchAlertContactGroupResponseContactGroups extends TeaModel {
        @NameInMap("ContactGroupId")
        @Validation(required = true)
        public Long contactGroupId;

        @NameInMap("ContactGroupName")
        @Validation(required = true)
        public String contactGroupName;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        public static SearchAlertContactGroupResponseContactGroups build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactGroupResponseContactGroups self = new SearchAlertContactGroupResponseContactGroups();
            return TeaModel.build(map, self);
        }

    }

}
