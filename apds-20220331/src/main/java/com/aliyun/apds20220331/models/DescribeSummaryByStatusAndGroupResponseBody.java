// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSummaryByStatusAndGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Error")
    public String error;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSummaryByStatusAndGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryByStatusAndGroupResponseBody self = new DescribeSummaryByStatusAndGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryByStatusAndGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSummaryByStatusAndGroupResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeSummaryByStatusAndGroupResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DescribeSummaryByStatusAndGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
