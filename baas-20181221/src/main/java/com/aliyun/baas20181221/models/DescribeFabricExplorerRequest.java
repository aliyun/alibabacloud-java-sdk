// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricExplorerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExBody")
    public String exBody;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("ExMethod")
    public String exMethod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/v1/channel</p>
     */
    @NameInMap("ExUrl")
    public String exUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-test11-tzwny25vqicq</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricExplorerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricExplorerRequest self = new DescribeFabricExplorerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricExplorerRequest setExBody(String exBody) {
        this.exBody = exBody;
        return this;
    }
    public String getExBody() {
        return this.exBody;
    }

    public DescribeFabricExplorerRequest setExMethod(String exMethod) {
        this.exMethod = exMethod;
        return this;
    }
    public String getExMethod() {
        return this.exMethod;
    }

    public DescribeFabricExplorerRequest setExUrl(String exUrl) {
        this.exUrl = exUrl;
        return this;
    }
    public String getExUrl() {
        return this.exUrl;
    }

    public DescribeFabricExplorerRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
