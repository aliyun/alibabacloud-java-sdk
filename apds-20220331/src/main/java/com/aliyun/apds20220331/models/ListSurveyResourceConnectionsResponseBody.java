// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceConnectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Error")
    public String error;

    @NameInMap("Success")
    public Boolean success;

    public static ListSurveyResourceConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceConnectionsResponseBody self = new ListSurveyResourceConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceConnectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSurveyResourceConnectionsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListSurveyResourceConnectionsResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public ListSurveyResourceConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
