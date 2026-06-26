// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTimedResidentResourcePoolApplicationsOutput extends TeaModel {
    @NameInMap("applications")
    public java.util.List<TimedResidentResourcePoolApplication> applications;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListTimedResidentResourcePoolApplicationsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListTimedResidentResourcePoolApplicationsOutput self = new ListTimedResidentResourcePoolApplicationsOutput();
        return TeaModel.build(map, self);
    }

    public ListTimedResidentResourcePoolApplicationsOutput setApplications(java.util.List<TimedResidentResourcePoolApplication> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<TimedResidentResourcePoolApplication> getApplications() {
        return this.applications;
    }

    public ListTimedResidentResourcePoolApplicationsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
