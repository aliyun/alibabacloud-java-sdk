// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisDimensionsResponseBody extends TeaModel {
    @NameInMap("ClientIps")
    public java.util.List<String> clientIps;

    @NameInMap("Databases")
    public java.util.List<String> databases;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroups")
    public java.util.List<String> resourceGroups;

    @NameInMap("UserNames")
    public java.util.List<String> userNames;

    public static DescribeDiagnosisDimensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisDimensionsResponseBody self = new DescribeDiagnosisDimensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisDimensionsResponseBody setClientIps(java.util.List<String> clientIps) {
        this.clientIps = clientIps;
        return this;
    }
    public java.util.List<String> getClientIps() {
        return this.clientIps;
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

    public DescribeDiagnosisDimensionsResponseBody setResourceGroups(java.util.List<String> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public java.util.List<String> getResourceGroups() {
        return this.resourceGroups;
    }

    public DescribeDiagnosisDimensionsResponseBody setUserNames(java.util.List<String> userNames) {
        this.userNames = userNames;
        return this;
    }
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

}
