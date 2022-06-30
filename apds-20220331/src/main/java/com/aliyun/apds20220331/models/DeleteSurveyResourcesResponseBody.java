// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteSurveyResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Error")
    public String error;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteSurveyResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSurveyResourcesResponseBody self = new DeleteSurveyResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSurveyResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSurveyResourcesResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DeleteSurveyResourcesResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DeleteSurveyResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
