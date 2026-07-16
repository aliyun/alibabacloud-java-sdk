// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CloneVersionResponseBody extends TeaModel {
    /**
     * <p>The version number of the cloned version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CloneVersion")
    public Integer cloneVersion;

    /**
     * <p>The version number that was cloned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OriginVersion")
    public Integer originVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneVersionResponseBody self = new CloneVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneVersionResponseBody setCloneVersion(Integer cloneVersion) {
        this.cloneVersion = cloneVersion;
        return this;
    }
    public Integer getCloneVersion() {
        return this.cloneVersion;
    }

    public CloneVersionResponseBody setOriginVersion(Integer originVersion) {
        this.originVersion = originVersion;
        return this;
    }
    public Integer getOriginVersion() {
        return this.originVersion;
    }

    public CloneVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
