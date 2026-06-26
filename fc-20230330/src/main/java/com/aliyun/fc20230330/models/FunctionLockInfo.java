// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class FunctionLockInfo extends TeaModel {
    /**
     * <p>The timestamp when the lock was applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-05T10:00:00Z</p>
     */
    @NameInMap("lockedAt")
    public String lockedAt;

    /**
     * <p>The name of the entity that applied the lock.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentRun</p>
     */
    @NameInMap("lockedBy")
    public String lockedBy;

    /**
     * <p>The list of locked resource types. Valid values include <code>function</code>, <code>trigger</code>, <code>version</code>, and <code>alias</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;function&quot;, &quot;trigger&quot;, &quot;version&quot;, &quot;alias&quot;]</p>
     */
    @NameInMap("lockedResources")
    public java.util.List<String> lockedResources;

    public static FunctionLockInfo build(java.util.Map<String, ?> map) throws Exception {
        FunctionLockInfo self = new FunctionLockInfo();
        return TeaModel.build(map, self);
    }

    public FunctionLockInfo setLockedAt(String lockedAt) {
        this.lockedAt = lockedAt;
        return this;
    }
    public String getLockedAt() {
        return this.lockedAt;
    }

    public FunctionLockInfo setLockedBy(String lockedBy) {
        this.lockedBy = lockedBy;
        return this;
    }
    public String getLockedBy() {
        return this.lockedBy;
    }

    public FunctionLockInfo setLockedResources(java.util.List<String> lockedResources) {
        this.lockedResources = lockedResources;
        return this;
    }
    public java.util.List<String> getLockedResources() {
        return this.lockedResources;
    }

}
