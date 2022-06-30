// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceByMigrationGroupsRequest extends TeaModel {
    @NameInMap("body")
    public ListSurveyResourceByMigrationGroupsRequestBody body;

    public static ListSurveyResourceByMigrationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceByMigrationGroupsRequest self = new ListSurveyResourceByMigrationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceByMigrationGroupsRequest setBody(ListSurveyResourceByMigrationGroupsRequestBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyResourceByMigrationGroupsRequestBody getBody() {
        return this.body;
    }

    public static class ListSurveyResourceByMigrationGroupsRequestBody extends TeaModel {
        @NameInMap("ids")
        public java.util.List<Integer> ids;

        public static ListSurveyResourceByMigrationGroupsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ListSurveyResourceByMigrationGroupsRequestBody self = new ListSurveyResourceByMigrationGroupsRequestBody();
            return TeaModel.build(map, self);
        }

        public ListSurveyResourceByMigrationGroupsRequestBody setIds(java.util.List<Integer> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Integer> getIds() {
            return this.ids;
        }

    }

}
