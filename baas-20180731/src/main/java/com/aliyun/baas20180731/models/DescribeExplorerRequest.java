// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeExplorerRequest extends TeaModel {
    @NameInMap("ExBody")
    public String exBody;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExMethod")
    public String exMethod;

    @NameInMap("ExUrl")
    public String exUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeExplorerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExplorerRequest self = new DescribeExplorerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExplorerRequest setExBody(String exBody) {
        this.exBody = exBody;
        return this;
    }
    public String getExBody() {
        return this.exBody;
    }

    public DescribeExplorerRequest setExMethod(String exMethod) {
        this.exMethod = exMethod;
        return this;
    }
    public String getExMethod() {
        return this.exMethod;
    }

    public DescribeExplorerRequest setExUrl(String exUrl) {
        this.exUrl = exUrl;
        return this;
    }
    public String getExUrl() {
        return this.exUrl;
    }

    public DescribeExplorerRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
