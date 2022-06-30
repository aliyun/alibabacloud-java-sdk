// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceByMigrationGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Error")
    public String error;

    @NameInMap("Success")
    public Boolean success;

    public static ListSurveyResourceByMigrationGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceByMigrationGroupsResponseBody self = new ListSurveyResourceByMigrationGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceByMigrationGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSurveyResourceByMigrationGroupsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListSurveyResourceByMigrationGroupsResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public ListSurveyResourceByMigrationGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
