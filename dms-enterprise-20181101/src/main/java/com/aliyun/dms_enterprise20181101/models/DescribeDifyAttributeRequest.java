// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>92748163-af62-4ca4-ad85-1****</p>
     */
    @NameInMap("AppUuid")
    public String appUuid;

    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    /**
     * <strong>example:</strong>
     * <p>339170706****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DescribeDifyAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyAttributeRequest self = new DescribeDifyAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDifyAttributeRequest setAppUuid(String appUuid) {
        this.appUuid = appUuid;
        return this;
    }
    public String getAppUuid() {
        return this.appUuid;
    }

    public DescribeDifyAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDifyAttributeRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public DescribeDifyAttributeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
