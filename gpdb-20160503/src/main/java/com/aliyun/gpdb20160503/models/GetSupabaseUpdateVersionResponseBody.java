// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseUpdateVersionResponseBody extends TeaModel {
    /**
     * <p>The latest upgradable version.</p>
     * 
     * <strong>example:</strong>
     * <p>20240731</p>
     */
    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>The ID of the Supabase project.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The recommended stable version for upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>20240630</p>
     */
    @NameInMap("StableVersion")
    public String stableVersion;

    public static GetSupabaseUpdateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseUpdateVersionResponseBody self = new GetSupabaseUpdateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupabaseUpdateVersionResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public GetSupabaseUpdateVersionResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetSupabaseUpdateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupabaseUpdateVersionResponseBody setStableVersion(String stableVersion) {
        this.stableVersion = stableVersion;
        return this;
    }
    public String getStableVersion() {
        return this.stableVersion;
    }

}
