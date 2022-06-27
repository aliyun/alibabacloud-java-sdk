// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisDimensionsResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<String> databases;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserNames")
    public java.util.List<String> userNames;

    public static DescribeDiagnosisDimensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisDimensionsResponseBody self = new DescribeDiagnosisDimensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisDimensionsResponseBody setDatabases(java.util.List<String> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<String> getDatabases() {
        return this.databases;
    }

    public DescribeDiagnosisDimensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisDimensionsResponseBody setUserNames(java.util.List<String> userNames) {
        this.userNames = userNames;
        return this;
    }
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

}
