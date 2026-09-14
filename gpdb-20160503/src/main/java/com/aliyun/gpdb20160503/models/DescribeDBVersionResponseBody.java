// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25C11EE5-B7E8-481A-A07C-BD619971A570</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The recommended upgrade version in the format of &quot;major version,minor version&quot; (separated by a comma). The first value is the target version for major engine version upgrade, and the second value is the target version for minor engine version update.</p>
     * 
     * <strong>example:</strong>
     * <p>mm.v7.4.2.7-202608031659,mm.v7.3.2.12-202608071438</p>
     */
    @NameInMap("VersionSuggestion")
    public String versionSuggestion;

    public static DescribeDBVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBVersionResponseBody self = new DescribeDBVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBVersionResponseBody setVersionSuggestion(String versionSuggestion) {
        this.versionSuggestion = versionSuggestion;
        return this;
    }
    public String getVersionSuggestion() {
        return this.versionSuggestion;
    }

}
