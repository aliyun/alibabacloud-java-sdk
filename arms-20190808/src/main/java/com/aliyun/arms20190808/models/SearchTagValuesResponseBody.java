// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTagValuesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Values")
    public java.util.List<String> values;

    public static SearchTagValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTagValuesResponseBody self = new SearchTagValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTagValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTagValuesResponseBody setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
