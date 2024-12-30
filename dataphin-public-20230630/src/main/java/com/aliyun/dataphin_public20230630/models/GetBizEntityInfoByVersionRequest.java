// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizEntityInfoByVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101001201</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BIZ_OBJECT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionId")
    public Long versionId;

    public static GetBizEntityInfoByVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBizEntityInfoByVersionRequest self = new GetBizEntityInfoByVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetBizEntityInfoByVersionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetBizEntityInfoByVersionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetBizEntityInfoByVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetBizEntityInfoByVersionRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
